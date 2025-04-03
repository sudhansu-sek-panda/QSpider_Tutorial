### Sorted Set


- It was introduced in JDK 1.2 version.
- It is a child interface of Set interface.
- It is not index based.
- It is not allowing duplicate elements.
- It is not following insertion order.
- It follows sorting order.
- It allows only homogeneous elements.
- It will not allow heterogenenous elements, if we are to add heterogeneous elements then JVM will rise an exception like java.lang.ClassCastException.
- It will not allow null values, if we are trying to add any null value then JVM will rise an exception like java.lang.NullPointerException.
- It is able to allow only COmparable objects by default, if we are trying to add non comparable objects then JVM will rise an exception like java.lang.ClassCastException.

Note: If we are trying to add non comparable objects then we have to use comparator.

Methods:
- <b>public object first();</b> <br>
It will return first element from the SortedSet.
- <b>public Object last()</b> <br>
It will return last element from the SortedSet.
- <b>public SortedSet headSet(Object obj)</b> <br>
It will return SortedSet object with the elements which are less the specified element.

- <b>public SortedSet tailSet(Object obj)</b> <br>
It will return SortedSet object with the elements which are greater than or equals to the specified element.

- <b> public SortedSet subSet(Object obj1, Object obj2)</b> <br>

It will return SortedSet object with the elements which are greater than or equals to the specified first element and which are less than the specified second element.
<pre>
import java.util.*;

public class DEmo {
    public static void main(String[] args) {
        TreeSet st = new TreeSet();
        st.add("D");
        st.add("F");
        st.add("C");
        st.add("B");
        st.add("A");
        st.add("E");
        System.out.println(st);
        System.out.println(st.first());
        System.out.println(st.last());
        System.out.println(st.headSet("D"));
        System.out.println(st.tailSet("D"));
        System.out.println(st.subSet("B", "E"));
    }
}

</pre>

<pre>
[A, B, C, D, E, F]
A
F
[A, B, C]
[D, E, F]
[B, C, D]
</pre>


