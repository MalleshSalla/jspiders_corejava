package com.arrays.examples;

public class Array2DExample {

	public static void main(String[] args) {
		int[][] arr = new int[][] {
			{1,1,1,1,1},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,1,1,1,1},
			{1,0,0,0,1},
			{1,0,0,0,1},
			{1,0,0,0,1},
		};
		for (int i = 0; i < arr.length; i++) {
			int[] row = arr[i];
			for (int j = 0; j < row.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("__________");
		System.out.println();
		for (int[] ele : arr) {
			for (int is : ele) {
				if (is==1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}	
	}

}
