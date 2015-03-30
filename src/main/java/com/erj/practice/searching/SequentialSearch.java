package com.erj.practice.searching;


public class SequentialSearch implements Searchable {

	@Override
	public boolean search(int target, int[] searchField) {
		for(int i = 0; i<searchField.length; i++){
			if(target == searchField[i]){
				return true;
			}
		}
		return false;
	}
}
