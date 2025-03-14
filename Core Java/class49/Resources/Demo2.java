public class Demo2 {
    public static void main(String[] args) {
       try {
            System.out.println("try");
       } catch (Exception e) {

       }
    }
}

// before the execution of return statement present inside try block, first jvm goes to finally block
// finally block is mandatory.
// There is only one situation where finally won't be executed. That is whenever we are using system.exit(0);  JVM shut down



// 
// flow
// `````````````````
// first 
// second 
// third


// Throw Keyword
// ```````````````````````````//
// Throw keyword is used to create customised exception and handover the created exception object to JVM
// default exception handler. 
// was right

throw new ArithmeticException() - It will give the same information as default exception handler does but excluding the description.abstract 
If the description is passed as an argument it will give the same exception.

static ArithmeticException e = new ArithmeticException() 
static ArithmeticException e 
// It has null as default value as it is non primitive type.
throw e; // Arithmetic Exception and Arithmetic Exception location
throw e; //Null Pointer Exception

