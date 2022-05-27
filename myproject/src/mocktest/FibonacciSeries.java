package mocktest;

import java.util.Scanner;


public class FibonacciSeries {

	/*
	 * public static void main(String[] args) { Scanner sc = new Scanner(System.in);
	 * System.out.println("Enter the first and second values"); int n1 =
	 * sc.nextInt(); int n2 = sc.nextInt(); System.out.println("enter the range");
	 * int n = sc.nextInt(); int sum = 0; System.out.print(n1 + " " + n2);
	 * 
	 * for (int i = 2; i < n; i++) { sum = n1 + n2; System.out.print(" " + sum); n1
	 * = n2; n2 = sum; }
	 * 
	 * sc.close(); }
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first and second values");
		int fv = sc.nextInt();
		int sv = sc.nextInt();
		System.out.println("Enter the range");
		int n = sc.nextInt();
		int sum = 0;
		System.out.print(fv+" "+sv);
		
		for (int i = 2; i <n ; i++) {
			 sum = fv+sv;
			 System.out.print(sum+" ");
			 
			 fv=sv;
			 sv =sum;
			
		}
		
		sc.close();
		
	}

	/*
	 * name       : salla mallesh 
	 * ph no      : 9502278234 
	 * email id   : sallamallesh95@gmail.com
	 * batch code : gcca21
	 */

}
