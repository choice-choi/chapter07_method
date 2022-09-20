package org.joonzis.ex;

// 국내에 거주하는 사람
public class Ex02_Local {
	
	// 필드				// 초기화 상채(field 값은 초기화 되어있다.)
	String name;		// null
	int age;			// 0
	String sn;			// null		// 주민등록번호
	boolean isKorean;	// false	// 한국인 : true,		외국인 : false
	
	// 메소드
	// 인적사항 입력 메소드
	void setLocalInfo(String _name, int age, String _sn) {
		//주민번호가 있냐 없냐, null이냐 아니냐 판단
		
		/* 아래와 중복이라 setLocalInfo(_name, age); 이렇게 변경 가능
		name = _name;
		this.age = age;
		 */
		
		// 두개 포함해서 두개 더
		setLocalInfo(_name, age);	// refactoring
		sn = _sn;
		isKorean = sn.charAt(7) <= '4' ? true : false;
		
	}
					// 전달받은 지역변수 name
	void setLocalInfo(String _name, int age) {
		//시리얼 넘버가 없어서 초기화 안 되니까 null로 판단
//		name = name;	//변수명 다르게 주는게 좋음, 필드의 name인지 지역변수의 name인지 구분이 안 가기 때문에
//		age = age;
		
		name = _name;
		this.age = age;	//같은 변수를 써야하는 경우에 this.은 클래스를 의미
		
		
	}
	
	void output() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주민등록번호 : " + (sn == null ? "없음" : sn));
		System.out.println(isKorean ? "한국인" : "외국인");
		
	}
	
}
