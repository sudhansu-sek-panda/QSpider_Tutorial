1 - If there is no Exception inside try block then catch block will be ignored.
2 - If there is an Exception rises inside try block, then rest of the try block won't be executed whether you handle the exception or not. 
3 - 

public static void main (String a[]){

try{
    Statement-1;
    Statement-2;
    Statement-3;
}
catch{
    Statement-4;
}

    Statement - 5;
}

Case:1 - If there is no Exception
O/P - 1,2,3,5 (catch block ignored)
Case:2 - If the exception rises at Statement-2 & handled
O/P - 1,4,5
Case:3 - If the exception rises at Statement-2 & not handled
O/P - 1, Exception
Case:4 - If the exception rises at statment 4
O/P - 1,2,3,5

System.out.println(10/0); // AE
System.out.println(10.0/0); // Infinity
System.out.println(0/0); // AE
System.out.println(0.0/0); // NaN Not a Number

Method to print Exception Information
---------------------------------------


THrowable class defines the following 3 methods to print Exception Information

1. printStackTrace()
2. toString() // provides the addess in normal methos
3. getMessage()

1. printStackTrace() Name: Description : Location
2. toString() Name: Description
3. getMessage() Description

1. printStackTrace() Name: Description : Location  // stack memory
2. toString() Name: Description // heap memory
3. getMessage() Description // 

public static void main(String a[]){
    try{
      System.out.println(10/0); 
    }
    catch{
 e.printStackTrace();
        System.out.println(e);
        System.out.println(e.getMessage());
    }
}


<!-- With one try block multiple catch block is possible but order of catch block is important
It should be Child to Parent but not Parent to Child
t-j
 -->

 public static void main(String a[]){
    try(){
System.out.println(10/0);
    }
    catch(ArithmeticException e){
<!--  Multiple catch block is possible -->
System.out.println("Hyy");
    }
    catch( Exception e){
        <!-- Multiple catch block is possible -->
        System.out.println("Hyy");
    }
 }