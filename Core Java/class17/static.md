### calling of a static method

There are three ways to acces a static method inside any static area i.e
1. By Directly
2. By class name (Recomended Way)
3. By the help of Objects


both static method

by class name:
<pre>
class Test{
    public static void m1(){ // static method
        System.out.println("static method");
    } 


    public static void main(String a[]){ static main method
    //By directly
        m1(); // static method
        //By class name
        Test.m1(); // static method 

        //By object
        Test t1 = new Test();
        t1.m1(); // static method
    }


}
</pre>

### Method Chanining

<pre>
class Test
{
    public static void m1(){
        m2();
        System.out.println("Method M1");
    }

    public static void m2(){
        System.out.println("Method M2");
    }

    public static void main(String arg[]){
        Test t1 = new Test();
        t1.m1;
    }
}

</pre>
Can we access any static method inside any non-static area directly?
Yes! We can access!

class Test
{
    public void m1(){ // Non static
        m2();
        System.out.println("Method M1");
    }

    public static void m2(){ //static 
        System.out.println("Method M2");
    }

    public static void main(String arg[]){
        Test t1 = new Test();
        t1.m1;
    }
}

- We could access static methods in not-static area.
- We couldn't access non-static methods in static area.




