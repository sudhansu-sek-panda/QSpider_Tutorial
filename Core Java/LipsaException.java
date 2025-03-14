public class LipsaException extends Throwable{
        public static void main(String[] args) {
        try {
            
            throw new LipsaException();
        } catch (LipsaException e) {
           System.out.println(e);
        }
      
      
           
            
        
        
    }
   
}


//  Throwable -> Exception -> AE(), NPE(), 