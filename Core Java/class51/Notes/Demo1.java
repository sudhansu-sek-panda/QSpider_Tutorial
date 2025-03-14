
// public class Demo1 {
//     public static void main(String[] args) throws Demo1{
//         /*{ OUTPUT - CE
//          *  incompatible types: Demo1 cannot be converted to Throwable
//             public static void main(String[] args) throws Demo1{                                               ^
//             1 error
//         } */
        
//     }
// }



public class Demo1 extends Exception{
    public static void main(String[] args) throws Demo1{
        /*{ OUTPUT 
        } */
        
    }
}