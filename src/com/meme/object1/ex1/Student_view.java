package com.meme.object1.ex1;

import java.util.Scanner;

public class Student_view {
	//view_list
	//학생들을 받아서 학생의 모든 정보를 출력.
	public void view (Student [] sts) {
//		Scanner sc = new Scanner(System.in);
//		Student st = new Student();
		for(int i =0; i<sts.length;i++) {
			
			Student student = sts[i];
			
			this.view(student);

		}	//student[] 배열의 배열을 student 배열에 넣어 출력하는 경우.
		
//		for(int i =0; i<sts.length;i++) { System.out.println("학생이름: "+ sts[i].name +" 점수: "+ sts[i].kor);	}		
	}
	
	
	//view_one
	//학생 한명을 받아서 학생의 모든 정보를 출력
	public void view(Student student) {
		System.out.println(student.name);
		System.out.println(student.kor);
		
//		System.out.println(st.total);
//		System.out.println(st.avg);
	}
}
