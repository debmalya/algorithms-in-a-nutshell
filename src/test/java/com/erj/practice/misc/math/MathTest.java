package com.erj.practice.misc.math;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathTest {

	@Test
	public void integerDivideByZero() {
		int result;
		try{
			result = 1/0;
			fail("Integers can't divide by zero");
		}catch(ArithmeticException ex){
			assertEquals("/ by zero", ex.getMessage());
		}
	}
	
	@Test
	public void floatDivideByZero(){
		double result = 1/0.0;
		assertEquals(Double.POSITIVE_INFINITY,result,0.000001);
	}

}
