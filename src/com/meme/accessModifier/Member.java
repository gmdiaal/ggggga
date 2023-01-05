package com.meme.accessModifier;

public class Member {
	//전세계 계발자들이 멤버변수는 private로 씀
	private String name;
	private int age;
	private double ki;
	private double muge;
	private boolean check;
	//프라이빗은 .해도 안나오니까, 다른사람이 쓸때는 내가 쓴 변수가 먼지 머름.
	
	public Member() {}
	
	public Member(int age) {
		if(age>0 || age<200) {
			this.age=age;
		}
	}
	
	
	
	
	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getKi() {
		return ki;
	}

	public void setKi(double ki) {
		this.ki = ki;
	}

	public double getMuge() {
		return muge;
	}

	public void setMuge(double muge) {
		this.muge = muge;
	}

	//set으로 시작하는 메서드를 setter 메서드
	//선언법: set+변수명의 첫글자를 대문자로 바꾼것 (setAge, setName...)
	public void setAge(int age) { //데이터를 집어넣는..//이것만 호출하면 되기때문에 if문 또 쓸필요 없음 = 사용자의 실수를 예비.
		if(age>0 && age<200) {
			this.age=age;	//매게변수로 받은 데이터를 멤버변수로
		}
	}
	
	//get으로 시작하는 메서드를 getter 메서드
	//선언법: get+변수명의 첫글자를 대문자로 바꾼것
	public int getAge() { //데이터를 꺼내가는..//내부>>외부
		return this.age;
	}
	
	public void info() {
		System.out.println("Name: "+ this.name);
		System.out.println("age: "+ this.age);
		System.out.println("ki: "+ this.ki);
		System.out.println("muge: "+ this.muge);
	}
	
	
}
