public class ToString{ // Over riding the to String method by user. Overide
String name; // Blue print for all objects
// Constructor with argument
ToString(String name1){
    this.name = name1;
}
// Overiding toString method by the user
public String toString(){
    return name;
}
public static void main(String a[]){
    ToString t1 = new ToString("abc"); // passing value to constructor
    ToString t2 = new ToString("abc");
    ToString t3 = new ToString("def");
    System.out.println(t1); // printing the user defined address of the object
    System.out.println(t2); // A object could have same address which reference one object
    System.out.println(t3); // Different object for the class


}
}
