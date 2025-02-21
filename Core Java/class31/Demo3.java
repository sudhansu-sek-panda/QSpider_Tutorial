class Test extends Object{
    Test(int x){
        System.out.println("abc");
    }
 }

 class Demo3 extends Test{

    Demo3(){
    
        System.out.println("def");
    }
    
    public static void main(String a[]){

        Demo3 t1 = new Demo3();
    }
 }
