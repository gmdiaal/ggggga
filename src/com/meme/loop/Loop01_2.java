package com.meme.loop;

public class Loop01_2 {

	public static void main(String[] args) {
		//0-100미만의 짝수만 출력
		int i = 0;
		int count = 0;
		
		for(;i<100;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("");
		//0-100미만 if문 없이.		
i=0;
		for(;i<100;i+=2) {
			System.out.print(i+" ");
		}
		System.out.println("");
////////////////////////////////////////////////////////////////////
		//0-100미만의 합계
i=0;
		for(;i<100;i++) {
			count+=i;
		}
		System.out.println(count);

		
	}
}
