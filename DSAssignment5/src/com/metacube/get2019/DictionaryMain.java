package com.metacube.get2019;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 * It is a class with main method
 * @author Khushi
 *
 */
public class DictionaryMain {

	/**
	 * It is a main method.
	 * @param args unused
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		boolean isExit = false;
		String key;
		DictImp dictObj1 = null;
		List<Value> valueList = new ArrayList<Value>();
		List<Value> rangeValueList = new ArrayList<Value>();
		try {
			do {
				System.out.println("------------------------------");
				System.out.println("1. Insert into dictionary.");
				System.out.println("2. Delete a key from dictionary");
				System.out.println("3. Get value of key.");
				System.out.println("4. Get sorted list of key value pair.");
				System.out.println("5. Get sorted list of key value pair within a range.");
				System.out.println("6. Exit");
				System.out.println("------------------------------");
				System.out.print("Enter your choice : ");
				int choice = sc.nextInt();
				sc.nextLine();
				System.out.println("------------------------------");
				switch(choice) {
				case 1 :
					Object obj = new JSONParser().parse(new FileReader("C:\\Users\\praka_000\\workspace\\DSAssignment5\\src\\com\\metacube\\get2019\\data.json")); 
					JSONObject jsonObj = (JSONObject) obj;
					dictObj1 = new DictImp(jsonObj);	  
					break;
				case 2 :
					System.out.print("Enter the key which you want to delete : ");
					key = sc.nextLine();
					System.out.println("------------------------------");
					dictObj1.delete(key);
					break;
				case 3 :
					System.out.print("Enter the key whose value you want to find : ");
					key = sc.nextLine();
					System.out.println("------------------------------");
					String value = dictObj1.getValue(key);
					System.out.println("Value of key "+ key + " : "+value);
					break;
				case 4 :
					valueList = dictObj1.getAll();
					dictObj1.showList(valueList);
					System.out.println("------------------------------");
					break;
				case 5 :
					System.out.print("Enter the starting key of range : ");
					String key1 = sc.nextLine();
					System.out.print("Enter the ending key of range : ");
					String key2 = sc.nextLine();
					System.out.println("------------------------------");
					rangeValueList = dictObj1.getBetween(key1, key2);
					dictObj1.showList(rangeValueList);
					System.out.println("------------------------------");
					break;
				case 6:
					isExit = true;
					System.out.println("Successfully Exit!!!");
					System.out.println("---------------------------------------");
					break;
				default :
					System.out.println("Invalid choice.");
					System.out.println("---------------------------------------");	
				}

			} while (!isExit);

		} catch (InputMismatchException e) {
			System.out.println(e.getStackTrace());
		}finally {
			sc.close();
		}
	}
}
