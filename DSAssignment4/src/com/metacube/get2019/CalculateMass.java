package com.metacube.get2019;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * It is a class used to calculate mass of a molecule.
 * @author Khushi
 *
 */
public class CalculateMass {
	
	Map<Character, Integer> map = new HashMap<Character, Integer>();
	
	/**
	 * It is a method to calculate mass of molecule.
	 * @param comFormula Compound formula
	 * @return mass of molecule
	 */
	public int calculateMass(String comFormula) {
		map.put('C', 12);
		map.put('H', 1);
		map.put('O', 16);
		map.put('(', 0);
		int sum = 0;
		comFormula = comFormula.toUpperCase();
		int massOfMolecule = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < comFormula.length(); i++) {
			if (comFormula.charAt(i) == ')') {				
				while (stack.peek() != 0) {
					sum += stack.pop();
				}
				stack.push(sum);
			}
			else if (Character.isDigit(comFormula.charAt(i))) {
				int j = 0;
				String strBase = "";
				while ((i+j) < comFormula.length() && Character.isDigit(comFormula.charAt(i + j))) {
					strBase = strBase.concat(comFormula.charAt(i + j) + "");
					j++;
				}
				int temp = Integer.parseInt(strBase);
				i = i + (--j);
				stack.push((stack.pop()) * temp) ;
			}
			else {
				stack.push(map.get(comFormula.charAt(i)));
			}
		}
		while (!stack.isEmpty()) {
			massOfMolecule += stack.pop();
		}
		return massOfMolecule;
	}
}
