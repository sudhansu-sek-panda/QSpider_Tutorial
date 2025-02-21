interface A{
    int x = 10;

}
class Test implements A {
public static void main(String a[]){
    System.out.println(x);
    System.out.println(A.x);
    System.out.println(Test.x);
}
}