import pandas as pd
import os.path
import sys
from re import search
import numpy

# Load file and arguments
csv_file=sys.argv[1]
clazz=sys.argv[2]
method=sys.argv[3]

print ("> Mutant filter from file: "+csv_file)
df = pd.read_csv(csv_file)
unique_mut = df.mutant.unique()
print("Unique mutants: "+str(len(unique_mut)))
mutants_ids={}
mid=0
for mutant in unique_mut:
    mutants_ids[mutant]=mid
    mid=mid+1

# Load seet of assertions of interest
assertion_file = csv_file.replace('-invs-by-mutants.csv','.assertions')
postcondition_delimiter=clazz+"."+method+"\("

def is_non_inv_line(curr_line):
    return search(":::OBJECT", curr_line) or search("==============", curr_line) or search(":::EXIT", curr_line) or search(":::ENTER", curr_line)

object_assertions=set()
postcondition_assertions=set()
def load_specs_from_assertion_file(assert_file):
    all_assertions=set()
    print("Loading assertions from: "+assert_file)
    with open(assert_file) as f:
        count = 0
        count_enabled = True
        is_object_prop = False
        for line in f:
            curr_line = line.strip()
            if (is_non_inv_line(curr_line)):
                obj_line = search(":::OBJECT", curr_line)
                if (obj_line or (search(postcondition_delimiter, curr_line) and search(":::EXIT", curr_line))):
                    if (obj_line):
                        is_object_prop = True
                    else:
                        is_object_prop = False
                    count_enabled = True
                else:
                    count_enabled = False
                continue
            if (count_enabled):
                if (is_object_prop):
                    object_assertions.add(curr_line)
                else:
                    postcondition_assertions.add(curr_line)
                all_assertions.add(curr_line)

    return all_assertions

assertions = load_specs_from_assertion_file(assertion_file)

# Build a dict with only the specs of interes, i.e., those specs that are part of the OBJECT pp or the POSTCONDTION
def is_of_interest(spec):
    curr_spec = spec
    if (curr_spec.startswith("FuzzedInvariant:")):
        curr_spec = curr_spec.replace("FuzzedInvariant:","")
    for inv in assertions:
        if (curr_spec in inv):
            return True
    return False

killers_and_mutants={}
unique_inv = df.invariant.unique()
for invariant in unique_inv:
    if is_of_interest(invariant):
        kl = df[df['invariant']==invariant]
        killed = kl.mutant.unique()
        killers_and_mutants[invariant]=(killed)

print("Specs killing mutants: "+str(len(killers_and_mutants)))

print()
print("> Minimizing by exploring the bit vector of each spec")
print("Building bit vectors of size: "+str(len(unique_mut)))
spec_vectors={}
for spec, mutants in killers_and_mutants.items():
    bit_vector = numpy.zeros(len(unique_mut))
    for mutant in mutants:
        bit_vector[mutants_ids[mutant]]=1
    spec_vectors[spec]=bit_vector

def count_ocurrences(inv):
    rows = df.apply(lambda x: True if x['invariant'] == inv else False , axis=1)
    num = len(rows[rows == True].index)
    return num

print("Starting to choose one spec for each bit vector")
visited=set()
invs_killer_set=set()
for spec, vector in spec_vectors.items():
    if str(vector) in visited:
        continue
    else:
        visited.add(str(vector))
        invs_killer_set.add(spec)

unique_obj_assertions=set()
unique_pc_assertions=set()
visited=set()
for curr_inv in invs_killer_set:
    if (curr_inv in visited):
        continue
    visited.add(curr_inv)
    if (curr_inv.startswith("FuzzedInvariant:")):
        curr_inv = curr_inv.replace("FuzzedInvariant:","")
    is_obj_inv = False
    for inv in object_assertions:
        if (curr_inv in inv):
            unique_obj_assertions.add(curr_inv)
            is_obj_inv = True
            break
    if (not is_obj_inv):
        for inv in postcondition_assertions:
            if (curr_inv in inv):
                unique_pc_assertions.add(curr_inv)

all_assertions=len(unique_obj_assertions)+len(unique_pc_assertions)
print("Specs: "+str(all_assertions))
print("=====================================")
print(":::OBJECT")
for unique in unique_obj_assertions:
    print(unique)
print("=====================================")
print(":::POSTCONDITION")
for unique in unique_pc_assertions:
    print(unique)


"""
Determine the amounf of fails of the given inv on the given mutant
"""
def amount_of_fails(inv, mutant):
    kl = df[df['mutant']==mutant]
    return len(kl[kl['invariant']==inv])

