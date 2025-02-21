### Constructor Overloading

Creating multiple constructor with same name but differnt type of argument is known as constructor overloading.

class Test{
    Test(float f){
        System.out.println("ABC");
    }
    Test(int a){
        System.out.println("DEF");
    }
    public static void main(String a[]){
        Test t1 = new Test(2.5f);
        Test t2  = new Test(20);
    }
}