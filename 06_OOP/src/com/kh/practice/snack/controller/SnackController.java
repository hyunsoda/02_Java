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
		
		
		return "저장이 완료되었습니다";
	
	}
	
	public String confirmData() {

		System.out.println(s.information());
		s.getKind();
		s.getName();
		s.getFlavor();
		s.getNumOf();
		s.getPrice();
		String result = s.getKind() + " (" + s.getName()+"-"+ s.getFlavor()+") "+s.getNumOf()+"개 "+s.getPrice()+"원";
		return result;
	}	
	
}
