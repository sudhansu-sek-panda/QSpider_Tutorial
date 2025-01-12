# SQL
SQL stnads for structure query language which is the specific purpose language and it is used to communicate with RDBMS.

## Rules of EF Codd
1. The data stored in the database should be in a tabular format including metadata.

### Metadata
The details or the data of a data is known as metadata.

2. The data stored in a shell should be a single valued data, to avoid the data loss.

3. According th EF Codd, we can store the data in multiple tables, if it is required we can establish the connection between two tables using key attributes.

4. We can validate the data by assigning the data types and by assigning constraints.

## Data Types
Data types is used to specify the type or the kind of the data which is stored at a specific location.

There are 5 types of datatypes are there:

1. char
2. varchar/ varchar2 
3. Number
4. Date
5. Large Objects

## char datatype
It is a data type which acts as upper case (A-Z), lower case (a-z), digits (0-9), and some special characters (@,#) into a specific column.

- To assign a datatype to any column, we can make use of a syntax, i.e **char(size)**

### size
size specifies that the maximum number of characters can be stored into a set.

Syntax:
SELECT [DISTNICT]column_name/ expression[ALIAS NAME] FROM table_name;

Order of Execution
1. FROM
2. SELECT
