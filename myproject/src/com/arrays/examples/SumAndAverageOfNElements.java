package com.arrays.examples;

import java.util.Scanner;

public class SumAndAverageOfNElements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int n=sc.nextInt();
		
		//score 10
		int[] scores = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the studet "+(i+1)+" score :");
			scores[i] = sc.nextInt();
		}
		// calculate - sum and average
		
		int sum =0;
		float avg = 0f;
		for (int ele : scores) {
			sum+=ele;
		}
		avg = sum/scores.length;
		System.out.println("The sum is :"+sum);
		System.out.println("The Avg is :"+avg);
		
		sc.close();
	}

}
