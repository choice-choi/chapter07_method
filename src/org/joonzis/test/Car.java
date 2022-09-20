package org.joonzis.test;

import java.util.Calendar;

/*
Q1. 
클래스 Car 를 정의하시오.
- 필드 : String model,String color, int year
- 메소드 : setFields(model, color) : 올해를 year로 처리, 
		 setFields(model, color, year),
		 output()
클래스 CarMain을 정의 하시오.
★
Calendar calendar = Calendar.getInstance();
calendar.get(Calendar.YEAR);	 // 현재 년도
*/

public class Car {
	//필드 3개
	String model, color; 	//선언만 한 상태로 지금 null임, 초기화 작업하여 값을 넣어줘야 함.
	int year;				//int는 int a;만으로도 초기화 값이 생김. int a = 0;
	
	//메소드 (임의의 메소드 만들어 초기화하는 작업)
	void setFields(String model2, String color2) {
		model = model2;
		color = color2;
		
		Calendar calendar = Calendar.getInstance();		//캘린더 객체 생성
		year = calendar.get(Calendar.YEAR);
	}
	
	void setFields(String model3, String color3, int year3) {
		model = model3;
		color = color3;
		year = year3;
	}	
	

	void output() {
		System.out.println("모델명 : " + model);
		System.out.println("컬러 : " + color);
		System.out.println("연식 : " + year);		//애초에 위에서 초기화 해야하는 메소드 2개를 거쳤기 때문에 여기에 무조건 연식이 들어감. 그래서 비교할게 없으므로 이 식이 끝.
		
	}
}

		