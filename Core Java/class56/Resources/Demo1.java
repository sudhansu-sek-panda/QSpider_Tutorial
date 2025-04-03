import java.util.HashSet;
class Demo1{
    public static void main(String a[]){
        HashSet hs1 = new HashSet(16);
        hs1.add("aaa");
        hs1.add(11);
        hs1.add(true);
        hs1.add(2.5);
        System.out.println(hs1);
        System.out.println(hs1.add(11)); // returns false
        System.out.println(hs1); // no new duplicate data allowed
        System.out.println(hs1.isEmpty());
        System.out.println(hs1.size());
        System.out.println(); 
        

    }
}