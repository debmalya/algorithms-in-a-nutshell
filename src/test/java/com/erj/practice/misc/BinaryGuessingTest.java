package com.erj.practice.misc;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryGuessingTest {

	@Test
	public void small() {
		int high = 10;
		int numberOfGuesses = BinaryGuessing.guess(0, high);
		assertTrue("Number of guesses["+numberOfGuesses+"] is too high",  numberOfGuesses <= Math.ceil(Math.log10(high)/Math.log10(2)));
	}
	
	@Test
	public void medium() {
		int high = 10000;
		int numberOfGuesses = BinaryGuessing.guess(0, high);
		assertTrue("Number of guesses["+numberOfGuesses+"] is too high",  numberOfGuesses <= Math.ceil(Math.log10(high)/Math.log10(2)));
	}
	
	@Test
	public void large() {
		int high = 10000000;
		int numberOfGuesses = BinaryGuessing.guess(0, high);
		assertTrue("Number of guesses["+numberOfGuesses+"] is too high",  numberOfGuesses <= Math.ceil(Math.log10(high)/Math.log10(2)));
	}
	
	@Test
	public void extraLarge() {
		int high = 1000000000;
		int numberOfGuesses = BinaryGuessing.guess(0, high);
		assertTrue("Number of guesses["+numberOfGuesses+"] is too high",  numberOfGuesses <= Math.ceil(Math.log10(high)/Math.log10(2)));
	}

}
