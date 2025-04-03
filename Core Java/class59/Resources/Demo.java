import java.util.*;


public class Demo{
    public static void main(String[] args) {
        TreeSet t1 = new TreeSet(new Descending());
        t1.add(150);
        t1.add(10);
        t1.add(80);
        t1.add(0);
        t1.add(20);
        System.out.println(t1);
        // System.out.println(t1.descendingSet());

    }
}
class Descending implements Comparator{
    @Override
    public int compare(Object o1, Object o2){
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
    //     if (i1>i2) {
    //        return -123;
    //     }
    //     else if(i1<i2){
    //         return +123;
    //     }

    //     else{
    // return 0;
    //       
    // return i1.compareTo(i2); 
    return i2.compareTo(i1); 
    }
       
    }
// to save time for the entire code developers developed descendingSet in the Navigable set.

