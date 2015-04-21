package com.erj.practice.searching;

public class BinarySearch implements Searchable {

	@Override
	public boolean search(int target, int[] field) {
		int comparisons = 0;
		int lowIndex = 0;
		int highIndex = field.length-1;
		while(lowIndex <= highIndex){
			int searchIndex = (lowIndex+highIndex)/2;
			if(field[searchIndex] == target){
				System.out.println("Binary Search("+field.length+") - Comparisons: " + comparisons);
				return true;
			}else if(target < field[searchIndex]){
				highIndex = searchIndex - 1;
			}else{
				lowIndex = searchIndex + 1;
			}
			comparisons++;
		}
		System.out.println("Binary Search("+field.length+") - Comparisons: " + comparisons);
		return false;
	}

}
