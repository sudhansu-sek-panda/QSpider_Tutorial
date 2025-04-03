import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class Demo3 {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();
        tm.put(101, "hello");
        tm.put(102, true);
        tm.put(103, null);
        tm.put(104, 11.11);
        System.out.println(tm);
        Set<Map.Entry> s = tm.entrySet();
       for(Map.Entry e:s){
        System.out.println(e.getKey() + " - " + e.getValue());
       }
      for(Map.Entry e:s){
        Integer i = (Integer) e.getKey();
        if(i == 101 || i == 102 || i == 103){
            e.setValue("happy");
           }
      }
      System.out.println(tm);
    }
}
