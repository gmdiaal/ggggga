package com.meme.object1.ex1;

import java.util.Scanner;

public class Student_view {
	//view_list
	//학생들을 받아서 학생의 모든 정보를 출력.
	public void view_list (Student [] sts) {
//		Scanner sc = new Scanner(System.in);
//		Student st = new Student();
//		for(int i =0; i<sts.length;i++) {
//			
//			Student student = sts[i];
//			
//			System.out.println(i+1 +"번째 학생이름:");
//	//		st.name = sc.next();
//	//		sts[i].name = st.name;
//			System.out.println(i+1 +"번째 학생점수:");
//	//		st.kor = sc.nextInt();
//	//		sts[i].kor = st.kor;			
//		}	//student[] 배열의 배열을 student 배열에 넣어 출력하는 경우.
		
		for(int i =0; i<sts.length;i++) { System.out.println("학생이름: "+ sts[i].name +" 점수: "+ sts[i].kor);	}		
	}
	
	
	//view_one
	//학생 한명을 받아서 학생의 모든 정보를 출력
	public void view_one(Student st) {
		System.out.println(st.name);
		System.out.println(st.kor);
		
//		System.out.println(st.total);
//		System.out.println(st.avg);
	}
}
