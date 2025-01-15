class Test{
    public static void m1(){ // static method
        System.out.println("static method");
    } 


    public static void main(String a[]){ //static main method
    //By directly
        m1(); // static method
        //By class name
        Test.m1(); // static method 

        //By object
        Test t1 = new Test();
        t1.m1(); // static method
    }


}