package com.metacube.get2019;

import java.util.*;

/**
 * It is a class with main method.
 * @author Khushi
 */
public class CommandPrompt {

	/**
	 * It is a main method
	 * @param args unused
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			Tree directoryTree = new Tree();
			String input;
			String[] command;
			boolean isExit = false;
			System.out.println("Welcome to Virtual Command Prompt!");

			do {
				System.out.print(directoryTree.indicator);
				String str = sc.nextLine();
				command = str.split(" ");
				switch (command[0]) {
				case "mkdir":
					directoryTree.addNode(command[1]);
					break;
				case "cd":
					directoryTree.changeCurrent(command[1]);
					break;
				case "bk":
					directoryTree.moveToParent();
					break;
				case "ls":
					directoryTree.listOfAllChildren();
					break;
				case "find":
					directoryTree.find(command[1]);
					break;
				case "tree":
					directoryTree.breadthFirstTraversal(directoryTree.root);
					break;
				case "exit":
					System.exit(0);
					break;
				default:
					System.out.println("Command doesn't exist!");
				}
			} while (!isExit);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			sc.close();
		}
	}
}
