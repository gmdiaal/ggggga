package com.meme.object4;

public class CardMain {

	public static void main(String[] args) {
		
		//클래스명.변수명
		System.out.println(Card.size);
		Card.staticMethod();
		
		Card card = new Card();
		card.setShape("Heart");
		card.setColor("red");
		card.setNumber(1);

		Card.size = 8;
		
		Card card2 = new Card();
		card2.setShape("Spade");
		card2.setColor("Black");
		card2.setNumber(12);
//		card2.size=9; //다른애들은 10인데 스페이드만 9가됨.
		
		card.info();
		card2.info();
		
	
	}
}
