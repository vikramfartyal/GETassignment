package com.metacube.get2019;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CountClumpTest {

	private int[] inputArray;
	private int expectedResult;
	private ArrayOperation aoObject;

	@Before
	public void initialize() {
		aoObject = new ArrayOperation();
	}

	public CountClumpTest(int expectedResult, int[] inputArray) {
		this.expectedResult = expectedResult;
		this.inputArray = inputArray;
	}

	@Parameterized.Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] {
				{ 2, new int[] { 1, 2, 2, 3, 4, 4 } },
				{ 2, new int[] { 1, 1, 2, 1, 1 } },
				{ 1, new int[] { 1, 1, 1, 1, 1 } },
				{ 0, new int[] {} },
				 });
	}

	@Test
	public void countClumpsTest() {
		assertEquals(expectedResult, aoObject.countClumps(inputArray));
	}
}
