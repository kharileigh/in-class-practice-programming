/*

SELECTION - selecting the rows

-- PICK ROWS USING CERTAIN CONDITION
-- data type (double quotes)
-- numeric type (single quotes)

Relational Operators : >, <. >=, <=, !=, =
Logical Operators : and, or, not
Check for Nulls : is, is not
*/

insert into employee
values(114, 'Poppy', 'Manager', 'Sales', 15000),
(115, 'Daab', 'Sr. Associate', 'HR', 13500), -- duplicate primary key
(117, 'Farah', 'Representative', 'Sales', 25000);

select * from employee;

-- = relational operator
select *
from employee
where department = "Sales";

-- not logical operator
select *
from employee
where department = "Sales";

-- reverse condition
select *
from employee
where not salary > 100000;

-- and logical operator (Display all Executives working in IT Department)
select *
from employee
where designation = "Executive" and department = "IT";

-- or operator (Display all working in either IT or HR Department
select *
from employee
where department = "IT" or department = "HR";

-- SELECTION & PROJECTION TOGETHER
-- Display name and department of all working in Sales Department
select name, department
from employee
where department = "Sales";

-- null condiitonal check (IS NOT)
select *
from employee
where department IS NOT null;

-- to check for equality (IS)
select *
from employee
where department IS null;
