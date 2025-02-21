### Singledon Class

If we want to create atmost one object of a class then it is known as Singledone class. 

class Test{
    static Test t = new Test();
    private Test{

    }
    public static Test getTest(){
        return t;
    }
    public static void main(String a[]){
        Test t1 = Test.getTest();
        Test t2 = Test.getTest();
        System.out.println(t1 == t2);
        System.out.println(t == t1);
    }
}

Singleton class is a class which create only one object through the help of factory method.

To make singleton class:

- A static variable is required which will store the object of the class.
- A private constructor is required because of an inheritance and creation of objects from another class.


Data Hiding
Hiding our internal data in such a way that no outside person can ever access out data is the concept of data hiding.

We can achieve data hiding by declaring our variable as private.