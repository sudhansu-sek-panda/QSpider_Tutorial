# Method Overloading
**Creating multiple methods with same method name and different type of argument inside a single class is the concept of method oveloading.** 

**Case A**
<pre>
m1(int x);
m1(int y);
</pre>
<pre>
No - Same method signature can't be possible.
Method Signature = Method name + Method argument type
</pre>

**Case B**
<pre>
m1(int x);
m2(float y);
</pre>
<pre>
NO: Different method name with different argument type can't take part in method overloading.
The method name should be same with different/ dissimilar argument type.
</pre>
**Case C**
<pre>
m1(int x);
m1(float y);
m1(char z);
</pre>
<pre>
<b>Yes</b>: Same method name with different argument type.
</pre>

**Q.** How could we use method overloading in different classes **?**

Method overloading happens in one class at the end even we have declared the same method in different classes.

**Q.** Is method overloading only applicable for user defind classes or it is applicable for system classes also **?**

**Q.** What are the arguments and return type of print() and println()
 **?**

23l
s i - l - f - d (in a sequence)
2 time upcasting.
Note: It will go up to last if no recent upcasting is there.
byte  - int

<b> Overloading </b>

<pre>

public class Test{
    public void m1(int x){
        System.out.println("abc");
    }
    public void m1(float f){
        System.out.println("def");
    }
    public static void main(String a[]){
        Test t1 = new Test();  // Exact match > Normal Match
        t1.m1(10); //or
        t1.m1((float)10); // widening by programmer
    // or
        t1.m1('a');        // Ascii code of 'a' is 97 // it is upcasting by compiler // b - string - int - b -> f -> double
         // or
        t1.m1(2.5f ); 
        t1.m1((float) 2.5);
        t1.m1(23L);
        // t1.m1(2.5);
        t1.m1((int) 2.5);
        // b1-> S -> int -> l -> f -> double
    }
}
// soumya - double type  possible lossy conversion of float to double
// w - c
</pre>
**Output**
<pre>
abc
def
abc
def
def
def
abc
</pre>
**Programme 2**
<pre>
public class Test1 {
    public void m1(byte b){
        System.out.println("abc");
    }
    public void m1(int a){
        System.out.println("def");
    }
    public static void main(String a[]){
        Test1 t1 = new Test1();
        t1.m1(10);
        t1.m1((int)10);
        t1.m1((byte)10);
    }
}

</pre>
**Output**
<pre>
def
def
abc
</pre>
**Programme 3**
<pre>
public class Test2 {
    public void m1(byte b){
        System.out.println("abc");
    }
    public void m1(short s){
        System.out.println("def");
    }
    public static void main(String a[]){
        Test2 t1 = new Test2();
       // t1.m1(10); // CE
        t1.m1((byte) 10);
        t1.m1((short)10 ); // 10;
    }
}
</pre>
**Output**
<pre>
abc
def
</pre>