import java.util.Scanner;

public class LoginMain{
String name, pass;

public void asignValues(){
    LoginMain obj1 = new LoginMain();
    obj1.name = "sudhansu";
    obj1.pass = "123";
    
}
public static void main(String a[]){
    LoginMain obj2 = new LoginMain();
    obj2.asignValues();
Scanner keyboard = new Scanner(System.in);

String userName, userPass;

System.out.println("Enter Username");
userName = keyboard.nextLine();

System.out.println("Enter Password");
userPass = keyboard.nextLine();

if(userPass.equals(pass) && userName.equals(name))
    System.out.println("Access Granted");

else if (userPass.equals(pass)) {
    
}
else if()
}
}