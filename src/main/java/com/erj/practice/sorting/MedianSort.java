package com.erj.practice.sorting;

import java.util.Arrays;

public class MedianSort implements Sortable {

	@Override
	public int[] sort(int[] source) {
		int[] destination = source;
		medianSort(destination,0, source.length - 1);
		return destination;
	}

	private void medianSort(int[] source, int left, int right) {
		if(right <= left){
			return;
		}
		int midpoint = (right - left + 1)/2;
		int medianValue = selectKth(source, midpoint + 1, left, right);
		
		medianSort(source, left, left + midpoint - 1);
		medianSort(source, left + midpoint + 1, right);
	}

	private int selectKth(int[] source, int i, int left, int right) {
		// TODO Auto-generated method stub
		return 0;
	}



}
