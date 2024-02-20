package com.hw2.model.dto;

public abstract class Animal {

	protected String name; // animal을 상속받은 tiger 혹은 monkey는 직접 접근 가능하다.
	
	public Animal() {}

	public Animal(String name) {
		super();
		this.name = name;
	}
	
	public abstract void sound();
}
