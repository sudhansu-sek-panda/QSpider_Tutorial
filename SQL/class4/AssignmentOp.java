package class4;

public class AssignmentOp {
    public static void main(String[] args) {
        // Three types of assignment operators are there
        // Simple Assignemnt
        // Chained Assignment
        // Compound Assignment
        int a = 10; //Simple assignment
        int b = 20; // Simple Assignment
        System.out.println(a);
        System.out.println(b);
        int x,y,c,d;
        x=y=c=d = 30; // Chained Assignment
        System.out.println(x);
        System.out.println(y);
        System.out.println(c);
        System.out.println(d);
        // Compound Assignment
        int num = 2;
        // num+= means num = (byte) num+1;
        num += 3;
        num -=4;
        num *=5;
        num /=6;
        System.out.println(num);
        if(num>=23){
            System.out.println("It is a compound Assignment");

        }
        // Note: resultant max(int typeOf(x) type of(y))

        /*
         * byte + byte = int (int is greater)
         * int + byte = int (int is greater)
         * short + byte = int (int is greater)
         * int + long = long (long is freater)
         * long + float = float is greater
         * float + double = double (double is greater)
         * double + long = long is greater
         * length - this keyword is  used to find out the length of a string
         * print or println is a method to display the values in the output screen
         * 
         * String + variable = string
         * anything with string is treated as string.
         * 
         * 
         */

        


    }
}
