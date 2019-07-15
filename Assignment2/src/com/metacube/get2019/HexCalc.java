package com.metacube.get2019;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * It is a class with main method.
 * @author Khushi
 *
 */
public class HexCalc {

	public static void main(String args[]) {
		HexCalcService obj = new HexCalcService();
		Scanner sc = new Scanner(System.in);
		String hex1, hex2;
		int base, n;
		try {
			boolean isExit = false;
			do {
				System.out.println("------------------------");
				System.out.println("Enter your choice of operation with hexadecimal numbers : \n ");
				System.out.println("1. Addition (+)");
				System.out.println("2. Subtraction (-)");
				System.out.println("3. Multiplication (x)");
				System.out.println("4. Division (/) ");
				System.out.println("5. Comparision (><=)");
				System.out.println("6. Hexadecimal to decimal conversion(H -> D)");
				System.out.println("7. Decimal to hexadecimal conversion(D -> H)");
				System.out.println("8. Exit the program");
				System.out.println("------------------------");
				int choice = sc.nextInt();
				sc.nextLine();
				switch (choice) {
				case 1:
					System.out.print("Enter the no of terms you want to add = ");
					n = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter the base = ");
					base = sc.nextInt();
					sc.nextLine();
					obj.hexAddition(n,base);
					break;
				case 2:
					System.out.print("Enter the first hexadecimal String = ");
					hex1 = sc.nextLine();
					System.out.print("Enter the second hexadecimal String = ");
					hex2 = sc.nextLine();
					System.out.print("Enter the base = ");
					base = sc.nextInt();
					sc.nextLine();
					obj.hexSubtraction(hex1, hex2, base);
					break;
				case 3:
					System.out.print("Enter the no of terms you want to multiply = ");
					n = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter the base = ");
					base = sc.nextInt();
					sc.nextLine();
					obj.hexMultiplication(n,base);
					break;
				case 4:
					System.out.print("Enter the first hexadecimal String = ");
					hex1 = sc.nextLine();
					System.out.print("Enter the second hexadecimal String = ");
					hex2 = sc.nextLine();
					System.out.print("Enter the base = ");
					base = sc.nextInt();
					sc.nextLine();
					obj.hexDivision(hex1, hex2, base);
					break;
				case 5:
					System.out.print("Enter the first hexadecimal String = ");
					hex1 = sc.nextLine();
					System.out.print("Enter the second hexadecimal String = ");
					hex2 = sc.nextLine();
					System.out.print("Enter the base = ");
					base = sc.nextInt();
					sc.nextLine();
					obj.compareHexStringss(hex1, hex2);
					break;
				case 6:
					System.out.print("Enter the hexadecimal String = ");
					hex1 = sc.nextLine();
					System.out.print("Enter the base = ");
					base = sc.nextInt();
					sc.nextLine();
					int value = obj.hexToDec(hex1, base);
					System.out.println("Decimal representation = "+value);
					break;
				case 7:
					System.out.print("Enter the decimal number = ");
					int dec1 = sc.nextInt();
					sc.nextLine();
					System.out.print("Enter the base = ");
					base = sc.nextInt();
					sc.nextLine();
					String hexValue = obj.decTohex(dec1, base);
					System.out.println("Hexadeciaml  value = "+hexValue);
					break;
				case 8:
					isExit = true;
					System.out.println("------------------------");
					System.out.println("Successfully exited");
					System.out.println("------------------------");
					break;
				default:
					System.out.println("------------------------");
					System.out.println("Invalid input");
					System.out.println("------------------------");

				}
			} while (!isExit);
		} catch (InputMismatchException e) {
			System.out.println(e.getStackTrace());
		}
		finally {
			sc.close();
		}
	}
}
