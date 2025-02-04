interface A{
    int x =10;
}

class Test1 impliments A{
    public static void main(String[] args) {
        int x = 20;
        System.out.println(x);
        System.out.println(A.x);
        System.out.println(Test1.x);

    }
}

