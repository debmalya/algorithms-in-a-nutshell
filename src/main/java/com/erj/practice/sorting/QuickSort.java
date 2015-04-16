package com.erj.practice.sorting;

import com.erj.practice.util.ArrayChecker;

public class QuickSort implements Sortable {

	private int[] array;
	private int highRecursiveCalls = 0;
	private int lowRecursiveCalls = 0;

	@Override
	public int[] sort(int[] source) {
		if(source == null){
			throw new RuntimeException("The source array is null");
		}
		if(source.length == 0){
			return source;
		}
		this.array = source;
		quickSort(0, source.length-1);
		System.out.println("QuickSort: "+source.length+"\n\thighRecursiveCalls = " + highRecursiveCalls + "\n\tlowRecursiveCalls = "+ lowRecursiveCalls);
		return array;
	}

	private void quickSort(int lowIndex, int highIndex) {
		int i = lowIndex;
		int j = highIndex;
		int pivotValue = array[calculateMidpointIndex(lowIndex, highIndex)];
		
		while(i <= j){
			while(array[i] < pivotValue){
				i++;
			}
			while(array[j] > pivotValue){
				j--;
			}
			if(i <= j){
				swapValues(i, j);
				i++;
				j--;
			}
		}
		System.out.println("Sorted yet?: " + ArrayChecker.isSorted(array));
		if(lowIndex < j){
			lowRecursiveCalls++;
			quickSort(lowIndex, j);
		}
		if(i < highIndex){
			highRecursiveCalls++;
			quickSort(i, highIndex);
		}
	}

	private void swapValues(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	private int calculateMidpointIndex(int lowIndex, int highIndex) {
		return lowIndex+(highIndex-lowIndex)/2;
	}

}
