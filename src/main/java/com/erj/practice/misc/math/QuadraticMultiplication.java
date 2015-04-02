package com.erj.practice.misc.math;

public class QuadraticMultiplication {

	public static void mult(int[] a, int[] b, int[] result) {
		int position = result.length-1;
		for (int i = 0; i<result.length; i++){
			result[i] = 0;
		}
		for(int m = a.length-1; m >= 0; m--){
			int offset = a.length-1-m;
			for(int n = b.length-1; n >= 0; n--, offset++){
				int product = a[m]*b[n];
				result[position-offset] += product % 10;
				result[position-offset-1] += result[position-offset]/10 + product/10;
				result[position-offset] %= 10;
			}
		}
		
	}

}
