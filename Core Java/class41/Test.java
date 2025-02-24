

public class Test {
        int x = 10;
        public static void main(String []a){
            Test t1 = new Test();
             System.out.println(t1.x); // 10
            t1 = null; // assigned null
            System.out.println(t1.x); // Null Pointer Exception // the previous object becomes useless
        }
    }

