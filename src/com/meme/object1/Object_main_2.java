package com.meme.object1;

public class Object_main_2 {

	public static void main(String[] args) {
		//Sword instance(객체) 생성
		Sword s1 = new Sword();
		//s1.name = "집행검";	//레퍼런스
		//s1.ad = 20;			//프리미티브
		s1.level = 3;		//프리미티브
		s1.life = 200;
		s1.price = 50000;
		//멤버변수 인스탠스변수는 객체를 가리키는 참조변수가 없을 때. garbage collector가 삭제시킴.
		System.out.println(s1.ad);
		System.out.println(s1.name);
		
		
		Sword s2= s1;
		
		Knight k1 = new Knight();
		k1.name = "햄주먹";
		k1.hp = 100;
		k1.str = 5;
		k1.dex = 3;
		k1.intel = 3;
		k1.sword = s2;
//		k1.sword2 = new Sword();
//		k1.sword2.name = "검1";
				
		System.out.println(k1.sword.name);
		System.out.println(k1.sword.ad);
		
//		Sword s3=null; //main메소드 안의 지역번수면서 주소를 담고잇는 참조변수. 지역변수는 초기화를 해야댐.
//		//초기화 해도, 참조할 객체가 없어서 읽을 수 없음.
//		System.out.println(s3.ad);
		
	}

}
