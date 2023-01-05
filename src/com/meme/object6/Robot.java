package com.meme.object6;

public class Robot {	//팔 클라스들을 필요로함. 의존적(dependency) << 필요한것을 주입(inject)
	//로봇은 팔을 가지고 있다.
	private ArmLeft armLeft;	//팔 클라스를 불러와서 멤버인스턴스
	private ArmRight armRight;
	//private ArmRight armRight = new ArmRight(); // 객체를 안에서 만듬. // D.I(dependence injection)(의존성주입)
	
	public Robot() {	
		this.armRight = new ArmRight(); //robot 객체를 만들면, armRight객체도 만들어짐.
	}
	
	public Robot(ArmRight armRight) {
		this.armRight = armRight; //외부에서 객체를 받아옴.
	}
	
	public ArmLeft getArmLeft() {
		return armLeft;
	}
	public void setArmLeft(ArmLeft armLeft) {
		this.armLeft = armLeft;
	}
	public ArmRight getArmRight() {
		return armRight;
	}
	public void setArmRight(ArmRight armRight) { //여기서 오른팔 만들었으니 쓸모없지 않을까? 나중에 못갈아낌.
		this.armRight = armRight;
	}	
	
	

}
