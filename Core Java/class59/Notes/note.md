### Revision
**Q** What is tree set **?** 
**Q** Why we need to use tree set **?**

Insertion order and sorting is related. 


ArrayList
insert 
printing
Tree Set - Npt preserved
thinking 
sorting 
Comparable
Comparaotr - T J 


### Comparator
It is an interface using which we can arrange our tree set object into customised sorting order(Descending order).

There are two methods present in comparator interface.
1 - public int compare(Object o1, Object o2); What is the purpose of compare()?
2 - public boolean equals(Object o)
This interface is also present in (java.util) package
<pre>
import java.util.TreeSet;
public class Demo{
    public static void main(String[] args) {
        TreeSet t1 = new TreeSet();
        t1.add(150);
        t1.add(10);
        t1.add(80);
        t1.add(0);
        t1.add(20);
        System.out.println(t1);
        System.out.println(t1.descendingSet());
    }
}
</pre>
Compile - javac Demo.java
Run - java Demo
<pre>
[0, 10, 20, 80, 150]
[150, 80, 20, 10, 0]
</pre>

- Whenever we'll be creating implemented class of comparator then we'll be giving the implementation to only compare() method.
- Providing implementation to equals() method is optional because it's parent class(Object class) have already given the implementation which can be called any time through inheritance. 
** Hash Map, Tree Map

<pre>
import java.util.*;


public class Demo{
    public static void main(String[] args) {
        TreeSet t1 = new TreeSet(new Descending());
        t1.add(150);
        t1.add(10);
        t1.add(80);
        t1.add(0);
        t1.add(20);
        System.out.println(t1);
        // System.out.println(t1.descendingSet());

    }
}
class Descending implements Comparator{
    @Override
    public int compare(Object o1, Object o2){
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
    //     if (i1>i2) {
    //        return -123;
    //     }
    //     else if(i1<i2){
    //         return +123;
    //     }

    //     else{
    // return 0;
    //       
    // return i1.compareTo(i2); 
    return i2.compareTo(i1); 
    }
       
    }
// to save time for the entire code developers developed descendingSet in the Navigable set.


</pre>
<pre>
swapping (-1, 1)
</pre>

