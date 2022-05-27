package com.patternsprograms;

public class ReverseTriangle {

	public static void main(String[] args) {
		int star=6;
		
		for (int i = 1; i <= 5; i++) {
			star--;
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
				
	}

}
