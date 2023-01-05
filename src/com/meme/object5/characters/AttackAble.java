package com.meme.object5.characters;

public interface AttackAble {
	
	//상수, 추상메서드만 가능.
	//상수
	public static final int DAMAGE = 1;
	//객체를 만들지않음 -> public. 글가지울어짐 -> static
	
	//추상메서드
	//접근지정자 public
	//그외지정자 abstract
	public abstract void attack();
//	void attack3(); //생각가능
//	public void attack4(); //이게 편하데..
	
	
	
}
