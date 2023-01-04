package com.meme.object3.p2;

import com.meme.object3.p1.Secret;

public class Secret_main {
	
	public static void main(String[] args) {
		
		Secret secret = new Secret();
		//보통 참조변수명을 만들 때 클래스 명을 소문자로 바꾼거로 씀.
		
		secret.s1();
		
		System.out.println(secret.point);
		Test test = new Test();
		System.out.println(test.point);
	}

}
