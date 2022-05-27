package mocktest;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Digit");
		int n = sc.nextInt();
		int oddSum = 0, rem,evenSum=0;

		while (n > 0) {
			if (n % 2 != 0) {
				rem = n % 10;
				oddSum = oddSum + (rem * rem * rem);
			}
			if(n%2==0) {
				rem = n%10;
				evenSum= evenSum + (rem * rem * rem);
			}
			n = n / 10;
		}
		System.out.println("sum of given cube of odd digit is : " + oddSum);
		System.out.println("sum of given cube of even digit is :"+evenSum);

		sc.close();
	}
}

/*
 * name       : salla mallesh 
 * ph no      : 9502278234 
 * email id   : sallamallesh95@gmail.com
 * batch code : gcca21
 */
