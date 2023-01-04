package com.meme.object2;

public class _4_Array_test {

	int [] ar2;
	int [] ar3 = new int [2];
	
	public void test1 (String [] ar_string, String [] ar_string2 ) {
		ar2 = new int [2];
		ar2[0] = 20; 	//지역내 선언, 지역변수
		ar3[0] = 30;	//main외 선언 
		ar_string[0] = "one";
		ar_string2[0] = "two";
		
		String change = null;
		change = ar_string[0];
		
		String [] ar_string3 = new String [2];
		ar_string3[0] = "메서드안";
		ar_string2[0] = ar_string3[0];
		
	}
}
