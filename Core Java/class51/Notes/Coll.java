import java.util.*;
public class Coll {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        System.out.println(l); // print content which is empty
        l.add(111); // adds in the l1
        l.add(222); // adds in the l1
        l.add(333); // adds in the l1
        System.out.println(l); // print content which is 111 222 333
        ArrayList l2 = new ArrayList(); 
        System.out.println(l2); // second collection prints content empty
        l2.add("aaa");
        l2.add("bbb");
        l2.add("ccc");
        System.out.println(l2); // print content aaa bbb ccc
        l2.add(l); // adds entire l content l2
        System.out.println(l2);  // prints all content of l2 then l1
        l.add("000");
        System.out.println("This is L added 000 "+l);
        l2.add(l);
        System.out.println(l2);
        // boolean ab = l2.contains(l);
        boolean ab = l2.containsAll(["aaa","bbb"]);
        // l2.clear();
        // l2.removeAll(l2);
        System.out.println(ab);
        System.out.println("")

    }
}


