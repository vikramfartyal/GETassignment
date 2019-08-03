package com.metacube.get2019;

import java.util.Scanner;

/**
 * It is a class with main method.
 * @author Khushi
 *
 */
public class CalculateMassMain {

	/**
	 * It is a main method
	 * @param args unused
	 */
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		CalculateMass calObj = new CalculateMass();
		System.out.println("-----------------------------");
		System.out.print("Enter the compound formula : ");
		String comFormula = sc.nextLine();
		System.out.println("-----------------------------");
		int massOfMolecule = calObj.calculateMass(comFormula);
		System.out.println("Mass of molecule "+comFormula+ " : "+massOfMolecule);
		System.out.println("-----------------------------");
		sc.close();
	}
}
