### Stack
It is another legacy class and a child class of vector.
-> WHenever we want LIFO(Last in First out) order of execution at that moment of time we will go to Stack.
-> This datastructure is internally used by JAVA as well.

### Methods
1. **Object push(Object o);**
Add element in the stack.
2. **Object pop();**
Remove the lement from the top of the stack.
3. **Object peek();**
Return the element from the top of the stack.
4. **boolean empty();**
Return true if empty or else false.
5. **int search(Object o);**
Return the offset if the element is present or else it will -1.

### CONSTRUCTOR
package - import java.util.**Stack**;  
 **Stack s = new Stack();**  
EX:
<pre>import java.util.Stack;
public class A{
    public static void main(String a[]){
        Stack s = new Stack();
        System.out.println(s.empty()); // true
        s.push("Hyy");
        s.push(1000);
        s.push(null);
        s.push(1.1);
        s.push('a');
        System.out.println(s); // Hyy, 1000, null, 1.1, 'a' 
        System.out.println(s.pop()); //a
        System.out.println(s); //Hi,1000,null,1.1
        System.out.println(s.peek()); //1.1
        System.out.println(s.empty()); // false
        System.out.println(s.search(1000)); //3
        System.out.println(s.search(2)); // -1
    }
}
</pre>
**Compilation**
<pre>
javac A.java

Note: A.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

java A
</pre>

 **Output** 
<pre>
true
[Hyy, 1000, null, 1.1, a]
a
[Hyy, 1000, null, 1.1]
1.1
false
3
-1
</pre>