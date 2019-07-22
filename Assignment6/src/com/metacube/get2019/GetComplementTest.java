package com.metacube.get2019;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * It is to run the test cases
 
 * @author Khushi
 *
 */
	
public class GetComplementTest{
	
	@Test
	public void testGetComplement1() {
		Intset s = new Intset(new int[] { 1, 2, 3 ,4 ,5 ,6} , 6);
		int[] expected = new int[ 1000 - 6 ];
		for ( int i = 0; i < 1000 - 6; i++){
			expected[i]= i + 7;
		}
		Intset actual = s.getComplement();
		assertArrayEquals( expected, actual.getSet());
	}
	
	@Test
	public void testGetComplement2() {
		Intset s = new Intset(new int[] {} , 0);
		int[] expected = new int[ 1000 ];
		int k = 0;
		for ( int i = 1; i <= 1000 ; i++){
			expected[k]= i ;
			k++;
		}
		Intset actual = s.getComplement();
		assertArrayEquals( expected, actual.getSet());
	}

}
