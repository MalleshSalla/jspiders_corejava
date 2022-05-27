package com.stringbasics;

public class Ex2 {

	public static void main(String[] args) {

		String s = "java";
		System.out.println(s.length());// 4
		
		int size = s.length();
		System.out.println(size); // 4
		
		String s1 = "JAVA";
		System.out.println(s.toUpperCase().toString());// JAVA
		
		System.out.println(s); // java
		System.out.println(s1.toLowerCase());// java
	
		char ch = s.charAt(0);
		System.out.println(ch); // j
		
		System.out.println(s.charAt(3)); // a
//		System.out.println(s.charAt(10)); // StringOutOfBoundException
		
		int index = s.indexOf('j');
		System.out.println(index);
		
		System.out.println(s.indexOf('a')); // 1
		System.out.println(s.indexOf('a',2)); // 3
		System.out.println(s.indexOf('v', 3)); // -1
		System.out.println(s.indexOf("va")); // 2
		System.out.println(s.indexOf("va",3));  // -1
	}

}
