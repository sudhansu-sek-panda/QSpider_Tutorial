### finalyze method - <u>finalyze()</u>
It is the type of the method which is called by the garbage collector to destroy the useless object of our class.

### Useless Object
An object without object reference is known as useless object.

**How to make an object useless?**

There are three ways to make an object useless.
1. Nullifying the **reference variable**
2. Reasigning the **reference variable**.
3. Object created inside any method

Methods and variable stored in stack area.
Objects stored in heap area.

1. Nullifying the reference variable
If we're assigning null to any object reference then that object will become useless and that pprocess is known as nulyfiying the reference variable.

<pre>
class Test{
    public static void main(){
        Test t1 = new Test(); 
         System.out.println(t1); // address
        t1 = null;
        System.out.println(t1); // assigned null // the previous object becomes useless
    }
}
</pre>
**Output**
<pre>
javac Test.java - ✅
java Test - Run with Exception
</pre>
<pre>
10
Exception in thread "main" java.lang.NullPointerException: Cannot read field "x" because "<local1>" is null
        at Test.main(Test.java:9)
</pre>
<pre>
class Test{
    int x = 10;
    public static void main(){
        Test t1 = new Test();
         System.out.println(t1.x); // 10
        t1 = null; // assigned null
        System.out.println(t1.x); // Null Pointer Exception // the previous object becomes useless
    }
}
</pre>

2. Reasigning the reference variable
3. Object created inside any method










[Previous]() | [Next]()