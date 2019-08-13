Drop database storefront;

Create database StoreFront;
use StoreFront;

create table product (
Product_Id int not null AUTO_INCREMENT,
Product_Name Varchar(30),
Product_Price Decimal(10, 4),
Product_Quantity int,
primary key(Product_id)
);

create table Category (
Category_Id int not null AUTO_INCREMENT,
Category_Name Varchar(50),
Parent_Category_Id int default -1,
primary key(Category_Id)
);

create table Product_Category (

Product_Id int,
Category_Id int,
foreign key (Product_id) references Product(Product_Id),
foreign key (Category_id) references Category(Category_Id)
);


create table Image (
Image_Id int not null AUTO_INCREMENT,
Image_Name varchar(50),
Product_Id int,
Primary key(Image_Id),
foreign key (Product_Id) references Product(Product_Id)
);

create table Address (
Address_id int not null AUTO_INCREMENT,
Locality varchar(30),
City varchar(30),
State varchar(30),
country varchar(30),
Zip_code int, 
Primary key(Address_id)
);

create table User (
User_id int not null AUTO_INCREMENT,
User_Name varchar(23),
Email_id varchar(23),
Phone_no bigint,
primary key(User_id)
);

create table product_Order (
Order_Id int not null AUTO_INCREMENT,
User_id int,
Order_Amount Decimal(10,4),
Order_Date date,
Primary key(Order_Id),
foreign key (User_id) references User(User_Id)
);

create table Order_Address (
Order_id int,
Address_id int,
foreign key (Order_id) references Product_order(Order_id),
foreign key (Address_id) references Address(Address_id)
);

create table Order_Item (
Order_id int,
Product_id int,
quantity int,
Product_Status Varchar(20) CHECK(Product_Status IN ('Shipping', 'returned', 'cancelled')),
foreign key (Order_id) references Product_order(Order_id),
foreign key (Product_id) references Product(Product_id)
);

show tables;

drop table product;

create table product (
Product_Id int not null AUTO_INCREMENT,
Product_Name Varchar(30),
Product_Price Decimal(10, 4),
Product_Quantity int,
primary key(Product_id)
);
