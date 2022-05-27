package com.patternsprograms;

public class DiamondInpattern {
	public static void main(String[] args) {
		int star=3;
		int space=-1;
		for (int i = 1; i <=5 ; i++) {
			if (i<=3) {
				star--;
				space+=2;
			} else {
				star++;
				space-=2;
			}
			for (int j = 1; j <= star ; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <=space ; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star ; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}
