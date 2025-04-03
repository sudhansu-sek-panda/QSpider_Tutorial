import java.util.NavigableMap;

class Demo2{ 
    public static void main(String[] args) {
        NavigableMap tm = new NavigableMap() {
            
            
        tm.put(101,"sudhansu"); 
        tm.put(101,null); 
        tm.put(102,null); 
        // tailMap headMap firstKey
        tm.put(103,true);
        tm.put(104, 11.11);
        System.out.println(tm);
    //     higherKey - greater than value
    // ceiling key - grester than or equals to
    // floor key - less than or equals to
    // lowerKey
    // pollFirstEntry(); - deletes the first entry, if we'll print it then it will show which value it did delete
    // pollLastEntry() - deletes the last entry, if we'll print it then it will show which value it did delete.
    // }
    // descendingMap() - descending the value 
    tm.descendingMap();

}  

    }

    