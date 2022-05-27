package com.patternsprograms;

public class TwoSidedArrow {
	public static void main(String[] args) {
		int space=4;
		int star=0;
		for (int i = 1; i <=7 ; i++) {
			if (i<=4) {
				space--;
				star++;
			} else {
				space++;
				star--;
			}
			for (int j = 1; j <=space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <=star ; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <=4 ; j++) {
				if (i==3||i==4||i==5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			for (int j = 1; j <=star ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
