class Test{
    Test(){
        System.out.println("abc");
    }
 }

 class Demo1 extends Test{

    Demo1(){
        super();
        System.out.println("def");
    }
    public static void main(String a[]){
        Demo1 t1 = new Demo1();
    }
 }