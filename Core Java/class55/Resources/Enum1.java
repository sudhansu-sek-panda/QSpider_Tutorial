import java.util.Enumeration;
import java.util.Vector;
class Enum1{
    public static void main(String a[]){
        Vector v = new Vector();
        Vector c = new Vector();
        for(int i=0; i<=10;i++){
            v.add(i);
        }
        System.out.println(v);
        Enumeration e = v.elements();
        while (e.hasMoreElements()) { 
            Integer I = (Integer) e.nextElement();
            if(I%2==0){
                c.add(I);
            }
            
        }
        System.out.println(c);
        System.out.println(c == v);
    }
}