public class MethodOverloading{
    public static void main(String a[]){
        Coffee f1 = new Coffee();
        System.out.println("\nLets Prepare Coffee! \n `````````````````````````` \n");
        System.out.println();
        f1.ingr("Bru");
        f1.ingr(1);
        f1.ingr(0.5f);
        System.out.println("Keep it on fire and Coffee Prepared \n \n ");
        System.out.println("Coffee Prepated \n");

    }
}

 class Coffee{
    public void ingr(int sugar){
        System.out.println("Sugar Amount: " + sugar + " gm");
 return ;
    }
    public void ingr(String coffeeName){
        System.out.println("Coffee: " + coffeeName);
        return ;
    }
    public void ingr(float milk){

        System.out.println("Milk Amount:" + milk + "in liter");
        return ;
    }
}