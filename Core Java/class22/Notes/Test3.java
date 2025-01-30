class A{

}
class B extends A{

}
class C extends B{

}

public class Test3 {
    public void m1(Object o){ // t.m1(new C()) - Child Object of Parent Reference Object, Yes, It is. It matches
        System.out.println("abc");
        return ;
    }
    public void m1(A a){ // t.m1(new C()) comes here and found that the child object. Yes it is true.
        System.out.println("def");
        return ;
    }
    public void m1(B b){ // t.m1(new C()) comes here and found that the child object. Yes it is true.
        System.out.println("ghi");
        return ;

    }
    public void m1(C c){
        System.out.println("jkl");
        return ;
    }
    
    public static void main(String args[]){
        Test3 t = new Test3();
        C c1 = new C(); // Object c1
        t.m1(c1); // Pasing Object c1 to m1(); by Test class 
        // Test class's t object will go to m1() and search for apropriate method signature.
        // Test t = new Test();
        // Test t = new Test();
        // Test t = new Test(); 

    }
}
Note. If there are relations among classes and we are providing default arguments then priority always goes to child class. 
/**
*
*
*
*
*
*
*
*
*
*
* step 1 - Programme started execution from main method.abstract 
* step 2 - It chechs the object name then go to method m1 with the t reference.abstract 
* step 3 - null is the default value for all the Non-primitive classes.
* step 4 - It found no exact match.
* step 5 - Compiler started searching for Relationship between non-primitive classes.
* step 6 - Compiler found Object class is the Parent class of all the classes.
* step 7 - It checked with A and CHecked with B and Checked with C. FOund parent as object and excluded it to give priority to child classes.
* step 8 - It searched for child class and found A as parent of B and C. It excluded A.
* step 9 - It searched for child class and found B as parent of C, so excluded it.abstract 
* step 10 - It searched for child class and found it in C. So as per the priority C block will execute.
* B is the child here so  B block executes.
*
*
*
*
*
*
*
*
*
*
*/