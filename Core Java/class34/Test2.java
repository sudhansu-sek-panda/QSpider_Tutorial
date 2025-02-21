class Test3{
    static {
        System.out.println("static");
    } 
}

class Test2 extends Test3{
    static {
        System.out.println("static-2");
    }
    public static void main(String a[]){
                System.out.println("main");

    }
}