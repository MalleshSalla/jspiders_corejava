package com.arrays.examples;

import java.util.Scanner;

public class ArrayBasics {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = scan.nextInt();
		
		
		// creating Array object with elements
		double[] d = new double[size];
		System.out.println("Enter the values one by one");
		for (int i = 0; i < d.length; i++) {
			d[i] = scan.nextInt();
		}
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i] + " ");
		}
		
		
		// creating the new Array and copying the elements
		double[] d1 = new double[size];
		System.arraycopy(d, 0, d1, 0, size);
		// to print the output
		System.out.println();
		System.out.println("the elements from the new Array ");
		System.out.print("[");
		for (double e : d1) {
			System.out.print(e + ",");
		}
		System.out.println("]");
		scan.close();
	}
}
