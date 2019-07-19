package com.metacube.get2019;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LinearSearchTest {

	private int[] inputArray;
	private int expectedResult;
	private int element;
	private int arrLength;
	private Search searObj;

	@Before
	public void initialize() {
		searObj = new Search();
	}

	public LinearSearchTest(int expectedResult, int[] inputArray, int element, int arrLength) {
		this.expectedResult = expectedResult;
		this.inputArray = inputArray;
		this.element = element;
		this.arrLength = arrLength;
	}

	@Parameterized.Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] {
				{ 3, new int[]{1, 2, 3 , 4, 5, 6}, 4, 6 },
				{ -1, new int[]{1, 2, 3 , 4, 5, 6}, 9, 6 },
				{ -1, new int[]{}, 4, 0}
				});
	}

	@Test
	public void linearSearchTest() {
			assertEquals(expectedResult, searObj.linearSearch(inputArray, element, arrLength));
	}
}