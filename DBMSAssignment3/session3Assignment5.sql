/* Assignment 5 Question 1 */
create view orderInformation as
select po.order_id, po.order_date, u.user_name, u.email_id, po.order_amount, p.product_name, o.product_status, o.product_id, o.quantity
from user as u inner join user_order as uo 
on u.user_id=uo.user_id
left outer join product_order as po 
on po.order_id=uo.order_id
left outer join order_item as o
on o.order_id=po.order_id
left outer join product as p 
on p.product_id=o.product_id
where datediff(curdate(), po.order_date) <= 60;

/* Assignment 5 Question 2 */
select product_name
from orderInformation
where product_status = 'Shipped'
group by product_id;

/* Assgnment 5 Question 3 */
select product_name
from orderInformation
group by product_id
order by sum(quantity) desc
limit 5;
 