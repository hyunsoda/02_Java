package com.kh.inheritance.model.dto;

public class BasicPhone extends Phone{
	
	private boolean hasPhysicalKeyboard;
	
	public BasicPhone() {}

	public BasicPhone(String brand, String model, int year, int price, boolean hasPhysicalKeyboard) {
		super(brand, model, year, price);
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}
	
	
	
	public boolean isHasPhysicalKeyboard() {
		return hasPhysicalKeyboard;
	}

	public void setHasPhysicalKeyboard(boolean hasPhysicalKeyboard) {
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}

	public void checkKeyBoard() {
		if(hasPhysicalKeyboard == true) {
			System.out.println("이 휴대폰은 물리적 키보드가 있습니다.");
		}
	}
	
}
