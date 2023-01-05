package com.meme.object4;

public final class God {

	private String name;
	private static final String MY_NAME = "";
	
	private static God god; //프라이빗이면 스태틱이여도 밖에서 못씀
							//스태틱이 붙엇으면 제일먼저 생성. 멤버 메서드,변수 에서는 못씀
	private God() {}	//생성자로 생상 못하게 막음
		
	public static God getInstance() {	//내부에서 생성자를 만들어줌
		//God god = new God();
		
		if(god == null) {
			God.god = new God();
		} //

		return God.god; //new God(); //프라이빗 인스턴스를 외부로 푸시
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
