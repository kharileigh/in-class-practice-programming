use wileyDI001;

-- display last name, job code, hire date, employee number
-- employee num first
-- alias for start date & hire date column

select EMPLOYEE_ID, LAST_NAME, JOB_ID, HIRE_DATE "STARTDATE"
from Employees;

-- display all & job IDs
-- last name (Employee alias) concatenated with job ID (Title alias)
select
concat ("Mr./Ms.", LAST_NAME, " works in ", JOB_ID) as "Employee and Title"
from Employees;

-- query to display all data from that table
-- separate each column by comma
-- name column title THE OUTPUT
select 
concat(EMPLOYEE_ID, ", ", FIRST_NAME, ", ", LAST_NAME, ", ", EMAIL, ", ", PHONE_NUMBER, ", ", HIRE_DATE, ", ", JOB_ID, ", ", SALARY, ", ", COMMISION_PCT) as "THE OUPUT"
from Employees;

-- display last name, job id, start date for employees with last names of Matos and Taylor
select LAST_NAME "Last Name", JOB_ID "Job", HIRE_DATE "Start Date"
from Employees
where LAST_NAME = "Taylor" or LAST_NAME = "Matos";