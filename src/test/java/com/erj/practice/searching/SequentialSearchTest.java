package com.erj.practice.searching;

import static org.junit.Assert.*;

import org.junit.Test;

public class SequentialSearchTest {

	@Test
	public void found() {
		Searchable sequentialSearch = new SequentialSearch();
		int[] searchField = {0,4,7,2};
		int target = 4;
		
		assertTrue(sequentialSearch.search(target, searchField));
	}
	
	@Test
	public void notFound() {
		Searchable sequentialSearch = new SequentialSearch();
		int[] searchField = {0,5,7,2};
		int target = 4;
		
		assertFalse(sequentialSearch.search(target, searchField));
	}
	@Test
	public void largerSearchField(){
		Searchable sequentialSearch = new SequentialSearch();
		int size = 100000000;
		int[] searchField = new int[size];
		
		for(int i = 0; i<size;i++){
			searchField[i] = i;
		}
		int target = 48596999;
		
		assertTrue(sequentialSearch.search(target, searchField));
	}

}
