package com.metacube.get2019;

/**
 * It is an peacock class which extends bird class.
 * @author Khushi
 *
 */
class Peacock extends Bird{
	
	/**
	 * It is an constructor used to intialize peacock attributes.
	 * @param id id of peacock.
	 * @param name name of peacock
	 */
	public Peacock(int id ,String name){
		this.id = id;
		this.name = name;
	}
	@Override
	public String getSound() {
		return "Scream";
	}

}