package com.meme.loop;

import java.util.Scanner;

public class Loop03_3 {
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
		//shot = 2; // 수동 단발

		for(int ammu=3;ammu>0;ammu--) {
//			System.out.println("1 단발 2 점사");
//			shot = scanner.nextInt();		

			if(shot==1) {
				
					for(int bollet=30;bollet>0;bollet--) {
						System.out.print("탕"+bollet);	
					}
					System.out.println("");
				
			}else if (shot==2) {
				
					for(int bollet=30;bollet>0;bollet-=3) {
						System.out.print("타다탕"+bollet);	
					}
					System.out.println("");	
			}
			//else로 반복하려면 ammu가 3인경우 2인경우 1인경우 다 설정해야댐.
			//else or for
			for(shot=0;shot!=1&&shot!=2;) {
				System.out.println("1 단발 2 점사");
				shot = scanner.nextInt();				
			}
			
		}
		System.out.println("다쏨");
		
		
		
		
		
		
		
		
		
		
	}
}
