/*
Foreign Key : Primary Key of one table can be foreign key in another
*/

-- PARENT CLASS HOLDS PRIMARY KEY
create table department(
departmentId varchar(10) primary key,
departmentName varchar(35),
location varchar(25),
capacity int);

-- CHILD CLASS HOLDS FOREIGN KEY
-- Foreign Key establishes the relationship between two tables
-- references parent table primary key 
-- same as foreign key in current table
-- constraint name should be meaningful, in case needing to add more
/* Syntax :
1st : constraint <constraint name>
2nd : foreign key(fieldname)
3rd : references parentstablename(primarykeyname);
*/
create table emp(
empId int primary key,
name varchar(20),
departmentId varchar(10),
designation varchar(20),
salary double,
constraint deptId_FK
foreign key(departmentId)
references department(departmentId));

describe emp;
describe department;

insert into department
values("D0011", "Department A", "Location M", 100),
("D0022", "Department B", "Location N", 200),
("D0033", "Department C", "Location O", 300),
("D0044", "Department D", "Location P", 400),
("D0055", "Department E", "Location Q", 500);

select * from department;

-- EVERY EMPLOYEE NOW CONNECTED TO DEPARTMENTS
-- foreign key (child) created relationship to primary key (parent)
insert into emp
values(1,"AAAA","D0033","Associate", 67000),
(2,"BBBB","D0022","Sr. Associate", 89000),
(3,"CCCC","D0033","Manager", 287000),
(4,"DDDD","D0044","Executive", 47000),
(5,"EEEE","D0022","Director", 769000);

select * from emp;

