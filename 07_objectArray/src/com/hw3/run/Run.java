package com.hw3.run;

import com.hw3.controller.ProductController;

public class Run {

	public static void main(String[] args) {
		/*
		 * ProductController pc = new ProductController();
		 * pc.mainMenu();
		 * -> ProductController에 있는 여러 메소드를 사용할 거라면 
		 * 필요하지만 현재는 메소드 하나만 사용할 것이기 때문에 아래와 같이 사용
		 * */
		new ProductController().mainMenu();
		// 객체를 생성하자마자 mainMenu()를 꺼내다 씀
	}

}
