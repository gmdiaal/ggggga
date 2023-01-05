package com.meme.accessModifier;

public class Member_main {

	public static void main(String[] args) {
		Member member = new Member();

		member.setAge(30); //외부에 있는 데이터를 내부로 전달해 주자
		member.setKi(170);
		member.setMuge(100);
		member.info();
		
//		member.name = "iu";
//		int age = 0;
//		if(age>0 || age<200) {
//			member.age=age;
//		}
//		
//		member.age=5500;
		
		
	}
}
