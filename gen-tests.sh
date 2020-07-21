java -cp build/classes/:lib/randoop-all-4.2.4.jar randoop.main.Main gentests --testclass=DataStructures.List --output-limit=100 --omit-methods='repOk|toString|getClass' --junit-package-name='testers' --junit-output-dir=src/examples/ --regression-test-basename=ListTester

