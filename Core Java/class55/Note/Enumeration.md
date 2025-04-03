### Enumeration
It is used to convert a single Object into elements to perform operations.

<b>Enumeration</b> <br>
<b>Methods of Enumeration</b><br>
<b>Programms</b><br>
<b>Limitations of Enumeration</b><br>




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
1 - Enumeration is only applicable for legacy classes and it is not a universal cursor. <br>
2 -  By using Enumeration we can only read the objects.
3 - We can't form remove operation.<br>
4 - In order overcome java developers have introduces iterator concept in 1.2 version.<br>


**Q.What is the difference between the enum and Enumration?**
Enumuration in Java, represented by the keyword enum, is a special data type used to define a collection of named constants. 
It provides a way to create a type-safe list of values, ensuring that a variable can only hold one of the specified constants. Enums are useful for representing a fixed set of options, such as days of the week, months of the year, or states of an object.

Declaration snd Usage
An enum is declared using the enum keyword, followed by the name of the enum and a list of constants separated by commas.

enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}