/* Assignment-2 QUESTION-1 */
DROP PROCEDURE IF EXISTS avgSale;

DELIMITER $$

CREATE PROCEDURE avgSale(IN month INT, IN year INT) 
BEGIN
    SELECT o.product_id, AVG(o.quantity) AS Average_Sale
    FROM product_order AS po INNER JOIN order_item AS o
    ON po.order_id = o.order_id AND EXTRACT(month FROM po.order_date) = month AND EXTRACT(year FROM po.order_date) = year
    GROUP BY o.product_id;
END $$

DELIMITER ;

CALL avgSale(7, 2018);

/* ASSIGNMENT-2 QUESTION-2 */
DROP PROCEDURE IF EXISTS orderDetail;

DELIMITER $$

CREATE PROCEDURE orderDetail(IN startDate DATE, IN endDate DATE)
BEGIN
    DECLARE start DATE;
    IF (startDate > endDate ) THEN
        SELECT DATE_SUB(endDate,INTERVAL DAYOFMONTH(endDate)-1 DAY) INTO start;
    ELSE
        SELECT startDate INTO start;
    END IF;
    SELECT po.order_id, po.order_date, o.product_id, o.product_status, po.order_amount 
    FROM product_order AS po INNER JOIN order_item AS o
    ON po.order_id = o.order_id 
    WHERE po.order_date BETWEEN start AND endDate;

END $$

DELIMITER ;

CALL orderDetail('2017-04-26', '2018-07-03');