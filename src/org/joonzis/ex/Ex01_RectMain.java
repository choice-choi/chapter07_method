package org.joonzis.ex;

public class Ex01_RectMain {

	public static void main(String[] args) {
		//메소드 로딩
		Ex01_Rect rec1 = new Ex01_Rect();
		rec1.setFields(13, 15);
		rec1.output();
		
		System.out.println("==============================");
		
		Ex01_Rect rec2 = new Ex01_Rect();
		rec2.setFields(20);
		rec2.output();

	}

}


