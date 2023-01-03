package com.meme.loop;

import java.util.Random;
import java.util.Scanner;

public class Loop_while01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		boolean check = true;
		int num = random.nextInt(11);
		
		while(check) { //키오스크, atm, 화면이 유지되다가 처음화면으로 돌아갈 때. menu들.
			System.out.println("숫자를 입력하세요");
			//int a = sc.nextInt();
			int a = random.nextInt(11);
			
			
			if(num==a) {
				System.out.println("일치");
				check= false; // break;
			}else {
				System.out.println("불일치");
			}
			
		}
		
		
	}

}
