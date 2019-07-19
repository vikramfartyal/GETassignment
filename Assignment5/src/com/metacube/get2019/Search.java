package com.metacube.get2019;


/**
 * It is a class used to search an element using Linear Search and Binary Search.
 * @author Khushi
 *
 */
public class Search {
	
	
	
	/**
	 * It is a method used to search an element using linear search.
	 * @param arr an array
	 * @param element element to be searched
	 * @param arrLength length of array
	 * @return index of element
	 */
	public int linearSearch(int arr[], int element, int arrLength) {
		if (arrLength > 0) {
			if (arr[arrLength - 1] == element) {
				return arrLength - 1;
			} else {
				return linearSearch(arr, element, arrLength - 1);
			}
		}
		return -1;

	}
	
	/**
	 * It is method to search an element using binary search.
	 * @param arr an array
	 * @param start starting position of array 
	 * @param end end position of array
	 * @param element element to be searched
	 * @return index of element
	 */
	public int binarySearch(int arr[], int start, int end, int element) {
		if (arr.length == 0 || start < 0 || end < 0) {
			return -1;
		}
		
		int mid = (start + end) / 2;

		if (end >= start) {
			if (arr[mid] == element) {
				return mid;
			} else if (arr[mid] > element) {
				return binarySearch(arr, start, mid - 1, element);
			} else if (arr[mid] < element) {
				return binarySearch(arr, mid + 1, end, element);
			}
		}

		return -1;
	}


}
