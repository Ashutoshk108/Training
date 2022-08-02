create database bhavnacorp

use bhavnacorp 

create table Personal_Details(id int Primary Key, name nvarchar(50), email_id nvarchar(50))

insert into Personal_Details values(1, 'Ashutosh', 'ashutosh@gmail.com')
insert into Personal_Details values(2, 'Aman', 'aman@gmail.com')
insert into Personal_Details values(3, 'Sahil', 'Sahil@gmail.com')
insert into Personal_Details values(4, 'Gaurav', 'gaurav@gmail.com')

select * from Personal_Details

create table Official_Details(id int Primary key, Department nvarchar(50), Designation nvarchar(50), Location nvarchar(50))

insert into Official_Details values(1, 'Engineering', 'Software Engineer', 'Noida')
insert into Official_Details values(2, 'HR', 'Head of HR', 'Noida')
insert into Official_Details values(3, 'Finance', 'Head of Finance Department', 'Noida')
insert into Official_Details values(4, 'Sales', 'Sales Lead', 'Noida')

select * from Official_Details


create table Salary(id int Primary key, days_Present numeric, Total_Salary numeric, Bonus numeric) 

insert into Salary values(1, 24, 50000, 7000)
insert into Salary values(2, 23, 60000, 7000)
insert into Salary values(3, 20, 70000, 10000)
insert into Salary values(4, 25, 350000, 17000)

select * from Salary

select max(Total_Salary) as 'Maximum Salary' from Salary

select avg(Total_Salary) as 'Avg Salary' from Salary

select sum(Total_Salary) as 'Sum of Salary' from Salary
