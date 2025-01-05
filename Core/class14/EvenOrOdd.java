class EvenOrOdd{
    public static void main(String args[]){
        // Print even or odd from 1 to 10 using iterations where the iteration should begin from 10.
         System.out.println(" even or odd from 1 to 10 using iterations where the iteration should begin from 10");
         for(int i = 10; i > 0 ; i--){
            int x = 10 - (i-1) ;
            if(x%2 == 0)
            System.out.println(x + " ----- It's even ");
            else
            System.out.println(x + " ------ It's odd");
         }
         // Print even and odd from 10 to 1 using iterations 
         System.out.println("even and odd from 10 to 1 using iterations ");
         for(int x = 10; x > 0; x--){
            if(x%2==0)
            System.out.println(x+ "  It's even");
            else
            System.out.println(x+ "   It's odd");
         }
    }
}