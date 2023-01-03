package com.meme.object2;

public class _3_Main_monster {
	public static void main(String[] args) {
		_2_Monster mon1 = new _2_Monster();
		mon1.power =10;
		mon1.hp = 100;
		_2_Monster mon2 = new _2_Monster();
		mon2.power =10;
		mon2.hp = 90;
		
		
		_2_Monster [] mons = new _2_Monster[2];

		_2_Monster mon3 = new _2_Monster();	
		
		boolean check = mon1.check_value(mon2);
		System.out.println(check);
		//System.out.println(mon1==mon2);
		//System.out.println(mon1.check_value());
		
//		mon1.check_value2(mon1, mon2, mon3, mons);	
//		System.out.println(mon3.power+" "+ mon3.hp+" ");

		//		System.out.println(mon1);
//		mon1.info();
//		System.out.println(mon2);
//		mon2.info();	
	}
}
