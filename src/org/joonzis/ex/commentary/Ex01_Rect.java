package org.joonzis.ex.commentary;

/*
 * 메소드 오버로딩 (method overloading)
 *	1. 메소드 이름이 같다.
 *	2. 매개변수가 다르다.
 *	3. 리턴은 상관 없다.
 */

public class Ex01_Rect {
	
	// Field
	int width;			// 너비
	int height;			// 높이
	boolean isSquare; 	// 직사각형: false  정사각형 : true
	
	// Method
	void setFields(int w, int h) {
		width = w;
		height = h;
		isSquare = (w == h) ? true : false;
	}
	
	void setFields(int side) {
		width = side;
		height = side;
		isSquare = true;
	}
	
	int calcArea() {
		return width * height;
	}
	
	void output() {
		System.out.println("너비 : " + width );
		System.out.println("높이 : " + height );
		System.out.println("크기 : " + calcArea());
		System.out.println(isSquare ? "정사각형" : "직사각형");
	}

}
