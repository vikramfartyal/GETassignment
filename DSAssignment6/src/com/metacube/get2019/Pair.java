package com.metacube.get2019;

import java.util.Comparator;

public class Pair implements Comparator<Pair>{

	private int weight;
	private int vertex;

	/**
	 * It is a constructor used to initialize attributes of pair class.
	 * @param weight
	 * @param vertex
	 */
	Pair(int weight, int vertex){
		this.weight = weight;
		this.vertex = vertex;
	}

	/**
	 * It is a getter method used to return weight of edge.
	 * @return edge weight.
	 */
	public int getWeight() {
		return this.weight;
	}

	/**
	 * It is a method used to return vertex.
	 * @return vertex.
	 */
	public int getVertex() {
		return  this.vertex;
	}
	
	public static final Comparator<Pair> sortPairByWeight = new Comparator<Pair>() {

		@Override
		public int compare(Pair pair1, Pair pair2) {
			return pair1.getWeight() - pair2.getWeight();
		}

	};

	@Override
	public int compare(Pair o1, Pair o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
