package logicprograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		armstrong(153);
		armstrongInRange(10,1000);// 153 370 371 407 
		
	}
	
	public static void armstrong(int n) {
		int temp=n;
		int rem,res=0;
		while (n!=0) {
			rem=n%10;
			res=res+(rem*rem*rem);
			n=n/10;
		}
		if (temp==res) {
			System.out.println(temp+" is a Armstrong number");
		} else {
			System.out.println(temp+" is not a Armstrong number");
		}
	}
	
	public static void armstrongInRange(int a,int b) {
		
		for (int i = a; i <=b; i++) {
			int n=i,temp=n;
			int res=0;
			
			while (n>0) {
				int rem=n%10;
				res=res+(rem*rem*rem);
				n=n/10;
			}
			if (temp==res) {
				System.out.print(i+" ");
			}
		}
	}

}
