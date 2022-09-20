package org.joonzis.test;

/*
Q3. 재귀함수
클래스 RecursiveCall 을 정의하시오.
- 필드  : X
- 메소드 : recursive(n) -> n번 "Hello" 출력하기
		 main
★
if-else 사용 - else 일 때 재귀 호출
*/

public class RecursiveCall {

	
	static void recursive(int n) {
		System.out.println("Hello");
		
		//나갈 조건문

		if(n==0) {
			return;
		}else {
			System.out.println("Hello");
			recursive(n-1);		// 5-1=4, 4-1=3, 3-1=2, 2-1=1...
		}
	}
	
	
	public static void main(String[] args) {
		recursive(5);	//위 n에 5가 담겨짐
		
	}

}
