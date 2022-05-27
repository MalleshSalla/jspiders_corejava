package logicprograms;

public class PrimeNumber {

	public static void main(String[] args) {

		primeInRange(10, 20);// the prime numbers in b/w range

		isPrime(4);// check prime or not

		primeCount(10, 100);

	}

	public static void isPrime(int num) {

		boolean isPrime = true;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(num + " is a prime number ");
		} else {
			System.out.println(num + " is not a prime number ");

		}
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

	public static void primeCount(int m, int n) {
		int count = 0;
		int lb = m, ub = n;
		for (int l = lb; l <= ub; l++) {
			int num = l;
			boolean isPrime = true;

			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					isPrime = false;

					break;
				}
			}
			if (isPrime) {
				System.out.print(num + " ");
				count++;
			}
		}
		System.out.println("\nThe prime number count is: " + count);
	}

}
