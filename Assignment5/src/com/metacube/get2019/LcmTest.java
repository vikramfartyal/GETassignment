package com.metacube.get2019;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LcmTest {

	private int input1;
	private int input2;
	private int expectedResult;
	private  ComputationOfLcmHcf cLcmHcf;

	@Before
	public void initialize() {
		cLcmHcf = new ComputationOfLcmHcf();
	}

	public LcmTest(int expectedResult, int input1, int input2) {
		this.expectedResult = expectedResult;
		this.input1 = input1;
		this.input2 = input2;
	}

	@Parameterized.Parameters
	public static Collection data() {
		return Arrays
				.asList(new Object[][] {
						{36 , 12, 18},
						{12, 12, 4 },
						{0 , 12, 0}
						});
	}

	@Test
	public void lcmTest() {
		assertEquals(expectedResult, cLcmHcf.lcmOfAB(input1, input2));
	}

}
