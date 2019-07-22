package com.metacube.get2019;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * It is to run the test cases
 * @author Khushi
 *
 */
	
public class SizeTest{
	
	@Test
	public void testSetSize1() {
		Intset s = new Intset(new int[] { 1, 2, 3 ,4 ,5 ,6} , 6);
		assertEquals( 6 , s.size());
	}
	
	@Test
	public void testSetSize2() {
		Intset s = new Intset(new int[] { 45, 23, 76, 12, 65, 9, 49, 0, 2, 4} , 10);
		assertEquals( 10 , s.size());
	}
	
	@Test
	public void testSetSize3() {
		Intset s = new Intset(new int[] {} , 0 );
		assertEquals( 0 , s.size());
	}
	
	@Test
	public void testSetSize4() {
		Intset s = new Intset(new int[] { 89, 1000, 0, 12, 143, 7, 211, 12} , 8);
		assertEquals( 8 , s.size());
	}
}
