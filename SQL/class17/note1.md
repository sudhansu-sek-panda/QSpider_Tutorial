# Data Manupulation Langugae - DML
It is used to manipulate the data or objects by performing creation, updation and deletion of the data.

It has 3 sql statements, they are 
1. Insert
2. Update
3. Delete

### INSERT
***It is used to insert the data to the existing table.***

**INSERT INTO TABLE VALUES**


### UPDATE

***It is used to update the existing data from the table.***

Syntax: 

<pre>
UPDATE table_name 
SET col_name = val, col_name = val2, ..... 
[WHERE cond]; 
</pre>


### DELETE   
It is used to remove the particular record from the table.



DELETE FROM EMP WHERE 
DEPTNO IN 10;
COMMIT;


# TCL Transaction Control Language


It is used to save the transactions done in data manipulation langugae revoke the transactions in data manipulation language.

It has two sql statements, they are 
1. COMMIT
2. ROLLBACK

### COMMIT
It is used to save all the transactions done by data manipulation language into database.
Syntax:

COMMIT;

### ROLLBACK
It is used to get back the latest transaction.

Syntax:
Rollback to Savepoint

To save the latest transaction into the save point we can make use of a syntax, 
rollback to savepoint_name

to create the save point we could make use of a syntax: 

savepoint savepoint_name



Table -> flashback  
record -> rollback  

note: 

# DCL - Data Control Language
It is used to control the data flow between the users. 
It has two sql statements
1. GRANT 
2. REVOKE 

### GRANT
It is used to give the permission to access our table by another user.

Syntax:
GRANT SQL_STATEMENT ON database TO username
GRANT INSERT/SELECT/DELECT ON EMP TO HR


CONN SCOTT
PASSWORD:


### REVOKE
It is used to take back any grant permission from another user.

Syntax:
REVOKE SQL_SYNTAX ON database FROM username


REVOKE INSERT ON EMP FROM HR;
REVOKE SELECT ON EMP FROM HR;
REVOKE UPDATE ON EMP FROM HR;
REVOKE DELETE ON EMP FROM HR;




