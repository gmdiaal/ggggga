package com.meme.object5.characters;

public class Knight extends Character implements AttackAble {
	//처음에 클라스명에 빨간줄은 오버라이딩 해야할것 남앗다는 뜻.
	int strong;
	
	//Item item; //인터페이스도 데이터타입으로 형성 가능.
	// item 상속{ 검, 스태프 }
	Item item = new Staff();
	
	//Staff staff = item; //@폴리모프 반대
	
	@Override
	public void attack() { //(public abstract void)
		item.a(); //얘가 어떤 장비를 착용하느냐에 따라서 메서드가 달라짐.(모션/효과음)
		//컴퓨터의 ubs 인식도 같음.// act method를 호출함.
		//부품업체들은 act method 안에 작동방식을 코딩함
	}

}
