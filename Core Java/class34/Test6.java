public class Test6 {
    static int x =10;
   
    static{
        m1();
        System.out.println("sb-1");
    }
    public static void m1(){
        System.out.println(y);
    }

    public static void main(String a[]){
        m1();
        System.out.println("main");
    }
    static{
        m2();
        System.out.println("sb-2");
    }
    public static void m2(){
        System.out.println(x);
    }
    static int  y =20;
}

//  20 -> 