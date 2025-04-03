public class Test {
    public static void main(String[] args) {
        // System.out.println(10/0);
       try{
        throw new ArithmeticException();
       }
       catch(Exception e){
        System.out.println("hyy");
    }
}


}
