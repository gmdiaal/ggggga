package com.meme.object4;

public class Card {

	//Card //DTO(Data Transfer Object), VO(Value Object)
	private String shape;
	private int number;
	private String color;
	
	//클래스변수
	public static int size=10;
	
	//instance 초기화블럭
	{}
	
	//static 초기화 블럭
	static {
		Card.size=50;	//웬만하면 클래스변수는 공통적인 값이라서 변경을 잘 안함.
		Card.staticMethod();
	}
	
	//클래스 메서드
	public static void staticMethod() {
		System.out.println("Static Method");
		Card.size=19;
//		System.out.println(this.shape);
//		this.info();
	}
	
	public void info() {
		System.out.println("Shape: "+ this.shape);
		System.out.println("Color: "+ this.color);
		System.out.println("Number: "+ this.number);
		System.out.println("Size: "+ Card.size);
		Card.staticMethod();
	}
	
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
