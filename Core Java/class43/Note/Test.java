class Test{
    private int roll;
    private String name;
    // Demo d = new Semo();
    // setName method
    public Test setName(String name1){
        this.name = name1;
        return this;
    }
    //setRoll method
    public Test setRoll(int roll1){
        this.roll = roll1;
        return this;
    }
    // toString 
    public String toString(){
        return this.name+ " " + this.roll;
    }
}
class Demo{
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.setName("abc").setRoll(101);
    }
}