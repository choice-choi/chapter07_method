package org.joonzis.ex.commentary;

/*
 * 재귀 호출 (recursive call)
 * 	1. 메소드가 자신을 호출할  때
 * 	2. 반복문을 처리하거나 복잡한 알고리즘 처리
 * 	3. 잘못 구현하면 무한 루프에 빠진다.
 */

public class Ex03_RecursiveClass {
	// Field
	static int count = 0;
	
	// Method
	// 재귀 호출로 반복문 형식 사용
	static void recursive() {
		System.out.println("recursive() call");
		if(++count == 5) {
			return;			// recursive 메소드 종료
		}
		recursive();		// 자기가 자기 자신을 부르는 것 : 재귀 호출 (recursive call)
	}
	
	public static void main(String[] args) {
		recursive();
	}

}
