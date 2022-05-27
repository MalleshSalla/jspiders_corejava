package com.arrays.examples;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class PalindromeOrNot {

	public static void main(String[] args) {
		int[] arr = getArrayElement(3);
		
//		for (int i : arr) {
//			System.out.print(i);
//		}
		/*
		 * System.out.print("[");
		 *  for (int i = 0; i < arr.length; i++) {
		 *   if (i<arr.length-1) { 
		 *    System.out.print(arr[i]+ ", "); 
		 *    } else {
		 * 		System.out.print(arr[i]); }
		 * 
		 * } System.out.print("]");
		 */
		System.out.println(Arrays.toString(arr));

	}

	private static int[] getArrayElement(int n) {
		int[] randomArr = new int[6];
		for (int i = 0; i < randomArr.length; i++) {
			randomArr[i] = ThreadLocalRandom.current().nextInt(1,9);
		}
		return randomArr;
	}

}
