package org.joonzis.ex;

public class Ex02_LocalMain {

	public static void main(String[] args) {

		Ex02_Local person1 = new Ex02_Local();
		person1.setLocalInfo("무하마드", 52);
		person1.output();
		
//		sn, isKorean 언급 안 해서 
//		주민등록번호 : 없음
//		외국인
//		노출되고 있음
		
		System.out.println("==================");
		
		Ex02_Local person2 = new Ex02_Local();
		person2.setLocalInfo("홍길동", 100, "999999-1111111");
		person2.output();
		
		
		

	}

}
