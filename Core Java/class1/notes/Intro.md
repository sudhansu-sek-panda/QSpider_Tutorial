#   JAVA 

## Programming Language
The language which is used to write a program is known as programming language.
- The Java programme which we write is known as **Source Code** or **Java file**
- Our system doesn't understand java programme.
- To overcome this problem java has provided us with the following 2 Software.

1. Compiler
2. JVM (Java Virtual Machine)

- Compiler checks the syntax of Java Programme and then generates **Byte-Code** and converts it into <u>machine level language</u>.

# IDE (Integrated Development Environment)
**It is a platform where programms are written and executed.**

<center>

| Editor    	| IDE           	|
|-----------	|---------------	|
| Notepad   	| [Eclipse](https://eclipseide.org/)       	|
| [Notepad++](https://notepad-plus-plus.org/downloads/) 	| [VSCode](https://code.visualstudio.com/)        	|
| [Editplus](https://www.editplus.com/download.html)  	| [Intellij Idea](https://www.jetbrains.com/idea/download/?section=windows) 	|
| [Sublime](https://www.sublimetext.com/)   	| [Blue J](https://www.bluej.org/)        	|
|           	| [NetBeans](https://netbeans.apache.org/front/main/index.html) 
    


</center>
Editor 
- Manually written 
- Output in the nest page

IDE
- Auto Compiler
Output in the same page

### Basic Syntax of Java

class house
methods rooms
variables cupboard
object memebr of house


**Syntax**

<pre>
class Demo{
public static void main(String args[]){
    System.out.println("Allu Arjun");
}
}
</pre>

- Every execution starts from **main method**.
- Java program <u>starts with **class** keyword</u>.
- <u>Class name should always start with Upper Case</u>, it is not mandatory but **recomended**.

- System.out.println() -> It is used to print any statement in Java

Every statement must end with semi colon (;)
Every open Curly Brass must be closed.

### Steps to develope Java Applicaation
1. Create a folser to save all java programme
2. Open edit or (edit plue) --> file --> new --> java --> write a programme
3. File --> Save as --> Select Folder --> Filename : Demo.java
4. Go to the folder --> address bar --> write cmd --> enter
5. Compile: javac Demo.java --> Run: java Demo  


Ex-1
Case - 1: If no class is public
<pre>
class A{

}
class B{

}
class C{

}
</pre>
If no class is declared as publuc then we can save the program with any file name.

case2: If a class is public
class A{

}
public class B{

}
class C{

}
If a class is declared as public then we have to save the program with the filename same as the class which has been
declared as public.

case 3: If more than 1 class is public
public class A{

}
public class B{

}
public class C{

}

case 3: It is impossible to declare more tham one class as public within a java programme.

file name
A.java 
B.java
C.java

# Identifier:
```````````````````````````
name: identifier:
A name in java program which is used for identification purpose is known as identifier.
- It can be a class name, method name or variable name.

class Demo{
    public static void main(String args[]){

    }
}
class name: Demo, String, System, 
method name: main(), println()
variable namex,args,out

Rules for naming Identifier:

1. Allowed characters are:

a-z --> lowercase
A-Z --> uppercase
0-9 --> digits
$ --> dollar
_ --> underscore

2. Bond007 //valid
007Bond // invalid

(identifiers should naever start with digits).

3. Identifiers are case sensitive
case sensitive:
The lowercas character and the coresponding uppercase character are not same because of ASCII value or unicode

ASCII value or unicodde:
Every character in java has been assigned a fixed integer number.
'A' -- .Z. -> 65-90
'a' -- 'z' -> 97-122

class Test {
    public static void main(Stiring args[]){
        System.out.println('a'+0);
        System.out.println('Z'+0);
        System.out.println('A'+0);
        System.out.println('Z'+0);
        System.out.println('0'+0);
        System.out.println('9'+0);

    }
}

4. Reserved Keyword can't be used as an identifier

int x = 10; // valid
int if = 20; // invalid
if --> reserved keyword

Data Type:
- Every variables of some type is known as datatype.
Ex: int x = 20;
Data types tells us which type of value a variable can store.

Java is a statically typed language because we have to mention the data type of a variable.

classs Employee{
    public static void main(Sttring a[]){
        String Name = "Sudhansu";
        int age = 33;
        double salary = 100000;
        char Gender = 'M';
        String address = "Bhadrak";

    }
}

* Python is dynamically typed language because we don't need to mention the data type of a variable.


Data type

[Previous]() 	 | [Next]()
