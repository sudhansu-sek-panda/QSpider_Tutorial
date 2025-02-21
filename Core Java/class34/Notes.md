### Copy Constructor

### Blocks
There are two types of Block.

1. Startic Block
2. Non-Static Block

### Static-Block

It is the block which is getting executed automatically before the main method.

class Test{
    static {
        System.out.println("static");
    }
    public static void main(String a[]){
                System.out.println("main");

    }
}

After 1.5 version of java it is mandatory to priovide main method inside the programme

class Test{
    static {
        System.out.println("static");
    }
}

We can compile but we can't able to run.

Execution starts from main method.


class Test{
    static {
        System.out.println("static");
    }
}
java Test.java

output - static 
Can't find main(String a[])

class Test{
    static {
        System.out.println("static");
        System.exit(0);
    }
}
java Test.java

flow??
memory

We can provide multiple static block inseide a class, but the flow of execution of a static block will be from top to buttom and after the execution of the static block the main method will getting executed.

<pre>
class Test{
    static {
        System.out.println("static-1");
    }
   
    public static void main(String a[]){
                System.out.println("main method");

    }
    static {
        System.out.println("static-2");
    }
}
</pre>
<pre>
static - 1
static - 2
main method
</pre>
**Step 1** 
Identification of static data members from top to buttom and at the time of the identification the JVM will provide the default value to the variables.

**step - 2**
Initialization of static variable as well as execution of static block from top to bottom.

**step - 3**
Execution of main method
<pre>
public class Test6 {
    static int x =10;
    static{
        m1();
        System.out.println("sb-1");
    }
    public static void m1(){
        System.out.println(y);
    }

    public static void main(String a[]){
        m1();
        System.out.println("main");
    }
    static{
        m2();
        System.out.println("sb-2");
    }
    public static void m2(){
        System.out.println(x);
    }
    static int  y =20;
}

</pre>

Output

<pre>
0
sb-1
10
sb-2
20
main
</pre>

### Static Control Flow

































without
static 
main