/*
	JOIN
    used to fetch data from two separate tables
    used to combine rows from two or more tables, based on a related column between them.
    
    INNER JOIN
    returns records that have matching values in both tables
    
	LEFT OUTER JOIN
    returns all records from the left table, and the matched records from the right table
    
    RIGHT OUTER JOIN
    returns all records from the right table, and the matched records from the left table
    
    FULL JOIN (NOT SUPPORTED BY THIS SQL)
    returns all records when there is a match in either left or right table
    
    CROSS JOIN (CARTESIAN PRODUCT)
    returns the cartesian product of rows from the tables in the join
    combines each row from first table with each row of the second table
    
*/


-- INNER JOIN & USING
-- (columns are same)
-- 1. SELECT : to differentiate from tables, use alias for table name
--      	(need alias to differentiate between columns of name / fields in both tables)
-- 2. FROM : tables to fetch from
-- 3. USING : joins with respect to field within parenthesis 
--           (name that matches one table will be matched with that of name in other table)
--           (use a common column between both tables to join)
select member_id, M.name, committees_id, C.name
from members M inner join committes C
USING(name);


-- INNER JOIN & ON
-- (column names are different but still want to join - names are different so no alias needed)
-- column is the same values / data types but has different names
-- 1. SELECT : fields to fetch from tables 
-- 2. FROM : tables to fetch from
-- 3. ON : condition on which to join the two tables
select empId, name, dept_id, departmentName, location, designation, salary
from emp E inner join department D
on E.dept_id = D.departmentId;


-- LEFT JOIN
select empId, name, dept_id, departmentName, location, designation, salary
from emp E left join department D
on E.dept_id = D.departmentId;

-- RIGHT JOIN
select empId, name, dept_id, departmentName, location, designation, salary
from emp E right join department D
on E.dept_id = D.departmentId;

-- JOIN
select empId, name, dept_id, departmentName, location, designation, salary
from emp E join department D
on E.dept_id = D.departmentId;

-- CROSS JOIN
select empId, name, dept_id, departmentName, location, designation, salary
from emp E cross join department D



