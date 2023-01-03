package com.meme.loop;

import java.util.Scanner;

public class Loop01_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sec = 0;
		//학생수 입력
		//학생수 만큼 점수를 입력 받아서 
		//총합계를 출력
		
//		int student=0; //student_count 가 더 정확할 듯
//		int score=0;
//		int student_name=0;
//		int score_sum=0;
//		System.out.println("학생수 입력");
//		student=sc.nextInt();
//
//		for(;student>0;student--) {
//			System.out.println("점수 입력 (순서)");
//			score=sc.nextInt();	
//			System.out.print(score+"");
//			score_sum+=score;
//		}
//		System.out.println(score_sum);
//		System.out.println("");
///////////////////////////////////////////////////////////
	//sec이 5일 때 5,4,3,2,1 for문을 수정하지 않고 출력
		System.out.println("초를 입력하세요");
//		sec=5;
//		//sec=sc.nextInt();
//		
//		for(int i = 0; i<60; i++) { //수정 하지말것.	
//			//i=i-sec; //0-5=-5 -4 -3 -2 -1 0 1 ...59
//			sec=sec-60; //5-60= -55 -56 -57 -58...-60
//			sec=60-sec; //60-5=55 56 57..60
//			i=sec;
//			sec++;
//			//i=55, sec=56
//			System.out.println(60-i+"초");
			//i=i-sec; //

//		}
//////////////////////////////////////////////////////////////////	
		System.out.println("초를 입력하세요");
		sec=sc.nextInt();
		
		for(int i = 0; i<60; i++) { //수정 하지말것.//	
			if(sec==i) { //입력 수와 i가 같을 때	 //from.221228. 블록 안의 중복문을 사용하면 더 많은 출력가능. 
				i=59;
			}
			System.out.println(i+"초");
		}	
		System.out.println("종료");	
	
	
	
	}
}
