package com.erj.practice.searching;


public class SequentialSearch implements Searchable {

	@Override
	public boolean search(int target, int[] searchField) {
		int comparisons = 0;
		for(int i = 0; i<searchField.length; i++){
			comparisons++;
			if(target == searchField[i]){
				System.out.println("Sequential Search("+searchField.length+") - Comparisons: " + comparisons);
				return true;
			}
		}
		System.out.println("Sequential Search("+searchField.length+") - Comparisons: " + comparisons);
		return false;
	}
}
