package com.erj.practice.misc.math;

public class LinearAdditionLast {
	public static void last(int[] a, int[] b, int[] sum){
		int position = a.length;
		int carry = 0;
		while(--position >= 0){
			int total = a[position] + b[position] + carry;
			if(total > 9){
				sum[position + 1] = total-10;
				carry = 1;
			}else{
				sum[position + 1] = total;
				carry = 0;
			}
		}
		sum[0] = carry;
	}
}
