package org.bitnick.example.challenge.test.fizzbuzz;

import static org.junit.Assert.*;
//import static org.junit.Assert.assertTrue;

import org.bitnick.example.challenge.fizzbuzz.Fizzbuzz;
import org.junit.Assert;
import org.junit.Test;

public class FizzbuzzTest {
	private final Fizzbuzz fizzbuzzTest = new Fizzbuzz();
	
	@Test
	public void returnsNumericalString() throws Exception {
		Assert.assertEquals("1", fizzbuzzTest.fizzbuzz(1));
	}
	
	@Test
	public void returnsFizzIfDivisbleBy3() throws Exception {
		Assert.assertEquals("Fizz", fizzbuzzTest.fizzbuzz(3));
		Assert.assertEquals("Fizz", fizzbuzzTest.fizzbuzz(6));
		Assert.assertEquals("Fizz", fizzbuzzTest.fizzbuzz(9));
		Assert.assertEquals("Fizz", fizzbuzzTest.fizzbuzz(12));
	}
	
	@Test
	public void returnsBuzzIfDivisbleBy5() throws Exception {
		Assert.assertEquals("Buzz", fizzbuzzTest.fizzbuzz(5));
		Assert.assertEquals("Buzz", fizzbuzzTest.fizzbuzz(10));
		Assert.assertEquals("Buzz", fizzbuzzTest.fizzbuzz(20));
		Assert.assertEquals("Buzz", fizzbuzzTest.fizzbuzz(25));
	}
	
	@Test
	public void returnsFizzBuzzIfDivisbleBy3and5() throws Exception {
		Assert.assertEquals("FizzBuzz", fizzbuzzTest.fizzbuzz(15));
		Assert.assertEquals("FizzBuzz", fizzbuzzTest.fizzbuzz(30));
		Assert.assertEquals("FizzBuzz", fizzbuzzTest.fizzbuzz(45));
		Assert.assertEquals("FizzBuzz", fizzbuzzTest.fizzbuzz(60));
	}
	
	@Test
	public void runtimeTest() throws Exception {
		for (int counter = 1; counter <=100; counter++) {
			System.out.println(fizzbuzzTest.fizzbuzz(counter));
		}
	}
}
