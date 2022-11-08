package org.joonzis.ex.commentary;

// 국내에 거주 하는 사람 
public class Ex02_Local {
	
	// Field			// 초기화상태 (field값은 초기화 되어있다.)
	String name;		// null
	int age;			// 0
	String sn;			// null		//주민등록번호
	boolean isKorean;	// false	//한국인 : true  외국인 : false
	
	// Method
	void setLocalinfo(String _name, int _age, String _sn) {
		setLocalinfo(_name, _age);				// refactoring
		sn = _sn;
		isKorean = sn.charAt(7) <= '4' ? true : false;
	}
	
	void setLocalinfo(String _name, int _age) {
		name = _name;
		age = _age;
	}
	
	void output() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주민등록 번호 : " + (sn == null ? "없음" : sn));
		System.out.println(isKorean ? "한국인" : "외국인"); 
	}
}
