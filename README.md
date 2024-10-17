## Getting Started

This program generates the fibonacchi sequence up until the users desired iteration. This stops at 92 max interations because of limitations of long values
Use this program by this command:
```
$ java -jar --enable-preview fibonacchiSequence.jar [enter an integer]
```

Example of the terminal when passed in the right arguments:
```
$ java -jar --enable-preview fibonacchiSequence.jar 5
Computing Fibonacci sequence up to: 5 iterations.
F0: 0
F1: 1
F2: 1
F3: 2
F4: 3
F5: 5
Fibonacci Sequence of 5 iterations is: 5
```
Example of passing no arguments:
```
$ java -jar --enable-preview fibonacchiSequence.jar 
You must only pass in one integer number.
```

Example of passing more than 1 arguments:
```
$ java -jar --enable-preview fibonacchiSequence.jar 0 0 
You must only pass in one integer number.
```

Example of passing string instead of an integer:
```
$ java -jar --enable-preview fibonacchiSequence.jar asdf
The passed argument is not a number.
```
