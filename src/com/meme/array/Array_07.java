package com.meme.array;
import java.util.Scanner;

public class Array_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] ar = {5,1,4};
//		1.데이터 추가
		//직접 입력해야 댐. 0번 인덱스에 추가. 나머지는 뒤로 밀림.
//		2.데이터 삭제
		//0번 인덱스 삭제
//		3.종료
		
		int input; int menu;
		while(true) {
			System.out.println("1.데이터 추가 2.데이터 삭제 3.종료");
			menu = sc.nextInt();

		if(menu==1) {//		1.데이터 추가
			System.out.println("데이터 입력");
			input = sc.nextInt(); //menu는 어짜피 돌아올 때 초기화 되서 또 써도 되네?
			//뒤로밀기
			int [] plus = new int [ar.length+1];
			for(int i=0;i<ar.length;i++) {
				plus[i+1]=ar[i];
			}
			ar=plus;
			//뒤로밀기 끝
			ar[0]=input; //데이터 추가
			System.out.println("데이터");
			for(int i=0;i<ar.length;i++) {
				System.out.print(" "+ar[i]);
			}//출력문
			System.out.println();
		}//		1.데이터 추가
		else if(menu==2) {//		2.데이터 삭제
		//앞으로밀기
		int [] minus = new int [ar.length-1]; //plus로 써도댐. 하지만 선언해야댐.
		for(int i=0;i<minus.length;i++) {
			minus[i]=ar[i+1];
		}
		ar=minus;
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(" "+ar[i]);
		}//출력문
		System.out.println();
		}//		2.데이터 삭제
		
		//3.종료
		else if(menu==3) {break;}
		}//while밖
	}

}
