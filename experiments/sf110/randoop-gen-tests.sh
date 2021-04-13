#!/bin/bash

# This scrit allows to generate tests for a class in a SF110 project

# Verify that the required environment variables have been set
[[ -z "$SPECFUZZER" ]] && { echo "> The environment variable SPECFUZZER is empty" ; exit 1; }
[[ -z "$SF110SRC" ]] && { echo "> The environment variable SF110SRC is empty" ; exit 1; }

# Arguments
project=$1
target_class=$2;
test_class_name=$3;

# Create useful constants
sf110_dir=$SF110SRC
project_bin=$sf110_dir/$project/build/classes
project_jars=$sf110_dir/$project/lib
outdir_tests=experiments/sf110/$project/tests
class_name=${target_class##*.}
class_config=experiments/sf110/$project/$class_name

# Auxiliar routine
read_classes_from_file() {
    if [ ! -d "$class_config" ]; then
        echo "\n> Directory $class_config does not exist. Exiting..."
        exit 1
    fi

    pushd $class_config > /dev/null
    filename="classes.txt"

    classes_flags=""
    while IFS="" read -r p || [ -n "$p" ]
    do
        currline="$p"
	classes_flags="$classes_flags --testclass=$currline"
    done < $filename

    popd > /dev/null
}

echo '> Generating tests for class: '$project'/'$target_class

echo ""
echo "> Compiling project: $project"
pushd $sf110_dir/$project > /dev/null
ant clean compile
popd > /dev/null

echo ""
echo "> Going to generate JUnit tests in: $outdir_tests"
echo "> Cleaning up old tests: $outdir_tests"
rm -r $outdir_tests/*
mkdir -p $outdir_tests
read_classes_from_file
echo 'Classes: '$classes_flags
# Ignore all methods from javax.swing.* package to avoid breaking randoop
omitmethods="toString|hashCode|equals|clone|compareTo|javax.swing.*|ASTNode.dump|ASTNode.getTree|ASTNode.display|ASTNode.createTree|dk.statsbiblioteket.summa.common.util.PriorityQueue.getComparator|java.lang.Iterable.forEach|java.lang.Iterable.spliterator|java.util.List.spliterator|java.util.Collection.stream|java.util.AbstractList.subList|java.util.List.sort|jahuwaldt.plot.LinearAxisScale.findGoodLimits"

echo ""
echo "> Executing Randoop"
java -cp build/classes/:lib/randoop-all-4.2.4.jar:${project_bin}:$project_jars/* randoop.main.Main gentests $classes_flags --output-limit=500 --literals-level=ALL --literals-file=$SPECFUZZER/literals/lits.txt --omitmethods=$omitmethods --only-test-public-members=true --usethreads=false --junit-package-name='testers' --junit-output-dir=$outdir_tests --junit-reflection-allowed=false --regression-test-basename=$test_class_name --no-regression-assertions=true --randomseed=0
echo ""
echo "> Finished!"

echo '> Done!'
