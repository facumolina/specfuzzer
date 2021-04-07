import pandas as pd
import os.path
import sys
from re import search

# Load file and arguments
csv_file=sys.argv[1]
clazz=sys.argv[2]
method=sys.argv[3]

df = pd.read_csv(csv_file)
assertion_file =  csv_file.replace('-invs-by-mutants.csv','.assertions')

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

print("Assertions without filtering: "+str(len(assertions)))

unique_obj_assertions=set()
unique_pc_assertions=set()
visited=set()
for idx in df.index:
    curr_inv = df['invariant'][idx]
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
print("Unique: "+str(all_assertions))
print("=====================================")
print(":::OBJECT")
for unique in unique_obj_assertions:
    print(unique)
print("=====================================")
print(":::POSTCONDITION")
for unique in unique_pc_assertions:
    print(unique)

