package com.metacube.get2019;

/**
 * It is class which is has methods to perform operations on string i.e. reverse a string, 
 * compare 2  strings, swapcase, find longest word in string.
 * @author Khushi
 *
 */
public class StringOperations {
	
	public char[] stringToCharArr(String str) {
		
		char[] strCharArray = str.toCharArray();
		return strCharArray;
	}

	public int getLength(String str) {
		int count = 0;
		for (char c : str.toCharArray()) {
			count++;
		}
		return count;
	}
	/**
	 * This is a method which is used to reverse a string without using API function
	 * @param str It is the string which is to be reverse.
	 * @return reverseString 
	 */
	public String reverseString(String str) {
		String reverseString = "";
		char[] strCharArray = stringToCharArr(str);
		int strLength = getLength(str);
		for (int i = strLength - 1; i >= 0; i--){
			reverseString += strCharArray[i];
		}
		return reverseString;
	}
	
	/**
	 * It is method which is used to compare 2 string for equality
	 * @param str1 First String
	 * @param str2 Second String
	 * @return 1 if strings are equal and 0 if not equal.
	 */
	public int compare2Strings(String str1, String str2) {
		int strLen1 = getLength(str1);
		int strLen2 = getLength(str2);
		char[] str1CharArray = stringToCharArr(str1);
		char[] str2CharArray = stringToCharArr(str2);
		if(strLen1 != strLen2) {
			return 0;
		}
		boolean flag = true;
		for (int i = 0; i < strLen1; i++) {
			if (str1CharArray[i] != str2CharArray[i]) {
				flag = false;
				break;
			}
		}
		if (flag)
			return 1;
		else
			return 0;
	}
	
	/**
	 * It is method which is used to reverse case of string without using API.
	 * @param str String 
	 * @return reversed case String.
	 */
	public String swapCase(String str) {
		String swapCaseString = "";
		int strLength = getLength(str);
		for (int i = 0; i < strLength; i++) {
			char ch = str.charAt(i);
			if ( ch >= 65 && ch <= 90) {
				ch = (char)(ch + 32);
			}
			else if (ch >= 97 && ch <= 122) {
				ch = (char)(ch -32);
			}
			swapCaseString += ch ;
		}
		return swapCaseString;
	}
	
	/**
	 * It is a method which is used to return largest word among a string.
	 * @param str string
	 * @return largest word of string
	 */
	public String largestWordOfString(String str) {
		String largestWord;
		String[] words_arr = str.split(" ");
		int arrLength = words_arr.length;
		largestWord = words_arr[0];
		for (int i = 1; i < arrLength; i++) {
			if (getLength(largestWord) <= (getLength(words_arr[i]))) {
				largestWord = words_arr[i];
			}
		}
		return largestWord;
	}
}

