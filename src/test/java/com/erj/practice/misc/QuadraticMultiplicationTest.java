package com.erj.practice.misc;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuadraticMultiplicationTest {

	@Test
	public void addSmallArrays() {
		int[] a = new int[]{0};
		int[] b = new int[]{1};
		int[] result = new int[Math.max(a.length, b.length) + 1];
		
		QuadraticMultiplication.mult(a, b, result);
		
		assertEquals(0, result[1]);
	}

}
