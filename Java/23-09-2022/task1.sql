create database company;
use company;

drop table Employee;
create table Employee(EId int primary key, EName varchar(50), Address varchar(50), Gender varchar(10),Contact int, DOB date, Salary int);
insert into Employee values(1, 'Aman Gupta','Faridabad','Male',759789856,'2000-01-11',70000);
insert into Employee values(2, 'Abhijeet','Delhi','Male',849789856,'2001-01-11',50000);
insert into Employee values(3, 'Shivam','Faridabad','Male',776785856,'1999-01-11',60000);
insert into Employee values(4, 'Vivek','Delhi','Male',759789856,'2000-01-11',100000);

select * from Employee;

create table Department(DId int primary key, D_Name varchar(30),Description varchar(100), Contact int);
insert into Department values(101, 'HR', 'Responsible for handling human resource related task',436734576);
insert into Department values(102, 'IT', 'Responsible for serving the client',436734576);
insert into Department values(103, 'Finance', 'Hadnles all the financial transactions within the organization',436734576);

Select * from Department;
create table Job(Job_id int primary key,Title varchar(50),D_ID int,Foreign Key(D_Id ) references Department(DId));

select * from Job;
Alter table Job
Add column E_Id int;
select * from Job;

Alter table Job 
Add Foreign key(E_Id) references Employee(EId);

select * from Job;
insert into Job values(1,'Developer',102,3);

select * from Job;

