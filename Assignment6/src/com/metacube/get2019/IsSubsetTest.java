package com.metacube.get2019;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * It is to run the test cases
 * @author Khushi
 *
 */
	
public class IsSubsetTest{
	
	@Test
	public void testIsSubset1() {
		Intset s = new Intset(new int[] { 1, 2, 3 ,4 ,5 ,6} , 6);
		Intset s1 = new Intset(new int[] { 1, 2, 3 } , 3);
		assertEquals( true , s.isSubSet(s1));
	}
	
	@Test
	public void testIsSubset2() {
		Intset s = new Intset(new int[] { 45, 23, 76, 12, 65, 9, 49, 0, 2, 4} , 10);
		Intset s1 = new Intset(new int[] { 45, 23, 76, 81, 65, 99} , 6);
		assertEquals( false , s.isSubSet(s1));
	}
	
	@Test
	public void testIsSubset3() {
		Intset s = new Intset(new int[] {} , 0 );
		Intset s1 = new Intset(new int[] {} , 0 );
		assertEquals( true , s.isSubSet(s1));
	}
	
	@Test
	public void testIsSubset4() {
		Intset s = new Intset(new int[] { 89, 1000, 0, 12, 143, 7, 211} , 7);
		Intset s1 = new Intset(new int[] { 89, 1000, 7, 211 } , 4);
		assertEquals( true , s.isSubSet(s1));
	}
}
