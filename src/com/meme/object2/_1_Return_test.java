package com.meme.object2;

import java.util.Random;

public class _1_Return_test {
	public int[] t1(int a) {
		//System.out.println("return이 없을 때는 void");
		int [] ar_c = new int [2];
		ar_c[0]=a;	//50
		return ar_c;	//배열의 배열,ar_c[0] =50;
	}

	public int t2 () {
		Random random = new Random();
		System.out.println("return은 int");
		return random.nextInt(50+1);
	}
	
	public int [] t3() {
		int [] ar = new int[2];
		ar[0] = 999;
		return ar;
	}
	
}
