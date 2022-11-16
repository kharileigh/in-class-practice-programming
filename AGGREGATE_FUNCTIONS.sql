/*
  AGGREGATE FUNCTIONS
  MULTIPLE ROWS INPUT -> 1 ROW OUTPUT


*/

-- total salary of organisation
select sum(salary) "Total Salary to Entire Organisation"
from employee;

-- those in specified department, will have their salary added
-- with alias
select sum(salary) "Total Salary to HR Department"
from employee
where department = "HR";

-- min, mac & max salary in entire organisation
select min(salary) "Minimum Salary in Organisation",
max(salary) "Maximum Salary in Organisation",
avg(salary) "Average Salary in Organisation"
from employee;

-- SELECTION CRITERIA FOR : min, mac & max salary in entire organisation
select min(salary) "Minimum Salary in Organisation",
max(salary) "Maximum Salary in Organisation",
avg(salary) "Average Salary in Organisation"
from employee
where department = "HR";

-- total number of rows in this field
select count(designation)
from employee;

-- total number of specific field (REMOVES DUPLICATES)
select count(distinct department)
from employee;