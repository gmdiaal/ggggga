package com.meme.object1.ex1;

public class Method_test_3_main {

	public static void main(String[] args) {
		
		Menu_controller menu = new Menu_controller();
		Method_test_3 method_test_3 = new Method_test_3();
		int salary = 3000000;
		//호출시 매개변수로 보내는 값: 인자값
		method_test_3.t3(salary, 0.95); //호출할 때는 선언이 아니라 값을 보내야댐 ) int salary 안댐
		System.out.println(salary);
		
		Sword sw = new Sword();
		sw.ad =10;
		sw.name="집행검";
		
		method_test_3.info(sw);
		System.out.println(sw.name +" "+sw.ad );
//		System.out.println("main: "+salary);
		
	}
}
