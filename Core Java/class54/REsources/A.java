import java.util.Stack;
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