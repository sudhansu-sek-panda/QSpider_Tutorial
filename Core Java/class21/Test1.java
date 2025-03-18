public class Test1 {
    public void m1(byte b){
        System.out.println("abc");
    }
    public void m1(int a){
        System.out.println("def");
    }
    public static void main(String a[]){
        Test1 t1 = new Test1();
        t1.m1(10);
        t1.m1((int)10);
        t1.m1((byte)10);
    }
}
