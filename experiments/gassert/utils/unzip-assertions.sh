subject=$1

echo 'Unzipping assertions for '$subject
zip_files=$subject*'daikon'*'GASSERT'*.zip
for zipfile in $zip_files
do
  echo 'File: '$zipfile
  unzip $zipfile > /dev/null 2>&1
  assertions_file=${zipfile%".zip"}'.assertions'
  echo 'Assertions saved to file: '$assertions_file
  cp $subject/output/output.assertions $assertions_file
  rm -r $subject
done

echo 'Done!'
