
public class Test {
public void finalize(){
    System.out.println("Finalize method ");
}    
public static void main(String a[]){
    System.out.println("main start ");
    Test t1 = new Test();
    t1 = null;
    System.gc();
}
}
