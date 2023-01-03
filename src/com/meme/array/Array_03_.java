package com.meme.array;

public class Array_03_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수에는 같은 데이터 타입만 대입 가능.
		int [] ar1 = {1,2,3};
		int [] ar2 = {5,6,7,8};
		int num=11; //primitive type, 지역번수
		String name1 ="iu";//reference type이면서 @지역변수임
		//한번 만들어진 크기는 줄이거나 늘릴수가 없음.
		
		for(int i = 0; i<ar1.length;i++) {
			System.out.print(ar1[i]+" ");
		}
		System.out.println("\n");
		//얕은복사
		ar1=ar2; // ar1의 힙-번지를 ar2의 힙-번지로 옮김.

		for(int i = 0; i<ar1.length;i++) {
			System.out.print(ar1[i]+" ");
		}
		System.out.println("\n");
		

		for(int i = 0; i<ar2.length;i++) {
			System.out.println(ar2[i]+" ");
		}

	}
}
