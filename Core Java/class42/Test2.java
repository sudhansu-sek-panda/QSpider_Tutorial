
public class Test2 {
    
    public void finalize(){
        System.out.println("finalize method called");
    }
    public static void main(String[] args) {
       Test2 t1 = new Test2();
        t1 = null;
        System.gc();
    }
    // System.out.println(  );

}
