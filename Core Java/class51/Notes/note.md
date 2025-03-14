Throws keyword is applicabale only for Throwable types but not for normal java class. 


Throws keyword is applicable for methods and constructors.
Throws keyword is not applicable for classes.


public class Demo1 throws Exception{❌

    Demo1() throws Exception{✅

    }    
    public static void main(String[] args) throws Exception{✅
        /*{ OUTPUT 
        } */
        
    }
}