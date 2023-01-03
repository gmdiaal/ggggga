package com.meme.loop;

public class Loop03_1 {
	public static void main(String[] args) {
		//구구단 3단
		//3*1=3
		//3*2=6
		//....
		//3*9=27
		//고정된 값과 변하는 값 분류. 변하는 건 변수. 상수.
		//100의 자리 10의 자리 1의자리 상부 구조를 갖는 개념들
		for(int dan=2;dan<10;dan++) {
			for(int i=1;i<10;i++) {
				System.out.println(dan + " x " + i + " = " + dan*i);
			}			
		}
		
		
	}
}
