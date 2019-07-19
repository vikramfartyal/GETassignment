package com.metacube.get2019;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LcmHcfMain {

	public static void main(String args[]) {

		ComputationOfLcmHcf comHL = new ComputationOfLcmHcf();
		boolean isExit = false;
		int a, b, result;
		try {
			do {
				System.out.println("1. Find LCM");
				System.out.println("2. Find HCF");
				System.out.println("3. Exit");
				System.out.println("------------------");
				System.out.print("Enter your choice : ");
				Scanner sc = new Scanner(System.in);
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("------------------");
					System.out.print("Enter first number : ");
					a = sc.nextInt();
					System.out.print("Enter second number : ");
					b = sc.nextInt();
					result = comHL.lcmOfAB(a, b);
					System.out.println("------------------");
					System.out.println("Lcm of " + a + " and " + b + " : "
							+ result);
					System.out.println("------------------");
					break;
				case 2:
					System.out.println("------------------");
					System.out.print("Enter first number : ");
					a = sc.nextInt();
					System.out.print("Enter second number : ");
					b = sc.nextInt();
					result = comHL.hcfOfAB(a, b);
					System.out.println("------------------");
					System.out.println("Hcf of " + a + " and " + b + " : "
							+ result);
					System.out.println("------------------");
					break;
				case 3:
					isExit = true;
					System.out.println("------------------");
					System.out.println("Successfully exit");
					System.out.println("------------------");
					break;
				default:
					System.out.println("------------------");
					System.out.println("Not a valid Choice");
					System.out.println("------------------");
				}

			} while (!isExit);
		} catch (InputMismatchException e) {
			System.out.println(e.getStackTrace());
		}
	}
}
