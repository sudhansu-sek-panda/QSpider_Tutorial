### LinkedHashMap
LinkedHashMap is exactly same as HashMap except following difference.

<table>
<tr>
<th>HashMap
</th>
<th>
LinkedHashMap
</th>
</tr>
<tr>
<td>
1. The underlaying data structure is hashtable.
2.Insertion order is not preserved.
3. It was introduced in the 1.2v.
</td>

<td>
1. The underlaying data structiure is the combination of Hashtable and LinkedList
2. Insertion order is preserved.
3. It was introduced in java 1.4v.
</td>
</tr>
</table>
<pre>
import java.util.*;
class Demo{
    public static void main(String arg[]){
        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put(101,"Hello");
        lhm.put('a',null);
        lhm.put(null,100);
        lhm.put(null,true); // override the value
        lhm.put("wow",11.11);
        lhm.put(101,false); // override the value, 
        System.out.println(lhm);
    }
}
</pre>
<pre>
{101=false, a=null, null=true, wow=11.11}
</pre>

arraylist
hashset 
tree set

treemap
hashmap


### IdentityHashMap
It is exactly same as HashMap except the following differences

<table>
<tr>
<th> HashMap
</th>
<th> IdentityHashMap
</th>
</tr>


<tr>
<td>
In the case of HashMap JVM will always use equals() to identify duplicate keys.
</td>
<td>
In the case of IdentityHashMap JVM will use equality(==) operator to identify duplicate values.
</td>
</tr>
</table>

### WeakHashMap
It is exactly same as HashMap except the following differences
<table>
<tr>
<th>HashMap
</th>
<th>WeakHashMap
</th>
</tr>
<tr>
<td>
In the case of normal HashMap, an object isn't eligible for GC even though it doesn't have any reference because HashMap dominates over GC.
</td>
<td>
In the case of WeakHashMap if the object doesn't have any reference pointing towards it then it will be eligible for GC because GC doiminates over WeakHashMap
</td>
</tr>
</table>

### SortedSet
- It is the child interface of MAP.
- If we want to represent a group of key value pair according some sorting order of keys, then we should go for SortedMap. 
- Sorting is only possible based on keys and not on values.

### Methods
1. Object firstkey();
2. Object Lastkey();
3. SortedMap headMap(Object key);
4. SortedMap tailMap(Object key);
5. SortedMap submap(Object key1, Object key2);


### TreeMap
- It is the implemented class of SortedMap
- The underlaying data structure is RedBlack Tree.
- Duplicate keys are not allowed but values can be duplicated.
- Insertion order isn't preserved.
- For keys heterogenous elementsare not allowed but for value it is allowed, if we try to insert heterogeneous elements(for keys) then we will get ClassCastException.
- Null insertion for key isn't allowed but for values there is no restriction.

### Constructor
1. TreeMap m = new TreeMap();
2. TreeMap m = new TreeMap(SortedMap m);
3. TreeMap m = new TreeMap(Map m);

<!-- String
StringBuilder
StringBuffer -->
<!-- Tokeniser
RegularExpression

Serializable
 -->
<!-- Generics
Multithreading
JDBC
Aplet
JSP
Servlet
Switch

 -->