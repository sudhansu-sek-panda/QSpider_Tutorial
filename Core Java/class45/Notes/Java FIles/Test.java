public class Test{
public static void main(String a[])
{
   Integer I1 = new Integer(10); //primitive type as an argument
   Integer I2 = new Integer("10");  // String type as an argument
   Integer I3 = new Integer('a');  // Parsable to Integer type object
//    Integer I4 = new Integer();  // Character type object
   System.out.println(I1); // Printing Object 
   System.out.println(I2); // Printing Object 
   System.out.println(I3); // Printing Object 
  
}
}