import java.util.TreeMap;

class Demo{
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();
        tm.put(101,"sudhansu"); 
        tm.put(101,null); 
        tm.put(102,null); 
        // tailMap headMap firstKey
        tm.put(103,true);
        tm.put(104, 11.11);
        System.out.println(tm);
        System.out.println("first key:  " + tm.firstKey() +" and last key: "+ tm.lastKey() +" \n \n first entry:   "+tm.firstEntry()+ " and last entry: " + tm.lastEntry());
        System.out.println(tm.headMap(103));
        System.out.println(tm.tailMap(103));
        System.out.println(tm.subMap(102, 104));
    }
}