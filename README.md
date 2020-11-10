Barebones java maven project
============================


Requires:

1. JDK 1.8
2. maven



To build the jar, first make sure that your JAVA_HOME variable points to the location of the jdk. Next run:

```
mvn clean package
```

This will produce an executable jar file in the target directory, looking like:

```
gsrsnetworkmaker-0.0.1-SNAPSHOT-jar-with-dependencies.jar
```

This can be run with:

```
java -jar gsrsnetworkmaker-0.0.1-SNAPSHOT-jar-with-dependencies.jar <paramaters>
```
