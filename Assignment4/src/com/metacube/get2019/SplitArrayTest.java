package com.metacube.get2019;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class SplitArrayTest {

		private int[] inputArray;
		private int expectedResult;
		private ArrayOperation aoObject;

		@Before
		public void initialize() {
			aoObject = new ArrayOperation();
		}

		public SplitArrayTest(int expectedResult, int[] inputArray) {
			this.expectedResult = expectedResult;
			this.inputArray = inputArray;
		}

		@Parameterized.Parameters
		public static Collection data() {
			return Arrays.asList(new Object[][] {
					{ 3, new int[] { 1, 1, 1, 2, 1 } },
					{ -1, new int[] { 2, 1, 1, 2, 1} },
					{ 1, new int[] {10, 10 } },
					{ 0, new int[] {} }
					 });
		}

		@Test
		public void splitArrayTest() {
			assertEquals(expectedResult, aoObject.splitArray(inputArray));
		}
}
