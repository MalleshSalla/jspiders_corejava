package com.arrays.examples;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class ArrayOperationTest {
	
	@Test
	public void linearSearchWithValidKeyTest() {
		ArrayOperations obj = new ArrayOperations();
		
		int[] inputArr = {2,5,10,22,25,21,89};
		int key = 22;
		int expected = 3;
		int actual = obj.linearSearch(inputArr,key);
		assertEquals(expected,actual);
 	}
	@Test
	public void linearSearchWithNotValidKeyTest() {
		ArrayOperations obj = new ArrayOperations();
		
		int[] inputArr = {2,5,10,22,25,21,89};
		int key = 99;
		int expected = -1;
		int actual = obj.linearSearch(inputArr,key);
		assertEquals(expected,actual);
 	}
	@Test
	public void linearSearchWithEmptyArrayKeyTest() {
		ArrayOperations obj = new ArrayOperations();
		
		int[] inputArr = {};
		int key = 99;
		int expected = -1;
		int actual = obj.linearSearch(inputArr,key);
		assertEquals(expected,actual);
 	}
	@Test
	public void linearSearchWithNullArrayKeyTest() {
		ArrayOperations obj = new ArrayOperations();
		
		int[] inputArr = null;
		int key = 99;
		int expected = -1;
		int actual = obj.linearSearch(inputArr,key);
		assertEquals(expected,actual);
 	}
	@Test
	public void maxElementWithPNumbers() {
		ArrayOperations obj = new ArrayOperations();
		
		int[] inputArr = {2,5,100,22,25,21,89};
		int expected = 100;
		int actual = obj.maxElement(inputArr);
		assertEquals(expected,actual);
 	}
	@Test
	public void sortTest() {
		ArrayOperations obj = new ArrayOperations();
		
		int[] inputArr = {2,5,4,3,6,1};
		int[] expected = {1,2,3,4,5,6};
		int[] actual = obj.sort(inputArr);
		assertArrayEquals(expected,actual);
 	}
	@Test
	public void sortNNumberTest() {
		ArrayOperations obj = new ArrayOperations();
		
		int[] inputArr = {-2,-5,-4,-3,-6,-1};
		int[] expected = {-6,-5,-4,-3,-2,-1};
		int[] actual = obj.sort(inputArr);
		assertArrayEquals(expected,actual);
 	}

	
}
