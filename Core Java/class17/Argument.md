# Argument 
Argument means input to the method
Argument are of two types.
1. Primitive Type (int, byte, char, ...)
2. Non-Primitive Type (class name)

At the time of method declaration we couldn't initialize any variable inside the argument part of any method.  
m1(int x = 10) ❌  
m1(int x) ✅  
m1(String f) ✅  
m1(char c) ✅

int 

Calling of a non static method with primitive type as an argument.
**<pre>
class Test {
    public void m1(int x){
        System.out.println(" M1 Method");
    }
    public static void main(String a[]){
        Test t1 = new Test();
        t1.m1();
    }
}
</pre>**

<pre>
❌
</pre>
<pre>
class Test {
    public void m1(int x){
        System.out.println(" M1 Method");
    }
    public static void main(String a[]){
        Test t1 = new Test();
        t1.m1(10);
    }
}
</pre>

<pre>
✅
</pre>

<pre>
class Test {
    public void m1(int x, int y){
        System.out.println(" M1 Method");
    }
    public static void main(String a[]){
        Test t1 = new Test();
        t1.m1(10);
    }
}
</pre>
<pre>
❌
</pre>
<pre>
class Test {
    public void m1(int x, int y){
        System.out.println(" M1 Method");
    }
    public static void main(String a[]){
        Test t1 = new Test();
        t1.m1(10,20);
    }
}
</pre>
<pre>
✅
</pre>


## Calling of a non-static method with non-primitive type as an argument
<pre>
class Test {
    public void m1(String s){
        System.out.println(" M1 Method");
    }
    public static void main(String a[]){
        Test t1 = new Test();
        t1.m1("abc");
        t1.m1(new String());
        t1.m1(null);
    }
}
</pre>
**Note: Every non-primitive data type has default value null**
<center>
<table>
<tr>
<th>
String
</th>
<th>
Test
</th>
<th>
Demo
</th>
</tr>
<tr>
<td>
"abc"
</td>

<td>
</td>

<td>
</td>
</tr>
<tr>

<td>new String()
</td>

<td>
new Test()
</td>

<td>
new Demo()
</td>
<tr>

<td>
null
</td>

<td>
null
</td>

<td>
null
</td>
</tr>
</table>
</center>
<pre>
class Test {
    public void m1(Test t){
        System.out.println(" M1 Method");
    }
    public static void main(String a[]){
        Test t1 = new Test();
        t1.m1(new Test());
        t1.m1(null);
        t1.m1(t1);
    }
}

</pre>
<pre>
Output:
M1 Method
M1 Method
M1 Method
</pre>


