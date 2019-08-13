Select product.product_id, product_name, category_name, product_price 
from product inner join
product_category on product.product_id =  product_category.product_id
inner join  Category on product_category.category_id = category.category_id
where product_quantity > 0
order by Product.product_id desc;


Select product_name
from product as p 
left outer join Image as I 
on p.product_id = I.product_id
where I.image_id is null;


select c.category_id, c.category_name, ifnull(parent.category_name, 'Top Category') as parent_category_name 
from category as c left outer join Category as parent
on c.parent_category_id = parent.category_id
order by parent.category_name, c.category_name;


select c.category_id, c.category_name, p.category_name as parent_category_name
from category as c right outer join category as p
on c.parent_category_id = p.category_id
where c.category_name is not null;


select product_name, product_price 
FROM product as p inner join product_category as cat
on p.product_id = cat.product_id
inner join category as c 
on c.category_id = cat.category_id
where category_name = 'Electronics';


select * from product
where product_quantity < 50;
