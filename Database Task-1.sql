create table Products(prdt_id int primary key, price int, discount int, prdt_name varchar(30), manufacturer varchar(30))

insert into Products values(1, 5000, 500, 'Prdt A', 'Manufacturer A')
insert into Products values(2, 5500, 600, 'Prdt B', 'Manufacturer B')
insert into Products values(3, 6000, 700, 'Prdt C', 'Manufacturer C')
insert into Products values(4, 6600, 400, 'Prdt D', 'Manufacturer D')
insert into Products values(5, 7000, 800, 'Prdt E', 'Manufacturer E')
insert into Products values(6, 4500, 540, 'Prdt F', 'Manufacturer F')
insert into Products values(7, 1500, 100, 'Prdt G', 'Manufacturer G')
insert into Products values(8, 7300, 800, 'Prdt H', 'Manufacturer H')
insert into Products values(9, 8700, 900, 'Prdt I', 'Manufacturer I')
insert into Products values(10, 8200, 900, 'Prdt J', 'Manufacturer J')

select * from Products


create table Orders(order_id int primary key, customer_id int, order_date varchar(30))
insert into Orders values(1, 1, '22-7-2022')
insert into Orders values(2, 2, '07-7-2022')
insert into Orders values(3, 3, '2-8-2022')
insert into Orders values(4, 4, '1-8-2022')
insert into Orders values(5, 5, '25-7-2022')
insert into Orders values(6, 6, '28-7-2022')
insert into Orders values(7, 7, '29-7-2022')
insert into Orders values(8, 8, '23-7-2022')
insert into Orders values(9, 9, '22-7-2022')
insert into Orders values(10, 10,'1-7-2022')

select * from Orders

create table Customer(id int primary key, C_name varchar(30), city varchar(30), pincode int)
insert into Customer values(1, 'Arun', 'Delhi', 116008)
insert into Customer values(2, 'Axat', 'Faridabad', 216008)
insert into Customer values(3, 'Aman', 'Noida', 316008)
insert into Customer values(4, 'Ajay', 'Gurugram', 416008)
insert into Customer values(5, 'Ashu', 'Noida', 516008)
insert into Customer values(6, 'Hritik', 'Faridabad', 616008)
insert into Customer values(7, 'Abhishek', 'Delhi', 716008)
insert into Customer values(8, 'Amit', 'Mohali', 816008)
insert into Customer values(9, 'Raj', 'Gurugram', 916008)
insert into Customer values(10, 'Anmol', 'Palwal', 156008)

select * from Customer

create table Accounts(c_id int primary key, order_id int, payment_status varchar(30) )
insert into Accounts values(1,1,'Yes')
insert into Accounts values(2,2,'No')
insert into Accounts values(3,3,'Yes')
insert into Accounts values(4,4,'No')
insert into Accounts values(5,5,'Yes')
insert into Accounts values(6,6,'No')
insert into Accounts values(7,7,'Yes')
insert into Accounts values(8,8,'No')
insert into Accounts values(9,9,'Yes')
insert into Accounts values(10,10,'No')

select * from Accounts

create view Customer_View
as
select prdt_id, price, payment_status
from  Products as P
inner join Accounts as A
on P.prdt_id=A.c_id

select * from Customer_View

create view Accounts_view
as
select sum(price) as 'Total sales amount' 
from Products as P
inner join Accounts as A
on P.prdt_id=A.c_id and A.payment_status='Yes'

select * from Accounts_view

create view Order_View
as 
select order_id, order_date, C_name, city
from Orders as O
inner join Customer as C
on O.order_id=C.id

select * from Order_View

create view Product_view
as 
select prdt_name, manufacturer, payment_status 
from Products as P
inner join Accounts as A
on P.prdt_id=A.c_id and payment_status='Yes'

select * from Product_view