package com.metacube.get2019;

import java.util.*;

/**
 * It is a class with main method.
 * @author Khushi
 *
 */
public class CommandPrompt {

	/**
	 * It is a main method
	 * @param args unused
	 */
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		try{
			Tree directoryTree = new Tree();
			String input;
			String[] option;
			System.out.println("Welcome to Virtual Command Prompt!");
			System.out.println(directoryTree.indicator);
			input = sc.nextLine();
			option= input.split(" ");

			while(!"exit".equals(option[0])){
				switch(option[0]){
				case "mkdir" :
					directoryTree.addNode(option[1]);
					break;
				case "cd" :
					directoryTree.changeCurrent(option[1]);
					break;
				case "bk" :
					directoryTree.moveToParent();
					break;
				case "ls" :
					directoryTree.listOfAllChildren();
					break;
				case "find" :
					directoryTree.find(option[1]);
					break;
				case "tree" :
					directoryTree.breadthFirstTraversal(directoryTree.root);
					break;
				case "exit" : 		
					break;
				default :
					System.out.println("Command doesn't exist!");
					break;
				}

				System.out.println(directoryTree.indicator);
				input = sc.nextLine();
				option= input.split(" ");
			}
		}catch(Exception e){
			System.out.println(e);
		}finally {
			sc.close();
		}
	}
}
