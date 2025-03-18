import java.util.*;
public class Demo{
    public static void main(String[] args) {
        Vector r = new Vector();
        Vector r1 = new Vector();
        r1.add(111);
        System.out.println(r);
        r.capacity();
        System.out.println(r);
        r.addElement(r1);
    }
}