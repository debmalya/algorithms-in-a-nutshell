package com.erj.practice.sorting;

public class InsertionSort implements Sortable{

	@Override
	public int[] sort(int[] source) {
		int[] result = source;
		for(int position = 0; position<result.length; position++){
			insert(result, position, result[position]);
		}
		return result;
	}

	private void insert(int[] array, int position, int value) {
		int i = position-1;
		while(i>=0 && array[i]>value){
			array[i+1] = array[i];
			i=i-1;
		}
		array[i+1] = value;
	}
}
