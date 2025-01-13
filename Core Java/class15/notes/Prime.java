public class Prime{
    public static void main(String args[]){
        int num = 7;
        int i ;
        int count = 0 ;
        if(num == 0 || num ==1)
        System.out.println("Prime Number Starts from 2");
        for(i=2 ; i<num; i++){                    // start loop
            
            if(num%i == 0){                 
                count ++;
                break;
            }                                
        } // end loop
        if(count == 0)
        System.out.println(num+ " Is a Prime Number");
    else
    System.out.println(num + " Not a Prime Number");
    
    }
    
}