class Test{
    int roll;
    String name;
    Test(int roll1, String name1){
        this.roll = roll1;
        this.name = name1;
    }
    Test(Test ref){
        this.roll = ref.roll;
        this.name = ref.name;
    }
    public static void main(String a[]){
        Test t1 = new Test(101, "abc");
        System.out.println(t1.roll);
        System.out.println(t1.name);
        Test t2 = new Test(t1);
        System.out.println(t2.roll);
        System.out.println(t2.name);
    }
}