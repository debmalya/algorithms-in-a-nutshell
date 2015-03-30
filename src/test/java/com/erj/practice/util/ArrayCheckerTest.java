package com.erj.practice.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayCheckerTest {

	@Test
	public void emptyArrayIsSorted() {
		int[] source = new int[0];
		
		assertTrue(ArrayChecker.isSorted(source));
	}
	
	@Test
	public void oneElementArrayIsSorted() {
		int[] source = new int[]{0};
		
		assertTrue(ArrayChecker.isSorted(source));
	}
	
	@Test
	public void twoElementArrayIsSorted() {
		int[] source = new int[]{1,2};
		
		assertTrue(ArrayChecker.isSorted(source));
	}
	
	@Test
	public void twoElementArrayIsNotSorted() {
		int[] source = new int[]{2,1};
		
		assertFalse(ArrayChecker.isSorted(source));
	}
}
