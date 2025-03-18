### Legacy Classes
These are the classes which were introducted in 1.0 version and they are 
1. Vector
2. Stack

Q. Why a class which was introduced in 1.0 version became an implemented class of an interface introduced in 1.2 version?

A - These classes were re-engineered, and re-modified according to the requirement of the interface and then after made the implemented class of the interface introduced in 1.2 version.

### Vector
* It is a legacy class.
* The underlaying data structure is growable or resizable array.
* Insertion order is preserved.
* Duplicated are allowed.
* Heterogeneous elements can be inserted.
* Null insertion is possible.

**Methods**
1. addElement(Object o);
2. removeElement(Object o);
3. removeElementAt(int index);
4. removeAllElements();
5. elementAt(int index);
6. firstElement();
7. lastElement();
8. size();
9. capacity();
10. Enumeration enumeration();

Constructors :-
1. Vector r = new Vector();
If we are using this constructors to create the vector's object then it will create an empty object with default capacity of 10.
- If we reach the limit of the vector's object then it will increase the capacity by executing the below formula

NewCapacity = (current/initialCapacity*2)
2. Vector r = new Vector(int initialCapacity);
3. Vector r = new Vector(int initialCapacity, int incrementalCapacity);
The above constructor will create an empty vector object with our given capacity and when the JVM will reaches the limit of the Vector's object then rather using the formula it will use the incremental Capacity given to increase the capacity.
5. Vector r = new Vector(Collection c);

### Stack