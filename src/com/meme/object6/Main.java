package com.meme.object6;

public class Main {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Robot robot = new Robot();
		ArmLeft armLeft = new ArmLeft(); //(약한연결) 로봇을 지워도 왼팔은 남아있음.
		robot.setArmLeft(armLeft);
		System.out.println(robot.getArmRight());
		System.out.println(robot.getArmLeft());
		
		robot = null; //(강한연결) armRight가 로봇에 선언되어 있음으로 오른팔을 찾지 못함.
		
		System.out.println("프로그램 끝");
	}
		//가가가
}
