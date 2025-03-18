import java.util.Scanner;
public class CurrencyCal {
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt(), notes;
        if (amount >= 2000) {
            notes = amount/2000;
            System.out.println("There will be "+ notes);
            amount = amount % 2000;
        }
        if (amount >= 500) {
            notes = amount/500;
            System.out.println("There will be "+ notes);
            amount = amount % 500;
        }
        if (amount >= 100) {
            notes = amount/100;
            System.out.println("There will be "+ notes);
            amount = amount % 100;
        }
        if (amount >= 50) {
            notes = amount/50;
            System.out.println("There will be "+ notes);
            amount = amount % 50;
        }
        if (amount >= 10) {
            notes = amount/10;
            System.out.println("There will be "+ notes);
            amount = amount % 10;
        }
        if (amount >= 1) {
            notes = amount/1;
            System.out.println("There will be "+ notes);
            amount = amount % 1;
        }
    }
   
    
}

// if else - for greater or less than 
// rem - % for getting th 1673
// quotient - / for the number of count
// a loop 
// numbers - 2000, 500, 100, 50, 10, 1


// String s = "";
/*
 * rem = num;
 * if(rem > 2000){
 * rem = num % 2000
 * num = num
 * s = quotient;
 * }
 * 
 *  public static void curCal(int value){
        String s = " ";
        while((rem == 0) OR (rem < 1)){
            System.out.println(" ");
        }
 */
