package com.hw2.model.dto;

public abstract class Person {
	protected String id;
	protected String name;
	
	public Person() {}

	public Person(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public abstract String getInfo();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
}
