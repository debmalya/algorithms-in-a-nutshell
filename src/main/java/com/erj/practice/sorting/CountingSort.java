package com.erj.practice.sorting;

public class CountingSort implements Sortable {

	@Override
	public int[] sort(int[] source) {
		int maximumValue = findMaximumValue(source);
		System.out.println(maximumValue   );
		int [] buckets = new int[maximumValue + 1];
		
		for(int value: source){
			buckets[value]++;
		}
		int sourceIndex = 0;
		for(int i = 0; i<buckets.length; i++){
			while(buckets[i] > 0){
				source[sourceIndex++] = i;
				buckets[i]--;
			}
		}
		return source;
	}

	private int findMaximumValue(int[] source) {
		int max = source[0];
		for(int value : source){
			if(value > max){
				max = value;
			}
		}
		return max;
	}

}
