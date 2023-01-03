package com.meme.loop;

import java.util.Scanner;

public class Loop03_3_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//배그
		//총알 30발 -> 1탄창
		//캐릭터당 3탄창
		
		//1.단발
		//2.점사
		
		//1번이면 "탕" 30번 반복
		//2번 "타타탕" 10번 반복
		//다시 단발? 점사? 물어봐
		int shot = 0;	
		String sound ="";
		int count=0;
		//shot = 2; // 수동 단발
		System.out.println("1 단발 2 점사");
		shot = scanner.nextInt();		
		for(int ammu=3;ammu>0;ammu--) {
//			for(;shot!=1&&shot!=2;) {
//				System.out.println("1 단발 2 점사");
//				shot = scanner.nextInt();				
//			}
			sound ="타타탕";
			count = 10;

			if(shot==1) {
				sound = "탕";
				count = 30;
			}
			
//			else if (shot==2) {
//				sound ="타타탕";
//				count = 10;
//				
//			} //else없이 무조건으로 설정하면 코드 아낌.
			
			for(;count>0;count-=1) {
				System.out.print(sound);	
			}
			

		}
		System.out.println("다쏨");
		
		
		
		
		
		
		
		
		
		
	}
}
