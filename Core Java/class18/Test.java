class Test{
    public int m1(){
        System.out.println("abc");
        return 10;
    }
    public static void main(String a[]){
        Test t1 = new Test();
        t1.m1(); // returns only abc
        System.out.println(t1.m1()); // returns both abc and 10;
    }
}