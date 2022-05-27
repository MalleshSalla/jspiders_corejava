package com.objectmethods;

public class User {

	public static void main(String[] args) {
		A obj = new A(10,20);
		A obj1 = new A(10,20);
		
		System.out.println(obj.equals(obj1));
		System.out.println(obj1.equals(obj));
	}
}
