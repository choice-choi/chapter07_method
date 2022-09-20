package org.joonzis.ex;

public class Ex01_Rect {
	//필드
	int width;			// 너비
	int height;			// 높이
	boolean isSquare;	// 정사각형 : true;		직사각형 : false

	// 메소드		>>어떠한 메소드는 무조건 초기화
	// 너비 높이 입력 메소드
	// 1. 너비, 높이를 둘 다 받을 때
	// 2. 너비, 높이 중 하나만 받을 때 
	void setFields(int w, int h) {
		// 조건1) 가로 세로 같으면 정사각형
		width = w;
		height = h;
		
		if(w==h) {
			isSquare = true;
		}
	}
	void setFields(int side) {
		width = side;
		height = side;
		isSquare = true;
		
		//메인 객체 2개 만들어보기
		
		/*
		// 무조건 width와 height는 같은 값이니까 if문 사용할 필요 없음
		if(width == height) {
			isSquare = true;
		*/
		}
	
	
	// 사각형 크기를 구하여 리턴하는 메소드
	int calcArea() {
		return width * height;
	}
	
	// 데이터 출력 메소드
	void output() {
		System.out.println("너비 : " + width); 
		System.out.println("높이 : " + height); 
		System.out.println("크기 : " + calcArea());		//사각형 크기를 구하여 리턴하는 메소드 부르기
		System.out.println(isSquare ? "정사각형" : "직사각형");		//if문으로도 변형 가능
	}
	
	
	
	
	
	
}
