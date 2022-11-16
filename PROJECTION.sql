/*
Selection : Selection of Rows
Projection : Selection of Columns

To View Content - (record of the table)
SELECT <projection list> (column names)
FROM <table>
WHERE <selection condition>
*/

use wileyDI001;

create table employee(
employeeId int primary key,
name varchar(30),
designation varchar(30),
department varchar(35),
salary double);

insert into employee
values(110, 'Poppy', 'Manager', 'Sales', 15000),
(105, 'Daab', 'Sr. Associate', 'HR', 13500), -- duplicate primary key
(112, 'Farah', 'Representative', 'Sales', 25000);

-- SELECTS ALL
select * 
from employee;

-- SELECTS COLUMNS ONLY
select employeeId, name, salary
from employee;

-- SELECT & as CREATES ALIAS NAMES FOR COLUMN
select employeeId as ID, name, salary
from employee;
-- OR -- QUOTES IF ALIAS HAS SPACE
select employeeId "EMP ID", name, salary
from employee;

-- USE TO CONCATENATE FIELDS & MESSAGES TOGETHER 
select
concat("Mr./Ms.", name, " work as ", designation, " in ", department, " department") as "Employee Details"
from employee;


-- WHILE OPTING FOR PROJECTION LIST, MAKE USE OF CALCULATIVE FIELDS AS WELL
-- monthly salary x 12 = annual salary 
-- alias in quotation marks
select name, salary "Monthly Salary", 12 * salary "Annual Salary"
from employee;


-- OPERATORS 
select
name,
salary "Basic Salary",
.10 * salary "allowance",
.07 * salary "deduction",
salary + .10 * salary -0.07 * salary "TotalSalary"
from employee;


-- TO STOP REPEATED ONES FROM NOT APPEARING
select distinct department from employee;
