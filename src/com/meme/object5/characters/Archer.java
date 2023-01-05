package com.meme.object5.characters;

public class Archer extends Character implements AttackAble {

	int test5 = 900;
	private int dex;
	
	public Archer() {
		//super();//new Archer를 하게 되면 부모객체+자기객체로 만들어짐. //부모의 생성자에서 매개변수가 없는 생성자를 호출
		//super("");//부모생성자에 기본생성자가 없으면 조건에 맞게 형성해야함 this()와 같음. (이 경우 문자열 input이라 빈문자열 대입)
	}
	
	public void attack() {	//부모한테 있음으로 오버라이딩 //public이 제일 넓은 접근지정자 임으로 바꿀 수 없음.
		//super.attack();			//기본으로 들어가있는 문구.(생략된)
		System.out.println("활쏘기");	//오버라이딩
		//System.out.println(this.name); //인터페이스에서 불러올수 없음. 확장개념.
		//System.out.println(this.getName());
	}
	public void move() {
		System.out.println("이동");
	}
	
	public int getDex() {
		return dex;
	}
	public void setDex(int dex) {
		this.dex = dex;
	}
	
	
	
}
