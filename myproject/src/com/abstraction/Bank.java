package com.abstraction;

public class Bank {
	private class Sbi implements Atm{
		public void deposite() {
			System.out.println("Money is deposite");
		}
		public void withdraw() {
			System.out.println("Money is withdraw");
		}
	}
	
	public Atm getBank() {
		return new Sbi();
	}
}
