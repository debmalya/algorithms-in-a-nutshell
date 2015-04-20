package com.erj.practice.searching;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void found() {
		Searchable sequentialSearch = new BinarySearch();
		int[] searchField = {0,2,4,7};
		int target = 4;
		
		assertTrue(sequentialSearch.search(target, searchField));
	}
	
	@Test
	public void notFound() {
		Searchable sequentialSearch = new BinarySearch();
		int[] searchField = {0,2,5,7};
		int target = 4;
		
		assertFalse(sequentialSearch.search(target, searchField));
	}
	@Test
	public void largerSearchField(){
		Searchable sequentialSearch = new BinarySearch();
		int size = 100000000;
		int[] searchField = new int[size];
		
		for(int i = 0; i<size;i++){
			searchField[i] = i;
		}
		int target = 48596999;
		
		assertTrue(sequentialSearch.search(target, searchField));
	}

}
