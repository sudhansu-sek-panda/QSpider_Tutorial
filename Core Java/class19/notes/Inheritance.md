# Inheritance
Aquiring the properties of one class to another class is known as inheritance.
We can achieve inheritance by the help of **extends** keyword.


The class whose property has been aquired by another class is known as parent class or super class or base class.

- The class who aquire the property is known as child class.

- The main advantages of inheritance is **code reusability**.

There are five types of inheritance in java.
1. Single Inheritance
2. Multilevel Inheritance
3. Multiple Inheritance.
4. Hierarchical Inheritance
5. Hybrid Inheritance

### Single Inheritance
Aquiring the properties of one class by another class is known as **single inheritance**.

<pre>
class A{
    public void m1(){
        System.out.println("abc");
    }
}
class B extends B{
    public void m2(){
        System.out.println("def");
    }
}

class Test{
    public static void main(String args[]){
        A a1 = new A();
        a1.m1(); // abc
        a1.m2(); // CE - Can't find symbol
        B b1 = new B();
        b1.m1(); // abc
        b1.m2(); // def
    }
}
</pre>

### Multilevel Inheritance

If the child class is the parent class of another class then is known as multilevel inheritance.

<pre>
class A{
    public void m1(){
        System.out.println("abc");
    }
}
class B extends B{
    public void m2(){
        System.out.println("def");
    }
}

class C extends B{
    public void m3(){
        System.out.println("ghi");
    }
}
class Test{
    public static void main(String args[]){
        A a1 = new A();
        B b1 = new B();
        C v1 = new C();
        a1.m1(); // abc
        a1.m2(); // CE - Can't find symbol
        a1.m3(); // CE - Can't find symbol
        B b1 = new B();
        b1.m1(); // abc
        b1.m2(); // def
        b1.m3(); // CE - Can't find symbol
        c1.m1(); // abc
        c1.m2(); // def
        c1.m3(); // ghi
    }
}
</pre>

[Previous]() | [Next](https://github.com/sudhansu-sek-panda/QSpider_Tutorial/blob/main/Core%20Java/class19/notes/MultipleInheritance.md)