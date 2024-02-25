package com.hw22.model.dto;

public class Tiger extends Animal{

	public Tiger() {
		// TODO Auto-generated constructor stub
	}
	
	public Tiger(String name) {
		
		super(name);
	};
	
	
	@Override
	public void sound() {
		System.out.println(name + "가 어흥하며 포효합니다.");
	}

	
	
	
}
