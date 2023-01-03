package com.meme.object1.ex1;

import java.util.Scanner;

public class Student_input {
	Scanner sc = new Scanner(System.in);
	
	//find_student
	//학생배열을 받아서 
	//학생의 번호를 입력 받아서 일치하는 학생을 return, 없으면 null
	public Student find_student (Student[] students){
		System.out.println("찾을 학생의 번호 입력");
		Student one_student = null;
		int num = sc.nextInt();
		for(int i = 0; i<students.length; i++) {
			
			if(students[num] == students[i]) {
				one_student = students[i]; //@필요없네?
				return one_student;
				//return students[i]; 
			}
			
//			else {
//				return one_student;
//			}
		}
		return one_student; //null
		
		
		
	}
	
	
	//set_student
	//학생한명 객체를 생성해서 이름 번호 국어 영어 수학 입력
	//총점평균
	public Student[] set_student (Student [] students) { //Student[]

		Student student = new Student();
		System.out.println("입력 이름 점수 순");
		student.name = sc.next();
		student.kor = sc.nextInt();
		System.out.println("이름: "+student.name + " 점수: " + student.kor);
				
		//students.length + 1 의 배열을 형성
		Student [] students_new = new Student[students.length + 1];
		
		for(int i =0; i<students.length;i++) {	//일일히 복사해야함
			students_new [i] = students[i];
		}
		
		students_new [students.length] = student; // = students_new.length-1
		
		//students = students_new;
		return students_new;
	}
	
	//set_all_students
	//매개변수로 학생배열을 받아서 
	//배열의 수 만큼 학생 객체를 생성해서 이름 번호 국어 영어 수학 입력
	//총점평균
	//학생객체를 배열에 대입
	public void set_all_students(Student [] students) {
		for(int i = 0; i< students.length; i++) {
			Student student = new Student();
			System.out.println("학생 이름, 점수 입력 차례대로");
			student.name = sc.next();
			student.kor = sc.nextInt();
			students[i]=student;
		}
		
	}
	
}
