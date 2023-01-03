package com.meme.loop;

public class Loop02_1 {
	public static void main(String[] args) {
		//반복문의 보조문
		//1. break;
		//반복문 내에서 break를 만나면 그 즉시 반복문을 종료 함.
		for(int i = 0; i<10;i++) {

			if(i%2==0) { //i%4==3//i가 3일때.
				continue; //밑으로 안가고 반복문의 꼬리인 증감식으로
			}
			System.out.println(i);
		}
		System.out.println("for문 종료");
		//2. continue;
		//for	:그 즉시 증감식으로 이동
		//while	:그 즉시 조건신으로 이동
	}
}
