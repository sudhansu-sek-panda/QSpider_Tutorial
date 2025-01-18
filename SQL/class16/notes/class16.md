# Data Definition Language (DDL)
**It is used to deal with the table creation inside the database and it deals with the structure with the object.**

It has five statements. 
1. CREATE
2. RENAME
3. ALTER
4. TRUNCATE OR TRUNK
5. DROP

## CREATE
It is used to create or construct a table.
The syntax to create a table.
CREATE TABLE <table_name> 
(column1 datatype(size) [constraint], 
column2 datatype(size) [constraint],
column3 datatype(size) [constraint],...);

<pre>
SELECT * FROM TAB; - To show all the tables.
</pre>

To describe any table we could make use of: 

<pre>
DESCRIBE TABLE;
DESC TABLE;
</pre>

### RENAME
It is used to change the name of an existing table.

<pre>
RENAME TABLE TO NEW_NAME;
</pre>

### ALTER

It is used to modify the structure of the table.

**To add a column we can make use of a syntax:**

<pre>
ALTER TABLE TABLE_NAME ADD column_name datatype constraint;
</pre>

EX:
ALTER TABLE STUDENTS ADD phoneno number(10) check(length(phoneno) = 10) UNIQUE;


**To delete any column from the existing table, we could make use of the syntax:**

<pre>
ALTER TABLE TABLE DROP COLUMN column_name;
</pre>
Ex: ALTER TABLE STUDENTS DROP COLUMN phoneno;

**To rename any column from the existing table, we could make use of the syntax:**

<pre>
ALTER TABLE TABLE_NAME RENAME COLUMN column_name to new_column_name;
</pre>

Ex: ALTER TABLE STUDENTS RENAME COLUMN STRM TO STREAM;


ALTER TABLE STD 
MODIFY 

To modify the data type of the existing column, we could make use of the syntax: 

<pre>
ALTER TABLE table_name MODIFY column_name datatype;
</pre>
To modify a not null or null in an existing table we could make use the syntax:

<pre>
ALTER TABLE table_name MODIFY column_name old_datatype [NULL]/NOT NULL;
</pre>

ALTER TABLE STUDENT MODIFY STREAM varchar(14) null;


## TRUNCATE
It is used to remove all the records from the table permanenetly.

<pre>
TRUNK TABLE table_name;
</pre>

## DROP
It is used to drop the table from the data.

<pre>
DROP TABLE table_name;
</pre> 
DROP TABLE student

To retrive or recover the table from the bin folder we colud make use of 

<pre>
FLASHBACK TABLE table_name TO BEFORE DROP;
</pre>
Ex: FLASHBACK TABLE student TO BEFORE DROP;

To remove or delete the table from the bin folder, we can make use of syntax: 
PURGE TABLE table_name;

