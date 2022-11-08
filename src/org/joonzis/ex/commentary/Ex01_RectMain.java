package org.joonzis.ex.commentary;

public class Ex01_RectMain {

	public static void main(String[] args) {
		 
		// 1. 객체(인스턴스) 생성
		Ex01_Rect nemo1 = new Ex01_Rect();	// 디폴트 생성자 : java 자체에서 자동으로 만들어줬음
		Ex01_Rect nemo2 = new Ex01_Rect();
		
		// 2. 메소드 호출
		nemo1.setFields(3, 4);		// 메소드 오버로딩  
		nemo2.setFields(3);		
		
		nemo1.output();
		System.out.println("-----");
		nemo2.output();
	}

}
