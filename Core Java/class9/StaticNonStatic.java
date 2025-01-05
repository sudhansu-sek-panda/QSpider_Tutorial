class StaticNonStatic{
    int x = 10;
    static int y =20;
    public static void main(String [] args){
        StaticNonStatic t1 = new StaticNonStatic();
        StaticNonStatic t2 = new StaticNonStatic();
        System.out.println(t1.x);
        System.out.println(t1.y);
        System.out.println(t2.x);
        System.out.println(t2.y);
        t1.x = 111;
        t2.y = 222;
        System.out.println(t1.x);
        System.out.println(t1.y);
        System.out.println(t2.x);
        System.out.println(t2.y);
        
    }
}