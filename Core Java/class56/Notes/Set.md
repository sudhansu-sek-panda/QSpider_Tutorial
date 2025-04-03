Set
=================
It is the child interface of collection.

If we want to represent a group of individual objects as a single entity where duplicates are not allowed and insertion order is not preserved then we should go for set. 

Set interface doesn't contain nay new methdos.

1. HashSet
=============
The underlying data structure is Hashtable.
**Hash Table??**

- Insertion order is not preserved.
- It is based on on hascode of the object.
- Duplicate elements are not allowed, if we try to insert deplicate elements we will not get any CE or RE, it simply returns false. add() methods return false

- Hectrogenious elements are allowed.
- null insertion is possible only once.
- It implements Seriaziable, Clonable but RandomAccess interface.

### Constructor
1. HashSet h = new HashSet();
initial capacity = 16

2. HashSet h = new HashSet(int initialCapacity);

3. HashSet h = new HashSet(Collection c);
<pre>
import java.util.HashSet;
class Demo1{
    public static void main(String a[]){
        HashSet hs1 = new HashSet(16);
        hs1.add("aaa");
        hs1.add(11);
        hs1.add(true);
        hs1.add(2.5);
        System.out.println(hs1);
        System.out.println(hs1.add(11)); // returns false
        System.out.println(hs1); // no new duplicate data allowed
        System.out.println(hs1.isEmpty());
        System.out.println(hs1.size());
        System.out.println(); 
        

    }
}
</pre>

<pre>
[aaa, 2.5, 11, true]
false
[aaa, 2.5, 11, true]
false
4
</pre>













N - L R of J