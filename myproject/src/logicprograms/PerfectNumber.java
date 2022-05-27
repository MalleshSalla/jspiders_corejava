package logicprograms;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int temp = n;
		int sum=0;
		
		for (int i = 1; i <= n/2; i++) {
			if (n%i==0)
				sum+=i;
		}
		if (sum==temp) {
			System.out.println(temp+ " is perfect number");
		} else {
			System.out.println(temp+" is not a perfect number");
		}
		
		
		sc.close();

	}

}
