package logicprograms;

import java.util.Scanner;

public class FibonaciiSequence {

	public static void main(String[] args) {
//		0, 1, 1, 2, 3, 5, 8, 13, 21, 34

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		int n1=0,n2=1,sum=0;
		System.out.print(n1+" "+n2);
		
		for (int i = 2; i < n; i++) {
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}
		sc.close();
	}

}
