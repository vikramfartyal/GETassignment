package com.metacube.get2019;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Before;
import org.junit.Test;


/**
 * Test class.
 * @author Khushi
 *
 */
public class NQueenProTest {

	private int row;
	private int boardDimension;
	private NQueenPro nQueenObj;
	
	@Before
	public void initialize() {
		nQueenObj = new NQueenPro();
	}
	
	int expectedResult1[][] = new int[][]{{0, 0, 0},
											{0, 0, 0},
											{0, 0, 0}};

	@Test
	public void nQueenTest1 () {
		row = 0;
		boardDimension = 3;
		assertArrayEquals(expectedResult1, nQueenObj.showBoard(row, boardDimension));
	}

	int expectedResult[][] = new int[][]{{0, 1, 0, 0}, 
										{0, 0, 0, 1}, 
										{1, 0, 0, 0}, 
										{0, 0, 1, 0}};  

	@Test
	public void nQueenTest () {
		row = 0;
		boardDimension = 4;
		assertArrayEquals(expectedResult, nQueenObj.showBoard(row, boardDimension));
	}
		

}