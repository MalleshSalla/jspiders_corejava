package com.arrays.examples;

public class ArrayAssignment {

	
	public int occurenceOfKey(int[] arr,int key) {
		int count = 0;
		if(arr!= null && arr.length!=0) {
			for(int ele:arr) {
				if (ele==key) {
					count++;
				}
			}
		}
		return count;
	}
}
