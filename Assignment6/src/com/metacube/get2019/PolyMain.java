package com.metacube.get2019;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PolyMain {
	
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * It is used to take coefficient array from user.
	 * @param noOfTerms
	 * @return coefficient array
	 */
	static int[] getCoeff(int noOfTerms) {
		int[] coeffArr = new int[noOfTerms];
		System.out.print("Enter coefficient array : ");
		for (int i = 0; i < noOfTerms; i++ ) {
			coeffArr[i] = sc.nextInt();
		}
		return coeffArr;
	}
	
	/**
	 * It is used to take exponent array from user.
	 * @param noOfTerms
	 * @return exponent array
	 */
	static int[] getExpo(int noOfTerms) {
		int[] expoArr = new int[noOfTerms];
		System.out.print("Enter exponent array corresponding to coefficient array : ");
		for (int i = 0; i < noOfTerms; i++ ) {
			expoArr[i] = sc.nextInt();
		}
		return expoArr;
	}
	
	
	/**
	 * It is a main method.
	 * @param args
	 */
	public static void main(String args[]) {

		boolean isExit = false;
		int noOfTerms, noOfTerms1;
		int coeffArr[];
		int expoArr[];
		Poly p, p1;
		try {
			do {
				System.out.println("1. Evaluate a polynomial");
				System.out.println("2. Find degree of polynomial");
				System.out.println("3. Add 2 polynomials");
				System.out.println("4. Multiply 2 polynomials");
				System.out.println("5. Exit");
				System.out.println("--------------------------------");
				System.out.print("Enter your choice : ");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("--------------------------------");
					System.out.print("Enter the number of terms in your polynomial : ");
					noOfTerms = sc.nextInt();
					System.out.println("--------------------------------");
					coeffArr = new int[noOfTerms];
					expoArr = new int[noOfTerms];
					coeffArr = getCoeff(noOfTerms);
					expoArr = getExpo(noOfTerms);
					p = new Poly(coeffArr, expoArr, noOfTerms);
					System.out.print("Enter the value of x : ");
					float x = sc.nextFloat();
					float result = p.evaluate(x);
					System.out.println("Value of polynomial for "+x+"= "+result);
					System.out.println("--------------------------------");
					break;
				case 2:
					System.out.println("--------------------------------");
					System.out.print("Enter the number of terms in your polynomial : ");
					noOfTerms = sc.nextInt();
					System.out.println("--------------------------------");
					coeffArr = new int[noOfTerms];
					expoArr = new int[noOfTerms];
					coeffArr = getCoeff(noOfTerms);
					expoArr = getExpo(noOfTerms);
					p = new Poly(coeffArr, expoArr, noOfTerms);
					int degree = p.degree();
					System.out.println("Degree of Polynomial : " + degree);
					System.out.println("--------------------------------");
					break;
				case 3:
					System.out.println("--------------------------------");
					System.out.print("Enter the number of terms in your polynomial : ");
					noOfTerms = sc.nextInt();
					System.out.println("--------------------------------");
					coeffArr = new int[noOfTerms];
					expoArr = new int[noOfTerms];
					coeffArr = getCoeff(noOfTerms);
					expoArr = getExpo(noOfTerms);
					p = new Poly(coeffArr, expoArr, noOfTerms);
					for (int i = 0; i < coeffArr.length; i++) {
						System.out.printf(" " + coeffArr[i] + "x^"
								+ expoArr[i]);
						if (i != coeffArr.length - 1) {
							System.out.print(" + ");
						}
					}
					System.out.println();
					System.out.println("--------------------------------");
					System.out.print("Enter the number of terms in your 2nd polynomial : ");
					noOfTerms1 = sc.nextInt();
					System.out.println("--------------------------------");
					coeffArr = new int[noOfTerms1];
					expoArr = new int[noOfTerms1];
					coeffArr = getCoeff(noOfTerms1);
					expoArr = getExpo(noOfTerms1);
					p1 = new Poly(coeffArr, expoArr, noOfTerms1);
					for (int i = 0; i < coeffArr.length; i++) {
						System.out.printf(" " + coeffArr[i] + "x^"
								+ expoArr[i]);
						if (i != coeffArr.length - 1) {
							System.out.print(" + ");
						}
					}
					System.out.println();
					System.out.println("--------------------------------");
					Poly add = p.addPoly(p, p1);
					int addCoeff[] = new int[noOfTerms + noOfTerms1];
					addCoeff = add.getcoeff();
					int addExpo[] = new int[noOfTerms + noOfTerms1];
					addExpo = add.getExpo();
					System.out.print("Addition : ");
					for (int i = 0; i < addCoeff.length; i++) {
						if(addCoeff[i] != 0) {
							System.out.printf(" " + addCoeff[i] + "x^"
									+ addExpo[i]);
							if (i != addCoeff.length - 1) {
								System.out.print(" + ");
							}
						}
					}
					System.out.println();
					System.out.println("--------------------------------");
					break;
				case 4:
					System.out.println("--------------------------------");
					System.out.print("Enter the number of terms in your polynomial : ");
					noOfTerms = sc.nextInt();
					System.out.println("--------------------------------");
					coeffArr = new int[noOfTerms];
					expoArr = new int[noOfTerms];
					coeffArr = getCoeff(noOfTerms);
					expoArr = getExpo(noOfTerms);
					p = new Poly(coeffArr, expoArr, noOfTerms);
					for (int i = 0; i < coeffArr.length; i++) {
						System.out.printf(" " + coeffArr[i] + "x^"
								+ expoArr[i] );
						if (i != coeffArr.length - 1) {
							System.out.print(" + ");

						}
					}
					System.out.println();
					
					System.out.println("--------------------------------");
					System.out.print("Enter the number of terms in your polynomial : ");
					noOfTerms1 = sc.nextInt();
					System.out.println("--------------------------------");
					coeffArr = new int[noOfTerms1];
					expoArr = new int[noOfTerms1];
					coeffArr = getCoeff(noOfTerms1);
					expoArr = getExpo(noOfTerms1);
					p1 = new Poly(coeffArr, expoArr, noOfTerms1);
					for (int i = 0; i < coeffArr.length; i++) {
						System.out.printf(" " + coeffArr[i] + "x^"
								+ expoArr[i]);
						if (i != coeffArr.length - 1) {
							System.out.print(" + ");

						}
					}
					System.out.println();
					
					System.out.println("--------------------------------");
					Poly multiply = p.multiPoly(p, p1);
					int multiCoeff[] = new int[noOfTerms * noOfTerms1];
					multiCoeff = multiply.getcoeff();
					int multiExpo[] = new int[noOfTerms * noOfTerms1];
					multiExpo = multiply.getExpo();
					for (int i = 0; i < multiCoeff.length; i++) {
						if(multiCoeff[i] != 0){
							System.out.printf(" " + multiCoeff[i] + "x^"
								+ multiExpo[i]);
						
						if (i != multiCoeff.length - 1) {
							System.out.print(" + ");
						}
						}
					}
					System.out.println();
					System.out.println("--------------------------------");
					break;
				case 5:
					isExit = true;
					System.out.println("--------------------------------");
					System.out.println("Successfully exit!!!");
					System.out.println("--------------------------------");
					break;
				default:
					System.out.println("--------------------------------");
					System.out.println("Invalid choice!!1Make a valid choice.");
					System.out.println("--------------------------------");
				}
			} while (!isExit);

		} catch (InputMismatchException e) {
			System.out.println(e.getStackTrace());
		} finally {
			sc.close();
		}

	}

}
