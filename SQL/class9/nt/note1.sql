-- 1 - WAQTD the maximum salary given to an employee in deptno. 10.

SELECT MAX(SAL)
FROM EMP 
WHERE DEPT = 10;

-- 2 - WAQTD the details of the employee who is earning maximum salary

SELECT * 
FROM EMP 
WHERE SAL = (SELECT MAX (SAL)
FROM EMP);


-- 3 - WAQTD the detils of the employee earning salary more than Miller

SELECT *
FROM EMP 
WHERE SAL = (SELECT MAX(SAL)
FROM EMP);

SELECT *
FROM EMP 
WHERE SAL > (SELECT STATS_BINOMIAL_TESTFROM EMP 
WHERE ENAME = 'MILLER') 


-- Sub Query
-- -> A query written inside an  another query is known as sub query.*
-- The working principle of sub query:
Outer Queries -> DEpendent -- Inner Queries


--> Let us consside 2 queries, outer query and inner query.
--> Inner Query executes first and provides an output
--> The output of inner query is given as input to the outer query.
--> With the help of input from inner query outer query generates the result.
--> Therefore we can say that outer query is dependent on inner query.

-- why do we use sub-Query?
-- Case-1

-- Whenever we have an unknown value in the query, we use sub-query to find out the unknown values.
-- Case 2
-- Whenever the data to be selected and the condition to be satisfied are present in different tables, then we use sub-Query.

--> 1 - WAQTD name of the employees earning more than adams.
SELECT ENAME
FROM EMP 
WHERE SAL > (SELECT SAL 
FROM EMP
WHERE NAME = ('Adams'));



--> 2
SELECT ENAME, SAL 
FROM EMPWHERE SAL < (SELECT SAL 
FROM EMP
WHERE ENAME='KING');

--> 3

SELECT ENAME, deptno
FROM EMP
WHERE deptno = (SELECT deptno
FROM EMP WHERE ENAME = 'jONES'
);

--> 4
SELECT ENMAE, JOB 
FROM EMP 
WHERE JOB = (SELECT JOB FROM EMP WHERE ENAME )

-- Types of Sub - QUeries
-- There are two types of sub-queries are there

-- (1) - SIngle Row SUb-Query
-- ``````````````````````````````
-- It is a subquery which returns exactly one value or one record, we call it as single 
-- row subquery

-- (2): Multi Row sub-query
-- If the 

ANY - OR OPERATOR
AND - IN OPERATOR

-- GOT MAX SALARY - REMOVE THE MAX SAL - SELECT ALL THE DATA 

-- SELECT * FROM EMP 
WHERE SAL IN (SELECT MAX(SAL) FROM EMP WHERE SAL < )
- 255 suB queries we could write 





