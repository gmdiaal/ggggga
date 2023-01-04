package com.meme.object2;

public class Car {

	String company="BMW";
	String name;
	int price;
	int speed;
	String color;
	
	{//instance블럭에서는, 공통적 멤버변수를 정할 때 쓰렴..
		System.out.println("초기화블럭: "+ this.company);
		this.company = "AUDI";
	}//초기화 블럭.

//	public Car(int price, int speed) {
//		this.company = "Kia";
//		this.name = "스포티지";
//		this.price = price;
//		this.speed = speed;
//		this.color = "black";
//	}
//	public Car(int speed, int price ) {
//		this.company = "Kia";
//		this.name = "스포티지";
//		this.price = price;
//		this.speed = speed;
//		this.color = "black";
//	}
	
	public Car() {
//		this("black");//생성자 내에서 다른 생성자 호출
		System.out.println("생성자: "+ this.company);
		this.company = "Kia";
		this.name = "스포티지";
		this.price = 3500;
		this.color = "black";
	}
	public Car(String color) {
		this("color", 3500);
//		this.company = "Kia";
//		this.name = "스포티지";
//		this.price = 3500;		
//		this.color = color;
	}
	public Car(String color,int price) {
		this.company = "Kia";
		this.name = "스포티지";
		this.price = price;		
		this.color = color;
	}
	public Car(int price, String color) {
		this.company = "Kia";
		this.name = "스포티지";
		this.price = price;		
		this.color = color;
	}
	
	public void info() {
		System.out.println("name: "+this.name);
		System.out.println("company: "+this.company);
		System.out.println("price: "+this.price);
		System.out.println("color: "+this.color);
	}
}
