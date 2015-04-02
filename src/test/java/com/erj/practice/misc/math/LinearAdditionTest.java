package com.erj.practice.misc.math;

import static org.junit.Assert.*;

import org.junit.Test;

import com.erj.practice.misc.math.LinearAddition;

public class LinearAdditionTest {

	@Test
	public void addSmallArrays() {
		int[] a = new int[]{0};
		int[] b = new int[]{1};
		int[] sum = new int[Math.max(a.length, b.length) + 1];
		
		LinearAddition.add(a, b, sum);
		
		assertEquals(1, sum[1]);
	}
	
	@Test
	public void addLargerArrays() {
		
		int[] a = new int[]{0,1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1,0};
		int[] b = new int[]{9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9};
		int[] sum = new int[Math.max(a.length, b.length) + 1];
		
		LinearAddition.add(a, b, sum);
		
		//1,012,345,678,909,876,543,209
		assertEquals(9, sum[21]);
		assertEquals(0, sum[20]);
		assertEquals(2, sum[19]);
		assertEquals(3, sum[18]);
		assertEquals(4, sum[17]);
		assertEquals(5, sum[16]);
		assertEquals(6, sum[15]);
		assertEquals(7, sum[14]);
		assertEquals(8, sum[13]);
		assertEquals(9, sum[12]);
		assertEquals(0, sum[11]);
		assertEquals(9, sum[10]);
		assertEquals(8, sum[9]);
		assertEquals(7, sum[8]);
		assertEquals(6, sum[7]);
		assertEquals(5, sum[6]);
		assertEquals(4, sum[5]);
		assertEquals(3, sum[4]);
		assertEquals(2, sum[3]);
		assertEquals(1, sum[2]);
		assertEquals(0, sum[1]);
		assertEquals(1, sum[0]);
	}
}
