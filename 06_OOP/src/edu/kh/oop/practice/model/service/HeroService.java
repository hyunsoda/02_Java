package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Hero;

public class HeroService {
	
	public void ex1() {
		Hero p1 = new Hero();  // 객체 1
		p1.setNickName("Sohyun");
		p1.setJob("학생");
		p1.setLevel(3);
		p1.setHp(500);
		p1.setMp(300);
		p1.setExp(5000);
		
		
		System.out.printf("%s 직업으로 '%s'님이 생성되었습니다.\n 현재 레벨  : %d\n",
				p1.getJob(), p1.getNickName(),p1.getLevel());
		p1.attack(300);
		p1.attack(300);
		p1.magicJump();
		
		
		System.out.println("======");
		
		Hero p2 = new Hero();   // 객체 2
		p2.setNickName("hi");
		p2.setJob("직장인");
		p2.setLevel(5);
		p2.setHp(300);
		p2.setMp(0);
		p2.setExp(600);
		System.out.printf("%s 직업으로 '%s'님이 생성되었습니다.\n 현재 레벨  : %d\n",
				p2.getJob(), p2.getNickName(),p2.getLevel());
		p2.attack(20);
		p2.magicJump();
		
	}
}
