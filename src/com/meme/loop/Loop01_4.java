package com.meme.loop;

import java.util.Scanner;

public class Loop01_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id=1234;
		int pw=5678;
		
		//로그인 시도 총 3번 시도가능.
		//반복문 종료 후.
		//로그인이 성공했으면 "환영합니다" 출력
		//로그인 실패 시, "은행방문하세요" 출력
		
		
//		for(int i=0;i<=3;i++) {
//			System.out.println("아이디 입력");
//			int input_id = sc.nextInt();
//			System.out.println("비밀번호 입력");
//			int input_pw = sc.nextInt();
//			//로그인 성공시
//			if( id==input_id && pw==input_pw ) {
//				System.out.println("환영합니다.");
//				i=10;	
//			}						
//			else { //로그인 실패시
//				System.out.println("다시 입력");
//			}
//			if(i==3) {
//				System.out.println("은행방문하세요");
//			}
//		}
		
		/////////////////////////////////////////////////
		boolean check = false;
		for(int i=0;i<=3;i++) {
			System.out.println("아이디 입력");
			int input_id = sc.nextInt();
			System.out.println("비밀번호 입력");
			int input_pw = sc.nextInt();
			//로그인 성공시
			if( id==input_id && pw==input_pw ) {
				System.out.println("로그인성공//환영합니다.");
				check = true; //한번이라도 로그인 성공하면 true
				i=10;	
			}						
			else { //로그인 실패시
				System.out.println("다시 입력");
			}
		}
		if(check) {
			System.out.println("환영합니다2.");
		}else {
			System.out.println("은방문하세요.");
		}
		
		
		
	}
}
