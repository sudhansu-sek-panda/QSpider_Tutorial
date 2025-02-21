Copy Constructor:
- It is a special type of constructor that creates a new object by coping the value of an existing object.
- It takes the existing object as a parameter and it copies the value of all the variables like primitive type and object type and after that it ceates a new object with the same state like original.
- The main advantages of the copy constructor is if we make any changes inside the copied object then, it does not affet the original object.

<pre>
class Test{
int roll;
String name;

Test(int roll1, String name1){
this.roll = roll1;
this.name = name1;
}

Test(Test ref){
this.roll = ref.roll;
this.roll = ref.name;
}

public static void main(String a[]){
Test t1 = new Test(10,"abc");
System.out.println(t1.roll);
System.out.println(t1.name);
Test t2 = new Test(t1);
System.out.println(t2.roll);
System.out.println(t2.name);
}

</pre>

