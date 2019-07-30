package com.metacube.get2019;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PolyMain {

	public static void main(String args[]) {
		Scanner sc  = new Scanner(System.in);
		MultiVarPoly polyObj = new MultiVarPoly();
		try {
				System.out.println("--------------------------------------------");
				System.out.print("Enter the number of variables in the polynomial : ");
				int numberOfVar = sc.nextInt();
				System.out.println("--------------------------------------------");
				int expoArr[] = new int[numberOfVar + 1];
				System.out.print("Enter the number of terms in your polynomial : ");
				int numberOfTerms = sc.nextInt();
				System.out.println("--------------------------------------------");
				for (int i = 1; i <= numberOfTerms; i++) {
					System.out.print("Enter the coefficient of "+i+" terms : ");
					int coeff = sc.nextInt();
					System.out.println("--------------------------------------------");
					for (int j = 1; j <= numberOfVar; j++) {
						System.out.print("Enter exponent value for your "+j+" variable for "+i+" term : ");
						int exponent = sc.nextInt();
						expoArr[j] = exponent;
					}
					System.out.println("--------------------------------------------");
					polyObj.createLinkList(coeff, expoArr);
					
				}
				polyObj.show();
				polyObj.findDegree();
		} catch (InputMismatchException e) {
			System.out.println(e.getStackTrace());
		} finally {
			sc.close();
		}
	}
}
