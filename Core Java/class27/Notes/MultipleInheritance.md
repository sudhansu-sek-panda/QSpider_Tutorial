interface A{
    public void m1();// by default 
}
class Test impliments A{
    public void m1(){ 
        System.out.println("abc");
    } 
    public static void main(String a[]){
        Test t1 = new Test();
        t.m1();
    }
}

same method signature - 
If more than one interface containing methods with same method signature then in the implemented class we've to provide the implementation once.

<pre>

interface A{
    abstract void m1();
}
interface B {
    abstract void m1();
}

class Test implements A,B{
    public void m1(){

    }
}

</pre>
If more than one interface containing methods with different method signature then in the implementation class we've to provide the implementation separately.

<pre>
interface A{
    abstract void m1();
}
interface B {
    abstract void m2();
}

class Test implements A,B{
    public void m1(){

    }
    ❌ // m2 has not implementation
}

</pre>
<pre>
interface A{
    abstract void m1();
}
interface B {
    abstract void m2();
}

class Test implements A,B{
    public void m1(){

    }
     public void m2(){

    }
}

</pre>
Co-Varient concept is not applicable for primitive type. 
<pre>
interface A{
    abstract float m1();
}
interface B {
    abstract int m1();
}

class Test implements A,B{
    public int m1(){
        return 0;
    }❌  
    
}
</pre>
If more than one interface containing methods with same method signature but different primitive type return type then in the implimentation class it is impossible to provide implimentation.

