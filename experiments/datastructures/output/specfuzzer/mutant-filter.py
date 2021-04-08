import pandas as pd
import os.path
import sys
from re import search

# Load file and arguments
csv_file=sys.argv[1]
clazz=sys.argv[2]
method=sys.argv[3]

print ("> Mutant filter from file: "+csv_file)
df = pd.read_csv(csv_file)
unique_mut = df.mutant.unique()
print("Unique mutants: "+str(len(unique_mut)))

# Build a dict with mutants and the list of invariants the killed them
mutants_and_killers={}
for mutant in unique_mut:
    kl = df[df['mutant']==mutant]
    killers = kl.invariant.unique()
    mutants_and_killers[mutant]=set(killers)

l = [ len(killers) for killers in mutants_and_killers.values()]
print("Number of killers by mutant: "+str(l))

# Load seet of assertions of interest
assertion_file = csv_file.replace('-invs-by-mutants.csv','.assertions')

postcondition_delimiter=clazz+"."+method+"\("

def is_non_inv_line(curr_line):
    return search(":::OBJECT", curr_line) or search("==============", curr_line) or search(":::EXIT", curr_line) or search(":::ENTER", curr_line)

def load_specs_from_assertion_file(assert_file):
    all_assertions=set()
    #print("Loading assertions from: "+assert_file)
    with open(assert_file) as f:
        count = 0
        count_enabled = True
        for line in f:
            curr_line = line.strip()
            if (is_non_inv_line(curr_line)):
                if (search(":::OBJECT", curr_line) or (search(postcondition_delimiter, curr_line) and search(":::EXIT", curr_line))):
                    count_enabled = True
                else:
                    count_enabled = False
                continue
            if (count_enabled):
                all_assertions.add(curr_line)

    return all_assertions

assertions = load_specs_from_assertion_file(assertion_file)

# Keep in mutants only the assertions of interes (i.e., they are part of the OBJECT pp or the POSTCONDTION)
for mutant, killers in mutants_and_killers.items():
    new_killers=set()
    for killer in killers:
        curr_killer = killer
        if (curr_killer.startswith("FuzzedInvariant:")):
            curr_killer = curr_killer.replace("FuzzedInvariant:","")
        for inv in assertions:
            if (curr_killer in inv):
                new_killers.add(killer)
                break
    mutants_and_killers[mutant]=new_killers
                

# Determine a set of invariants that would kill all the mutants
invs_killer_set=set()
killed=set()

def determine_by_intersection():
    res=set()
    for mutant1 in mutants_and_killers:
        if mutant1 not in killed:
            killers1 = mutants_and_killers[mutant1]
            if (len(res.intersection(killers1))>0):
                killed.add(mutant1)
                continue
            for mutant2 in mutants_and_killers:
                if mutant2 not in killed and mutant1 != mutant2:
                    killers2 = mutants_and_killers[mutant2]
                    if (len(res.intersection(killers2))>0):
                        killed.add(mutant2)
                        continue
                    both = killers1.intersection(killers2)
                    if (len(both)>0):
                        killed.add(mutant1)
                        killed.add(mutant2)
                        res = res.union(both)
    return res


"""
Determine the amounf of fails of the given inv on the given mutant
"""
def amount_of_fails(inv, mutant):
    kl = df[df['mutant']==mutant]
    return len(kl[kl['invariant']==inv])

"""
For each mutant get the killers with an amount of fails less than or equal to nfails
"""
def determine_by_number_of_fails(nfails,max_samples):
    res=set()
    for mutant in mutants_and_killers:
        killers = mutants_and_killers[mutant]
        filtered_killers=set()
        for inv in killers:
            if (amount_of_fails(inv, mutant)<=nfails):
                filtered_killers.add(inv)
                if (len(filtered_killers)>=max_samples):
                    break
        res = res.union(filtered_killers)
        killed.add(mutant)
    return res

invs_killer_set = determine_by_number_of_fails(1,1)
#invs_killer_set = determine_by_intersection()

print("Killed: "+str(len(killed)))
print("Invariants: "+str(len(invs_killer_set)))
for inv in invs_killer_set:
    print(inv)

