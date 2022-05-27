package mocktest;

import java.util.Scanner;

public class PrimeNumberInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range to find prime numbers");
		int m = sc.nextInt();
		int n = sc.nextInt();
		primeInRange(m, n);
		sc.close();
	}

	public static void primeInRange(int m, int n) {
		for (int i = m; i <= n; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i);
			}
		}
	}

	/*
	 * public static void main(String[] args) { Scanner sc = new Scanner(System.in);
	 * System.out.println("Enter the Range to print Prime numbers"); int lb =
	 * sc.nextInt(); int ub = sc.nextInt(); for (int i = lb; i <= ub; i++) { int
	 * count = 0; for (int j = 1; j <= i; j++) { if (i % j == 0) { count++; } } if
	 * (count == 2) { System.out.print(i + ","); } } }
	 */

}
/*
 * name : salla mallesh ph no : 9502278234 email id : sallamallesh95@gmail.com
 * batch code : gcca21
 */
