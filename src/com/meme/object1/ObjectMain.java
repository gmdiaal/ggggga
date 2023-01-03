package com.meme.object1;

public class ObjectMain {
	public static void main(String[] args) {
		System.out.println("start");
		//main은 프로그램을 실행목적
		//test 목적
		//main은 어느 클래스 안에 있던지 상관 없음.
		
		//학생한명 생성
		//객체 생성
		//변수 선언과 거의 동일
		//클래스명 변수명 = new 클래스명(); //변수선언과 = 객채생성 //객채를 변수에 담아라.
		Student student;
		student = new Student();
		student.num= 20;
		//student.name="test";
		//null은 reference 타입의 초기값임.
		System.out.println(student.name);
		System.out.println(student);
		System.out.println(student.num);
		System.out.println(student.avg);
		//배열과 마찮가지로 heap에 만들어진 얘들은 초기화가 자동임.
		
		//학생객체2 생성
		Student student2 = new Student();
		student2.name ="iu";
		student2.num =30;
		System.out.println(student==student2);
		
		student=student2;
		System.out.println(student.name);
		System.out.println(student2);
		System.out.println(student);

		student.name = "winter";
		System.out.println(student2.name); //얕은복사.
		
		//garbage collector //c언어에서는 참조가 없어진 heap영역을 지웟어야 했다.
		
		System.out.println("finish");
	}
}
