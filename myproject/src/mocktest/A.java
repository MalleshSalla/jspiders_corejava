package mocktest;

public class A {
	public void add(int a,int b) {
		System.out.println(" two number addition : "+(a+b));
	}
	
	public void add(int a,int b,int c) {
		System.out.println(" three number addition : "+(a+b));
	}
	
	public static void main(String[] args) {
		A obj = new A();
			obj.add(10, 10);
			obj.add(10,20,30);// non-static method overloading
	}
}
