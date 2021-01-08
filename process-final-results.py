import pandas as pd
import os.path
import sys

# Load file and arguments
df = pd.read_csv(sys.argv[1])
total_invs = len(df['invariant'].value_counts())

print("")
print("Number of invariants killing mutants: ", total_invs)


column_names = ["invariant", "fails", "fst_it", "total_its"]
final_df = pd.DataFrame(columns = column_names)

for index, row in df.iterrows():
    if final_df[final_df['invariant']==row['invariant']].empty:
        min_it = df[df['invariant']==row['invariant']]['iteration'].min()
        total_it = len(df[df['invariant']==row['invariant']]['iteration'].unique())
        fails = df[(df['invariant']==row['invariant']) & (df['iteration']==min_it)]['fails'].sum()
        row_to_add = {
                        "invariant":[row['invariant']],
                        "fails":[fails],
                        "fst_it":[min_it],
                        "total_its":[total_it]
                     }
        final_df = final_df.append(pd.DataFrame(row_to_add), ignore_index=True)

print("Invariants sorted by mutation killing ability (times that failed in program points)")
ka = final_df.sort_values(by=['fails'], ascending=False, ignore_index=True)

pd.set_option('max_colwidth', 800)

print(ka)
