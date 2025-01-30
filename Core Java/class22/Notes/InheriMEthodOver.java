class A{}  
class B extends A{} // B class extends the properties of A class / Parent to C  but child of a // If a child class is a parent to another class then it is knwon as Multilevel Inheritance. The super child class has all the access of all properties of class
class C extends B {} // multi level Inheritance C class extends the properties of B class

public class InheriMEthodOver {
 public void m1(Object o){ // method declaration // void returntype // void returntype with Non-Primitive arguments
    System.out.println("abc");
 }
 public void m1(A a ) { // Method Overloading means defining same method naem with different argument type.
    System.out.println("def"); // print statement to check the flow of execution
 }
 public void m1(B b){ // Method Overloading - same method name with different argument type. same method m1() with differnt Non-primitive argument type.
System.out.println("def");
 }
 static public  void main(String arg[]){ // we could alternate the modifiers but not other rules.
 InheriMEthodOver i1 = new InheriMEthodOver();
 C c1 = new C(); // created the reference of C class and storing the C class object
 // reference C Object new C();
 i1.m1(c1); // passing the child object as an argument. Whenever it will find the exact method signature it will execite that method block.
// to compile this programme javac file name.java
// to run this programme java filenme
}
}

// Plan A - the child reference checked all the method and found no exact match but match.
// Plan B - the child reference then tried to find the relation between the classes.
// Plan C - If there are more than one class with relation priority always goes to child class.
// Object is a parent class of all the class  - so Object class got excluded.
// Between child class A,B and C A is the parent of B and C. so it got elemenated.
// Between B and C - B is the parent class of C so, B class got elemenated.
// C is the ultimate child class and got the priority.

