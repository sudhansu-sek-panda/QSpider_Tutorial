<pre>

interface A{
    int x = 10;

}  
class Test implements A {
    int x = 20;
public static void main(String a[]){
    Test t1 = new Test();
    System.out.println();
    System.out.println(t1.x);
    System.out.println(test.x);
}
}

</pre>
### No inheritance
<pre>
interface A{
    int x = 10;

}
class Test implements A {
    int x = 20;
public static void main(String a[]){
    Test t1 = new Test();
    System.out.println(t1.x); // 20
    System.out.println(test.x); // CE
}
}
</pre>
### Inheritance
<pre>
interface A{
    int x = 10;

}
class Test implements A {
public static void main(String a[]){
    Test t1 = new Test();
    System.out.println(t1.x); // 10
    System.out.println(test.x); // CE
}
}
    </pre>
### Both
<pre>
interface A{
    int x = 10;

}
class Test implements A {
    int y = 20;
public static void main(String a[]){
    Test t1 = new Test();
    System.out.println(t1.x); // 10
    System.out.println(t1.y); // 20
    System.out.println(test.x); // 10
}
}

</pre>
