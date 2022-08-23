/*creating database*/
create database fashion

/*to set current database to use*/
use fashion

/*creating brand table*/
CREATE TABLE brand(
brand_id int primary key identity,
brand_name nvarchar(20),
brand_segment nvarchar(20),
brand_values int,
audiance_target nvarchar(20)
)

/*creating brand_log*/
create table brand_log(LogID int identity, operation nvarchar(20), updated_date Datetime)
select * from brand_log

/*creating trigger for insert command*/
create trigger brandInsertTrigger
on brand
for insert
as
insert into brand_log(operation, updated_date)
select 'Data inserted', GETDATE() from inserted

/*creating trigger for delete command*/ 
create trigger brandDeleteTrigger
on brand
for delete
as 
insert into brand_log(operation, updated_date)
select 'Data deleted', GETDATE() from deleted

/*to delete a record from the table where name is 'Nike'*/
delete from brand where brand_name='Nike'

/*creating trigger for update command*/
create trigger brandUpdateTrigger
on brand
after update
as 
insert into brand_log(operation, updated_date)
select 'Data updated', GETDATE() from deleted


SELECT * FROM brand_log
UPDATE brand SET brand_name='OPPO' WHERE brand_id 


/*creating procedure to insert data in the brand table*/
create procedure sp_insertbrand(
@brand_name nvarchar(20),
@brand_segment nvarchar(20),
@brand_values int,
@audiance_target nvarchar(60))
as
begin
insert into brand(brand_name,brand_segment,brand_values,audiance_target) values(@brand_name,@brand_segment,@brand_values,@audiance_target)
end

/*calling sp_insertbrand procedure to insert data in the brand table*/
exec sp_insertbrand @brand_name='Puma', @brand_segment='Sports',@brand_values=1000.8,@audiance_target='Youth'
exec sp_insertbrand @brand_name='Apple', @brand_segment='Electronic',@brand_values=876,@audiance_target='Urban'
exec sp_insertbrand @brand_name='Microsoft', @brand_segment='Electronic',@brand_values=1000,@audiance_target='Urban'
exec sp_insertbrand @brand_name='Facebook', @brand_segment='Social Media',@brand_values=795,@audiance_target='Youth'
exec sp_insertbrand @brand_name='EA Arts', @brand_segment='Gaming',@brand_values=800,@audiance_target='Youth'
exec sp_insertbrand @brand_name='Walmart', @brand_segment='Retail',@brand_values=500,@audiance_target='All'
exec sp_insertbrand @brand_name='AWS', @brand_segment='Cloud',@brand_values=896,@audiance_target='Corporates'
exec sp_insertbrand @brand_name='Azure', @brand_segment='Cloud',@brand_values=876,@audiance_target='All'
exec sp_insertbrand @brand_name='Flipkart', @brand_segment='E-commerce',@brand_values=900,@audiance_target='Urban'
exec sp_insertbrand @brand_name='Amazon', @brand_segment='E-commerce',@brand_values=700,@audiance_target='Tier-2, Tier-3 city'
exec sp_insertbrand @brand_name='Nike', @brand_segment='Shoe',@brand_values=700,@audiance_target='Youth'


/*creating celebrity table*/
CREATE TABLE celebrity(
celeb_id int primary key identity,
celeb_fname nvarchar(20),
celeb_lname nvarchar(20),
celeb_area nvarchar(20),
celeb_age int,
followers_num numeric(15,1)
)

/*creating procedure to insert data in the celebrity table*/
create procedure sp_insertCelebrity(
@celeb_fname nvarchar(20),
@celeb_lname nvarchar(20),
@celeb_area nvarchar(20),
@celeb_age int,
@followers_num numeric(15,1)
)
as
begin
insert into celebrity(celeb_fname,celeb_lname,celeb_area, celeb_age, followers_num) values(@celeb_fname, @celeb_lname, @celeb_area, @celeb_age, @followers_num)
end

/*inserting data in the celebrity table using sp_insertCelebrity*/
exec sp_insertCelebrity @celeb_fname='Salman',@celeb_lname='Khan',@celeb_area='Actor',@celeb_age=55,@followers_num=55.5
exec sp_insertCelebrity @celeb_fname='Akshay',@celeb_lname='Kumar',@celeb_area='Actor',@celeb_age=52,@followers_num=55.5
exec sp_insertCelebrity @celeb_fname='Virat',@celeb_lname='Kohli',@celeb_area='Cricketer',@celeb_age=30,@followers_num=85
exec sp_insertCelebrity @celeb_fname='John',@celeb_lname='Abraham',@celeb_area='Actor',@celeb_age=40,@followers_num=55.5
exec sp_insertCelebrity @celeb_fname='Tom',@celeb_lname='Cruise',@celeb_area='Actor',@celeb_age=60,@followers_num=5
exec sp_insertCelebrity @celeb_fname='Robert',@celeb_lname='Downey Jr.',@celeb_area='Actor',@celeb_age=58,@followers_num=50
exec sp_insertCelebrity @celeb_fname='Elon',@celeb_lname='Musk',@celeb_area='Technology',@celeb_age=50,@followers_num=70
exec sp_insertCelebrity @celeb_fname='Naval',@celeb_lname='Ravikant',@celeb_area='Investor',@celeb_age=45,@followers_num=10
exec sp_insertCelebrity @celeb_fname='Sundar',@celeb_lname='Pichai',@celeb_area='Technology',@celeb_age=46,@followers_num=30
exec sp_insertCelebrity @celeb_fname='Narendra',@celeb_lname='Modi',@celeb_area='Politician',@celeb_age=65,@followers_num=67
exec sp_insertCelebrity @celeb_fname='Ethan',@celeb_lname='Hunt',@celeb_area='Influencer',@celeb_age=50,@followers_num=60

/*fetching content from celebrity*/
select * from celebrity

/*creating celebrity_log*/
create table celebrity_log(LogID int identity, operation nvarchar(20), updated_date Datetime)
select * from celebrity_log

/*creating trigger for insertion command*/
create trigger CelebrityInsertTrigger
on celebrity
for insert
as
insert into celebrity_log(operation, updated_date)
select 'Data inserted', GETDATE() from inserted

/*creating trigger for delete command*/ 
create trigger celebrityDeleteTrigger
on celebrity
for delete
as 
insert into celebrity_log(operation, updated_date)
select 'Data deleted', GETDATE() from deleted

delete from celebrity where celeb_fname='Tom'

/*creating trigger for update command*/
create trigger celebrityUpdateTrigger
on celebrity
after update
as 
insert into celebrity_log(operation, updated_date)
select 'Data updated', GETDATE() from deleted

/*creating endorsement table*/
CREATE TABLE endorsement(
brand_id int foreign key references brand(brand_id), 
celeb_id int foreign key references celebrity(celeb_id), 
tenure_deal int
)

/*creating procedure to insert data in the endorsement table*/
create procedure sp_insertEndorsement(@brand_id int, @celeb_id int, @tenure_deal int)
as
begin
insert into endorsement(brand_id, celeb_id, tenure_deal) values(@brand_id, @celeb_id, @tenure_deal)
end

/*inserting data into the endorsment table using sp_insertEnorsement procedure*/
exec sp_insertEndorsement @brand_id=1, @celeb_id=1, @tenure_deal=2
exec sp_insertEndorsement @brand_id=1, @celeb_id=2, @tenure_deal=3
exec sp_insertEndorsement @brand_id=3, @celeb_id=1, @tenure_deal=2
exec sp_insertEndorsement @brand_id=3, @celeb_id=6, @tenure_deal=2
exec sp_insertEndorsement @brand_id=4, @celeb_id=3, @tenure_deal=2
exec sp_insertEndorsement @brand_id=2, @celeb_id=4, @tenure_deal=2
exec sp_insertEndorsement @brand_id=3, @celeb_id=7, @tenure_deal=1
exec sp_insertEndorsement @brand_id=2, @celeb_id=4, @tenure_deal=3
exec sp_insertEndorsement @brand_id=6, @celeb_id=10, @tenure_deal=3



select * from endorsement


/*creating endorsement_log*/
create table endorsement_log(LogID int identity, operation nvarchar(20), updated_date Datetime)
/*fetching data from the endorsement_log*/
select * from endorsement_log

/*creating trigger for insertion command*/
create trigger EndorsementInsertTrigger
on endorsement
for insert
as
insert into endorsement_log(operation, updated_date)
select 'Data inserted', GETDATE() from inserted

/*creating trigger for delete command*/ 
create trigger endorsementDeleteTrigger
on endorsement
for delete
as 
insert into endorsement_log(operation, updated_date)
select 'Data deleted', GETDATE() from deleted

delete from endorsement where brand_id=1

/*creating trigger for update command*/
create trigger endorsementUpdateTrigger
on endorsement
after update
as 
insert into endorsement_log(operation, updated_date)
select 'Data updated', GETDATE() from deleted


drop procedure sp_brandsNotEndorsed

/*creating procedure to get the brand names which are not endorsed by any celebrity*/
create procedure sp_brandsNotEndorsed
as 
begin
select brand_name as 'Brands not Endorsed' from brand as b 
left join endorsement as e 
on b.brand_id=e.brand_id where e.brand_id is null
end

/*executing sp_brandsNotEndorsed*/
exec sp_brandsNotEndorsed

/*creating procedures to get the name of brands endorsed*/
create procedure sp_Endorsedbrands
as 
begin
select distinct brand_name as 'Brands Endorsed' from brand as b 
left join endorsement as e 
on b.brand_id=e.brand_id where e.brand_id is not null
end

/*executing sp_Endorsedbrands*/
exec sp_Endorsedbrands

/*fetching data from all three tables*/
select * from brand
select * from celebrity 
select * from endorsement

/*common brands endorsed by celebrities*/
create procedure sp_commonBrandsEndorsed
as
begin
select 
	celebrity.celeb_fname,
	brand.brand_name
from celebrity
join endorsement 
	on celebrity.celeb_id=endorsement.celeb_id
join brand 
	on brand.brand_id=endorsement.brand_id
end

/*calling sp_commonBrandsEndorsed to show the common brands endorsed by celebrities*/
exec sp_commonBrandsEndorsed

