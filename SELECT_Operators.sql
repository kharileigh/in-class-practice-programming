select * from employee;

select * from employee
where designation LIKE "Sr. %";

-- 1st character (underscore means 1 chracter)
-- 2nd character is A
-- Following characters can be anything (percentage is number of characters
select * from employee
where department LIKE "_a%";

-- condition between 50,000 - 100,000
select * from employee
where salary >= 50000 and salary <= 100000;
-- OR
-- between  & and operator
select * from employee
where salary BETWEEN 50000 and 100000;

-- display all working in IT, HR, MARKETING department
select * from employee
where department = "IT" or department = "HR" or department = "Marketing";


-- if you have possible values