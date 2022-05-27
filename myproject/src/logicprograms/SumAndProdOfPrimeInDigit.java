package logicprograms;

import java.util.Scanner;

public class SumAndProdOfPrimeInDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit ");
		int n = sc.nextInt();
		int sum=0,rem,prod=1;
		while (n>0) {
			int count=0;
			rem=n%10;
			n=n/10;
			for (int i = 1; i <= rem; i++) {
				if(rem%i==0)
					count++;
			}
			if(count==2) {
				sum+=rem;
				prod*=rem;
			}
		}
		System.out.println(sum);
		System.out.println(prod);
		sc.close();
	}

}
