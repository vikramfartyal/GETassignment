/* ASSIGNMENT - 3 */


ALTER TABLE product ADD INDEX productNameIndex(product_name);
ALTER TABLE product ADD INDEX productPriceIndex(product_price);

SHOW INDEX FROM product;

ALTER TABLE category ADD INDEX categoryNameIndex(category_name);
SHOW INDEX FROM category;

ALTER TABLE product_order ADD INDEX orderDateIndex(order_date);
SHOW INDEX FROM product_order;



