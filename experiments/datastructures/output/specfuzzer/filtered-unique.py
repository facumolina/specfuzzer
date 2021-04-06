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

#print("Assertions without filtering: "+str(len(assertions)))

unique_assertions=set()
for idx in df.index:
    curr_inv = df['invariant'][idx]
    if (curr_inv in assertions):
        unique_assertions.add(curr_inv)

print(len(unique_assertions))
