public class LocalVariable {
    public static void main(String []args){
        int x = 10;
        if(true){
            int y = 20;
            x = x+y;
        }
        System.out.println(x);
        // System.out.println(y); // Provide Error - Can't find symbol y
    }
}
