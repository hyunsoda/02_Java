package com.hw2.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;
import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;

public class Zoo {

	private List<Animal> animalList = new ArrayList<Animal>();
	
	public Zoo() {
		// animalList = new ArrayList<Animal>();
	}
	
	
	public void addAnimal(Animal animal) {
		
		animalList.add(animal);
		
	}
	
	public void showAnimal() {
		System.out.println("동물들의 울음소리를 들어보세요 : ");
		for(Animal animal : animalList) {
			
			animal.sound();
		}
		
//		Tiger tiger = new Tiger("호랑이");
//		tiger.sound();
//		Monkey monkey = new Monkey("원숭이");
//		monkey.sound();
		
		
	}
	
	public void displayMenu() {
		int input = 0;
		do {
			
		
		System.out.println("****** KH 동물원 *******");
		System.out.println("원하는 작업을 선택하세요 : ");
		System.out.println("1. 동물들의 울음소리 듣기");
		System.out.println("2. 종료");
		
		try {
			Scanner sc = new Scanner(System.in); 
			System.out.print("선택 : ");
			input = sc.nextInt();
			
			switch(input) {
			
			case 1 : showAnimal(); break;
			case 2 : System.out.println("프로그램을 종료합니다."); break;
			default : System.out.println("잘못된 선택입니다. 다시 선택해주세요..");
			}
			
			
		}catch(InputMismatchException e) {
			System.out.println("올바른 숫자를 입력해주세요.");
		}
		}while(input !=2);
	}
	
}
