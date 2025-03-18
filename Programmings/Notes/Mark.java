import java.util.Scanner;
public class Mark{
    public static void main(String a[]){
        System.out.println("ENter hte mark");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        scoreByStudent(value);
    }
    /* 
    public static void scoreByStudent(int mark){

       if(mark > 89)
        System.out.println("A");
       else if(mark < 90 && mark > 79) // the jvm will come to this block when if block is 
       System.out.println("B");
       else if(mark < 80 && mark > 69)
       System.out.println("C");
       else if(mark < 70 && mark > 59)
       System.out.println("D");
       else if(mark < 60)
       System.out.println("F");

    }
       */
      public static void scoreByStudent(int mark){

        if(mark >= 90)
         System.out.println("A");
        else if(mark >= 80) // the jvm will come to this block when if block is 
        System.out.println("B");
        else if(mark >= 70)
        System.out.println("C");
        else if(mark >= 60)
        System.out.println("D");
        else 
        System.out.println("F");
 
      }

}