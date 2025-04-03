- Removing all the elements of a collection
- Separating even and odd elements in to other collections.
- Displaying the addition of even and odd elements in a Collection.


### Program - Removing all the elements of a collection
<pre>
import java.util.Iterator;
import java.util.Vector;
public class Demo1 {
    public static void main(String a[]){
        Vector v = new Vector();

        for(int i=0;i<=10;i++){
            v.addElement(i);
        }

        System.out.println(v);

        Iterator e = v.iterator();

         while(e.hasNext()){
             Integer o = (Integer) e.next();
             e.remove(); // remove all
             // remove all the elements
       
        }
         System.out.println(v);
         
       
    }

}
</pre>


### Program - Separating even and odd elements in to another collection.
<pre>
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
public class Demo1 {
    public static void main(String a[]){
        Vector v = new Vector();
        Vector v1 = new Vector();
        Vector v2 = new Vector();
        for(int i=0;i<=10;i++){
            v.addElement(i);
        }
        System.out.println(v);
        System.out.println(v1);
        Iterator e = v.iterator();
        
        while(e.hasNext()){
            Integer o = (Integer) e.next();
            if(o%2==0){
               v1.add(o);
            }
            else{
                v2.add(o);
            }

        }
        
        System.out.println(v);
        System.out.println(v1);
        System.out.println(v2);
           
        }
    }

}
</pre>


### Program - Display the addition of even and odd elements in a Collection.

<pre>
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
public class Demo1 {
    public static void main(String a[]){
        Vector v = new Vector();
        Vector v1 = new Vector();
        Vector v2 = new Vector();
        for(int i=0;i<=10;i++){
            v.addElement(i);
        }
        System.out.println(v);
        System.out.println(v1);

        Iterator e = v.iterator(); //Defining a Iterator

        while(e.hasNext()){
            Integer o = (Integer) e.next();
            // add even elements in vector v1 and odd elements in vector v2 
            if(o%2==0){
               v1.add(o);
            }
            else{
                v2.add(o);
            }

        }

        v2.addElement(10); // adding an extra element later

        System.out.println(v);
        System.out.println(v1);
        System.out.println(v2);
        // Used enumeration for addition, not affecting the data
        Enumeration en = v1.elements();
        Enumeration en1 = v2.elements();

        while (en.hasMoreElements() && en1.hasMoreElements()) { 
            Integer wi1 =  (Integer) en1.nextElement();
            Integer wi2 =  (Integer) en.nextElement();
            System.out.println(wi1+wi2);
           
           
        }
    }

}
</pre>
**Run - java Demo**
<pre>
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
[]
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
[0, 2, 4, 6, 8, 10]
[1, 3, 5, 7, 9, 10]
1
5
9
13
17
20
</pre>

**Q. Is it possible to reduce the code by using only Enumeration?**
