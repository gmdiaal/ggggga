package com.meme.object1.ex1;

import java.util.Scanner;

public class Menu_controller {

	
	//start
	//1. 등록
	//2. 수정
	//3. 삭제
	//4. 종료
	public void menu_4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생수를 입력하세요");
		int count = sc.nextInt();
		Student [] students = new Student [count];
		Student_input input_st = new Student_input();
		Student_view student_view = new Student_view();
		
		
		int menu = 0;
		
		while(menu!=5) {
			System.out.println("1. 학생정보입력 2. 학생 검색 정보 출력 3. 학생 전체 정보 출력 4. 학생 추가 5. 종료");	
		menu = sc.nextInt();
		switch(menu) {
		case 1:
			System.out.println("학생정보입력");
			input_st.set_all_students(students);
			break;
		case 2:
			System.out.println("학생 검색 정보 출력");
			//널이 아니면 보내고 //null이면 없읍니다 출력
			// 학생찾기 출력 
			Student student = new Student();
			student = input_st.find_student(students);
			if(student != null) {
				student_view.view(student);
			}else{System.out.println("찾는 학생이 없습니다.");};
			
			
			break;
		case 3:
			System.out.println("학생 전체 정보 출력");
			student_view.view(students);
			break;
		case 4:
			System.out.println("학생 추가");
			students = input_st.set_student(students);
			//input_st.set_student(students);
			break;
		default:
			System.out.println("종료");
			break;
			}//switch문 out
		}
		
		///////////////
//		boolean check=true;
//		while (check) {
//			switch(menu) {
//			case 1:
//				System.out.println("등록됨");
//				break;
//			case 2:
//				System.out.println("수정됨");
//				break;
//			case 3:
//				System.out.println("삭제됨");
//				break;
//			default:
//				System.out.println("종료");
//				check = false
//				break;
//				}//switch문 out
//			if(menu==4) {break;}
//		}
		
	}//menu method out

}
