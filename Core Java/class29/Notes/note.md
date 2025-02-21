</pre>
interface A{
 public String m1(); // interface has no implementation // Non-primitive method // static and public and final
}
interface B{
public Object m1(); // Interface has no implementation
}


class Test impliments A,B{
public static void main(String a[]){
    public Object m1(){ // child class should be here not parent class ❌
        return null;
    }
}
}

</pre>
- co-varient concept doesn't apply on primitive type returntype


<pre>
interface A{
 public String m1(); // interface has no implementation // Non-primitive // static and public and final
}
interface B{
public Object m1(); // Interface has no implementation
}


class Test impliments A,B{
public static void main(String a[]){
    public String m1(){
        return null;
    }
}
}

</pre>
- Option A,B, Test
<pre>
interface A{
 public String m1(); // interface has no implementation // Non-primitive // static and public and final
}
interface B{
public Object m1(); // Interface has no implementation
}


class Test impliments A,B{
public static void main(String a[]){
    public Test m1(){  // Test has relation with both A and B and it is child to A and B. As per covarient concept child should be below and parent should be above.
        return null;
    }
}
}
</pre>
**CE**

<pre>
interface A{
 public String m1(); // interface has no implementation // Non-primitive // static and public and final
}
interface B{
public Object m1(); // Interface has no implementation
}


class Test impliments A,B{
public static void main(String a[]){
    public A m1(){ // A has no relation with B
        return null;
    }
}
}
</pre>
<pre>
interface A{
 public String m1(); // interface has no implementation // Non-primitive // static and public and final
}
interface B{
public Object m1(); // Interface has no implementation
}


class Test impliments A,B{
public static void main(String a[]){
    public B m1(){ // B has no relation with A
        return null;
    }
}
}
</pre>
Java 8 - 
In java 1.8 the static methods are allowed inside the interface.
As a result we were unable to use main method there.
<pre>
interface A{
    static void m1(){

    }
    public static void main(String a[]){

    }
}

Java 1.7 - static method wasn't allowed in interface.
- We would not able to use static method in interface. 
</pre>
Accessing the static method


<pre>
interface A{
    static void m1(){

    }
    public static void main(String a[]){
        m1();
        A.m1();
        // Through object is not possible
    }
}
</pre>

In java **1.8** the default methods are also allowed inside interface.

If we're declaring a class or interface  as public then it is mandatory to make the file name as class or interface name.


Interface - **END** 


















