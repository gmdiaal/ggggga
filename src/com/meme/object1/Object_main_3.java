package com.meme.object1;

import java.util.Scanner;

public class Object_main_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생수를 입력하세요");
		int count = sc.nextInt();//2
		//Student student = null;
		
		Student [] students = new Student[count];
		Student [] student2 = new Student[count];
		
		for(int i = 0; i<students.length;i++) {
			Student student = new Student();
			System.out.println(i+1 + "번째 학생의 이름");
			student.name = sc.next();
			students [i] =student;
		}
		
		for(int i = 0; i<students.length;i++) {
			System.out.println(students[i].name);
		//	System.out.println(student2[i].name); //heap 영역에 0번주소 1번주소에
			//배열임으로 자동으로 null로 초기화 됨. //0 번주소의 name을 꺼내올려 했더니 null.name이 	없음.
		}

		System.out.println("finish");
	}
}
