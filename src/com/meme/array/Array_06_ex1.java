package com.meme.array;

import java.util.Scanner;

public class Array_06_ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] ar = {8,5,13,9,6};	//키보드로 부터 삭제하고 싶은 값을 입력 받기
		int [] copy = new int [ar.length-1];
		
		int sel = sc.nextInt();
		for(int delete=0;delete<ar.length;delete++) {
			if(ar[delete] == sel) {	//삭제할 배열값이 고른값과 일치.
				System.out.println("일치");
				//끝자리 변경될때 적용용
				int end_length = ar.length-1;	//4 끝자리용
				
				//del이 첫째자리
				if(sel==ar[0]) {
					for(int i=0; i<4;i++) {
						copy[i]=ar[i+1]; //1번자리 빼고 복제 첫째자리
					}
					ar=copy;
				}//del이 첫째자리
				
				//del이끝자리
				else if(sel==ar[end_length]) {
					for(int i=0; i<4;i++) {	//끝자리라 0~4까지
						copy[i]=ar[i];	//0~n-1 까지 복제 끝자리
					}
					ar=copy;
				}//del이끝자리
				
				//del이중앙
				else {	//중앙은 좌,우 에서 지워야 함으로 for문 두개	//8,5,13,9,6
					for(int i=0;i<delete;i++) {	//delete = 1~3 0과4는 다른조건있음
					copy[i]=ar[i]; // 8,5,13(1~3)
						for(int a=ar.length-1; a>delete ;a--) {	//4부터 1~3(delete)까지 긁음
							copy[a-1]=ar[a]; // 13, 9,6 
						}
					}
					ar=copy;
				}
				//del이중앙

			}	//입력값과 일치
		}
		for(int i=0;i<ar.length;i++) {
		System.out.print(ar[i]+" ");
		}	
		System.out.println();
		System.out.println("ar길이: "+ar.length);
	}
}
