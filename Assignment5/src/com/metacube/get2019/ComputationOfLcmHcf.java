package com.metacube.get2019;

/**
 * It is a class used to compute lcm and hcf of 2 numbers.
 * @author Khushi
 *
 */
public class ComputationOfLcmHcf {

	int temp = 1;

	/**
	 * It is a method used to find Lcm of 2 numbers
	 * @param a First number
	 * @param b second number
	 * @return lcm of a & b
	 */
	public int lcmOfAB(int a, int b) {

		if (a == 0 || b == 0) {
			return 0;
		}

		if (temp % a == 0 && temp % b == 0) {
			return temp;
		} else {
			temp++;
			return lcmOfAB(a, b);
		
		}
	}

	/**
	 * It is method used to find hcf of 2 numbers.
	 * @param a first number
	 * @param b second number
	 * @return hcf of a & b
	 */
	public static int hcfOfAB(int a, int b) {
		int rem;
		if (a == 0) {
			return b;
		} else if (b == 0) {
			return a;
		}
		int max = a > b ? a : b;
		int min = a > b ? b : a;
		rem = max % min;
		if (rem == 0) {
			return b;
		} else {
			return hcfOfAB(min, rem);
		}
	}

}
