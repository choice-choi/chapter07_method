package org.joonzis.test;

import org.joonzis.ex.Ex01_Rect;

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

public class CarMain {

	public static void main(String[] args) {
		// 캘린더로 객체 만들고 캘린더 겟 메소드 만들 것 이걸 어디에 대입해서 현재 년도 만들기
		
		Car myCar = new Car();
		
//		답1_ 현재년도 나오는 답)
		myCar.setFields("a3", "purple");
		myCar.output();
		
		System.out.println("==============================");
		
//		답2)
//		myCar.setFields("a3", "purple", 2010 );		
//		myCar.output();
		
		

	}

}
