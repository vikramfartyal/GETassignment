package com.metacube.get2019;

import java.util.Scanner;

/**
 * It is a class with main method.
 * @author Khushi
 *
 */
public class MinimizeRunMain {

	/**
	 * It is a main method
	 * @param args unused.
	 */
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------------------------------");
		System.out.print("Ënter the total number of balls Virat is going to play : ");
		int numberOfBalls = sc.nextInt();
		System.out.println("-----------------------------------");
		System.out.print("Enter the number of bowlers : ");
		int numberOfBowlers = sc.nextInt();
		System.out.println("-----------------------------------");
		MinimizeRun minObj = new MinimizeRun(numberOfBowlers);
		sc.nextLine();
		Bowler b;
		int totalBalls = 0;
		Bowler ballsArray[] = new Bowler[numberOfBowlers];
		for (int i = 0; i < numberOfBowlers; i++) {
			System.out.print("Enter name of "+ (i + 1) +" player :  ");
			String bowlerName = sc.nextLine();
			System.out.print("Enter balls of "+bowlerName+ " : ");
			int balls = sc.nextInt(); 
			sc.nextLine();
			totalBalls += balls;
			b= new Bowler(bowlerName, balls);
			ballsArray[i] = b;
		}
		System.out.println("-----------------------------------");
		
		minObj.insert(ballsArray);
		String[] sequence = new String[totalBalls];
		sequence = minObj.extractMax(totalBalls);
		System.out.println("Sequence of bowlers : ");
		System.out.println("-----------------------------------");
		for (int i = 0; i < numberOfBalls; i++ ) {
			System.out.println((i + 1)+ ". "+sequence[i]);
		}
		System.out.println("-----------------------------------");
	}
}
