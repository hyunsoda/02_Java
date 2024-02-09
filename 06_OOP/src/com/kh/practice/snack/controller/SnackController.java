package com.kh.practice.snack.controller;

import com.kh.practice.snack.view.SnackMenu;
import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	Snack s = new Snack();
	
	public String saveData(String kind, String name, 
			String flavor, int numOf, int price) {
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		String result ="저장 완료되었습니다.";
		return result;
	}
	
//	public String confirmData() {
//		String assure = "저장된 정보를 확인하겠습니까(y/n) : ";
//		char yn		
//		if()
//	}
	
}
