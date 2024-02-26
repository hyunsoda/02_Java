package com.Project.baseball.model.dto;

import java.io.Serializable;
import java.util.Objects;

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
		return "이름 : " + name + ", 팀 : " + team + ", 나이 : " + age + ", 포지션 : " + position
				+ ", 데뷔년도 : " + debutYear;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, debutYear, name, position, team);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseballPlayer other = (BaseballPlayer) obj;
		return age == other.age && debutYear == other.debutYear && Objects.equals(name, other.name)
				&& Objects.equals(position, other.position) && Objects.equals(team, other.team);
	}
	
	
	
}
