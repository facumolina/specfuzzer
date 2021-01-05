import pandas as pd
import os.path
import sys

# Load file and arguments
df = pd.read_csv(sys.argv[1])
total_invs = len(df['invariant'].value_counts())

print("> Processing results")
print("")
print("Number of invariants killing mutants: %d", total_invs)
print("Invariants sorted by mutation killing ability (times that failed in program points)")
killing_ability = df.groupby('invariant')['fails'].sum().sort_values(ascending=False)
print(killing_ability)