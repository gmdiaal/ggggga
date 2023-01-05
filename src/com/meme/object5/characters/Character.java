package com.meme.object5.characters;

public abstract class Character { //추상 클래스: 상속해서 써라 //추상 매서드: 상속 받아서 오버라이딩해서 써라
	private String name;
	private int hp;
	private int level;
	
	public Character() {}
	
//	public void attack() {
//		System.out.println("공격"); //어짜피 상속받아서 오버라이딩할거라서 의미가 없지만, 지우면 에러가 뜸.
//	}//상송하면 궁수랑 마법사랑 효과음이 다름. 
//	public abstract void attack(); //미완성된 매서드 >> 미완성된 클래스 >> 클래스에도 abstract 붙여줘야함
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	

}
