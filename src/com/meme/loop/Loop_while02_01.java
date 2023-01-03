package com.meme.loop;

import java.util.Scanner;

public class Loop_while02_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//게임
		//1.로그인
		//2.로그인 한 유저만 게임 가능
		
		///////////////////////로그인파트
		//1.로그인 2.종료
		//	1:id, pw 입력 후 로그인 판단 >>로그인 종료 루프
		//	2종료
		
		////////////////////////게임 진행 파트
		//1. 로그인 성공했을 때 진행
		//초기 GOLD는 0
		//5렙 달성시 1000 10렙 달성시 2000 15렙 3000 지급마다 메시지 출력
		//레벨은 1로 시작
		//모든 몬스터의 경험치는 동일
		// 1 -> 2 : 3마리		경험치 얻을 때마다 표기 (3번필요)
		// 2 -> 3 : 6마리							6번
		// 3 -> 4 : 9마리							9번
		//............
		//14 -> 15: 52마리	//?? 42마리 아닌가
		//만렙달성 축하, 현재 gold 출력
		
		int id=123; int pw=321;
		int level=1; int gold=0;
		boolean check=true;
		//로그인파트
		while(check) {
			System.out.println("1:로그인 2:종료");
			int menu = sc.nextInt();
			if (menu==2) {
				System.out.println("프로그램 종료됨");
				break;
				} //2. 종료버튼
			else if (menu==1) {//id,pw입력
				System.out.print("id입력:");
				int input_id = sc.nextInt();
				System.out.println("pw입력:");
				int input_pw = sc.nextInt();
				
				if(id==input_id&&pw==input_pw ) {//로그인성공
					System.out.println("로그인 성공");
					
					/////////////////////게임 진행 파트

					while(true) {
						System.out.println("1.사냥 2.시간죽이기 3.로그아웃(종료)");
						int game_menu= sc.nextInt();
						if(game_menu==1) {				
							System.out.println("몬스터 처치");
							//////////////////////레벨링//////////////////////
							System.out.println("공격: 아무키");
							int attack_key=sc.nextInt(); // 1.몸통박치기 2.휘두르기 3.도망
							if(level<14) {
								for(int exp=0;exp<3*level;exp++) {//레벨업 14미만
									System.out.println("경험치+1");
									if(level%5==0) { //gold획득
										gold+=(level/5)*1000;
										System.out.println("레벨달성골드획득"+(level/5)*1000 );
										System.out.println("현재골드"+ gold);
									}
								}//exp for문
								++level; System.out.println("레벨업! 현재 레벨"+level);
							}else if (level==14){ //레벨업 14렙전용
								for(int exp=0;exp<52;exp++) {//레벨업
									System.out.println("경험치+1");
								}
								level++; gold+=(level/5)*1000;//정확히 15달성 때 gold획득 
							}//레벨 14 경험치 52용, 15레벨 골드용 else if문
							else {System.out.println("레벨15 사냥해도 경험치 없음");}//if (level==15) { break; }//레벨 15유지용
							//////////////////////레벨링//////////////////////
						}//game menu 1
						
						if(game_menu==2) {
							System.out.println("시간을죽임");
						}
						if(game_menu==3) {break;}
					}//게임 진행 파트
					
				}//로그인 성공 //게임 시작
				else {System.out.println("로그인실패");}
				
			}//else if 1.로그인 버튼
			
		}//로그인 while문


		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
