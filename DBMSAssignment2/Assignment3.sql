select o.order_id, order_date, sum(quantity * p.product_price) as order_total
from product_order as o inner join
order_item as i on o.order_id = i.order_id
inner join product as p on p.product_id = i.product_id
group by order_id
order by order_date desc
limit 50;


create view updated_amount as
select o.order_id, sum(quantity * p.product_price) as order_total
from product_order as o inner join
order_item as i on o.order_id = i.order_id
inner join product as p on p.product_id = i.product_id
group by o.order_id;

select * from updated_amount;

update product_order as o
SET order_amount = (select order_total from updated_amount as u where o.order_id = u.order_id)
where order_amount is null;

select order_id from product_order
order by order_amount desc
limit 10;

select o.order_id
from product_order as o inner join order_item as i on o.order_id=i.order_id
where datediff(curdate(),o.order_date) > 10
and i.product_status in ('Cancelled','Returned')
group by order_id;


select u.user_name
from user as u inner join product_order as p on u.user_id = p.user_id
where datediff(curdate(),p.order_date)/30 >= 1;


select u.user_name, o.order_id
from user as u 
inner join product_order as o
on u.user_id = o.user_id
where datediff(curdate(), o.order_date) < 15;


select product_id
from order_item
where product_status = 'Shipped'
and order_id = 1;

select i.product_id, o.order_date
from product_order as o inner join order_item as i on o.order_id=i.order_id
inner join product p on p.product_id = i.product_id
where p.product_price between 20 and 50;

