

public class Demo1 {
    public static void main(String[] args) {
        System.out.println(m1());
    }
    public static int m1(){
        try {
            return 10;
        } catch (Exception e) {
            return 20;
        }
        finally{
            return 30;
        }
    }
}

// If there is a return statement present inside try, catch and finally block then priority will be given to finnaly block statement.

