 class Test{
    Test(){
        System.out.println("abc");
    }
 }

 class Demo extends Test{

    Demo(){
        System.out.println("def");
    }
    public static void main(String a[]){
        Demo t1 = new Demo();
    }
 }

 abc
 def

  class Test{
    Test(){
        System.out.println("abc");
    }
 }

 class Demo extends Test{

    Demo(){
        super(10);
        System.out.println("def");
    }
    public static void main(String a[]){
        Demo t1 = new Demo();
    }
 }
