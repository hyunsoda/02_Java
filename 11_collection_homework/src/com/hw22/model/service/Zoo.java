package com.hw22.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal;

public class Zoo {

	List<Animal> animals = new ArrayList<Animal>();
	
	public Zoo() {}
	
	public void addAnimal(Animal animal) {
	
		animals.add(animal);
	}
	
	public void showAnimals() {
		for(Animal ani : animals) {
			ani.sound();
		}
	}
	
	public void displayMenu() {
		int input = -1;
		
		do {
		System.out.println("******KH 동물원*****");
		System.out.print("원하는 작업을 선택하세요 : ");
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 동물들의 울음소리 듣기");
		System.out.println("2. 종료");
		input = sc.nextInt();
		
		switch(input) {
		case 1 : showAnimals(); break;
		case 0 : System.out.println("프로그램을 종료합니다.");
		}
			
		
		} while(input ==0);
		
		
		
		
		
	}
	
}
