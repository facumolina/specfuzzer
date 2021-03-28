import pandas as pd
import os.path
import sys

# Load file and arguments
df = pd.read_csv(sys.argv[1])

# Calculate a print some useful information
print("")
total_invs = len(df['invariant'].value_counts())
unique_ppt = df.ppt.unique()
unique_mut = df.mutant.unique()
print("Number of invariants killing mutants: ", total_invs)
print()
print("Unique program points: "+str(len(unique_ppt)))
print(list(unique_ppt))
print()
print("Unique mutants: "+str(len(unique_mut)))
print()

column_names = ["invariant", "fails", "fst_it", "total_its"]


for ppt in unique_ppt:
    ppt_df = pd.DataFrame(columns = column_names)
    for index, row in df.iterrows():
        if (row['ppt']==ppt and ppt_df[ppt_df['invariant']==row['invariant']].empty):
            min_it = df[df['invariant']==row['invariant']]['iteration'].min()
            total_it = len(df[df['invariant']==row['invariant']]['iteration'].unique())
            fails = len(df[(df['invariant']==row['invariant']) & (df['iteration']==min_it)])
            row_to_add = {
            "invariant":[row['invariant']],
            "fails":[fails],
            "fst_it":[min_it],
            "total_its":[total_it]
            }
            ppt_df = ppt_df.append(pd.DataFrame(row_to_add), ignore_index=True)

    print("Program Point: "+ppt)
    print("     Invariants sorted by mutation killing ability (times that failed in the program point)")
    ka = ppt_df.sort_values(by=['fails'], ascending=False, ignore_index=True)
    pd.set_option('max_colwidth', 1000)
    pd.set_option("display.max_rows", None)
    print(ka[['invariant','fails']])
    print()