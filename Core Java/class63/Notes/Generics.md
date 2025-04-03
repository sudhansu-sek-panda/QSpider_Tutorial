### Generics <>

Most of the collection frameworks implemented classes have allowed hectorgenious elements insertion. 
If we want to make our collection frameworks implemented class as purely homogenious class then we'll go for generics. 

<pre>
Not purely Homogenious
</pre>
<pre>
import java.util.ArrayList;
class Demo{
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add("sudh");
        a.add("abc");
        a.add("Anubhab");
        a.add("Subasis");
    }
}
</pre>

<pre>
import java.util.ArrayList;
class Demo{
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList();
        a.add("sudh");
        a.add("abc");
        a.add("Anubhab");
        a.add("Subasis");
        a.add(100);
    }
}
</pre>

