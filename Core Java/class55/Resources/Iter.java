import java.util.Iterator;
import java.util.Vector;
public class Iter {
    public static void main(String[] args) {
        Vector v = new Vector();
        for(int i = 1; i<=10;i++){
            v.add(i);
        }
        System.out.println(v);
        Iterator i = v.iterator();
        while(i.hasNext()){
            Integer a1 = (Integer) i.next();
            if(a1%2==0){
                i.remove();
            }
        }
        System.out.println(v);
    }
}
