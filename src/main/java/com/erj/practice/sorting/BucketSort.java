package com.erj.practice.sorting;

import java.util.ArrayList;

public class BucketSort implements Sortable {

	@Override
	public int[] sort(int[] source) {
		ArrayList<ArrayList<Integer>> buckets = new ArrayList<ArrayList<Integer>>();
		for(int i = 0; i<source.length;i++){
			buckets.add(i, new ArrayList<Integer>());
		}
		
		for(int i = 0; i<source.length; i++){
			int k = (int)Math.floor(source[i]/64);
			buckets.get(k).add(source[i]);
		}
		extract(buckets, source);
		return source;
	}

	private void extract(ArrayList<ArrayList<Integer>> buckets, int[] source) {
		Sortable insertionSort = new InsertionSort();
		int index = 0;
		for(int i = 0; i<buckets.size(); i++){
			int[] smallArray = insertionSort.sort(convertBucketListToIntArray(buckets.get(i)));
			for(int k = 0; k<smallArray.length; k++){
				source[index++] = smallArray[k];
			}
		}
	}
	
	private int[] convertBucketListToIntArray(ArrayList<Integer> list){
		int [] smallArray = new int[list.size()];
		for(int j = 0; j<smallArray.length; j++){
			smallArray[j] = list.get(j);
		}
		return smallArray;
	}

}
