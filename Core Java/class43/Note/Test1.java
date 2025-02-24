class Demo{
    private int roll;
    private String name;
    
    // setName method
    public Demo setName(String name1){
        this.name = name1;
        Test1 d = new Test1();
        return this;
    }
    //setRoll method
    public Demo setRoll(int roll1){
        this.roll = roll1;
        return this;
    }
    // toString 
    public String toString(){
        return this.name+ " " + this.roll;
    }
}
public class Test1{
    public static void main(String[] args) {
        Demo t1 = new Demo();
        t1.setName("abc").setRoll(101);
        System.out.println(t1);
    }
}