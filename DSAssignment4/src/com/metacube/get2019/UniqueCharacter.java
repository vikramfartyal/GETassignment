package com.metacube.get2019;

import java.util.HashMap;

public class UniqueCharacter {
	
	HashMap<String, Integer> map = new HashMap<>(); 
	
	public int noOfUniqueChar(String str) {
		if (map.containsKey(str)) {
			return map.get(str);
		}
		else {
			int count[] = new int[Character.MAX_VALUE];
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ' '){
					continue;
				}
				count[str.charAt(i)]++;
			}
			int noOfChar = 0;
			for (int i = 0; i < count.length; i++) {
				if (count[i] == 1) {
					noOfChar++;
				}
			}
			map.put(str, noOfChar);
			return noOfChar;
		}
	}

}
