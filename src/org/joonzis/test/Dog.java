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

public class Dog {
	
	//필드
	String name, breed;
	int age;
	
	//초기화 하는 메소드 2개
	void setDog(String name2, int age2) {
//		setDog(name2,age2,"푸들");	//이 식으로 리펙토링 할 경우 아래 세문장은 작성안함
		name = name2;
		age = age2;
		breed = "푸들";		//품종받지 않음으로 '푸들' 작성
	}
	
	void setDog(String name3, int age3, String breed3) {
		
		name = name3;
		age = age3;
		breed = breed3;
	}
	
	//츌력하는 메소드
	void info() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("품종: " + breed);
	}
	

}
