package com.objectmethods;

public class A {
	int i ;
	int j;
	public A(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	public boolean equals(Object obj) {
		return this.i == ((A)obj).i&&this.j==((A)obj).j;
	}

}
