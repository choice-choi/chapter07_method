package org.joonzis.ex.commentary;

public class Test_OperMain {

	public static void main(String[] args) {
		
		Test_Oper oper = new Test_Oper();
		
		double num1 = 100;
		double num2 = 200;
		
		oper.val1 = 100;
		oper.val2 = 200;
		
		oper.plus(num1, num2);
		oper.minus();
		oper.multiplication();
		System.out.println(oper.division());
	}

}
