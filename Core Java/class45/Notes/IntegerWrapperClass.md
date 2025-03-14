
### Integer Wrapper class
Integer I = new Integer(10);✅  
Integer I = new Integer('20');✅  
Integer I = new Integer(2.5); ❌  
Integer I = new Integer(); ❌  
Integer I = new Integer('a');✅  
Integer I = new Integer("text");❌

Byte Short Long - 2 type argument



<pre>
public class Test{
public static void main(String a[])
{
   Integer I1 = new Integer(10);    //primitive type as an argument
   Integer I2 = new Integer("10");  // String type as an argument
   Integer I3 = new Integer('a');  // Parsable to Integer type argument
   System.out.println(I1); // Printing Object 
   System.out.println(I2); // Printing Object 
   System.out.println(I3); // Printing Object 
}
}
</pre>
<pre>
<b>javac Test.java</b> 

Test.java:4: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
   Integer I1 = new Integer(10); //primitive type as an argument
                ^
Test.java:5: warning: [removal] Integer(String) in Integer has been deprecated and marked for removal
   Integer I2 = new Integer("10");  // String type as an argument
                ^
Test.java:6: warning: [removal] Integer(int) in Integer has been deprecated and marked for removal
   Integer I3 = new Integer('a');  // Parsable to Integer type object
                ^
3 warnings
</pre>

<pre>
<b>java Test </b>
10
10
97
</pre>


**Not allowed**
1. Other Primitive types
2. Other String types
3. No argument Constructor

<pre>
public class Demo {
  public static void main(String a[]){
    Integer I1 = new Integer();
    Integer I2 = new Integer("text");
    Integer I3 = new Integer(2.5);
    System.out.println(I1);
    System.out.println(I2);
    System.out.println(I3);
  }  
}

</pre>
<pre>
 javac Demo.java
Demo.java:5: error: no suitable constructor found for Integer(no arguments)
    Integer I1 = new Integer();
                 ^
    constructor Integer.Integer(int) is not applicable
      (actual and formal argument lists differ in length)
    constructor Integer.Integer(String) is not applicable
      (actual and formal argument lists differ in length)
Demo.java:6: warning: [removal] Integer(String) in Integer has been deprecated and marked for removal      
    Integer I2 = new Integer("text");
                 ^
Demo.java:7: error: no suitable constructor found for Integer(double)
    Integer I3 = new Integer(2.5);
                 ^
    constructor Integer.Integer(int) is not applicable
      (argument mismatch; possible lossy conversion from double to int)
    constructor Integer.Integer(String) is not applicable
      (argument mismatch; double cannot be converted to String)
2 errors
1 warning
</pre>