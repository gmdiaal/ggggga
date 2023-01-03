package com.meme.object2;

public class _0_Main {

	public static void main(String[] args) {
		_1_Return_test return_test = new _1_Return_test();
		
		//int a = return_test.t1(); //리턴할 값이 없음.
		int [] a = return_test.t1(50); //리턴할 값이 없음.
		
		int num = return_test.t2();
		System.out.println(num);

	//	System.out.println(ar[0]);
		System.out.println("집에서추가");
		System.out.println("fin");
		
		int [] ar = return_test.t3();
		System.out.println(ar[0]);
	}
}
