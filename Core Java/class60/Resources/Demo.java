import java.util.HashMap;

class Demo{
    public static void main(String[] args) {
        HashMap hm = new HashMap(); // Initial Capacity 16 and Empty, fill ratio = 0.75
        System.out.println("\n \n The HashMap is Empty: "+hm.isEmpty());
        System.out.println("The size of the HashMap is: "+ hm.size());
        
        hm.put("name", "Sudhansu");
        hm.put(124, "A"); 
        System.out.println("The size of the HashMap is: "+ hm.size());
        System.out.println("The HashMap is Empty: "+hm.isEmpty());
        System.out.println(hm);
        System.out.println(hm.get("name"));
        System.out.println(hm.containsKey("name"));
        System.out.println(hm.containsValue("B"));
        System.out.println("The size of the HashMap is: "+ hm.size());
        hm.clear();
        System.out.println(hm);
        System.out.println("The HashMap is Empty: "+hm.isEmpty());
    }
}