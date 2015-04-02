package com.erj.practice.misc.math;

import static org.junit.Assert.*;

import org.junit.Test;

import com.erj.practice.misc.math.QuadraticMultiplication;

public class QuadraticMultiplicationTest {

	@Test
	public void addSmallArrays() {
		int[] a = new int[]{0};
		int[] b = new int[]{1};
		int[] result = new int[Math.max(a.length, b.length) + 1];
		
		QuadraticMultiplication.mult(a, b, result);
		
		assertEquals(0, result[1]);
	}
	
	@Test
	public void addMediumArrays() {
		int[] a = new int[]{2,2,2};
		int[] b = new int[]{1,1,1};
		int[] result = new int[a.length + b.length];
		
		QuadraticMultiplication.mult(a, b, result);
		
		assertEquals(0, result[0]);
		assertEquals(2, result[1]);
		assertEquals(4, result[2]);
		assertEquals(6, result[3]);
		assertEquals(4, result[4]);
		assertEquals(2, result[5]);
	}
	
	@Test
	public void addBiggerArrays() {
		int[] a = new int[]{1,2,3,4};
		int[] b = new int[]{5,6,7,8};
		int[] result = new int[a.length + b.length];
		
		QuadraticMultiplication.mult(a, b, result);
		
		assertEquals(0, result[0]);
		assertEquals(7, result[1]);
		assertEquals(0, result[2]);
		assertEquals(0, result[3]);
		assertEquals(6, result[4]);
		assertEquals(6, result[5]);
		assertEquals(5, result[6]);
		assertEquals(2, result[7]);
	}
	
	@Test
	public void addEvenBiggerArrays() {
		int[] a = new int[]{1,2,3,4,5};
		int[] b = new int[]{6,7,8,9,0};
		int[] result = new int[a.length + b.length];
		
		QuadraticMultiplication.mult(a, b, result);
		
		assertEquals(0, result[0]);
		assertEquals(8, result[1]);
		assertEquals(3, result[2]);
		assertEquals(8, result[3]);
		assertEquals(1, result[4]);
		assertEquals(0, result[5]);
		assertEquals(2, result[6]);
		assertEquals(0, result[7]);
		assertEquals(5, result[8]);
		assertEquals(0, result[9]);
	}

}
