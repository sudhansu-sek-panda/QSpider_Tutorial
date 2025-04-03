
import java.util.LinkedHashSet;

public class Demo2 {
 public static void main(String arg[]){
    LinkedHashSet lhs = new LinkedHashSet();
    lhs.;
    lhs.add("aaa");
    lhs.add(true);
    lhs.add(2.5);
    System.out.println(lhs);
    System.out.println(lhs.add(true));
    lhs.addFirst(123);
    lhs.addLast("sudhansu");
   //  lhs.forEach(action);
   // lhs.add(lhs)
   lhs.getFirst(); // blank space in the terminal // need to print the return type
   lhs.getLast(); // blank space in the terminal // need to print the return type
    System.out.println(lhs);
    System.out.println(lhs.getFirst());// it fetch the first element of the LinkedHashSet
    System.out.println(lhs.getLast()); // it fetch the last element of the LinkedHashSet
    System.out.println(lhs.getClass()); // It returns the run time class 
    System.out.println(lhs.size()); // returns the no of objects present in the LinkedHashSet
    System.out.println(lhs.iterator()); // it returns the reference
    System.out.println(lhs.parallelStream()); // reference
    System.out.println(lhs.removeFirst()); // removes the element and returns the element as object. // Every method has exception
    System.out.println(lhs.removeLast()); // removes the last element and returns element as object // NoSuchElementException
    System.out.println(lhs); // printing the LinkedHashSet
    System.out.println(lhs.hashCode()); // printing the unique values
    System.out.println(lhs.toString()); // printing the object instead address, as toString method is overridden in collections 
    System.out.println(lhs.isEmpty()); // returns the boolean value, either true or false
   //  System.out.println(lhs.remove());
   // lhs.wait(1000); InterruptedException
   // System.out.println(lhs.);

 }   
}
