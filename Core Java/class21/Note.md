# Method Overloading
**Creating multiple methods with same method name and different type of argument inside a single class is the concept of method oveloading.** 

**A**
<pre> 
m1(int x);
m1(int y);
</pre>
<pre>
No - Same method signature can't be possible.
Method Signature = Method name + Method argument type
</pre>

**B**
<pre>
m1(int x);
m2(float y);
</pre>
<pre>
NO: Different method name with different argument type can't take part in method overloading.
The method name should be same with different/ dissimilar argument type.
</pre>
**C**
m1(int x);
m1(float y);
m1(char z);
**Yes**: Same method name with different argument type.


**Q.** How could we use method overloading in different classes **?**

Method overloading happens in one class at the end even we have declared the same method in different classes.

Is method overloading only applicable for user defind classes or it is applicable for system classes also?

Q. What are the argumnets and return type of print() and println()
A. ?

23l
s i - l - f - d (in a sequence)
2 time upcasting.
Note: It will go up to last if no recent upcasting is there.
byte  - int



<pre>
public class Test{
    public void m1(int x){
        System.out.println("abc");
    }
    public void m1(float f){
        System.out.println("def");
    }
    public static void main(String a[]){
        Test t1 = new Test();
        // Exact match > Normal Match
        t1.m1(10); //or
        t1.m1((float)10); // widening by programmer
        // or
        t1.m1('a'); // Ascii code of 'a' is 97 // it is upcasting by compiler // b - string - int - b -> f -> double
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