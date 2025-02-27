
### Boolean Wrapper class
1. Primitive type
2. String type
### Primitive type as an argument
if we're passing primitive type as an argument to the boolean class object then the only allowed arguments are
1. lowercase true (**true**)
2. lowercase false (**false**)  


<pre>
Boolean b = new Boolean(true);✅
Boolean b = new Boolean(false);✅
</pre>
<pre>
Boolean b = new Boolean(False);❌
Boolean b = new Boolean(True);❌
</pre>
☝️
**Here it is case sensitive** 
### String type as an argument

👇
**Here it is case insensitive** 
<pre>
Boolean b = new Boolean("true");✅
Boolean b = new Boolean("True");✅
</pre>
Output:
<pre>
true
true
</pre>
If we're passing String type as argument to the Boolean class object then except true everything will be treated as false.
<pre>
Boolean b = new Boolean("false");✅
Boolean b = new Boolean("False");✅
Boolean b = new Boolean("abc");✅
Boolean b = new Boolean("xyz");✅
</pre>

Output:
<pre>false
false
false
false
</pre>


Note: 
1. In all Wrapper classes <u>**toString()**</u> method is over-ridden
2. In all Wrapper classes <u>**equals()** </u>method is over-ridden.