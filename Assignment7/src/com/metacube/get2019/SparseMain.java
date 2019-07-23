package com.metacube.get2019;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * It is a class with main method.
 * @author Khushi
 *
 */
public class SparseMain {

	static Scanner sc = new Scanner(System.in);

	/**
	 * It is a method used to take matrix as input from user.
	 * @param row number of rows.
	 * @param col number of columns.
	 * @return matrix.
	 */
	static int[][] getInput(int row, int col) {
		int matrix[][] = new int[row][col];
		System.out.print("Enter elements of matrix : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		return matrix;
	}

	/**
	 * It is a main method.
	 * @param args Unused.
	 */
	public static void main(String args[]) {
		boolean isExit = false;
		int row, col, row1, col1;
		int[][] matrix, matrix1;
		SparseMatrix s, s1;
		try {
			do {
				System.out.println("1. Addition of 2 sparse Matrix");
				System.out.println("2. Transpose of Sparse Matrix");
				System.out.println("3. Multiplication of 2 sparse Matrix");
				System.out.println("4. Check whether sparse matrix is symmetric or not");
				System.out.println("5. Exit");
				System.out.println("------------------------------");
				System.out.print("Enter your choice : ");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("------------------------------");
					System.out.print("Enter number of rows in matrix1 : ");
					row = sc.nextInt();
					System.out.print("Enter number of column in matrix1 : ");
					col = sc.nextInt();
					System.out.println("------------------------------");
					matrix = new int[row][col];
					matrix = getInput(row, col);
					s = new SparseMatrix(row, col, matrix);

					System.out.println("------------------------------");
					System.out.print("Enter number of rows in matrix2 : ");
					row1 = sc.nextInt();
					System.out.print("Enter number of column in matrix2 : ");
					col1 = sc.nextInt();
					System.out.println("------------------------------");
					matrix1 = new int[row1][col1];
					matrix1 = getInput(row1, col1);
					s1 = new SparseMatrix(row1, col1, matrix1);

					System.out.println("------------------------------");
					System.out.println("Addition : ");
					SparseMatrix add = new SparseMatrix(row, col);
					add = s.add(s1);
					add.printSparse();
					System.out.println("------------------------------");
					break;
				case 2:
					System.out.println("------------------------------");
					System.out.print("Enter number of rows in matrix1 : ");
					row = sc.nextInt();
					System.out.print("Enter number of column in matrix1 : ");
					col = sc.nextInt();
					System.out.println("------------------------------");
					matrix = new int[row][col];
					matrix = getInput(row, col);
					s = new SparseMatrix(row, col, matrix);

					SparseMatrix trans = new SparseMatrix(col, row);
					System.out.println("------------------------------");
					System.out.println("Transpose : ");
					trans = s.transpose();
					trans.printSparse();
					System.out.println("------------------------------");
					break;
				case 3:
					System.out.println("------------------------------");
					System.out.print("Enter number of rows in matrix1 : ");
					row = sc.nextInt();
					System.out.print("Enter number of column in matrix1 : ");
					col = sc.nextInt();
					System.out.println("------------------------------");
					matrix = new int[row][col];
					matrix = getInput(row, col);
					s = new SparseMatrix(row, col, matrix);

					System.out.println("------------------------------");
					System.out.print("Enter number of rows in matrix2 : ");
					row1 = sc.nextInt();
					System.out.print("Enter number of column in matrix2 : ");
					col1 = sc.nextInt();
					System.out.println("------------------------------");
					matrix1 = new int[row1][col1];
					matrix1 = getInput(row1, col1);
					s1 = new SparseMatrix(row1, col1, matrix1);

					System.out.println("------------------------------");
					System.out.println("Multiplication : ");
					SparseMatrix multi = new SparseMatrix(row, col1);
					multi = s.multiply(s1);
					multi.printSparse();
					System.out.println("------------------------------");
					break;
				case 4:
					System.out.println("------------------------------");
					System.out.print("Enter number of rows in matrix1 : ");
					row = sc.nextInt();
					System.out.print("Enter number of column in matrix1 : ");
					col = sc.nextInt();
					System.out.println("------------------------------");
					matrix = new int[row][col];
					matrix = getInput(row, col);
					s = new SparseMatrix(row, col, matrix);

					System.out.println("------------------------------");
					System.out.print("Matrix is symmetric : ");
					boolean result = s.symmetric();
					System.out.println(result);
					System.out.println("------------------------------");
					break;
				case 5:
					isExit = true;
					System.out.println("Successfully Exit!!!");
					break;
				default:
					System.out.println("Invalid choice!!!Make a valid choice");

				}

			} while (!isExit);
		} catch (InputMismatchException e) {
			System.out.println(e.getStackTrace());
		} catch (AssertionError e) {
			System.out.println(e.getStackTrace());
		}
	}

}
