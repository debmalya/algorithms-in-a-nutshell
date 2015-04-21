package com.erj.practice.util;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

public class ThrowAway {

	@Test
	@Ignore
	public void test() {
		for(int i=0; i<100; i++){
			System.out.println(100-i);
		}
	}
	
	@Test
	@Ignore
	public void testMemoryAllocationInt(){
		int size = 100000000;
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i<size;i++){
			System.out.println("Memory Allocation Test - Remaining: " + (size-i));
			list.add(i);
		}
		
		assertEquals(size, list.size());
	}

}
