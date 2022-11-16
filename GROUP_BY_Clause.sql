/*
GROUP BY
*/

-- PROJECTION LIST
-- created smaller chunks of groups, then use aggregate functions on each group
-- DATA GROUPED BY FIELD (each in department) 
select department, sum(salary) "Total Salary"
from employee
group by department;


-- PROJECTION LIST NOT SHOULD NOT BE MULTIPLE COLUMN, SHOULD ONLY BE SINGLE COLUMN
-- THIS GIVES INCORRECT OUTPUT AS TRYING TO DISPLAY MULTI ROW WITH SINGLE ROW OUTPUT
-- BUG : group by will display the first row in each multiple column as oppose to give an error
select name, department, sum(salary) "Total Salary"
from employee
group by department;


-- CONDITIONS ON GROUPS : having Clause
select department, sum(salary) "Total Salary"
from employee
group by department
having sum(salary) > 50000;

