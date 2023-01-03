package com.meme.loop;

import java.util.Scanner;

public class Loop03_2 {
	public static void main(String[] args) {
		//분과 초를 입력받아서
		//해당 분 초가 되면 반복문을 모두 종료
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("분입력");
		int in_b= 1; //sc.nextInt();
		System.out.println("초입력");
		int in_s= 5; //sc.nextInt();
		
		System.out.println(in_b +" "+in_s);

		for(int b=0;b<60;b++) {
			
			for(int s=0;s<60;s++) {
				System.out.println(b+"분"+s+"초");				
				if(in_s==s&&in_b==b) {//	for문의 반복 조건에 초기식이 들어갈 경우, 필드에 변수선언을 하면 초기화가 안되서 버그남.
					System.out.println(b+"분"+s+"초");
					b=100; 
					//s=100;
					break;
				}
				
			}//안 for문
			
		}//밖 for문
		
		//System.out.println(s+" "+b);
		
	}
}
