package com.erj.practice.misc.math;

public class BinaryGuessing {
	
	public static int guess(int low, int high){
		int target = (int)(Math.random()*10000000);
		int turns = 0;
		while ((high - low) >= 2){
			turns++;
			int mid = (low + high)/2;
			if(mid == target){
				return turns;
			}else if (mid < target){
				low = mid + 1;
			}else{
				high = mid - 1;
			}
		}
		return 1 + turns;
	}
}
