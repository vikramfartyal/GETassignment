package com.metacube.get2019;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * It is a class with main method using AreaOfShapes class.
 * @author Khushi
 *
 */
public class Area {
	
	/**
	 * It is a main method which is using AreaOfShapes class to find area of shapes.
	 * @param args unused
	 */
	public static void main(String args[]) {

		AreaOperations aos_obj = new AreaOperations();
		Scanner sc = new Scanner(System.in);
		double area, width, height, radius;
		boolean isExit = false;
		try {
			do {
				System.out.println("1. Find area of triangle.");
				System.out.println("2. Find area of rectangle");
				System.out.println("3. Find area of square");
				System.out.println("4. Find area of circle");
				System.out.println("5. Exit");
				System.out.println("----------------------");
				System.out.print("Enter your choice = ");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("----------------------");
					System.out.print("Enter height of triangle = ");
					width = sc.nextDouble();
					System.out.print("Enter width of triangle = ");
					height = sc.nextDouble();
					area = aos_obj.areaOfTriangle(width, height);
					System.out.println("Area of Triangle = " + area);
					System.out.println("----------------------");
					break;
				case 2:
					System.out.println("----------------------");
					System.out.print("Enter height of rectangle = ");
					width = sc.nextDouble();
					System.out.print("Enter width of rectangle = ");
					height = sc.nextDouble();
					area = aos_obj.areaOfRectangle(width, height);
					System.out.println("Area of Rectangle = " + area);
					System.out.println("----------------------");
					break;
				case 3:
					System.out.println("----------------------");
					System.out.print("Enter width of square = ");
					width = sc.nextDouble();
					area = aos_obj.areaOfSquare(width);
					System.out.println("Area of Square = " + area);
					System.out.println("----------------------");
					break;
				case 4:
					System.out.println("----------------------");
					System.out.print("Enter radius of circle = ");
					radius = sc.nextDouble();
					area = aos_obj.areaOfCircle(radius);
					System.out.println("Area of Circle = " + area);
					System.out.println("----------------------");
					break;
				case 5:
					isExit = true;
					System.out.println("----------------------");
					System.out.println("Successfully exit");
					System.out.println("----------------------");
					break;
				default:
					System.out.println("----------------------");
					System.out.println("Invalid choice");
					System.out.println("----------------------");
				}
			} while (!isExit);
		} catch (InputMismatchException e) {
			System.out.println(e.getStackTrace());
		}
		catch (ArithmeticException e) {
			System.out.println(e.getStackTrace());
		}
		finally {
			sc.close();
		}
	}
}