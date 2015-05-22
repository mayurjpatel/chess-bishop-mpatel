chess-bishop
============
This repo provides a basic project as a quick interview question.  The goal of this project is to implement the _getNextPositions(...)_ method of the Bishop class.  Given a starting position, that should return the set of positions that the Bishop could move to.

Clearly there is a lot left out of this question (like, other pieces on the board!), but this should serve as a
decent starting point.

Getting Started
===============
You should be able to run the (failing) tests for this project via Maven:

```Shell
$ mvn test
[INFO] Scanning for projects...
{{ Maven compiling }}
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running chess.BishopTest
Tests run: 1, Failures: 1, Errors: 0, Skipped: 0, Time elapsed: 0.039 sec <<< FAILURE!

Results :

Failed tests:   testNextPositionsNotNull(chess.BishopTest): The set of next positions can never be null

Tests run: 1, Failures: 1, Errors: 0, Skipped: 0

{{ Maven Build Failure reporting }}
```
As we work through the exercise we can use the unit tests to check our progress.
