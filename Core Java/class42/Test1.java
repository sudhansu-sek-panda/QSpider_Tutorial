public class Test1 extends String {
    public void finalize(){
        System.out.println("finalize method called");
    }
    public static void main(String[] args) {
        String s1 = new String();
        s1 = null;
        System.gc();
    }
   
}