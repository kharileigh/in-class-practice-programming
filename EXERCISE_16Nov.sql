use wileyDI001;

-- 1
-- display last name, salary earning between $5000 & $12000 
-- in department 20 or 50
-- label columns Employee & Monthly Salary respectively
select LAST_NAME "Employee", SALARY "Monthly Salary"
from Employees
where SALARY between 5000 and 12000 and DEPARTMENT_ID in (20, 50);


-- 2
-- display last name & hire date for all hired in 1994
select LAST_NAME "Employee", HIRE_DATE "Start Date"
from Employees
where HIRE_DATE = 1994;


-- 3
-- display last name & job ID for all who do NOT have a manager
select LAST_NAME "Employee", JOB_ID "Role"
from Employees
where MANAGER_ID is null;

-- NEED TO UPDATE TYPO IN COLUMN NAME
alter table Employees
rename column COMMISION_PCT to COMMISSION_PCT;

-- 4
-- display last name, salary & commission of all who earn commission
select LAST_NAME "Employee", SALARY "Salary", COMMISSION_PCT "Commisssion Percentage"
from Employees
where COMMISSION_PCT is not null;

-- 5
-- change last name of employee 3 to Drexler
update Employees
set LAST_NAME = "Drexler"
where EMPLOYEE_ID = 3;

-- 6 
-- change salary to $100000 for all who have salary less than $90000
update Employees
set SALARY = 100000
where salary <= 90000;

-- 7
-- delete Betty Dancs from Employees table
delete from Employees
where FIRST_NAME = "Betty" and LAST_NAME = "Dancs";

-- 8
-- empty Employee table
delete from Employees;