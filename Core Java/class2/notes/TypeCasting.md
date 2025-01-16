<style>
td{
    text-align: center;

}
    </style>

<center> <table  >

<tr  >
<td>int x = 10;</td> 
<td align="center"> ✅</td>
<td>  </td>
<td align="center"> ✅</td>
</tr>

<tr>
<td>long l = 10L; </td> 
<td align="center"> ✅</td>
<td>  </td>
<td align="center"> ✅</td>
</tr>

<tr>
<td>long l = 10;</td> 
<td> ✅</td>
<td>  </td>
<td> ✅</td>
</tr>

<tr>


<td>int x = 10L;</td> 
 <td> ✅</td>
 <td>  </td>
<td> ✅</td>
</tr>

<tr>

<td>byte b= 10;</td> 
<td> ✅</td>

<td>  </td>
<td> ✅</td>
</tr>

<tr>
<td>byte b = 130;</td>
<td> ✅</td>
<td>  </td>
<td> ✅</td>
</tr>
<tr>
<td>float f =10.5F;</td> 
<td> ✅</td>

<td>double d = 10.5;</td> 
<td> ✅</td>

</tr>
<tr>
<td>double d = 10.5f;</td> 


<td> ✅ </td>
<td> </td>
<td>double d = 10.5;</td> 
</tr>

</table>
</center>

Type Casting

- Converting from one data type to another data type is known as type casting.

- There are 2 types of type casting.
1 - implicit type 
casting: - 
Smaller data type to bigger data type.
2 - Explicit type casting: Bigger data type to smaller data type

Implicit type casting:
- Compiler is responisibe for implicit type casting.
- Converting smaller data type to a bigger data type is known as implicit data type casting.

- Whenever we are assigning a smaller data type value to a bigger data type variable, implicit data type casting will be performed.
Ex:
int x = a;
System.out.println(x); // 97->output
(value -> char -> 2 byte)
variable -> int -> 4 byte

double d =10.5;
System.out.println(d) // 10.0

- class test{
    public static void main(String a[]){
        int x = 'a';
        System.out.println(x); //97

        double d =10;
        System.out.println(d); //10.0
    }
}
- It is also known as upcasting or widening.
