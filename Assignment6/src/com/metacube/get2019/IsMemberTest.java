package com.metacube.get2019;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * It is to run the test cases
 * @author Khushi
 *
 */
	
public class IsMemberTest{
	
	@Test
	public void testIntset1() {
		Intset s = new Intset(new int[] { 1, 2, 3 ,4 ,5 ,6} , 6);
		assertEquals( true , s.isMember( 3 ));
	}
	
	@Test
	public void testIntSet2() {
		Intset s = new Intset(new int[] { 45, 23, 76, 12, 65, 9, 49, 0, 2, 4} , 10);
		assertEquals( false , s.isMember( 1 ));
	}
	
	@Test
	public void testIntSet3() {
		Intset s = new Intset(new int[] {} , 0 );
		assertEquals( false , s.isMember( 3 ));
	}
	
	@Test
	public void testIntSet4() {
		Intset s = new Intset(new int[] { 89, 1000, 0, 12, 143, 7, 211, 12} , 8);
		assertEquals( true , s.isMember( 12 ));
	}
}
