use wileyDI001;

create table users(
userId int auto_increment primary key,
userName varchar(25) not null,
age int,
password varchar(25) default "MyPassword"
);

insert into users(userName, age, password)
values("User1", 34, "user123");

select * from users;

-- default password inserted instead of null
insert into users(userName, age)
values("User2", 44);

select * from users;

create table Voters(
voterId int auto_increment primary key,
voterName varchar(25),
address varchar(40),
age int check(age >= 18));

-- inserted into database
insert into voters(voterName, address, age)
values("Sarah", "London", 34);

-- not inserted into database
insert into voters(VoterName, address,age)
values("Bobby", "Croydon", 14);

describe voters;