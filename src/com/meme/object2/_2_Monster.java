package com.meme.object2;

public class _2_Monster {
	
	//멤버변수, instance
	int power;	//heap에 형성
	int hp;
	
	//생성자 CONSTRUCTOR
	public _2_Monster() {
		//매개변수가 없는 생성자를 기본 생성자, default constructor
		this.power=50;
		this.hp=60;
		System.out.println("생성자 실행"); //mon = new _2_Monster 후에 mon._2_Monster 불가능
	}
	public _2_Monster(int power) {
		
	}
	
	
	//멤버메서드, instance method
	
	public boolean check_value(_2_Monster monster) { //Monster monster
		//나의 power와 같고, 나의 hp가 같다면 true
		if(monster.power==this.power && monster.hp==this.hp ) {
			return true;
		}

		return false;
	}

//	public boolean check_value2(_2_Monster monster, _2_Monster monster2, 
//			_2_Monster monster3, _2_Monster [] monsters ) { //Monster monster
//		//나의 power와 같고, 나의 hp가 같다면 true
//		if(monster.power==monster2.power && monster.hp==monster2.hp ) {
//			return true;
//		}
//		monster3.power =110;
//		monster3.hp = 1100;
//		monsters[1].hp = 9010;	
//		return false;
//	}
	
	public void info(int a) {
		
	}
	//공격
	//어슬렁
	public void info() {
		System.out.println(this);
		//참조변수 this : class 내부에서만 사용 가능, 생성된 객체의 주소를 담음. 배열의 주소라고 보면 댐
		System.out.println(this.power);
		//this는 생략 가능
		System.out.println(hp);
		
		attack(); //this.attack(); //참조변수명.멤버
	}
	
	public void attack() {
		System.out.println("공격합니다.");
		//this.info(); //StackOverflowError 무한반복
	}
	
	public void set_hp(int hp) {
		this.hp=hp; //지역변수가 우선됨 
		
	}
	
}
