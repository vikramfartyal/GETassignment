Insert into category(Category_name, Parent_Category_id) 
Values('Clothing', default),
('Men Clothing', 1),
('Women Clothing', 1),
('Kids Clothing', 1),
('Electronics', default),
('Home appliances', 5),
('Gadgets', 5);

Select * from category;

Insert into product(Product_name, product_price, product_quantity)
Values ('Oven', 500, 3),
('Mobile Phone', 1000, 6),
('Blazer', 1000, 10),
('Jeans', 2000, 23),
('Kurta', 750, 12);

Select * from product;

Insert into Product_category(product_id, category_id) 
values (1, 5),
(1, 6),
(2, 5),
(2, 7),
(3, 1),
(3, 2),
(4, 3),
(4, 4),
(5, 1),
(5, 3);

Select * from Product_category;

Insert into Image( Product_Id, Image_name)
values (1, 'Oven Image'),
(1, 'Oven Image2'),
(4, 'Jeans Image');

Select * from image;

Insert into address(country, state, city, locality, zip_code) 
values ('India', 'Rajasthan', 'Jaipur', 'Jagatpura', 302014),
('India', 'Jharkhand', 'Ranchi', 'palsana', 332402);

select * from address;

insert into user(user_name,phone_no,email_id)
values('khushi',9836579231,'khushi@yahoo.com'),
('yatika',9829287632,'yatika@gmail.com'),
('yash',8754639021,'yash@metacube.com');

select * from user;

insert into product_order(order_date,user_id)
values('2017-04-26',1),
('2018-07-03',2);

Select * from product_order;

insert into order_item(order_id, product_id, quantity, product_status)
values(1, 1 ,2, 'Shipped'),
(1, 4, 1, 'Shipped'),
(2, 3, 3, 'Cancelled'),
(2, 4, 1, 'Shipped'),
(2, 5, 1, 'Returned');

Select * from order_item;


Insert into Order_Address(Address_id, order_id) 
values (1,1),
(2,2);

select * from order_Address;
