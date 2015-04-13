package com.erj.practice.sorting;

public class MergeSort implements Sortable {

	private int[] array;
	private int[] temporaryMergeArray;
	
	@Override
	public int[] sort(int[] source) {
		this.array = source;
		this.temporaryMergeArray = new int[source.length];
		mergeSort(0, source.length-1);
		return array;
	}

	private void mergeSort(int lowerIndex, int higherIndex) {
		if(lowerIndex < higherIndex){
			int middleIndex = lowerIndex + ((higherIndex - lowerIndex)/2);
			mergeSort(lowerIndex, middleIndex);
			mergeSort(middleIndex + 1, higherIndex);
			mergeParts(lowerIndex, middleIndex, higherIndex);
		}
	}

	private void mergeParts(int lowerIndex, int middleIndex, int higherIndex) {
		for (int i = lowerIndex; i <= higherIndex; i++){
			temporaryMergeArray[i] = array[i];
		}
		int i = lowerIndex;
		int j = middleIndex + 1;
		int k = lowerIndex;
		while(i<= middleIndex && j <= higherIndex){
			if(temporaryMergeArray[i] <= temporaryMergeArray[j]){
				array[k] = temporaryMergeArray[i];
				i++;
			}else{
				array[k] = temporaryMergeArray[j];
				j++;
			}
			k++;
		}
		while (i <= middleIndex){
			array[k] = temporaryMergeArray[i];
			k++;
			i++;
		}
	}
}
