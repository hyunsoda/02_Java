package edu.kh.poly.ex2.model.vo;

public class Fish extends Animal{

	public Fish() {
	}
	public Fish(String type, String eatType) {
		super(type, eatType);
	}
	
	// alt + shift + s -> Override/implements method ..-> OK
	@Override
	public void eat() {
		System.out.println("입을 뻐끔뻐끔거리면서 먹는다..");
	}

	@Override
	public void breath() {
		System.out.println("아가미 호흡을 한다.");
	}

	@Override
	public void move() {
		System.out.println("꼬리로 헤엄치며 움직인다.");
	}
	
	
	@Override
	public String toString() {
		return "Fish : " + super.toString();
	}
}
