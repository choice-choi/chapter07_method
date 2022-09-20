package org.joonzis.ex;

public class Ex04_Triangle {

	int width;
	int height;
	
	void setFields(int w, int h) {
		width = w;
		height = h;
	}
	
	// 메소드 명칭 똑같이 쓰려고 하는 메소드 오버로딩
	
	// 아래 두 calcArea 메소드가 오버로딩 되지 않는 이유
	// 메소드 오버로딩은 매개변수의 수나 순서 타입에 의해서 변형 됨 -> 매개변수가 다르지 않기 때문에 (리턴 타입은 중요하지 않다)
	int calcArea() {
		return width * height / 2;
	}
	
	double calcArea() {
		return width * height / 2;
	}
}

	//메인을 보여주면 다른 서브 클래스인지 판단해보기

