use bhavnacorp

create table Products(P_ID int primary key, P_Name nvarchar(30), Unit int, Price int)

insert into Products values(1, 'Prdt_1', 10, 100)
insert into Products values(2, 'Prdt_2', 17, 1800)
insert into Products values(3, 'Prdt_3', 16, 190)
insert into Products values(4, 'Prdt_4', 13, 1600)
insert into Products values(5, 'Prdt_5', 9, 200)


select * from Products

create table Customers(C_ID int primary key, C_Name nvarchar(30), city nvarchar(30), P_Code int)

insert into Customers values(1, 'Ashutosh', 'Faridabad', 121002)
insert into Customers values(2, 'Aman', 'Delhi', 116008)
insert into Customers values(3, 'koshal', 'Patiala', 221602)
insert into Customers values(4, 'Rahul', 'Mohali', 143008)
insert into Customers values(5, 'Hritik', 'Chandigarh', 161002)

select * from Customers


create table Orders(O_Id int primary key, C_ID int, Order_Date nvarchar(30), constraint fk_inv_C_ID foreign key (C_ID) references Customers(C_ID))
insert into Orders values(1101, 1, '21-07-2022')
insert into Orders values(107, 2, '23-06-2022')
insert into Orders values(178, 3, '25-07-2022')
insert into Orders values(297, 76, '28-07-2022')
insert into Orders values(157, 5, '31-07-2022')
insert into Orders values(127, 5, '31-07-2022')
insert into Orders values(387, 3, '31-07-2022')

select * from Orders

select * from Customers
select C_ID, count(C_ID) as 'Frequency of Order' from Orders group by C_ID


select distinct C_Name,P_Code,Order_Date from Customers as C
inner join Orders as O
on C.C_ID=O.C_Id
order by C_Name 

select * from Products 
where Price>200 

select P_Name, sum(Unit) as 'Total Unit of Goods'
from Products 
group by P_Name
having sum(Unit)>15

