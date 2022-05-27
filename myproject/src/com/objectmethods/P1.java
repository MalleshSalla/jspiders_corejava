package com.objectmethods;

public class P1 {
	int i=10;
	
	public String toString() {
		return " Idiot ";
	}
	
	public static void main(String[] args) {
		P1 obj = new P1();
		
		System.out.println(obj);
		System.out.println(obj.toString());
	}
}
