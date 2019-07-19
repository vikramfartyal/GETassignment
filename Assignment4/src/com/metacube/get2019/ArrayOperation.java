package com.metacube.get2019;

public class ArrayOperation {

	/**
	 * It is used to find maximum length mirror in an array
	 * @param arr an array
	 * @return length of maximum mirror
	 */
	public int maxMirror(int[] arr) {
		
		int arrlength = arr.length;
		if (arr.length == 0) {
			throw new AssertionError("Array is Empty");
		}
		int maxCount = 0;

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = arr.length - 1; j >= 0 && i + count < arr.length; j--) {
				if (arr[i + count] == arr[j]) {
					count++;
				} else {
					maxCount = Math.max(maxCount, count);
					count = 0;
				}
			}
			maxCount = Math.max(maxCount, count);
		}
		return maxCount;
	}
	
	/**
	 * It is a method used to count number of clumps in an array.
	 * @param arr an array
	 * @return number of clumps
	 */
	public int countClumps(int[] arr) {
		boolean match = false;
		int arrLength = arr.length;
		if (arr.length == 0) {
			throw new AssertionError("Array is Empty");
		}
		int count = 0;
		for (int i = 0; i < arrLength - 1; i++) {
			if (arr[i] == arr[i + 1] && !match) {
				match = true;
				count++;
			} else if (arr[i] != arr[i + 1]) {
				match = false;
			}

		}
		return count;
	}

	public boolean countXY (int arr[], int X, int Y) {
		int arrLength = arr.length-1;
		int countX = 0;
		int countY = 0;
		boolean flag = true;
		for (int i = 0; i <= arrLength; i++) {
			if (arr[i] == X) {
				countX++;
			} else if (arr[i] == Y) {
				countY++;
			}

		}
		if (countX != countY ) {
			flag = false;
		}
		return flag;
	}
	
	/**
	 * It is method used to return an array in which every X is followed by Y, and without moving X from its position.
	 * @param arr an array
	 * @param X 
	 * @param Y
	 * @return new array in which X followed Y
	 */
	public int[] fixXY(int[] arr, int X, int Y) {
		int arrLength = arr.length;
		
		if (arrLength == 0) {
			throw new AssertionError("Array is Empty");
		}
		
		if(arr[arrLength-1] == X) {
			throw new AssertionError("Count of X and Y is not equal");
		}
		
		boolean flag = countXY(arr, X, Y);
		if (!flag) {
			throw new AssertionError("Count of X and Y is not equal");
		}
		
		
		for(int i = 1; i < arrLength; i++) {
			if( arr[ i-1 ] == X && arr[ i ] == X) {
				throw new AssertionError("Two X are adjacent to each other");
			}
		}
		
		for (int i = 0; i < arrLength - 2; i++) {
			if (arr[i] == X && arr[i + 1] == arr[i])
				System.out.println();
		}
		int k = 0, swap;
		for (int i = 0; i < arrLength - 1; i++) {
			if (arr[i] == X) {
				while (arr[k] != Y && k < arrLength - 1) {
					k++;
				}
				swap = arr[i + 1];
				arr[i + 1] = arr[k];
				arr[k] = swap;
				k = i + 2;
			}
		}
		return arr;
	}

	/**
	 * It is a method which return the index at which sum of left and right side are equal.
	 * @param arr an array
	 * @return index at which sum equal
	 */
	public int splitArray(int[] arr) {
		int arrLength = arr.length;
		if (arr.length == 0) {
			throw new AssertionError("Array is Empty");
		}
		int leftSum = 0;
		for (int i = 0; i < arrLength; i++) {
			leftSum += arr[i];
		}
		int rightSum = 0;
		for (int j = arrLength-1; j >= 0; j--) {
			rightSum += arr[j];
			leftSum -= arr[j];
			if (leftSum == rightSum)
				return j;
		}
		return -1;
	}
}
