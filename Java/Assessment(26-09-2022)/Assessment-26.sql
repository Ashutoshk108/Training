create database Assessment26;

use Assessment26;

create table User(
User_Id int primary key,
F_Name varchar(30),
L_Name varchar(30),
Address varchar(50),
Mobile int,
Email varchar(30),
UserName varchar(30),
Password varchar(30),
Referral_Pnts int);

Desc User;
insert into User values(1,'Aman','Gupta','Faridabad',34568879,'aman@gmail.com','Aman123','Bhavna@123',0);
insert into User values(2,'Axat','Yadav','Faridabad',6768879,'axat@gmail.com','Axat123','Bhavna@123',0);
insert into User values(3,'Arun','Kumar','Faridabad',98568879,'arun@gmail.com','Arun123','Bhavna@123',0);
insert into User values(4,'Ajay','Gupta','Faridabad',78568879,'ajay@gmail.com','Rahul123','Bhavna@123',0);
insert into User values(5,'Rahul','Jaiswal','Faridabad',54568879,'rahul@gmail.com','Rahul123','Bhavna@123',0);
/*
update User 
set Referral_Pnts=1000 where User_Id=2;
*/

create table Referral(
Referal_Id int primary key,
F_Name varchar(30),
L_Name varchar(30),
Mob_No int,
Email varchar(30),
User_Id int,
Foreign key(User_Id) references User(User_Id),
Date_Of_Referral date,
Status boolean
);

desc Referral;
insert into Referral values(1,'Gaurav','Gaur',65876465,'Gaurav@gmail.com',1,'2022-09-21',true);
insert into Referral values(2,'Avinash','Thakur',85876465,'Avi@gmail.com',1,'2022-09-22',true);
insert into Referral values(3,'Vivek','Verma',77876465,'Vivek@gmail.com',2,'2022-09-23',false);
insert into Referral values(4,'Hritik','Mishra',45876465,'Hritik@gmail.com',1,'2022-09-23',true);
insert into Referral values(5,'Koshal','Garg',75876465,'Koshal@gmail.com',1,'2022-09-24',true);

create table Customer(
C_Id int primary key,
F_Name varchar(30),
L_Name varchar(30),
Email varchar(30),
Mob_No int
);


desc Customer;
insert into Customer values(1,'Aman','Gupta','aman@gmail.com',34568879);
insert into Customer values(2,'Axat','Yadav','axat@gmail.com',6768879);
insert into Customer values(3,'Arun','Kumar','arun@gmail.com',98568879);
insert into Customer values(4,'Ajay','Gupta','ajay@gmail.com',78568879);
insert into Customer values(5,'Rahul','Jaiswal','rahul@gmail.com',54568879);

create  table Buying_Details(
Customer_ID int,
foreign key(Customer_ID) references Customer(C_Id),
User_Id int,
foreign key(User_Id) references User(User_Id),
Purchase date,
Prd_Name varchar(30)
);

desc Buying_Details;

insert into Buying_Details values(1,1,'2022-09-22','Samsung Galaxy S22');
insert into Buying_Details values(2,2,'2022-09-22','Iphone 14');
insert into Buying_Details values(3,3,'2022-09-23','Samsung galaxy fold');
insert into Buying_Details values(4,4,'2022-09-23','Iphone 13');
insert into Buying_Details values(5,5,'2022-09-24','Samsung Galaxy S21');

/*First Query*/
SELECT User.User_Id, count(Referral.User_Id) as number_of_Referrals        
from User
left join Referral
on (User.User_Id=Referral.User_Id)
group by
    User.User_Id;
    
/*Second Query*/
select User_Id, F_Name, Referral_Pnts from User;

select * from Customer;

/*3rd Query*/
select F_Name,Mobile from User left join Buying_Details on User.User_Id=Buying_Details.User_Id where 
Purchase='2022-09-22';

/*4th Query*/
select * from Buying_Details where Prd_Name='Iphone 14';

/*5th Query*/

delete C_Id,F_Name,L_ame,Email,Mob_No from customer left join  Buying_Details on 
Customer.User_Id=Buying_Details.UserId where Prd_Name='iphone14';

/*6th Query*/
create view Userview as select User.F_Name,user.L_Name,user.Email,user.Mobile from User 
order by Email,Mobile;
select * from Userview;

