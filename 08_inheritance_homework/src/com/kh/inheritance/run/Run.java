package com.kh.inheritance.run;

import com.kh.inheritance.model.dto.BasicPhone;
import com.kh.inheritance.model.dto.SmartPhone;

public class Run {

	public static void main(String[] args) {
		SmartPhone SP = new SmartPhone("Samsung","Galaxy S20",2020,1200000,"Android",128);
		SP.pritnInfo();
		System.out.println("============================");
		BasicPhone BP = new BasicPhone("Nokia", "3310",2000,100000,true);
		BP.pritnInfo();
		BP.checkKeyBoard();
	}

}
