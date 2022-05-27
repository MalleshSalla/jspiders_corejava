package com.NumbersPattern;

public class TriangleNumber1 {
	public static void main(String[] args) {
		for (int i = 1; i <=4 ; i++) {
			int num=0;
			for (int j = 1; j <=i; j++) {
				num++;
				System.out.print(num);
			}
			System.out.println();
		}
	}
}
