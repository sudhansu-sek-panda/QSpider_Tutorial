public class Test{
    public void m1(int x){
        System.out.println("abc");
    }
    public void m1(float f){
        System.out.println("def");
    }
    public static void main(String a[]){
        Test t1 = new Test();
        // Exact match > Normal Match
        t1.m1(10); //or
        t1.m1((float)10); // widening by programmer
        // or
        t1.m1('a'); // Ascii code of 'a' is 97 // it is upcasting by compiler // b - string - int - b -> f -> double
        // or
        t1.m1(2.5f ); 
        t1.m1((float) 2.5);

        t1.m1(23L);
        // t1.m1(2.5);
        t1.m1((int) 2.5);
        // b1-> S -> int -> l -> f -> double
    }
}
// soumya - double type  possible lossy conversion of float to double
// w - c




