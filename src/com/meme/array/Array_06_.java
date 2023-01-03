package com.meme.array;

import java.util.Scanner;

public class Array_06_ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] ar = {8,5,13,9,6};
		//키보드로 부터 삭제하고 싶은 값을 입력 받기
		int [] copy = new int [ar.length-1];
		int delete = 3;	//삭제할 배열값 ar[4] ->9
		
		System.out.println(ar.length);
		
		for(int i=0;i<delete;i++) {
			copy[i]=ar[i]; // 8,5,13
			for(int a=ar.length-1; a>delete;a--) {
				copy[i]=ar[i]; //6,9
				
			}
		}
		
		ar=copy;
		for(int i=0;i<ar.length;i++) {
		System.out.print(ar[i]+" ");
		}	
		System.out.println();
		System.out.println(ar.length);
		//덜어씌우기
		//if로  ar[2] 건너뛰기
		
		
		//지우고 싶은 글자와 일치시키기
		int delete_2 = sc.nextInt();
		// ar[i] == delete_2 이면
		
		
		
		
		
	}
}
