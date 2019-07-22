package com.metacube.get2019;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * It is to run the test cases
 * @author Khushi
 *
 */
	
public class UnionTest{
	
	@Test
	public void testUnion1() {
		Intset s = new Intset(new int[] { 1, 2, 3 ,4 ,5 ,6} , 6);
		Intset s1 = new Intset(new int[] { 1, 2, 3 } , 3);
		Intset actual = s.union(s, s1);
		assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, actual.getSet());
	}
	
	@Test
	public void testUnion2() {
		Intset s = new Intset(new int[] { 45, 23, 76, 12, 65, 9, 49, 0, 2, 4} , 10);
		Intset s1 = new Intset(new int[] {}, 0);
		Intset actual = s.union(s, s1);
		assertArrayEquals( new int[] { 0, 2, 4, 9, 12, 23, 45, 49, 65, 76 } , actual.getSet());
	}
	

}
