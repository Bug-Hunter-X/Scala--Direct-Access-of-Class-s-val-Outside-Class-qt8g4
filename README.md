# Scala Bug: Direct Access of a val Outside its Defining Class

This repository demonstrates a common Scala error: attempting to access a `val` (immutable variable) directly from outside the class where it's defined.  Scala's encapsulation restricts direct access to class members unless explicitly provided via methods or getters.

## Bug Description
The `bug.scala` file contains a `MyClass` with a `val` named `name`. The `main` method attempts to print the value of `name` directly. This leads to a compilation error because `name` is not accessible outside `MyClass`.

## Solution
The `bugSolution.scala` file demonstrates the correct approach: using a getter method (`getName`) to access the value of `name`.