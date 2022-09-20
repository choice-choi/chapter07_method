package org.joonzis.ex;

/*
 * 재귀 호출
 * 1. 메소드가 자신을 호출할 때
 * 2. 반복문을 처리하거나 복잡한 알고리즘 처리
 * 3. 잘못 구현하면 무한 루프에 빠진다.
 */
public class Ex03_RecursiveClass {
	//필드1개, 메소드 2개
	
	
	// 필드
	static int count = 0;
	
	// 메소드
	static void recursive() {
		System.out.println("recursive() call");
		
		count++;	// if(++count == 5)랑 같으나 아래 식처럼 따로 써주기..
		if(count == 5) {
			return;	// 메소드를 빠져나갈땐 return, 반복문 벗어날 땐 break;
		}
		
		recursive();	// 자기가 자기 자신을 부르는 것			//항상 끝나는 타이밍 지정해줘야 함, 예외처리들 잘 알아두기
	}
	
	public static void main(String[] args) {
		recursive();
	}
	
	
}


