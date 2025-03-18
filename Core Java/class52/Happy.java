
import java.util.Vector;

public class Happy {
    public static void main(String[] args) {
        Vector v = new Vector(); 
        v.addElement(124);
        v.addElement(false);
        v.addElement(null);
        v.addElement(1.1);
        v.addElement(null);
        v.addElement("hi");
        System.out.println(v);
        System.out.println(v.removeElement(null));
        System.out.println(v);
        v.removeElement(0);
        System.out.println(0);
        System.out.println(v);
        v.removeAllElements();
        System.out.println(v);
    }
    // any programming language - basi syntax
    
}
