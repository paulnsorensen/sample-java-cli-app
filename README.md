**Sample Java CLI App**

To build:
```
./build.sh
```


To run with file:
```
./run.sh -file=testFile
```


To run with STDIN, just omit file argument and type into console. Type `Ctrl + D` in the console to close the stream and finish the program.
```
./run.sh
```

You can also pipe files to STDIN:
```
./run.sh < testFile
```

Resources used
* https://www.baeldung.com/executable-jar-with-maven
* https://www.baeldung.com/java-buffered-reader