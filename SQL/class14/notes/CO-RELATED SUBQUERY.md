# CO - RELATED SUB QUERY
- A QUery written anothe query such that the outer query is and inner query are dependent on each other is known as co-related sub query.

SELECT SAL FROM EMP E1
WHERE (SELECT COUNT(DISTNICT SAL)
FROM EMP E2
WHERE E1.SAL >E2.SAL ) = 3-1)

Let us consider two queries 
1 - Outer Query and 
2 - Inner Query

The outer query executes first but partcially.
The partially executed output is given as an input to the outer inner query.
The inner query executes completely and generates an output.

The output of the inner query is fed as input to the outer query and outer query produces the result.

Therfore we can say that both inner query and outer query both are inter dependent on each other.

In co-related sub-query joinning condition is mandatory and must be written only in the sub query.

*** Co-related sub query works with a principal of both sub-query and joins. ***

To take or extract the maximun salary.  
SELECT SAL FROM EMP E1
WHERE (SELECT  COUNT( DISTNICT SAL) 
FROM EMP E2
WHERE E1.SAL < E2.SAL) = N-1)

To get N minimum salary we can make use of this syntax.

SELECT SAL 
FROM EMP E1
WHERE (SELECT COUNT(DISTNICT SAL) 
FROM EMP WHERE E1.SAL > E2.SAL) = N-1).

EXISTS
NOT EXIST

To find the nth value we use CO related sub queries.

EXISTS OPERATOR
It is an unary operaotr which accpets only operand at right hand side and the operand must be co-related query.

Exists operator returns true if the sub-query returns any value other than the null.

# NO EXISTS
it is similar to exist operator which returns true if the sub-query returns null. 

\ - to remove the special character behaviour.

 _ % - 


 ESCAPE CHARACTER
 ````````````````````````````````
 Escape Character is used to remove the special behaviour of the special characters and treat them as not null characters.

 ESCAPE character must be defined. 
 2 - Escape character must be used just before the special character which has to be treated as normal character. 



 WAQTD the details of the employess whose name contains _INIT
 SELECT * 
 FROM EMPLOYEES
 WHERE ENAME LIKE '%!_%' ESCAPE '!';



ESCAPE CHARACTER
```````````````````````````
WAQTD the salary employee name and salary of all the employees.


select ename, sal from emp
order by 

ORDER BY
````````````````
It is used to arrange the data or records either in ascending or descnding order.
By default order by clause solves the records in ascending order.

- Order By clause executes at the last.
Order By clause executes after the select clause and it executes row by row.

Syntax and Order of execution
``````````````````````````````````````````










