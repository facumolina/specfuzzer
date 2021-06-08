import pandas as pd
import os.path
import sys

# Load file and arguments
df = pd.read_csv(sys.argv[1])
iteration = sys.argv[2]
mutant_file = sys.argv[3]

# Extend the current df with the new columns
df["iteration"]=iteration
df["mutant"]=mutant_file

# Save the new csv file
df_all = pd.read_csv('invs-by-mutants.csv')
frames = [df_all, df]
joined = pd.concat(frames)

joined.to_csv('invs-by-mutants.csv', mode= 'w', index = False, header=True)

