package logicprograms;
import java.util.Scanner;

public class SumAndProdInDigit {

	

			public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number");
			int n = sc.nextInt();
			int sum=0,prod=1,rem;
			
			while(n>0) {
				rem=n%10;
				sum+=rem;
				prod*=rem;
				n=n/10;
			}
		
			System.out.println("sum of given digit is : "+sum);
			System.out.println("product of given digit is : "+prod);
			
			sc.close();
		}
	

}
