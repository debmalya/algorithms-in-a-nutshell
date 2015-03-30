package com.erj.practice.util;

public class ArrayChecker {
	public static boolean isSorted(int[] source){
		for(int i = 0; i<source.length-1; i++){
			if(source[i]>source[i+1]){
				return false;
			}
		}
		return true;
	}
}
