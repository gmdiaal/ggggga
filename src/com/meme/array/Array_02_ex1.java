package com.meme.array;

import java.util.Scanner;

public class Array_02_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1. 학생수 입력
		//2. 학생수 만큼 이름을 입력 spring, summer, winter
		//3. 학생수 만큼 학생의 번호 국어 영어 수학 입력
		//	spring 학생의 번호:
		//	spring 학생의 국어:
		//	spring 학생의 영어:
		//	자동으로 총점과 평균 계산하는 배열
		
		//모든 학생의 정보 출력
		//이름		번호	국어	영어	수학	총점	평균
		//spring	1	22	33	44

		int student_num = 0;
		int count = 0;
		String [] student_name;
		int [] student_kor; int [] student_eng;
		int [] total; double [] avg;


		
		System.out.println("학생수입력");
		student_num =sc.nextInt(); //1.학생 수 입력
		student_name = new String [student_num];				
		student_kor = new int [student_num];
		student_eng = new int [student_num];
		total = new int [student_num];
		avg = new double [student_num];
		
		//string 과목배열 1,2,3 -> kor, eng, ... stuent_kor -> 과목배열[i]
		
		for(int i=0; i<student_num;i++) {
			System.out.println( (i+1) + "번째 학생 이름, 국어점, 영어점 입력");			
			student_name [i] = sc.next(); //2.학생 수만큼 이름 입력
			student_kor [i] = sc.nextInt();	//국어
			student_eng [i] = sc.nextInt();	//영어
			
			total[i]= student_eng[i] + student_kor[i]; //총점
			avg[i]= (double)total[i]/2;
		}	

		//spring	1	22	33	44
		
		System.out.println("이름	번호	국어	영어	총점	평균");
		for(int i=0; i<student_num;i++) {
			System.out.println(student_name[i]+"\t"+(i+1)+"\t"+student_kor[i]+"\t"+student_eng[i]
					+"\t"+total[i]+"\t"+avg[i]
					);
		}
	

	}
}
