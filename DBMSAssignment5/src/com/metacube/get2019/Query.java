package com.metacube.get2019;

/**
 * It is a class which holds all queries
 * @author Khushi
 *
 */
public class Query {

	/**
	 * It is a method to return query which get details of order from the database.
	 * @param id id of user
	 * @return sql query
	 */
	public String returnQuery(int id) {
		String query1 = "select p.order_id, p.order_date, p.order_amount from product_order as p "
				+ " inner join order_item as o on p.order_id = o.order_id "
				+ " where p.user_id = " + id + " and product_status = 'Shipped' "
				+ " order by order_date" ;
		return query1;
	}
	
	/**
	 * It is a method to return query to insert image of a product into image table.
	 * @return sql query
	 */
	public String query2() {
		String query2 = "Insert into image(url, product_id) values (?, ?)";
		return query2;
	}
	
	/**
	 * It is a method to return query to update details of a product into the database.
	 * @return sql query
	 */
	public String query3() {
		String query3 = "update product as p"
				+ " inner join order_item as o"
				+ " on o.product_id = p.product_id inner join product_order as po"
				+ " on o.order_id = po.order_id "
				+ " set p.active = 0 "
				+ " where datediff(curdate(), po.order_date)/365 > 1";
		return query3;
	}
	
	/**
	 * It is a method to return query used to get parent categories and no of there child categories.
	 * @return sql query
	 */
	public String query4() {
		String query4 = " select p.category_name, count(p.parent_category_id) as SubCategories"
				+ " from category as c inner join category as p"
				+ " on  c.parent_category_id = p.category_id "
				+ " group by p.category_id "
				+ " order by p.category_name ";
		
		return query4;
	}
}
