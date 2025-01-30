
public class MOJ {
    public void m1(Object o){
        System.out.println("def");
    }
    public void m1(String s){
        System.out.println("abc");
    }
    public void m1(MOJ t){
        System.out.println("abc");
    }
   
    public static void main(String a[]){
        MOJ t1 = new MOJ();
        // t1.m1(new String());
        // t1.m1(new Object());

        t1.m1(null);   
        //WHenever we are passing any common value like null to any argument part of any method
        // which contains non-primitive type argument then 1st it will check is there
        // any relationship between the argument or not, if there is any relation then
        // priority goes to child class.

    }
}

// Q. What will be the code implementation if there are two child 
// classes and there is no relationship exists? 
//Q What will be the code implementation if there are two child classes and there is also a parent class?


