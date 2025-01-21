# Returntype



The return statement must be the last statement inside any method otherwise we'll get compile time error saying unreachable statement.
<pre>
class Test{
    public int m1(){
        System.out.println("abc");
    }
    public static void main(String a[]){
        Test t1 = new Test();
    }
}
</pre>
***How can we print the return statement of any method?***

There are two ways to print the return statement of any method.
1. By directly
2. By storing it within a variable

### By Directly
***Non-Static method***
<pre>
class Test{
    public int m1(){
        System.out.println("abc");
        return 10;
    }
    public static void main(String a[]){
        Test t1 = new Test();
        t1.m1(); // returns only abc

        System.out.println(t1.m1()); // returns both abc and 10;
    }
}
</pre>

***Static method***
<pre>
class Test{
    public static int m1(){
        System.out.println("abc");
        return 10;
    }
    public static void main(String a[]){

        t1.m1(); // returns only abc

        System.out.println(t1.m1()); // returns both abc and 10;
    }
}
</pre>
### By storing it within a variable.

***Non-Static Method***
<pre>
class Test{
    public int m1(){
        System.out.println("abc");
        return 10;
    }

    public static void main(String a[]){
        Test t1 = new Test();
       int x =  t1.m1(); // returns only abc

        System.out.println(x); // returns 10;
    }
}
</pre>

***Static Method***
<pre>
class Test{
    public static int m1(){
        System.out.println("abc");
        return 10;
    }

    public static void main(String a[]){

       int x =  t1.m1(); // returns only abc // direct method

        System.out.println(x); // returns 10;
    }
}
</pre>

<pre>
class Test{
    public static int sum(int x, int y){
        int sum = x+y;
        return sum;
    }
    public static void main(String args){
        System.out.println(sum(10,20));
    }
}
</pre>
***Output***
<pre>
PS D:class18> javac Test2.java
PS D:class18> java Test2 

30
</pre>

<pre>
<b>Note1:</b> Void has no returntype. If we print the void method it will give error.   

<b>Note2:</b> If we'll simply call it will give no error.
</pre>
CE Note 1: 
<pre>
class Test{
    public static int sum(){
        int sum = x+y;
    }
    public static void main(String args){
        System.out.println(sum());
    }
}
</pre>
<pre>
CE Error

PS D:\Files\QSpider_Tutorial\Core Java\class18> javac Test2.java
Test2.java:4: error: missing return statement
    }
    ^
1 error
</pre>
CE Note2: 
<pre>
class Test{
    public static int sum(int x, int y){
        int sum = x+y;
        return sum;
    }
    public static void main(String args){
        System.out.println(sum());
    }
}
</pre>
***Output***
<pre>


Test2.java:8: error: method sum in class Test2 cannot be applied to given types;
            System.out.println(Test2.sum());
                                    ^
  required: int,int
  found:    no arguments
  reason: actual and formal argument lists differ in length
1 error
</pre>