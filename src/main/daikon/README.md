Every file inside this directory was developed to be included in Daikon source code. For this code to work properly, the following modifications are required:

* In class daikon.chicory.DaikonVariableInfo add the following line in method getObjectHashCode before the last return:
```java
ObjectsCollector.addObject(hashCode,theObject); 
```

* In class daikon.chicory.Runtime add the following line in method addShutdownHook after dtrace.close() line:
```java
ObjectsCollector.serializeObjects();
```

* In directory $DAIKONDIR/java/lib add the following jar files:
1. `xstream-1.4.11.1.jar`
2. `xmlpull_1_0_5.jar`

