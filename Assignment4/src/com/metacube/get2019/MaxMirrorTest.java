package com.metacube.get2019;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MaxMirrorTest {

	private int[] inputArray;
	private int expectedResult;
	private ArrayOperation aoObject;

	@Before
	public void initialize() {
		aoObject = new ArrayOperation();
	}

	public MaxMirrorTest(int expectedResult, int[] inputArray) {
		this.expectedResult = expectedResult;
		this.inputArray = inputArray;
	}

	@Parameterized.Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] {
				{ 3, new int[] { 1, 2, 3, 8, 9, 3, 2, 1 } },
				{ 2, new int[] { 7, 1, 4, 9, 7, 4, 1 } },
				{ 3, new int[] { 1, 2, 1, 4 } } ,
				{ 7, new int[] {1, 4, 5, 3, 5, 4, 1} },
				{ 0, new int[] {} }
				});
	}

	@Test
	public void maxMirrorTest()  {
		assertEquals(expectedResult, aoObject.maxMirror(inputArray));
	}
}