### Abstract Modifier
Abstract modifier is the modifier which is applicable for methods, and classes but not for variables.

### Abstract Method
No Implimentation, Only declaration

Abstract method is a method which is declared but not implemented.    

**Only Declaration**
<pre>
abstract void m1();
</pre>
**Compile time Error**
<pre>
abstract void m1(){
    ❌ CE - No implementation allowed in abstract method
}
</pre>

### Abstract Class
<pre>
abstract class A{
    abstract void m1();
}
</pre>

if a method is declared as abstract then we have to declare class as an abstract otherwise we'll get CE(Compile time Error).

<pre>
abstract class Test{
    abstract void m1();
}
</pre>
**Compile time Error**

<pre>
 class Test{ ❌ 

    abstract void m1();
}
</pre>
It is mandatory to declare the class as abstract as it contains abstract method
- We could not create the object of the abstract class. 
<pre>
abstract class Test{ 

    abstract void m1(); ❌
    public static void main(String a[]){
        Test t1 = new Test(); 
    }
}
</pre>
- So child class is responsible for providing implimentation.
- If the child class is not providing implimentation for all the abstract methods present in parent class then we've to declare child class as abstract.

- Abstract class will contain not-abstract methods.
- Abstract class can contain both both concrete [normal ] as well as abstract method.
<pre>
abstract class {
    abstract method
    concrete method
} 
</pre>
- Abstract class can contin zero no of abstract method.

[⬅️ Previous    ]()   | [Next ➡️]()