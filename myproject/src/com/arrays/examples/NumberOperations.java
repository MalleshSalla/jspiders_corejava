package com.arrays.examples;

public class NumberOperations {
	

	
//	Check the given numbers is prime
//	Generate prime numbers in the range
//	Print first N prime numbers
//	Count numbers of primes in the given range
//	Get all prime numbers in the given range
	
	public boolean isPrime(int num) {
		if (num<2 || (num%2==0 && num!=2)) 
			return false;
		for (int i = 2; i <=(int)Math.sqrt(num); i++) {
			if (num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public int countPrimeInRange(int lb,int ub) {
		int count = 0;
		for(int i = lb; i<=ub ;i++) {
			if (isPrime(i)) {
				count++;
			}
		}
		return count;
	}
	public int[] getPrimeInRange(int lb,int ub) {
		int n = countPrimeInRange(lb,ub);
		int[] arr = new int[n];
		int j=0;
		for (int i = lb; i <=ub; i++) {
			if (isPrime(i)) {
				arr[j++]=i;
			}
		}
		return arr;
		
	}
	
	public static void main(String[] args) {
		
		NumberOperations obj = new NumberOperations();
	
		System.out.println(obj.isPrime(2));
		
		System.out.println(obj.isPrime(-2));
		
		System.out.println(obj.isPrime(20));
		
		System.out.println(obj.isPrime(37));
		
		System.out.println(obj.isPrime(-37));
		
		System.out.println(obj.isPrime(0));
		
		System.out.println(obj.isPrime(1));
	
	}
}
