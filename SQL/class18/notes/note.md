# 18-01-2025

# Method Signature


Method signature consists of method name and type of argument.

[m1(int] ); - m1 of int
[m1(float] f) - m1 of float
[m1(Test] s) - m1 of Test

[m1(int] x, [int] y) - m1 of int int

Creating multiple methods with same method signature in a single class is an invalid java syntax.
<pre>
class Test{
    public void m1(int x){
        System.out.println("abc");
    }
    public void m1(int x){
        System.out.println("def");
    }
    public static void main(String args){
        Test t1 = new Test();
        t1.m1(10);
    }
}
</pre>
<pre>
Output:
CE 
m1(int ) 
</pre>





