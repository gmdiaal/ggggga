package com.meme.object5.characters;

public abstract class Magition extends Character {


	private int mp;

	public abstract void attack();
//	{ //불,물에 쓸거니 필요없지만..지우면 에러.
		//System.out.println("마법 공격"); }
	
	public abstract void spell(); //언잰가는 누가 써야댐
	
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
