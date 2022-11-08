package org.joonzis.ex.commentary;

public class Ex02_LocalMain {

	public static void main(String[] args) {
		
		Ex02_Local person1 = new Ex02_Local();
		Ex02_Local person2 = new Ex02_Local();
		Ex02_Local person3 = new Ex02_Local();

		person1.setLocalinfo("아빠", 70, "555555-1231234");
		person2.setLocalinfo("카말", 50, "777777-7885643");
		person3.setLocalinfo("에일리언", 300);
		
		person1.output();
		System.out.println("---------------------------");
		person2.output();
		System.out.println("---------------------------");
		person3.output();
	}

}
