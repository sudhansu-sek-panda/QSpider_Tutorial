# Interface

- It is similar to class but not same as class because the functionality of like we can't create object of an interface.

- To create an interface we required interface keyword.


**class Test**

class Test{
    Test t1 = new Test();
    // NOn-static object with non-primitive
}
Compilation SUccessfull

**Interface Test**

interface Test{
    Test t1 = new Test();
    // NOn-static object with non-primitive
}

**CE - Inteface can't create object.**

**The interface came into picture to enjoy the fuctionalities of multiple inheritance.**

### case 1:
<pre>
class A{

}
class B extends A{

} 
</pre>
### case 2:
<pre>
class A {

}
interface B impliments/ extends A{

} ❌ Not possible
</pre>
### case 3:
<pre>
interface A{

}
class B impliments A{

}
</pre>
### case 4:
<pre>
interface A{

}
interface B extends A{

}
</pre>
**case1:** class - class -> extends   
**case2:** class - interface -> Not Possible   
**case3:** interface - class -> impliments  
**case4:** interface - interface -> extends   


**Interface could achieve multiple inheritance:**
<pre>
interface A
{

}
interface B{

}
class C impliments A,B {

}
</pre>

### Interface Variable:
<pre>
interface A{
    int x =10;
}
</pre>

The variable which is declare inside an interface is by default treated as **public**, **static** and **final**.

Non-static variables are not possible in interface.
How to
**write a programm to proof the interface variables are by default static.**
interface - fullly abstract class
<pre>
interface A{
    int x = 10;
    public static void main(String a[]){
        A a1 = new A();
        a1.x(); // WE could not create object of interface
    }
}
</pre>
### Main method in the interface
<pre>
interface A{
    int x = 10;
    public static void main(String a[]){
        System.out.println(x);
        System.out.println(A.x);
    }
}
</pre>
### Through another class
<pre>
interface A{
        int x = 10;

}
class Test implements A {
public static void main(String a[]){
        System.out.println(x);
        System.out.println(A.x); // interface 
        System.out.println(Test.x); // class
    }
}
</pre>
### Write a programme to proof the interface variable is by default final
<pre>
interface A{
    int x = 10;

}
class Test implements A {
     x = 20; // bydefault it is final and provide CE
public static void main(String a[]){
   
    System.out.println(x);
    System.out.println(A.x);
    System.out.println(Test.x);
}
}
</pre>
if there are two variables with same name (a static and a local variable name) then priority always goes to local variable.
<pre>
interface A{
    int x = 10;

}
class Test implements A {
public static void main(String a[]){
    x = 20;// local variable // priority // directly call of static variable will not work here rather local
    System.out.println(x); // directly printlng priority based local variable
    System.out.println(A.x); // static variable through interface calling
    System.out.println(Test.x); // static variable of Test class
}
}
</pre>
