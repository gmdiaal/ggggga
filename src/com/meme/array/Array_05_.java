package com.meme.array;

public class Array_05_ {
	public static void main(String[] args) {
		int [] ar1 = {1,2,3};
		//1,2만 나오게끔.
		int [] ar2 = {1,2};
		int [] copy = {1,2};
		int [] copy2 = new int [ar1.length-1];
		
		ar2=copy;
		
		for(int i=0;i<ar1.length-1;i++) {
			copy2[i]=ar1[i];
			System.out.print(copy2[i]);
		}
		System.out.println("");
		ar1=copy2;
		for(int i=0;i<ar1.length;i++) {
		System.out.print(ar1[i]);
		}
		System.out.println("");
		for(int i=0;i<ar1.length;i++) {
		System.out.print(ar2[i]);
		}		
		
		
	}
}
