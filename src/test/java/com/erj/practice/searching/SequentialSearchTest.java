package com.erj.practice.searching;

import static org.junit.Assert.*;

import org.junit.Test;

public class SequentialSearchTest {

	@Test
	public void found() {
		Searchable sequentialSearch = new SequentialSearch();
		int[] searchField = new int[]{0,4,7,2};
		int target = 4;
		
		assertTrue(sequentialSearch.search(target, searchField));
	}
	
	@Test
	public void notFound() {
		Searchable sequentialSearch = new SequentialSearch();
		int[] searchField = new int[]{0,5,7,2};
		int target = 4;
		
		assertFalse(sequentialSearch.search(target, searchField));
	}

}
