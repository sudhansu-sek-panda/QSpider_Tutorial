class Test extends Object{
    Test(int x){
        System.out.println("abc");
    }
 }

 class Demo2 extends Test{

    Demo2(){
        super(20);
        System.out.println("def");
    }
    
    public static void main(String a[]){

        Demo2 t1 = new Demo2();
    }
 }