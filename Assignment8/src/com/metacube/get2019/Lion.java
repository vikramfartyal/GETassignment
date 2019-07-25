package com.metacube.get2019;

/**
 * It is an Lion class which extends Mammal class.
 * @author Khushi
 *
 */
class Lion extends Mammal{
	
	/**
	 * It is an constructor used to intialize lion attributes.
	 * @param id id of lion.
	 * @param name name of lion.
	 */
	public Lion(int id ,String name){
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String getSound() {
		return "roar";
	}

}