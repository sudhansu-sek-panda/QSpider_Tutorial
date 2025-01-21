public class Test{
    public void m1(int x){
        System.out.println("abc");
    }
    public void m1(int x){
        System.out.println("def");
    }
    public static void main(String args){
        Test t1 = new Test();
        t1.m1(10);
    }
}