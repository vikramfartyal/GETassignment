/* Assignment 3 Question -1 */

select u.user_id, user_name, email_id, phone_no, count(*) as no_of_orders
from user as u 
inner join product_order as o
on o.user_id = u.user_id
where datediff(curdate(), o.order_date) <= 30
group by u.user_id;


/* Assignment - 3 Question - 2 */
select u.user_name
from user as u 
inner join product_order as o
on o.user_id = u.user_id
where datediff(curdate(), o.order_date) <= 30
group by u.user_id
order by o.order_amount desc
limit 10;



/* Assignment 3 Question - 3 */
select p.product_id, product_name, count(p.product_id)*OI.quantity as number_of_product
from order_item as OI inner join product_order as O
on OI.order_id = O.order_id
inner join product as p 
on p.product_id = OI.product_id
where datediff(curdate(), o.order_date) <= 60
group by OI.product_id
order by count(p.product_id)*OI.quantity desc
limit 20;


/* Assignment-3 Question-4 */
select extract(month from order_date) as month, sum(order_amount) as total
from product_order
where datediff(curdate(),order_date)/365 <= 1
group by month;

/* Assignment-3 Question-5 */
alter table product
add active boolean default 1;

update product as p 
left outer join order_item as o 
on p.product_id=o.product_id 
left outer join product_order as po 
on po.order_id=o.order_id
set p.active = 0
where datediff(curdate(), po.order_date) > 90
or o.order_id is null;


/* Assignment 3 Question - 6 */
select p.product_id, product_name
from product_category as PC inner join category as c
on PC.category_id = c.category_id
inner join product as p
on p.product_id = PC.product_id
where c.category_name in ('Clothing', 'Electronics');


/* Assignment-3 Question - 7 */
select product_name 
from order_item as OI inner join product as p
on OI.product_id = p.product_id
where OI.product_status = 'cancelled'
group by OI.product_id, OI.product_status
order by count(*)
limit 10;
