package com.metacube.get2019;

import java.util.*;

/**
 * It is a class Node.
 * @author Khushi
 *
 */
public class Node {
	String name;
	List<Node> children = new ArrayList<Node>();
	Node parent;
	java.sql.Timestamp ts;
	
	/**
	 * It is a constructor.
	 * @param name
	 */
	public Node(String name){
		this.name = name;
	}
}