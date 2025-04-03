import java.util.*;
class Demo{
    public static void main(String arg[]){
        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put(101,"Hello");
        lhm.put('a',null);
        lhm.put(null,100);
        lhm.put(null,true); // override the value
        lhm.put("wow",11.11);
        lhm.put(101,false); // override the value, 
        System.out.println(lhm);
    }
}