package com.erj.practice.main.no.tests;

public class InfiniteRecursionThatExplodes {
	public static void main(String[] args) {
		int result = f(1);
	}
	
	public static int f(int i){
		System.out.println(i);
		return f(i+1);
	}
}
