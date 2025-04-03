import java.util.ArrayList;
import java.util.ListIterator;
class Demo{
    // main method
    public static void main(String args[]){
        ArrayList a1 = new ArrayList();
        a1.add("aaa");
        a1.add("bbb");
        a1.add("ccc");
        a1.add("ddd");
        a1.add("ddd");
        ListIterator li = a1.listIterator();
        // forward element
        while (li.hasNext()) {
            System.out.println(li.nextIndex() + " " + li.next());
        }
        while (li.hasPrevious()) { 
            System.out.println("\n " + li.previousIndex()+ " " + li.previous());
        }
    }
}