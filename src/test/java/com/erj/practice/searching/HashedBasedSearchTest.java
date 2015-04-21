package com.erj.practice.searching;

import static org.junit.Assert.*;

import org.junit.Test;

public class HashedBasedSearchTest {

	@Test
	public void found() {
		Searchable search = new HashBasedSearch();
		int[] searchField = {0,4,7,2};
		int target = 4;
		
		assertTrue(search.search(target, searchField));
	}
	
	@Test
	public void notFound() {
		Searchable search = new HashBasedSearch();
		int[] searchField = {0,5,7,2};
		int target = 4;
		
		assertFalse(search.search(target, searchField));
	}
	@Test
	public void largerSearchField(){
		Searchable search = new HashBasedSearch();
		int size = 100000000;
		int[] searchField = new int[size];
		
		for(int i = 0; i<size;i++){
			searchField[i] = i;
		}
		int target = 48596999;
		
		assertTrue(search.search(target, searchField));
	}

}
