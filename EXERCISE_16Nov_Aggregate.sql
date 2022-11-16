use wileyDI001;

-- 1
-- find highest, lowest, sum, average salary of all employees
-- label columns Maximum, Minimum, Sum, Average
select 
max(salary) "Maximum",
min(salary) "Minimum",
sum(salary) "Sum",
avg(salary) "Average"
from Employees;


-- 2
-- display minimum, maximum, sum and average salary for each job type
select JOB_ID,
max(salary) "Maximum",
min(salary) "Minimum",
sum(salary) "Sum",
avg(salary) "Average"
from Employees
group by JOB_ID;

-- 3
-- display number of people with same job
select EMPLOYEE_ID, count(*) "Total Employees in Different Roles"
from Employees
group by JOB_ID;


-- 4
-- determine number of managers without listing them 
-- label Number of Managers
select 
count(distinct MANAGER_ID) "Number Of Managers"
from Employees;


-- 5
-- difference between highest and lowest salaries
-- label column difference
select max(salary) - min(salary) "Difference"
from Employees;


