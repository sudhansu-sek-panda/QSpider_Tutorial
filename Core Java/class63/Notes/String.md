### String
- It is a pre defind class present in java.lang package and considered to be most important class after object class.

- Main method (String)
Due to the special power given to string class object it is considered as to be the important class after object class which is immutability.

String class object are immutable.
String class object are immutable which means if we're creating object of string class by passing a content then we can't perform any kind of changes or updation with the content of the obejct

String a = "sudhansu" 

* In String class toString method has already been overriden to return the content of the object nor the address of the object.

### String class constructors
1. String s = new String();
2. String s = new String(String literals);
3. String s = new String(StringBuffer sb);
4. String s = nes String(char [] c);
This constructor will create an String object with the given char type array.
5. String s = new String(StringBuilder )

If we're trying to perform any changes with the string class object then rather performing changes in the same object it will create a new a new object where it will store where it will store the changes.

### Important methods of String class.

#### Methods:
1.concat(String s);
2.charAt(int index);
3.length();
4. toLowerCase();
5.toUpperCase();
6.equals(Object o);
7. equalsIgnoreCase(Object o);
8. indexOf(char c);
9. lastIndexOf(char c);
10. replace(char old, char new);
11. subString(int begin);
12. substring(int begin, int end);
13. trim();

