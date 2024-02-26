package com.Project.baseball.model.dto;

import java.io.Serializable;

public class BaseballPlayer implements Serializable{

	private String name;
	private String team;
	private int age;
	private String position;
	private int debutYear;
	
	public BaseballPlayer() {}

	public BaseballPlayer(String name, String team, int age, String position, int debutYear) {
		super();
		this.name = name;
		this.team = team;
		this.age = age;
		this.position = position;
		this.debutYear = debutYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getDebutYear() {
		return debutYear;
	}

	public void setDebutYear(int debutYear) {
		this.debutYear = debutYear;
	}

	@Override
	public String toString() {
		return "BaseballPlayer [name=" + name + ", team=" + team + ", age=" + age + ", position=" + position
				+ ", debutYear=" + debutYear + "]";
	}
	
	
	
}
