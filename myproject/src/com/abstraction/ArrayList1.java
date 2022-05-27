package com.abstraction;

public class ArrayList1 {
	private class B implements IteratorList1{
		public void add() {
			System.out.println("add method");
		}
		public void remove() {
			System.out.println("remove method");
		}
	}
	
	public IteratorList1 getObj(){
		
		IteratorList1 obj = new B();
		return obj ;
	}
}
