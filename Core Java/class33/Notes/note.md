  <center> <pre> Date: 11-02-2025</pre> </center>

call to suoer and call to this. 


### Initialization of an object

static final and abstract

abstract - no implementation part.
final - restrict 
static - accessable by everywhere


Method resolution 


Interface method

### Initialization of an object

There are three ways to initialize the object. 
1. By directly 
2. By the help of object Reference
3. By the help of Constrictor



1. By directly 
class Test{
  int x = 20;
  public static void main(String a[]){
    Test t1 = new Test(); // x =1-; Initialized the Non static object
  }
}


2. By the help of object Reference

class Test{
  int x = 20;
  public static void main(String a[]){
    Test t1 = new Test(); // x =1-; Initialized the Non static object
    t1.x = 10; // By the help of object reference
  }
}


3. By the help of Constrictor

class Test{
  int roll ;
  Test(int roll1){
    this.roll = roll1;
  }
  public static void main(String a[]){
    Test t1 = new Test(101);
    Test t1 = new Test(102);
    System.out.println(t1.roll);
    System.out.println(t2.roll);
  }
}

// Default Initialization for non - stratic variable is zero
// When we assign value the object initialization happens.


// interface variable are by default final so we need to initialize this. We could not reuse it.

In abstract class the variable is not final, That's why we could able to initialize that variable by the help of child class constructor.

abstract class Test{
  int roll;
  Test(int roll1){
    this.roll = roll1;
        System.out.println(this.roll);

  }
} 

class Demo extends Test{
  Demo(){
    super(101);
  }
  public static void main(String a[]){
    Demo d1 = new Demo();
  }
}

We can't able to create the constructor inside interface because we can't reassign 
the variable by using constructor inside an interface, bydefault it is declared as final. So we can't create constructor inside interface.


interface Test{
  int roll;
  Test(int roll1){
    this.roll = roll1;
    System.out.println(this.roll);
  }
}


Multiple Inheritance - Ambigious issue and Constructor chaining
class A{
A(){

}
}
class B{
B(){

}
}
class C extends A,B{
C(){
  super(); // confuse where to go, whether A or B; Constructor Chaining
}
}


