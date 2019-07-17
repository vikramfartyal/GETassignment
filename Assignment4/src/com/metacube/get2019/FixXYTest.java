package com.metacube.get2019;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FixXYTest {

	private int[] inputArray;
	private int[] expectedResult;
	private int X;
	private int Y;
	private ArrayOperation aoObject;

	@Before
	public void initialize() {
		aoObject = new ArrayOperation();
	}

	public FixXYTest(int[] expectedResult, int[] inputArray, int X, int Y) {
		this.expectedResult = expectedResult;
		this.inputArray = inputArray;
		this.X = X;
		this.Y = Y;
	}

	@Parameterized.Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] {
				{ new int[] {9, 4, 5, 4, 5, 9}, new int[] { 5, 4, 9, 4, 9, 5 }, 4, 5},
				{ new int[] {1, 4, 5, 1}, new int[] { 1, 4, 1, 5 }, 4, 5 },
				{ new int[] {1, 4, 5, 1, 1, 4, 5}, new int[] { 1, 4, 1, 5, 5, 4, 1 }, 4, 5 },
				{ new int[] {}, new int[] {}, 4, 5}
				});
	}

	@Test
	public void fixXYTest() {
		assertArrayEquals(expectedResult, aoObject.fixXY(inputArray, X, Y));
	}
}