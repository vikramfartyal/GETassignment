/* Assignment 2 Question - 1 */

select p.product_id, product_name, count(*) as no_Of_categories 
from product_category as PC inner join category as c
on PC.category_id = c.category_id
inner join product as p
on p.product_id  = pc.product_id
group by PC.product_id;


/* Assignment 2 - Question 2 */

select Range_in_rs, count(product_id) as count
from 
     (select product_id,
            case when product_price between 0 and 100 then '0-100'
                when product_price between 100 and 500 then '100-500'
                when product_price > 500 then 'Above 500'
            end as Range_in_rs
       from product)as a
 Group by Range_in_rs;
 
/* Assignment 2 Question 3 */

select category_name, count(*) as no_Of_product
from product_category as pc inner join category as c
on pc.category_id = c.category_id
group by pc.category_id;

