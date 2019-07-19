package com.metacube.get2019;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class BinarySearchTest {

	private int[] inputArray;
	private int expectedResult;
	private int element;
	private int start;
	private int end;
	private Search searObj;

	@Before
	public void initialize() {
		searObj = new Search();
	}

	public BinarySearchTest(int expectedResult, int[] inputArray, int start, int end, int element) {
		this.expectedResult = expectedResult;
		this.inputArray = inputArray;
		this.element = element;
		this.start = start;
		this.end = end;
	}

	@Parameterized.Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] {
				{ 3, new int[]{1, 2, 3 , 4, 5, 6}, 0, 5, 4 },
				{ -1, new int[]{1, 2, 3 , 4, 5, 6}, 0, 5, 9 },
				{ -1, new int[]{}, 0, 0, 1}
				});
	}

	@Test
	public void binarySearchTest() {
		assertEquals(expectedResult, searObj.binarySearch(inputArray, start, end, element));
	}
}