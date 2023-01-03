package com.meme.array;

public class Array_08_ex1 {

	public static void main(String[] args) {
		int [] ar = new int [3];
		int [] ar2;
		ar2= new int [3];
		int [] ar3 = {1,2,3};
		int [] ar4 = {4,5,6};
		
		ar3[0]=ar4[0]; //1<-4
		ar4[2]=ar3[2]; //3<-6
		
		
		
		///////////////////////////출력문
		for(int j=0;j<ar.length;j++) {
			System.out.print(ar3[j]+" ");
			
		}
		System.out.println("");
		///////////////////////////출력문

	}

}
