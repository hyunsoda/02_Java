package com.kh.inheritance.run;

import com.kh.inheritance.model.dto.BasicPhone;
import com.kh.inheritance.model.dto.SmartPhone;

public class Run {

	public static void main(String[] args) {
		
		SmartPhone SP = new SmartPhone("Samsung","Galaxy s20",2020,1200000,"Android",128);
		SP.printInfo();
		
		BasicPhone BP = new BasicPhone("Nokia", "3310",2000,100000,true);
		BP.printInfo();
		BP.checkKeyboard();
	}

}
