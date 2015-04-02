package com.erj.practice.misc.math;

public class LinearAddition {

	public static void add(int[] a, int[] b, int[] sum) {
		int position = a.length-1;
		int carry = 0;
		while(position >= 0){
			int total = a[position] + b[position] + carry;
			sum[position+1] = total % 10;
			if (total > 9){
				carry = 1;
			}else{
				carry = 0;
			}
			position--;
		}
		sum[0] = carry;
	}
}
