class Test{
    Test(int x){
        //by default super
        System.out.println("abc");
    }
    Test(){
        this(10);
        System.out.println("def");
    }
    public static void main(String a[]){
        Test t1 = new Test();
    }
}