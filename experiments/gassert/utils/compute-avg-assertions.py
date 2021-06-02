import sys
import os

# Load file and arguments
file_dir = sys.argv[1]

# Process assertion files
print('Reading files from folder: '+file_dir)
total_assertions = 0
processed_files = 0
for filename in os.listdir(file_dir):
    if filename.endswith(".assertions"):
        processed_files += 1
        curr_file = os.path.join(file_dir, filename)
        print(curr_file)
        lines = sum(1 for line in open(curr_file))
        #print('Lines: '+str(lines))
        if (lines==0):
            raise Exception('The amount of lines in an assertions file should not be zero. File: '+curr_file)
        if (lines==1):
            total_assertions +=1
        else:
            total_assertions += (lines-1)

# Report
print('Total files: '+str(processed_files))
print('Total assertions: '+str(total_assertions))
print('Avg assertions: '+str(total_assertions/float(processed_files)))
