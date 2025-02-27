### Constructor of Wrapper Classes
Almost all wrapper classes contains two types of constructor 👇  
1. Primitive type as an argument  
2. String type as an argument

Note:   
👉 1. Only coresponding primitive type allowed  
👉 2. Only coresponding primitive type String allowed

### Integer Wrapper class
Integer I = new Integer(10);✅  
Integer I = new Integer('20');✅  
Integer I = new Integer(2.5); ❌  
Integer I = new Integer(); ❌  
Integer I = new Integer('a');✅  
Integer I = new Integer("text");❌

Byte Short Long - 2 type argument


**Not allowed**
1. Other Primitive types
2. Other String types
3. No argument Constructor


### Float Wrapper Class

Float class contains three types of constructor.
1. Constructor with **primitive** as an argument.


2. Constructor with **Stirng** as an argument.
3. Constructor with **Double** as an argument.
<pre>
Float f = new Float(2.5f); ✅ // primitive
Float f = new Float("2.5f");✅ // String
Float f = new Float(2.5);✅ // Double
</pre>
### Character Wrapper class
Character class contains only one constructor primitive type as an argument.
<pre>
Character c = new Character("a"); ❌
</pre>

<pre><b>CE </b> 
String type constructor is not defined
</pre>

