package com.meme.array;

import java.util.Scanner;

public class Array_06_ex2 {

	public static void main(String[] args) {
		//키보드로 부터 삭제하고 싶은 값을 입력 받기
		Scanner sc = new Scanner(System.in);
		int [] ar = {8,5,13,9,6};
		
		int [] copy = new int [ar.length-1];
		
		int del = sc.nextInt();
		int idx=0;
		for(int i = 0; i<ar.length;i++) {
			
			if(ar[i]==del) {
				continue;
			}
			copy[idx]=ar[i];
			idx++;
			//첫번째 수일 때 copy[i]=ar[i+1];
			//마지막 수일 때 copy[i]=ar[i-1];
			//중간의 수일 때 copy[i]=ar[i+1];
		}
		ar=copy;
		///출력문//////////////////////////
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		///출력문//////////////////////////
		
		
	}

}
