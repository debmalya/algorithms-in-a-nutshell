package com.erj.practice.sorting;

public class SelectionSort implements Sortable {

	@Override
	public int[] sort(int[] source) {
		int i;
		int j;
		int maximumValue;
		int maximumIndex = 0;
		
		for(i=source.length-1; i>=0; i--){
			maximumValue = source[0];
			maximumIndex = 0;
			for(j=1; j<=i; j++){
				if(source[j] > maximumValue){
					maximumValue = source[j];
					maximumIndex = j;
				}
			}
			int temp = source[i];
			source[i] = maximumValue;
			source[maximumIndex] = temp;
		}
		return source;
	}

}
