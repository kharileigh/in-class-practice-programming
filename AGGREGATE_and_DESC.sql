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

-- aggregate functions : MULTIPLE ROWS
-- input : multiple rows
-- output : 1 row