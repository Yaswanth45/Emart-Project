create database Emart_Project;
drop database Emart_Project;
use Emart_Project;

create table Users(
	uId int auto_increment,
    uName varchar(15)not null,
    pass varchar(10)not null,
    ROLE VARCHAR(30) NOT NULL,
	primary key (uId)
);

create table Buyers(
	bId int auto_increment,
    bName varchar(150) not null,
    mobileNumber varchar(10) not null,
    email Varchar(150) Not NUll,
    primary key(bid),
    uId Int REFERENCES Users(uId)
);

create table Categories(
	cId int auto_increment,
	cName varchar(15)not null,
	gstPer numeric(10) not null,
	primary key(cId)
);

create table SubCategories(
	sId int PRIMARY KEY auto_increment,
    sName varchar(15) NOT NULL,
    cId int REFERENCES Categories(cId)
);

create table Products(
	pId int Primary Key auto_increment,
    pName varchar(15)NOT NULL,
    pDesc Varchar(25),
    price numeric(10),
	sId int REFERENCES SubCategories(sId)
);

create table Sellers(
	sId int primary Key auto_increment,
    sName varchar(150)not null,
	brand varchar(10) not null,
    mobileno varchar(10),
    pId int REFERENCES Products(pId),
    uId int REFERENCES Users(uId)
); 

create table Orders(
	oId int auto_increment,
    oDate Date NOT NULL,
    totalAmt numeric(10)NOT NULL,
	discId varchar(10) NOT NULL,
    discValue numeric(10)NOT NULL,
	PRIMARY KEY(oId)
);

create table Payment(
	pyId int primary key auto_increment,
    oId int REFERENCES Orders(oId),
    pyDate Date,
    pyMode varchar(10)NOT NULL,
	pyAmt numeric(10)
);

create table Orderdetails(
	oId int REFERENCES Orders(oId),
    pId int REFERENCES Products(pId),
    qty numeric(10) NOt NULL,
	price numeric(30)NOT NULL,
    tAmt numeric(50),
	PRIMARY KEY(oId,pId)
);
select * from users;

select * from categories;
select * from sub_category;
select * from products;
select * from payments;
drop table products;
