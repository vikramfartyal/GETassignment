
package com.metacube.get2019;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class HcfTest {

	private int input1;
	private int input2;
	private int expectedResult;
	private  ComputationOfLcmHcf cLcmHcf;

	@Before
	public void initialize() {
		cLcmHcf = new ComputationOfLcmHcf();
	}

	public HcfTest(int expectedResult, int input1, int input2) {
		this.expectedResult = expectedResult;
		this.input1 = input1;
		this.input2 = input2;
	}

	@Parameterized.Parameters
	public static Collection data() {
		return Arrays
				.asList(new Object[][] {
						{ 5, 10, 45},
						{3, 3768, 1701 },
						{4, 0, 4}
						});
	}

	@Test
	public void hcfTest() {
		assertEquals(expectedResult, cLcmHcf.hcfOfAB(input1, input2));
	}

}
