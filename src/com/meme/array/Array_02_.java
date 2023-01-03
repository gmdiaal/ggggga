package com.meme.array;

import java.util.Scanner;

public class Array_02_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] ar = new int[3];
//		int [] ar2 = new int[]; //반드시 명시를 해둬야함.
		int [] ar2= new int[2];
		
		//키보드로 부터 숫자를 입력받아서 해당 숫자만큼 배열을 생성
		
		//배열 값
		System.out.println();
		
		//배열 길이와 값
//		System.out.println("배열의 길이 입력");
//		int [] ar3= new int[ sc.nextInt() ];
		
		
		//for(int i = 0; i<)
////////////////////////////////////
		
		int count = sc.nextInt();
		int []ar3 = new int[count];
		
		for(int i = 0;i<ar3.length;i++) { //@변수명.length
			System.out.println(i+1+"번째 숫자 입력");
			ar3[i]=sc.nextInt();
		}
		for(int i = 0; i<count;i++) {
			System.out.print(ar3[i]+" ");
		}

		
		
		
		
		
		
		
		
		
		
	}
}
