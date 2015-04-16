package com.erj.practice.sorting;

public class HeapSort implements Sortable {

	@Override
	public int[] sort(int[] source) {
		buildHeap(source);
		for(int i = source.length - 1; i >=1; i--){
			int temp = source[0];
			source[0] = source[i];
			source[i] = temp;
			heapify(source, 0, i);
		}
		return source;
	}

	private void buildHeap(int[] source) {
		for(int i = (int)Math.floor(source.length/2) -1; i>=0; i--){
			heapify(source, i, source.length);
		} 
	}
	
	private void heapify(int[] source, int index, int maximumIndex) {
		int largestIndex;
		int leftChildIndex = 2*index + 1;
		int rightChildIndex = 2*index + 2;
		
		if(leftChildIndex < maximumIndex && source[leftChildIndex] > source[index]){
			largestIndex = leftChildIndex; 
		}else{
			largestIndex = index;
		}
		if(rightChildIndex < maximumIndex && source[rightChildIndex] > source[largestIndex]){
			largestIndex = rightChildIndex;
		}
		if(largestIndex != index){
			int temp = source[index];
			source[index] = source[largestIndex];
			source[largestIndex] = temp;
			heapify(source, largestIndex, maximumIndex);	
		}
	}


}
