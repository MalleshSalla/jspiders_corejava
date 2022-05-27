package com.abstraction;

public class UserLogic {
	public static void main(String[] args) {
		Bank obj = new Bank();
		
		Atm a = obj.getBank();
		a.deposite();
		a.withdraw();
	}
}
