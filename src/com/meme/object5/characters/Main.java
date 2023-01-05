package com.meme.object5.characters;

public class Main {
	public static void main(String[] args) {
//		Magition magition = new Magition();
//		magition.getMp();
//		magition.setMp(30);
//		magition.setName("");
//		magition.attack();
		
		Archer archer = new Archer();

		Character character=null; //타입으로는 가능
		//Character character = new Character("");//객체로 안만들어짐
		
		character = archer;
		//아처는 캐릭터 타입이면서 아처타입임.
		archer.attack();
		//아처는 어택이 있는데 캐릭터는 없음.
		
		archer= (Archer)character; //캐릭터 중에서 아처만 (폴리모프)
		//모든 군인이 이병이 아니기 때문에, 군인중에서 이병
		//-> character.attack(); 은 없음. 종류가 다름.
		
		//포션, 칼, 골드, 도끼 가방에 다못담는데 게임에선 담을 수 잇네?
		//포션, 칼, 골드, 도끼는 아이템. 배열을 아이템으로 선언.
		//담을 때는 포션(아이템)
		//꺼낼 때는 포션(포션류)
		
		//테란 드랍쉽. 길이8 배열. 여러유닛 폴리모프.
		//System.out.println(character.test5); @형변환된다고 해서 부모에 없는 인스탠스가 생기지 않음
		//System.out.println(archer.super.test5); //부모영역은 부모영역만 사용가능.
	}
}
