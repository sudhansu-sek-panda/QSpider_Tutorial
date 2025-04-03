### 27-03-2025

r q o t - w l


NavigableMap:
It is the child interface of sortedMap and it defines several methods for navigation purpose.

**Methods:**
1. ceilingKey(e);
2. higherKey(e);
3. floorKey(e);
4. lowerKey(e);
5. pollFirstEntry();
6. pollLastEntry();
7. descendingMap();


### Entry Interface

- IT is an inner interface present in Map.
- This interface contains three methods.  
a. Object getKey();  
b. Object getValue();  
c. Object setValue(Object new);


Entryset
<pre>
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class Demo3 {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();
        tm.put(101, "hello");
        tm.put(102, true);
        tm.put(103, null);
        tm.put(104, 11.11);
        System.out.println(tm);
        Set<Map.Entry> s = tm.entrySet();
       for(Map.Entry e:s){
        System.out.println(e.getKey() + " - " + e.getValue());
       }
      for(Map.Entry e:s){
        Integer i = (Integer) e.getKey();
        if(i == 101 || i == 102 || i == 103){
            e.setValue("happy");
           }
      }
      System.out.println(tm);
    }
}

</pre>
**Output**
<pre>
{101=hello, 102=true, 103=null, 104=11.11}
101 - hello
102 - true
103 - null
104 - 11.11
{101=happy, 102=happy, 103=happy, 104=11.11}
</pre>

**For separating the key and value**
<pre>
 Set&lt;Map.Entry&gt; s = tm.entrySet();
       for(Map.Entry e:s){
        System.out.println(e.getKey() + " - " + e.getValue());
       }
</pre>
























