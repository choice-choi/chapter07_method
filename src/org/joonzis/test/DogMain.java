package org.joonzis.test;

/*
Q2.
클래스 Dog을 정의하시오.
- 필드 : String name, String breed, int age
- 메소드 : setDog(name, age) : 품종은 푸들
		setDog(name, age, breed) 
		info() - name, age, breed 출력
클래스 DogMain을 정의하시오.
*/

public class DogMain {

	public static void main(String[] args) {
		Dog myDog = new Dog();

//		myDog.name = "Pipi";
//		myDog.age = 1;
//		myDog.breed = "푸들"; 
		
//		답1)
		myDog.setDog("탐", 9);
		myDog.info();
		
		System.out.println("====================");

//		답2)
		myDog.setDog("개멍멍", 10, "푸들");
		myDog.info();
		
	}

}
