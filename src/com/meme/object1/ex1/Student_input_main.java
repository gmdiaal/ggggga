package com.meme.object1.ex1;

import java.util.Scanner;

public class Student_input_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		Student_input input = new Student_input();
		
//		Student student = new Student();
//		input.set_student(student);
//		System.out.println(student.name);
//		System.out.println(student.kor); //배열의 값들은 다 reference
		
		
		System.out.println("학생수 입력");
		int count = sc.nextInt();
		Student []students = new Student[count];
		input.set_all_students(students);
		
		for(int i = 0; i< students.length; i++) {
			System.out.print(i+1 +"번째 학생이름:"+ students[i].name +", 점수: " + students[i].kor );
			System.out.println(); //배열의 값들은 다 reference
		}
		
		
		
		
		
	}
}
