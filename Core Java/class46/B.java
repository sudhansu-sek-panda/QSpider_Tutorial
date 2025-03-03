
public class B {
   public static void main(String a[]){
    int x = 20;
    m1();
   } 
   public static void m1(){
    m2();
   }
   public static void m2(){
    System.out.println(10/0);
   }
}
