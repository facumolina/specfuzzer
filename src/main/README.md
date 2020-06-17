Running DynComp to perform dynamic comparability:

`java -cp .:$DAIKONDIR/daikon.jar daikon.DynComp DataStructures.ListTester`

Running Chicory to produce the dtrace file from the tester class:

`java -cp .:$DAIKONDIR/daikon.jar daikon.Chicory --comparability-file=ListTester.decls-DynComp DataStructures.ListTester`

Running Daikon to produce likely invariants:

`java -cp .:$DAIKONDIR/daikon.jar daikon.Daikon --user-defined-invariant invariant.FuzzedInvariants ListTester.dtrace.gz`
