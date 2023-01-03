package com.meme.loop;

import java.util.Scanner;

public class Loop_while02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean check = true;

		while(check) {	//while을 true(상수)로 두면 break문 밖에..
			System.out.println("1.짜장 2.짬뽕 4.프로그램종료");
			int select = scanner.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("짜장");
				break;
			case 2:
				System.out.println("짬뽕");
				break;
			case 3:
				System.out.println("탕수");
				break;
			default:
				System.out.println("종료");
				check=false;
				break;
			}
			
			System.out.println("프로그램을 종료합니다");
			
		}//while문 나가기
	
	}
}
