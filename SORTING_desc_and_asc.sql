-- SORT DATA ON MULTILPLE FIELDS
-- 1st field - Global Sort
-- 2nd field - sorted within 1st field

-- DEFAULT SORT ORDER : Ascending 
-- desc : Descending

select * 
from employee
order by department;

-- descending
select * from emplyee
order by department desc;

-- descending department
select * from employee
order by department desc, designation;

-- descending both
select * from employee
order by department desc, designation;



-- PROEJECTION LIST 
-- not mandatory on which opting for order by clause, should be there in projection list
-- select <project column list>
-- from <tablename>
-- where <selection condition>
-- order by <column list for sort order> asc/desc
select name, salary
from employee
where department = "Sales"
order by salary;


