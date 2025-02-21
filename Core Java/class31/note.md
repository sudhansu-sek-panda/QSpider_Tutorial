### Constroctor Chaining

- Calling a constructor from another constructor is known Constructor Chaining.
- We can achieve constructor chaining by the help of super(), this(). 
- super() and this() is only applicable for constructor. 

The call to super - super() - The call to super is used to call the parent class or super class constructor.
The call to this() is used to call the current class constructor.

call to this 
The constructor caller like call to super or call to this must be the first statement inside any constructor. It means we can't use call to super and call to this inside a single constructor. 

Test{
    Test(){
        super();
    }
}

Test{
    Test(){
        this(20);
    }
    Test(int x){
        System.out.println("abc");
    }
}


Test{
    Test(){
        super();
        this(); // CE this() should be first statement
    }
}

Test{
    Test(){
        this(); // CE recursive 
    }
}

Test{
    Test(){
        System.out.println("abc"); //CE 
        super(); // must be in first
    }
}
<pre>
Test{
    Test(){
    }
}
</pre>

The call to super is bydefaultly present inside the constructor if we're not explicitly call to this or call to super.
proof 
<pre>

Test{
    Test(int x){
        //by default super
        System.out.println("abc");
    }
    Test(){
        this(10);
        System.out.println("def");
    }
    public static void main(String a[]){
        Test t1 = new Test();
    }
}
</pre>

<pre>
class Test{
    Test(int x){
        //by default super
        System.out.println("abc");
    }

    Test(char c){
        this(2.5f);
        System.out.println("def");
    }

    Test(float f){
        this(10);
        System.out.println("ghi");
    }
 
    public static void main(String a[]){
        Test t1 = new Test('a');
        Test t2 = new Test(2.5f);

    }
}
</pre>

<pre>
class Test extends Object{
    Test(int x){
        System.out.println("abc");
    }
 }

 class Demo2 extends Test{

    Demo2(){
    
        System.out.println("def");
    }
    
    public static void main(String a[]){

        Demo2 t1 = new Demo2();
    }
 }
</pre>