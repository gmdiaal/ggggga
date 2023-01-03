package com.meme.object2;

public class Over_test {

	//매게변수 두개를 받아서 +한 결과를 리턴
	//	public void hap(int b, int a) {	} //순서는 상관 없음. //변수의 타입과 구성과 갯수.
	
	public int hap(int a, int b) {
		return a+b;
	}	//3+6하면 잘되지만 3+1.2하면...
	
	public double hap(int a, double b) {
		return a+b;
	}
	public double hap( double b,int a) {
		return a+b;
	}
	
	public String hap(String a, int b) {
		return a+b;
	}
	
	
}
