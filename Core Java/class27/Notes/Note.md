### Interface Methods 

By default m1 method is declared as abstract and public.  

**Compile time Error**
<pre>
interface A{
void m1(){
// abstract method can't have body
}
}
</pre>
Only declaration part is there.

The method's present inside an interface is by default declard as **public** as well as **abstract**.
<pre>
interface A{
 void m1(); // internally abstract and public
}
</pre>
<pre>
interface A{
    public void m1(); // internally abstract
}
</pre>
<pre>
interface A{
    abstract void m1(); // internally public
}
</pre>


How can we provide the implimentation to any abstract method which is present inside an interface?

interface A{
    public void m1();
}
class Test impliments A{
    ❌ 
}



interface A{
    public void m1(); // 1 method
}
class Test impliments A{  // no profit of making abstract
    public void m1(){ // 1 method // override // implimentation // declaring abstract this method again have no use
    
    }
}

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

public scope is 

abstract -> public
abstract -> protected
abstract -> default
private -> abstract 

