// Multilevel inheritance
class A{

}
class B extends A{

}
class C extends B{

}

public class ObjType1 {
    public static void main(String a[]){
        Object s = new ObjType();
        A t = (B) s;
    }
}
