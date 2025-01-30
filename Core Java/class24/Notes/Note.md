#  
var- arg - 1D Array
m1(String... s) ✅ // The var-arg is the last parameter
m1(boolean... x)✅ // The vararg is the last parameter
m1(int... x)✅ // The vararg is the last parameter
m1(int... x, int...y) ❌// var-arg parameter should be the last parameter
m1(int x, int... y)✅ // The vararg is the last parameter
m1(int... x, float... y)❌// var-arg parameter should be the last parameter
m1(int... x, int y) ❌// var-arg parameter should be the last parameter


The var-arg parameter must be the last parameter inside any argument part of the method.

# Var-Arg related to method overloading


Note: 
(int - primitive type int... | - Non-primitive type)

public class VarArg {
 public void m1( int... i){ //1.5
System.out.println("var-arg method);
 }  

 public void m1( int i){ //1.0
System.out.println("Normal Method");
 }  

 public static void main(String []a){
VarArg vg = new VarArg();
vg.m1() // var-agr method
vg.m1(10,20,30); // var-arg method
vg.m1(10) // normal method // Version Priority

 } 
}









