21-02-2025

If garbage collector called the finalize method of an object then the coresponding class finalize method will be executed.

public class Test{
    public void finalize(){
        System.out.println("finalize method called);
    }
    String s1 = new String();
    s1 = null;
    System.gc();
}



We can call the finalize method explicitly but it will destroy the useless object.

On an particular object we can call the finalize method at most once.

public class Test{

    static Test t;
    public void static main(String a[]){
        Test t1 = new Test();
        System.out.println(t1.hashcode());
        t1 = null;
        System.gc();
        t = null;

        System.gc();
        System.out.println("main end");
    }
}

// print hashcode, this object, deletion and creation of new object. 12:30. 

// 12:30 or 2:30 

// 


















[Previous]() | [Next]()