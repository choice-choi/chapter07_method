package org.joonzis.ex;

public class Test_OperMain {

	public static void main(String[] args) {
		
		Test_Oper oper = new Test_Oper();
		
		double num1 = 100;
		double num2 = 200;
		
		oper.val1 = 100;	// 괄호 없으니 필드임
		oper.val2 = 200;
		
		oper.plus(num1, num2);	// 괄호 있으니 메소드임
		oper.minus();
		oper.multiplication();
		System.out.println(oper.division());	// 호출했고 리턴 받아왔음, 리턴 있는 메소드임
		

		
		

		
		
		
	}

}
