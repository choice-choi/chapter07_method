package org.joonzis.test;

public class Dog {
	String name, breed;
	int age;

	void setDog(String n, int a) {
		name = n;
		age = a;
		breed = "푸들";
	}

	void setDog(String n, int a, String b) {
		name = n;
		age = a;
		breed = b;
	}

	void info() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("품종 : " + breed);
	}
}
