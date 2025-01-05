


public class Print{
    public static void main(String args[]){
        // Print 1 to 10 using for - loop
        System.out.println("From 1 to 10 usinf iterations (for loop)");
        for(int i = 1; i<= 10;i++){
            System.out.println("           " + i );
        }

        // Print 10 to 1 using for - loop
        System.out.println("From 10 to 1 using iterations (for loop)");
        for(int i = 10; i>0; i--){
            System.out.println("                    "+i);
        }

        //Print 1 to 10 as taking iteration from 10 to 1
        System.out.println("Print 1 to 10 as taking iteration from 10 to 1");
        for(int i = 10; i> 0; i--){
            System.out.println("                     " + (10-(i-1)));
        }
    }


}
































