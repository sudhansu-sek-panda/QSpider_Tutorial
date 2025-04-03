
import java.util.Arrays;


public class Demo2 {
  public static void main(String[] args) {
    char ch[] = {'a','b','c'};
    System.out.println(Arrays.toString(ch));
    String s = new String(ch);
    System.out.println(s);
    String s1 = "Hello";
    char x[] = s1.toCharArray(); 
    System.out.println(Arrays.toString(x));
    for(char a:x){
        System.out.println(a);
    }
  }  
}
