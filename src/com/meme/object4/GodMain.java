package com.meme.object4;

public class GodMain {
	public static void main(String[] args) {
		//main에 static이 없으면 참조할 제1원인이 없음.
		
		//singleTon 디자인패턴
		
		//무조건 하나의 객체만 형성되게
//		God god1 = new God();		
//		God god2 = new God();
		
//		God god = new God(); //생성자 프라이빗. 막힘
		God god = God.getInstance();
		god.setName("유일신");
		
		System.out.println("God: "+ god);
		System.out.println("God name: "+ god.getName());
		
		god = god.getInstance();
		System.out.println("God: "+ god);
		System.out.println("God name: "+ god.getName());
		
	}
}
