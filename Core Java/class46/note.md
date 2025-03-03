### Exception Handling
<pre> Interview Q: What is exception? </pre>
Exception is a unwanted or unexpected event which distrubs the normal flow of our Programme. 

Whenever an exception is raised JVM will stop the execution of the programme from that line only which will results in abnormal termination.

**Normal Flow**
<pre>
public class S {
   public static void main(String a[]) {
    System.out.println("Hyy");
    System.out.println("Hello");
    System.out.println("OK");
    System.out.println("Bye");
   }
}
</pre>
Output
<pre>
Hyy
Hello
OK
Bye
</pre>
**Exception**
<pre>
public class S {
   public static void main(String a[]) {
    System.out.println("Hyy");
    System.out.println("Hello");
    System.out.println(10/0);
    System.out.println("Bye");
   }
}

</pre>
Output
<pre>
Hyy
Hello
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at S.main(S.java:6)
</pre>
<pre>
Interview Q. Is it mandatory to handle an exception?
</pre>
<b>Yes</b>, it is mandatory to handle an exception in order to provide normal or graceful termination.
<pre>
Interview Q. What is exception handling?
</pre>
The alternative ways to provide to execute of a programme whenever an exception is raised is known as exception handling.

### Run Time Stack Mechanism

Run time stack mechanism is a process where we get to know how JVM is using stack to execute a programme, where it will create a stack frame for every new thread invokation. 
Thread means Method.

After the execution of the method JVM will remove the corresponding stack frame from the stack.

### Default Exception Handler
<pre>
public class B {
   public static void main(String a[]){
    int x = 20;
    m1();
   } 
   public static void m1(){
    m2();
   }
   public static void m2(){
    System.out.println(10/0);
   }
}
</pre>
<pre>
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at B.m2(B.java:11)
        at B.m1(B.java:8)
        at B.main(B.java:5)
</pre>

As soon as exception raised in a method, that method will be responsible to create an exception object with the following information. 

1. Name of the Exception
2. Description of the Exception
3. Location of the Exception

and handing over to JVM.
The JVM will look for the handling code in that method and if it doesn't finds the handling code then it will abnormally terminate that method and before that it will identify the caller(JVM or method). 

- After that JVM will move to the caller method in search for handling code, if it doesn't find the handling code there then the JVM will terminate the caller method too but abnormally. But here also it will identify the caller.

- This process will be done till main method and if the main method also doesn't contains the handling code then JVM will terminate the main method abnormally resulting in the abnormal termination of the programme.

At the end JVM will handover this exception object with the full information to the default exception handler and default exception handler will print the information in to the console. 