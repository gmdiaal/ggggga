package com.meme.array;

public class Array_01_ {

	public static void main(String[] args) {
		// primitive type
		//숫자, 문자, 논리형
		//문자형: char, 논리형: boolean
		//reference type
		//String 과 그외

		double d1 = 1.2; //d1번지 영역에 1.2를 2진수로 저장
		d1=5.3;
		if(d1>0) {
			int num =10;
		}
		//변수선언 공식
		//데이터타입 변수명;
		
		//배열선언 공식
		//(모을려고하는)데이터타입 [] 변수명
		double [] ar = {1.2, 5.2, 6.3}; //ar의 데이터타입은 'double'이 아니라 'double [](배열)'
		// double [] ar = new double[2'몇개의 데이터를 모으고 싶은지']
		System.out.println(ar);
		System.out.println(ar[1]);
//		System.out.println(ar[5]);
		
//		double [] ar2 = new double[2];
//		ar2 = {1,2};
//		System.out.println(ar2[1]);
		
		for(int i =0;i<3;i++) {	//index 0으로 초기화하고, i<x 미만으로 이유가 배열 에 많이 사용되기 때문.
			System.out.println(ar[i]);
		}
		
		int ar4[]= {2,3,4}; //이렇게 해도 댐. 다만 변수명(ar4) 까지 읽어야 배열임을 알 수 있음.
		//main(String[] args) <-배열
		
		double [] ar2 = new double [5];
		ar2[0]=1; 
		
	
	
	}

}
