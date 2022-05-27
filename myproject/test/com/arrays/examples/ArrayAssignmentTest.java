package com.arrays.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArrayAssignmentTest {

	
	private ArrayAssignment obj;
	
	@BeforeEach
	void beforeEach() {
		obj = new ArrayAssignment();
	}
	
	@Test 
	@DisplayName("Occurence of key with existing key")
	void ocurenceOfKeyWithValidKey() {
		int[] inputArr = {1,2,3,4,5,6,7,8,1,2,3,5,4,5};
		int key = 5;
		int expected = 3;
		int actual  = obj.occurenceOfKey(inputArr,key);
		assertEquals(expected,actual);
	}
	@Test 
	@DisplayName("Occurence of key with out existing key")
	void ocurenceOfKeyWithoutValidKey() {
		int[] inputArr = {1,2,3,4,5,6,7,8,1,2,3,5,4,5};
		int key = 15;
		int expected = 0;
		int actual  = obj.occurenceOfKey(inputArr,key);
		assertEquals(expected,actual);
	}
	@Test 
	@DisplayName("Occurence of key with null Array")
	void ocurenceOfKeyWithNullArray() {
		int[] inputArr = null;
		int key = 5;
		int expected = 0;
		int actual  = obj.occurenceOfKey(inputArr,key);
		assertEquals(expected,actual);
	}
	@Test 
	@DisplayName("Occurence of key with empty array")
	void ocurenceOfKeyWithEmptyArray() {
		int[] inputArr = {};
		int key = 5;
		int expected = 0;
		int actual  = obj.occurenceOfKey(inputArr,key);
		assertEquals(expected,actual);
	}
}
