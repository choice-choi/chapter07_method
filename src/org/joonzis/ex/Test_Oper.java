package org.joonzis.ex;

public class Test_Oper {


	
	// 필드 2개
	double val1;
	double val2;
	


	// 메소드 4개
	void plus(double num1, double num2) {
		System.out.println(num1+num2);
	}
	
	void minus() {
		System.out.println(val1-val2);	//매개변수가 없어서 val1,va2임. 메인에서 초기화해줌
	}
	
	void multiplication() {
		System.out.println(val1*val2);
	}
	
	//void는 리턴타입 안되니까 return 타입은 그에 맞는 데이터 타입 설정하기
	double division() {
		return val1/val2;			//메인이 출력하고 있어서 이곳에서 return val1/val2; 할 필요가 없다. 
	}
	
	

	
	
		
	
	
	
	
	
	
}
