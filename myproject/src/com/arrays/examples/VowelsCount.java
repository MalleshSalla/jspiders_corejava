package com.arrays.examples;

import java.util.Scanner;

public class VowelsCount {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		
		int size = scan.nextInt();
		char[] ch = new char[size];
		System.out.println("Enter the charecters one by one");
		for (int i = 0; i < ch.length; i++) {
			ch[i] = scan.next().charAt(0);
		}
		
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			switch (ch[i]) {
			case 'a':
			case 'B':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				count++;
				
			}
		}
		System.out.println("The number of vowel in the charecter array is "+count);
		scan.close();
	}

}
