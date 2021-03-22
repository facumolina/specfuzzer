#!/bin/bash

# Verify that the required environment variables have been set
[[ -z "$EVOSPEX" ]] && { echo "> The environment variable EVOSPEX is empty" ; exit 1; }

# Get arguments
root_dir=$EVOSPEX;
fqname=$1
method=$2
objs_folder=$3
executions=$4

evospex_jar=$EVOSPEX/target/evospex-jar-with-dependencies.jar
specfuzzer_jar=$SPECFUZZER/dest/jar/FuzzSpecs.jar

echo '> Running EvoSpex on subject: '$fqname'.'$method
echo 'executions: '$executions

# Get required variables
target_class_sn=$(sed 's/.*\.//' <<< $1)
resources_base=$EVOSPEX'/src/test/resources';
model_base=$resources_base'/objects'
model_file=$model_base/$target_class_sn/model/$target_class_sn.als
base_folder=$model_base/$objs_folder;
cd $base_folder;
num_args="$( ls -l in*.xml | wc -l )";
num_outputs="$( ls -l out*.xml | wc -l )";
cd $root_dir;
echo 'model: '$model_file
echo 'base_folder: '$base_folder
echo 'num_args: '$num_args
echo 'num_outputs: '$num_outputs


output_dir=experiments/datastructures/output/evospex
mkdir -p $output_dir
for value in $(eval echo {1..$executions})
do
java -cp $specfuzzer_jar:$evospex_jar main.EvoSpex $model_file $base_folder $num_args $num_outputs $3 $4 $5 $6 $7 $8 > $output_dir/$target_class_sn-$method-evospex-$value.assertions  
done
