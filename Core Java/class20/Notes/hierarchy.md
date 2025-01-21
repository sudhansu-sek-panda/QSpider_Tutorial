# Hierarchical Inheritance

If more than one class aquires the property of single class then it is known as hierarchical Inheritance.

![](https://github.com/sudhansu-sek-panda/QSpider_Tutorial/blob/main/Core%20Java/class20/Resources/Hyrarchical.png)
<pre>
class A{
public void m1(){
    System.out.println("abc");
}
}

class B extends A{
    public void m2(){
System.out.println("def");
    }
}

class C extends A{
public void m3(){
    System.out.println("ghi");
}
}
</pre>
<pre>

class Test{
public static void main(String a[]){
    A a1 = new A();
    B b1 = new B();
    C c1 = new C();
    a1.m1(); // abc
    a1.m2(); // CE Can't find symbol m2()
    a1.m3(); // CE Can't find symbol m3()
    b1.m1(); // abc // inheriting A class
    b1.m2(); // def // own method
    b1.m3(); // CE Can't find symbol m3()
    c1.m1(); //abc // inheriting A class
    c1.m2(); // CE Can't find symbol m2()
    c1.m3(); // ghi // own method
}
}
</pre>

![](https://github.com/sudhansu-sek-panda/QSpider_Tutorial/blob/main/Core%20Java/class20/Resources/Hyrarchical2.png)
![](https://github.com/sudhansu-sek-panda/QSpider_Tutorial/blob/main/Core%20Java/class20/Resources/Hyrarchi3.png)

[Previous](https://github.com/sudhansu-sek-panda/QSpider_Tutorial/blob/main/Core%20Java/class19/notes/Inheritance.md) | [Next](https://github.com/sudhansu-sek-panda/QSpider_Tutorial/blob/main/Core%20Java/class20/Notes/Hybrid.md)