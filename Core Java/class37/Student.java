class Student{
    private int roll;
    // getter method gets the data
    public void getRoll(int roll1){
        this.roll = roll1;
       
    }
    // setter method provide the output to the main method
    public int setRoll(){
        return roll;
    }
}

class Test{
    public static void main(String a[]){
        Student t1 = new Student();
        t1.getRoll(101); // passing value to the getter method
        System.out.println(t1.setRoll()); // 
    }
}