Enumeration
Methods of Enumeration
Programms
Limitations of Enumeration



### Enumeration
It is used to convert a single Object into elements to perform operations.
### Methods
<pre>
elements()
hasMoreElements()
nextElement()
</pre>
**Printing the even values from a collection through Enumeration.**
<pre>
import java.util.Enumeration;
import java.util.Vector;
class Enum{
    public static void main(String a[]){
        Vector v = new Vector();
        for(int i=0; i<=10;i++){
            v.add(i);
        }
        System.out.println(v);
        Enumeration e = v.elements();
        while (e.hasMoreElements()) { 
            Integer I = (Integer) e.nextElement();
            if(I%2==0){
                System.out.println(I);
            }
        }
    }
}  
</pre>
Compilation: **javac Enum.java**
<pre>
Note: Enum.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
</pre>
Run: **java Enum**
<pre>
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
0
2
4
6
8
10
</pre>
**Adding the Emumeration values in another Vector**
<pre>
import java.util.Enumeration;
import java.util.Vector;
class Enum1{
    public static void main(String a[]){
        Vector v = new Vector();
        Vector c = new Vector();
        for(int i=0; i<=10;i++){
            v.add(i);
        }
        System.out.println(v);
        Enumeration e = v.elements();
        while (e.hasMoreElements()) { 
            Integer I = (Integer) e.nextElement();
            if(I%2==0){
                c.add(I);
            }
            
        }
        System.out.println(c);
        System.out.println(c == v);
    }
}
</pre>
Compilation **javac Enum1.java**
<pre>

Note: Enum1.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
</pre>
Run **java Enum1**
<pre>
     
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
[0, 2, 4, 6, 8, 10]
false
</pre>
### Limitations of Enumeration
1 - Enumeration is only applicable for legacy classes and it is not a universal cursor.
2 -  By using Enumeration we can only read the objects.
3 - We can't form remove operation.
4 - In order overcome java developers have introduces iterator concept in 1.2 version.


Iterations
Methods of Iterations
Programs
Limitations of Iterations

### Iterator
It is a cursor which can get object one by one from any collections implemented class object. 
As it can fetch object from any collection object that is why it is knowm as Universal Cursor.

While iterating the object by iterator, we can perform both read as well as remove operation. 

### Declaration of Iterator methods
<pre>
public Iterator iterator();
</pre>
We can get object by using **iteraor();**

Methods of Iterator:
<pre>
1. public boolean hasNext();
2. public Object next();
3. pulic void remove();
</pre>

<pre>
import java.util.Iterator;
import java.util.Vector;

public class Iter {
    public static void main(String[] args) {
        Vector v = new Vector();
        for(int i = 1; i<=10;i++){
            v.add(i);
        }
        System.out.println(v);
        Iterator i = v.iterator();
        while(i.hasNext()){
            Integer a1 = (Integer) i.next();
            if(a1%2==0){
                i.remove();
            }
        }
        System.out.println(v);
    }
}

</pre>
**Compilation - javac Iter.java**
<pre>
Note: Iter.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
PS D:\Files\QSpider_Tutorial\Core Java\class55\Resources> javac Iter.java
Note: Iter.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
Note: Iter.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
Note: Recompile with -Xlint:unchecked for details.
PS D:\Files\QSpider_Tutorial\Core 
</pre>
**Run - java Iter**
<pre>
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
[1, 3, 5, 7, 9]
</pre>

<!-- 
Only ListIterator is present. 
No set iterator present 
production line
map - 

modificatios -  -->

### Limitations of Iterator
1. Both Enumeration and Iterator is **one directional cursor** (single directional/ forward direcetion) we can't move in backward direction.
2. While iterating by iterator we can perform only read and remove operations and we **can't perform replacement and addition** of new objects.
