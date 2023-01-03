package com.meme.object1;

public class Method_main_01 {

	public static void main(String[] args) {
		System.out.println("main method 실행");
		Method_test mt = new Method_test();
		
		//method를 호출한다.
		mt.t1();
		mt.t2();
		
		System.out.println("main method 종료");

	}

}
