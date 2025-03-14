public class Demo{
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        } catch (NullPointerException e) {

        }
        finally{
            System.out.println("finally");
        }
    }
}