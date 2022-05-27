package com.stringbasics;

public class Ex1 {

	public static void main(String[] args) {
		String s1 = "jsp";
		String s2= "jsp";
		
		String s3 = "JSP";
		String s4= "JSP";
		
		String s5 = new String("JSP");
		String s6= new String("JSP");
		
		System.out.println(s4==s5);
		System.out.println(s4.equals(s5));
		
		System.out.println(s1 == s2);// compares address
		System.out.println(s1.equals(s2));//comparing states
			
		System.out.println(s3==s5); // compares the address
		System.out.println(s5.equals(s6));//compares states
		
		String name1 = "jsp";
		String name2 = "qsp";
		System.out.println(name1+name2);
		System.out.println(name1);
		System.out.println(name2);
	}

}
