package org.joonzis.ex.commentary;

public class Ex04_Triangle {

	// Field
	int width;
	int height;
	
	// Method
	
	void setFields(int w, int h) {
		width = w;
		height = h;
	}
	// 아래 두 calcArea 메소드가 오버로딩 되지 않는 이유
	//	-> 메소드 명은 같으나, 매개변수가 다르지않다!!(매개변수가 같다.)
	int calcArea() {					// 일부러 오류냄!
		return width*height / 2;
	}
	double calcArea() {
		return width*height / 2.0;
	}
}
