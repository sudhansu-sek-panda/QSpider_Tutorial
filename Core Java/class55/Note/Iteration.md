### Iteration
<b>
Iterations <br>
Methods of Iterations<br>
Programs<br>
Limitations of Iterations<br>
</b>
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
