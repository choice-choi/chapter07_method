package org.joonzis.test;


public class CarMain {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.setFields("소나타", "white");
		myCar.output();
		
		System.out.println("-------------");
		
		myCar.setFields("아반떼",	"red", 2010);
		myCar.output();		
	}
}
