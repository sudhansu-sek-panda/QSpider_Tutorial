# Method Overriding

**
Changing the implementation part of any parent class method inside the child class accoring to the child class requirement is the concept of Method Overirding**

Child - Priority
- In method Over-riding  minimum we have required two classes and these two classes must have some relationship. 

- In Method - Riding the methods are always be of non-static type.

class Mahesh{
    public void marry(){
System.out.println("RP");
    }
}

class Liku extends Mahesh{
     public void marry(){
        System.out.println("NM");

    }
}

class Test{
    public static void main(String a[]){
        
    }
}

- In method overriding no new method will be created inside the child class.

class OppoF1{
    public void camera(){
        System.out.println("50mp and price 15000);
    }
}
class OppoF1pro extends OppoF1{
    public void camera(){
        System.out.println("100mp and price 20000);
    }
}
class Test{
    public static void main(String a[]){

    }
}

# Method Resolution of Method Overriding

Method Calling = Method Resolution

99% Reference type compiler - Test t1 = new Test(); - Run time Object JVM 1%

In method over riding the method resolution takes place on the basis of Runtime Object.
and the JVM is responsible for method resolution.
It is otherwise known as runtime polimerphism or dynamic polimerphism or dynamic method dispatch or late binding(run first). 

m t 
c t


class Mahesh{
 public void marry(){
        System.out.println("RP");
    }
}
class Liku extends Mahesh{
    public void marry(){
        System.out.println("NM");
    }
}

class Test {
    public static void main(String a[]){
        Mahes m1 = new Mahesh();
        m1.marry(); // RP
        Liku l1 = new Liku();
        l1.marry(); // NM
        Mahesh m2 = new Liku();
        m2.marry(); // NM
    }
}


