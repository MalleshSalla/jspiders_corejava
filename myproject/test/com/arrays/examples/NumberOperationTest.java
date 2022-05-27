package com.arrays.examples;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

public class NumberOperationTest {

	@Test
	void isPrimeWithPrimeTest() {
		NumberOperations obj = new NumberOperations();
		int num = 37;
		assertTrue(obj.isPrime(num));
	}
	@Test
	void isPrimeWithNotPrimeTest() {
		NumberOperations obj = new NumberOperations();
		int num = 33;
		assertFalse(obj.isPrime(num));
	}
	@Test
	void isPrimeWithEvenPrimeTest() {
		NumberOperations obj = new NumberOperations();
		int num = 2;
		assertTrue(obj.isPrime(num));
	}
	@Test
	void isPrimeWithNegNumberTest() {
		NumberOperations obj = new NumberOperations();
		int num = -33;
		assertFalse(obj.isPrime(num));
	}
	
	@Test
	void isPrimeWithZeroTest() {
		NumberOperations obj = new NumberOperations();
		int num = 0;
		assertFalse(obj.isPrime(num));
	}
	@Test
	void primeCountRangeTest() {
		int lb=1;
		int ub = 20;
		int expected = 8;
		NumberOperations obj = new NumberOperations();
		int actual =obj.countPrimeInRange(lb,ub);
		assertEquals(expected,actual);
	}

}
