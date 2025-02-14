-- 1.WAQTD NUMBER OF EMPLOYEES GETTING SALARY LESS THAN 2000 IN DEPTNO 10
SELECT COUNT(*)
FROM EMP
WHERE DEPTNO = 10 AND SAL < 2000 ;

-- 2.WAQTD TOTAL SALARY NEEDED TO PAY EMPLOYEES  WORKING AS CLERK
SELECT SUM(SAL)
FROM EMP
WHERE JOB ='CLERK';

-- 3.WAQTD AVERAGE SALARY NEEDED TO PAY ALL EMPLOYEES
SELECT AVG(SAL)
FROM EMP ;

-- FROM EMP ;

-- 4.WAQTD NUMBER OF EMPLOYEES HAVING 'A' AS THEIR FIRST CHARACTER
SELECT COUNT(*)
FROM EMP
WHERE ENAME LIKE 'A%';

-- 5.WAQTD NUMBER OF EMPLOYEES WORKING AS CLERK OR MANAGER
SELECT COUNT(*)
FROM EMP
WHERE JOB IN ('MANAGER' , 'CLERK' );

--6.WAQTD TOTAL SALARY NEEDED TO PAY EMPLOYEES HIRED IN FEB
SELECT SUM(SAL)
FROM EMP
WHERE HIREDATE LIKE '%FEB%';

--7.WAQTD NUMBER OF EMPLOYEES REPORTING TO 7839 (MGR)
SELECT COUNT(*)
FROM EMP
WHERE MGR = 7839 ;

--8.WAQTD NUMBER OF EMPLOYEES GETTING COMISSION IN
-- DEPTNO 30
SELECT COUNT(*)
FROM EMP
WHERE COMM IS NOT NULL AND DEPTNO = 30 ;
OR
SELECT COUNT(COMM)
FROM EMP
WHERE DEPTNO = 30 ;

--9.WAQTD AVG SAL , TOTAL SAL , NUMBER OF EMPS AND MAXIMUM SALARY GIVEN TO EMPLOYEES WORKING AS PERSIDENT
SELECT AVG(SAL) , SUM(SAL) , COUNT(*) , MAX(SAL)
FROM EMP
WHERE JOB = 'PRESIDENT' ;

--10.WAQTD NUMBER OF EMPLOYEES HAVING 'A' IN THEIR NAMES
SELECT COUNT(*)
FROM EMP
WHERE ENAME LIKE '%A%';

--11.WAQTD NUMBER OF EMPS AND TOTAL SALary needed to pay THE EMPLOYEES WHO HAVE 2 CONSICUTIVE L's IN THEIR  NAMES
SELECT COUNT(*) , SUM(SAL)
FROM EMP
WHERE ENAME LIKE '%LL%';

--12.WAQTD NUMBER OF DEPARTMENTS PRESENT IN EMPLOYEE TABLE
SELECT COUNT( DISTINCT DEPTNO )
FROM EMP ;

--13.WAQTD NUMBER OF EMPLOYEES HAVING CHARACTER '_' IN THEIR NAMES
SELECT COUNT(*)
FROM EMP
WHERE ENAME LIKE '%!_%' ESCAPE '!' ;
 
--14.WAQTD NUMBER OF EMPLOYEES HAVING ATLEAST 2
PERCENTILES IN THEIR NAMES
SELECT COUNT(*)
FROM EMP
WHERE ENAME LIKE '%!%%!%%' ESCAPE '%' ;

--15.WAQTD TOTAL SALARY GIVEN TO EMPLOYEES WORKING AS CLERK IN DEPT 30
SELECT SUM(SAL)
FROM EMP
WHERE JOB ='CLERK' AND DEPTNO = 30 ;

--16.WAQTD MAXIMUM SALARY GIVEN TO THE EMPLOYEES WORKING AS ANALYST
SELECT MAX(Sal)
FROM EMP
WHERE JOB ='ANALYST' ;

--17.WAQTD NUMBER OF DISTINCT SALARIES PRESENT IN EMPLOYEE TABLE
SELECT COUNT( DISTINCT SAL )
FROM EMP ;

--18.WAQTD NUMBER OF JOBS PRESENT IN EMPLOYEE TABLE
SELECT COUNT( DISTINCT JOB )
FROM EMP ;

--19.WATQD AVG SALARY GIVEN TO THE CLERK
SELECT AVG(SAL)
FROM EMP
WHERE JOB ='CLERK' ;

--20.WAQTD MINIMUM SALARY GIVEN TO THE EMPLOYEES WHO WORK IN DEPT 10 AS MANAGER OR A CLERK
-- W8
SELECT MIN(SAL)
FROM EMP
WHERE DEPTNO = 10 AND JOB IN ( 'MANAGER' , 'CLERK' ) ;