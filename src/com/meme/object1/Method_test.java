package com.meme.object1;

public class Method_test {

	//method 선언 공식
	//public 	static 		void 	main 	(String[]args){}
	//접근지정자 	[그외지정자]	리턴타입 	method명(매개변수들 선언){}
	//			[필수는아니다]					[매개변수들 선언]

	//접근지정자 : public
	//그외지정자 : 생략
	//리턴타입	  : void
	//메서드명:	작명
	//매개변수	:	생략
	
	public void t1() { //method의 header, 선언부
		//{} 메서드의 body
		//제어문, 반복문, 등등등이 여기서 다 이뤄짐.
		System.out.println("t1 메서드 실행시작");
		Method_test_2 mt2 = new Method_test_2();
		
		mt2.info();
		
		int num = 10;
		System.out.println("t1 num"+num);
		System.out.println("t1 메서드 종료");
	}//t1 끝
	
	//t2 method 선언
	public void t2() {
		System.out.println("t2 메서드 실행시작");
		int num = 20;
		System.out.println("t2 num"+num);
		System.out.println("t2 메서드 종료");
	}
	
}
