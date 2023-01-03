package com.meme.object1.ex1;

public class Method_test_3 {

	public void t3(int salary, double tax) {
		//3%땐 실급여 계산
		salary=(int)(salary*tax);
		System.out.println(salary);
	}
	
	public void info(Sword sword) {
		System.out.println(sword.name);
		System.out.println(sword.ad);
		sword.name ="단도";
		sword.ad = 999;
		//Sword 모든 정보를 출력
	}
	
}
