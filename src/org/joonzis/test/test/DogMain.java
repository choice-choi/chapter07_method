package org.joonzis.test;

public class DogMain {
	public static void main(String[] args) {
		Dog myDog = new Dog();
		
		myDog.setDog("뽀삐", 3, "말티즈");
		myDog.info();
		
		System.out.println("----------------");
		
		myDog.setDog("개멍멍", 10);
		myDog.info();
	}
}
