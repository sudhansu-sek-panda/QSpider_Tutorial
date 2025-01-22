public class Test2 {
    public void m1(byte b){
        System.out.println("abc");
    }
    public void m1(short s){
        System.out.println("def");
    }
    public static void main(String a[]){
        Test2 t1 = new Test2();
       // t1.m1(10); // CE
        t1.m1((byte) 10);
        t1.m1((short)10 ); // 10;
    }
}
