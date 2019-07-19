package com.metacube.get2019;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NQueenMain {

	public static void main(String args[]) {

		NQueenPro nQueenObj = new NQueenPro();
		try {
			System.out.print("Enter dimension of board : ");
			Scanner sc = new Scanner(System.in);
			int boardDimension = sc.nextInt();
			System.out.println("------------------");
			int[][] result = new int[boardDimension][boardDimension];
			result = nQueenObj.showBoard(0, boardDimension);
			for (int i = 0; i < boardDimension; i++) {
				for (int j = 0; j < boardDimension; j++) {
					System.out.print(result[i][j] + " ");
				}
				System.out.println();
			}
		} catch (InputMismatchException e) {
			System.out.println(e.getStackTrace());
		}
	}
}
