
public class Demo {
    
}
//  Accounts class is used to store the account information
class Accounts{
   
        String accNo;
        String accName;
        String accType;
        int balance;

        Accounts(String accNo, String accName, String accType, int balance){
            this.accNo = accNo;
            this.accName = accName;
            this.accType = accType;
            this.balance = balance;
        }
    }

// Transition class is used to store the Transaction operation like withdraw
class Transaction{
    public void withdraw(Accounts acc, int wd_Amt){
        // Print all the details
        System.out.println("Transaction Details");
        System.out.println("--------------------");
        System.out.println("Account Number" +acc.accNo ); // String
        System.out.println("Account Name"+ acc.accName); // String
        System.out.println("Account Type"+ acc.accType); // String
        System.out.println(" Withdraw Amount "+ wd_Amt); // parameter from withdraw method
        if (acc.balance>wd_Amt) {
            acc.balance = acc.balance-wd_Amt;
            System.out.println("The total balance is:"+ acc.balance);
            System.out.println("");
            
        }


    }
}