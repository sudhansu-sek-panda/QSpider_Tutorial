### Object Typecasting

The conversion of one type of object into another type is the concept of Object type casting.


### Coupling
Degree of de
Facebook - Messanger - Tightly coupled
Facebook - Loosly coupled.

To type cast any object we must have to follow three rules, in which first two rules are checked by compiler and the last rule is checked by JVM.

Class Cast Exception
What are the rules?

Pre Defined - User Defined

Rule No 1  - Checked by compiler
What is the rule?
- The type of C and the type of B either same type or they must have some relationship.

Object o = new Object();
String s = (String) o;
``````````````````````````````
A    B    C     D

C have relation with D


C != D
D have relationship C

Rule 2 - Checked by compiler

- The type of C and the type of A either same type or they must have some relation like A must be the parent of C.


Object o = new Object();
String s = (String) o;
``````````````````````````````
A    B    C     D

Third rule - Checked by JVM

- The type of C and the runtime object of D either same type or they have must have some relationship like C is the parent of runtime object of D.

Object o = new Object();
String s = (String) o;
``````````````````````````````
A    B    C     D

Not satisfied. checked by the jvm. Class caste Exception.



