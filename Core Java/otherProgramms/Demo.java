public class Demo {
    public static void main(String[] args) {
        m1();
    }
    public static void m1() throws InterruptedException{
        m2();
    }
    public static void m2() throws InterruptedException{
        Thread.sleep(1000);
    }
}
