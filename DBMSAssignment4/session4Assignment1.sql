/* ASSIGNMENT-1 Question-1 */

DROP FUNCTION IF EXISTS noOfOrderInMonth;

DELIMITER $$

CREATE FUNCTION noOfOrderInMonth (month INT, year INT) RETURNS BIGINT
BEGIN
    DECLARE noOfOrder BIGINT;
    SELECT  COUNT(order_id) INTO noOfOrder FROM product_order
    WHERE EXTRACT(month FROM order_date) = month AND EXTRACT(year FROM order_date) = year;
    RETURN noOfOrder;
END$$

DELIMITER ;

SELECT noOfOrderInMonth(6, 2019) as noOfOrder;

/* ASSIGNMENT-2 Question-2 */
DROP FUNCTION IF EXISTS maxOrderMonth;


DELIMITER $$

CREATE FUNCTION maxOrderMonth(year INT) RETURNS INT
BEGIN
    DECLARE month INT;
    SELECT EXTRACT(month FROM order_date) INTO month
    FROM product_order
    WHERE EXTRACT(year FROM order_date) = year
    GROUP BY month
    ORDER BY COUNT(order_id) DESC
    LIMIT 1;
    RETURN month;
END$$

DELIMITER ;

SELECT maxOrderMonth(2018) as MaxOrderMonth;