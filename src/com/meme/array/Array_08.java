package com.meme.array;

public class Array_08 {

	public static void main(String[] args) {
		int [] ar = {9,5,8,3,6};

		//9, 8, 6, 5, 3 내림차순
		//3, 5, 6, 8, 9 오름차순
		
		//0: 1,2,3,4 	제일 큰애를 앞으로
		//1: 2,3,4		두번째 큰애를 앞으로
		//...3,4
		//3: 4			
		//이중 for
		//System.out.println(ar.length-(ar.length-1));
		for(int i=0;i<ar.length-1;i++) {	//[2]5
			for(int s=i+1; s < ar.length ;s++) {	//5<8
				//System.out.println(ar[i]+"<"+ar[s]);
				if(ar[i]<ar[s]) {
					System.out.println( ar[i]+"["+(i+1)+"] < ["+(s+1)+"]"+ar[s] );
					int [] copy = ar;
					int dumi = 0;
					dumi = ar[i];	//5	5
					ar[i]=copy[s];
					ar[s]=dumi;		
//					ar[i]=copy[s]; //5->8
//					ar[s]=copy[i];
					

				}	
			}//안 for문

			for(int j=0;j<ar.length;j++) {
				System.out.print(ar[j]+" ");
				
			}
			System.out.println("");
			
		}//밖 for문
		///////////////////////////출력문
		for(int j=0;j<ar.length;j++) {
			System.out.print(ar[j]+" ");
			
		}
		System.out.println("");
		///////////////////////////출력문
	}//main
}
