package com.meme.array;

public class Array_04_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar1 = {1,2,3};
		int [] copy = new int[ ar1.length+1 ];
		int a = (Integer) null;
		int [] b = null;
		System.out.println(a);
		System.out.println(b[0]);

		for(int i=0;i< ar1.length;i++) {
			copy[i]=ar1[i]; //깊은복사
		}
		
		copy[copy.length-1]=4; //깊은복사
		ar1=copy; //얕은복사:주소만 옮김
		
		for(int i=0;i< ar1.length;i++) {
			System.out.println(ar1[i]);
		}
	}

}
