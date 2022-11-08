package org.joonzis.test;

import java.util.Calendar;

public class Car {
	// 필드
	String model, color;
	int year;

	// 메소드
	void setFields(String model, String c) {
		this.model = model;
		color = c;
		Calendar calendar = Calendar.getInstance();
		year = calendar.get(Calendar.YEAR);
	}

	void setFields(String m, String c, int y) {
		model = m;
		color = c;
		year = y;
	}
	
	void output() {
		System.out.println("모델명 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("연식 : " + year);
	}
	
	

}
