public class StaticVariable {
    static int x =10;
    public static void main(String[] args) {
        StaticVariable t1 = new StaticVariable();
        System.out.println(x);
        System.out.println(t1.x);
        System.out.println(StaticVariable.x);
    }
}
