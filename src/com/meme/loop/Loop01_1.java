package com.meme.loop;

import java.util.Scanner;

public class Loop01_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("start");
		System.out.println("반복문 횟수를 입력하세요.");	//@연산은 같은 타입끼리만 가능함.
		int i=0;
		int count= sc.nextInt();

		for(;i<count;i++) { //조건을 만드는데는 조건식 외에 초기값과 증감값, 3종이 영향을 줌.
			System.out.println("Hello World");
			//System.out.println("Good Bye");
			
		}
		System.out.println(i);
		
		System.out.println("finish");
	}

}
