package com.objectmethods;

public class Car {
	String brandName;
	double topSpeed;
	double milage;
	public Car(String brandName, double topSpeed, double milage) {
		this.brandName = brandName;
		this.topSpeed = topSpeed;
		this.milage = milage;
	}
	
	public boolean equals(Object obj) {
		Car temp = ((Car)obj);
		
		return this.brandName==temp.brandName&&
			this.topSpeed==temp.topSpeed&&this.milage==temp.milage;
	}
}
