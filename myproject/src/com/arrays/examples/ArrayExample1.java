package com.arrays.examples;

public class ArrayExample1 {

	public static void main(String[] args) {
		
		/*
		 * int[] arr = new int[5]; 
		 * int[] arr1 = new int[]{1,2,3,4,5,6};
		 */
		int[] arr = {101,201,301,401,501,601,701,801};
		
		// display all the elements of the array
		
		for (int i = 0; i <= arr.length-1; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("----------");
		
		// display array elements in reverse order 
		
		for (int i =arr.length-1; i>= 0; i--) {
			System.out.println(arr[i]);
		}
		
		System.out.println("----------");
		//display last 3 elements
		for (int i = arr.length-1; i>arr.length-4; i--) {
			System.out.println(arr[i]);
		}
		System.out.println("------------");
		
		// print element of an array ( excludes first and last 2 elements )
		
		for (int i = 2; i < arr.length-2; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("----------------");
		
		// forEach
		
		for (int i : arr) {
			System.out.println(i);
		}
		
		
	}

}
 