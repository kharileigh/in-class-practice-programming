create database wileyDI001;

use wileyDI001;


create table Departments(
DEPARTMENT_ID int auto_increment primary key,
DEPARTMENT_NAME varchar(30) not null,
MANAGER_ID int,
LOCATION_ID int
);

DROP TABLE IF EXISTS Jobs;

create table Jobs (
JOB_ID varchar(10) primary key,
JOB_TITLE varchar(35) not null,
MIN_SALARY int,
MAX_SALARY int
);

create table Employees(
EMPLOYEE_ID int auto_increment primary key,
FIRST_NAME varchar(20),
LAST_NAME varchar(25) not null,
EMAIL varchar(20) not null,
PHONE_NUMBER varchar(20),
HIRE_DATE date not null,
JOB_ID varchar(10) not null,
SALARY double,
COMMISION_PCT double,
MANAGER_ID int,
DEPARTMENT_ID int,

constraint jobId_FK
foreign key (JOB_ID)
references Jobs(JOB_ID),

constraint departmentId_FK
foreign key (DEPARTMENT_ID)
references Departments(DEPARTMENT_ID)
);

describe Departments;
describe Jobs;
describe Employees;

DROP TABLE IF EXISTS emp;
DROP TABLE IF EXISTS department;
DROP TABLE IF EXISTS Employees;


insert into Departments 
values(111, "HR", 234, 515),
(222, "Financial Services", 345, 516),
(333, "Management", 456, 517),
(444, "Production", 567, 518),
(555, "Development", 678, 519);

select * from Departments;
insert into Jobs
values(23, "Frontend Developer", 30000, 50000),
(24, "Backend Developer", 40000, 60000),
(25, "Business Analysis", 25000, 35000),
(26, "Product Management", 70000, 80000),
(27, "CEO", 100000, 500000);

select * from jobs;

-- DATE STRUCTURE : "YYYY-MM-DD"
-- FOREIGN KEYS MUST MATCH VALUES IN TABLE WHERE PRIMARY KEY RESIDES
insert into Employees 
values 
(121, "Mona", "Brown", "monabrown@gmail.com", 21545619809, "2022-10-27", 23, 50000, 12, 234, 222),
(122, "Poppy", "Piker", "poppypiker@gmail.com", 2152357890, "2022-10-26", 24, 60000, 11, 345, 444),
(123, "Mill", "Lor", "milllor@gmail.com", 2154560000, "2022-10-25", 27, 100000, 10, 456, 222),
(124, "Cora", "Lee", "coralee@gmail.com", 215456222, "2022-10-15", 23, 75000, 15, 567, 222),
(125, "Bob", "Bino", "bobbino@gmail.com", 2154563232, "2022-10-04", 27, 10000, 14, 678, 555);

select * from Employees;


