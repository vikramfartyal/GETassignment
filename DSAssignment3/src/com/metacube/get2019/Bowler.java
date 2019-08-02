package com.metacube.get2019;

public class Bowler {
	
	private String bowlerName;
	private int numberOfBalls;
	
	Bowler (String bowlerName, int numberOfBalls) {
		this.bowlerName = bowlerName;
		this.numberOfBalls = numberOfBalls;
	}
	
	public String getName() {
		return this.bowlerName;
	}
	
	public int getNumberOfBalls() {
		return this.numberOfBalls;
	}
	
	public void setNumberOfBalls(int balls) {
		this.numberOfBalls = balls;
	}
}
