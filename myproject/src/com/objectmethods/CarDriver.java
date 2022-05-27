package com.objectmethods;

public class CarDriver {

	public static void main(String[] args) {
		Car car = new Car("Tata",80.0,23.4);
		Car car1 = new Car("Tata",80.0,23.4);
		
		// equals() -> actually equals method compares address of an object
		// but we override the the method to compare properties of an object
		
		System.out.println(car.equals(car1));
		System.out.println(car1.equals(car));
	}
}