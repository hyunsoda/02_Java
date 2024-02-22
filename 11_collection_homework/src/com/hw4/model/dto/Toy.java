package com.hw4.model.dto;

import java.util.Objects;

public class Toy {
	// 내가 작성한 답

	private String name;
	private int age;
	private int price;
	private String color;
	private int manufacture;
	private String ingredient;
	private String ingname;
	
	public Toy() {}

	public Toy(String name, int age, int price, String color, int manufacture, String ingredient) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.color = color;
		this.manufacture = manufacture;
		this.ingredient = ingredient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getManufacture() {
		return manufacture;
	}

	public void setManufacture(int manufacture) {
		this.manufacture = manufacture;
	}

	public String getIngredient() {
		return ingredient;
	}

	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}

	public String getIngname() {
		return ingname;
	}

	public void setIngname(String ingname) {
		this.ingname = ingname;
	}

	@Override
	public String toString() {
		return "이름 : " + name + " / price : "+ price + " / 색상 : " + color + " / 사용가능연령 : "+
	age + " / 제조년월일 : " + manufacture + " / 재료 : " + ingredient;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, color, ingname, ingredient, manufacture, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		return age == other.age && Objects.equals(color, other.color) && Objects.equals(ingname, other.ingname)
				&& Objects.equals(ingredient, other.ingredient) && manufacture == other.manufacture
				&& Objects.equals(name, other.name) && price == other.price;
	}
	
	
	
	
}
