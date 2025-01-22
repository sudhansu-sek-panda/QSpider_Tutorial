
// static vs non-static method

public class StaticNonStatic {
    
// 1 - Non -Static method does not use static keyword
    public String staticMethod(){
        nonStaticMethod(); // static method is accessable in non - static area 
        return "ok";
    }
// 1 - Static methos uses static keyword 
    public static int nonStaticMethod(){

        // staticMethod(); We can not access non-static method in static method area.

        return 10;
    }
    public static void main(String a[]){

    }
}
