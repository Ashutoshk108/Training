
/*creating database*/
create database assessment 
use assessment

/*creating table for employee*/
create table emp(id int primary key identity, first_name nvarchar(30), last_name nvarchar(30), department nvarchar(30),Salary int)

/*inserting data into the emp table*/
insert into emp values('Ankul', 'Thakur', 'HR', 50000)
insert into emp values('Avinash', 'Thakur', 'IT', 70000)
insert into emp values('Gaurav', 'Gaur', 'HR', 40000)
insert into emp values('Karan', 'Mehta', 'Flight Attendent', 60000)
insert into emp values('Aman', 'Gupta', 'Surveillance', 90000)

/*displaying all details of emp*/
select * from emp

create table empPersonalDetails(id int identity foreign key references emp(id), city nvarchar(30), gender nvarchar(30), experience int)

/*inserting data into empPersonalDetails*/
insert into empPersonalDetails values('Mohali', 'male', 2)
insert into empPersonalDetails values('Yamuna nagar', 'male', 3)
insert into empPersonalDetails values('Kaithal', 'male', 1)
insert into empPersonalDetails values('Rohtak', 'male', 2)
insert into empPersonalDetails values('Faridabad', 'male', 4)
 
/*creating procedure to add details of new employee*/
create procedure sp_insertEmp(@first_name nvarchar(30), @last_name nvarchar(30), @department nvarchar(30), @Salary int, @city nvarchar(30), @gender nvarchar(30), @experience int)
as
begin
insert into emp(first_name, last_name, department, Salary) values(@first_name, @last_name, @department, @Salary)
insert into empPersonalDetails(city, gender, experience) values(@city, @gender, @experience)
end

/*executing sp_insert to add new employee*/
exec sp_insertEmp @first_name='Ashu', @last_name='Kumar', @department='HR', @Salary=70000, @city='Chandigarh', @gender='male', @experience=2 

/*displaying all data from both the tables*/
select * from emp
select * from empPersonalDetails

/*creating procedure to display employee data of the concerned employee*/
create procedure sp_displayEmpData(@id int)
as
begin
select 
	 e.id,e.first_name,e.last_name, e.department, p.city, p.gender, p.experience
from emp as e
join empPersonalDetails as p
	on e.id=p.id and e.id=@id
end

/*executing sp_displayEmpData procedure to display details related to emp id 3*/
exec sp_displayEmpData @id=3

create table passenger(id int primary key identity, first_name nvarchar(30), last_name nvarchar(30), source_loc nvarchar(30), destination_loc nvarchar(30)) 
insert into passenger values('Kumar', 'Rituraj', 'Mohali', 'Goa')
insert into passenger values('Akash', 'Kumar', 'Delhi', 'Goa')
insert into passenger values('Axat', 'yadav', 'Gurugram', 'Pune')
insert into passenger values('Jai', 'Dixit', 'Mumbai', 'Delhi')

select * from passenger

create table passengerDetails(id int identity foreign key references passenger(id), seat_no nvarchar(30), fare int)
insert into passengerDetails values('A1',5000)
insert into passengerDetails values('A2',4900)
insert into passengerDetails values('A3',6500)
insert into passengerDetails values('A4',7000)

select * from passengerDetails

/*creating procedure to book ticket for the passenger*/
create procedure sp_insertPassenger(@first_name nvarchar(30), @last_name nvarchar(30), @source_loc nvarchar(30), @destination_loc nvarchar(30), @seat_no nvarchar(30), @fare int)
as
begin
insert into passenger(first_name, last_name, source_loc, destination_loc) values(@first_name, @last_name, @source_loc, @destination_loc)
insert into passengerDetails(seat_no, fare) values(@seat_no, @fare)
end

exec sp_insertPassenger @first_name='Deepak', @last_name='Kumar', @source_loc='Delhi', @destination_loc='Pune',@seat_no='A5', @fare=7300

select * from passenger

/*creating procedure to display passenger data of the concerned id number*/
create procedure sp_displayPassenger(@id int)
as
begin
select 
	 p.id,p.first_name,p.last_name, p.source_loc, p.destination_loc, pd.seat_no, pd.fare
from passenger as p
join passengerDetails as pd
	on p.id=pd.id and p.id=@id
end

/*executing sp_displayPassenger procedure to display details related to passenger id 3*/
exec sp_displayPassenger @id=3
