package edu.kh.poly.ex2.model.vo;

public abstract class Animal {
	// 추상 클래스(abstract class)
	// 1. 미완성 메서드(추상메서드)를 보유하고 있는 클래스
	// 2. 객체로 만들면 안되는 클래스
	// -> 여러 타입들을 관리하기 위한 상위 타입의 목적,
	// 	  객체로 생성하여 사용하기 위한 목적이 아니다.
	
	// 속성(필드)
	private String type; // 종/과
	private String eatType; // 식성
	
	
	// 기능 (생성자 + 메서드)
	public Animal() {}

	// - 추상클래스는 new연산자를 통해 직접적인 객체 생성은 불가능하지만
	//   상속받은 자식 객체 생성 시 내부에 부모 부분이 생성될 때 사용된다.
	
			// new Animal();은 안되지만 상속받을 때 부모객체가 될 수 있음
	public Animal(String type, String eatType) {
		super();
		this.type = type;
		this.eatType = eatType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEatType() {
		return eatType;
	}

	public void setEatType(String eatType) {
		this.eatType = eatType;
	}

	@Override
	public String toString() {
		return type + " / " + eatType;
	}
	
	// 동물의 공통 기능 추출 (추상화)
	// -> 동물은 공통적으로 먹고, 숨쉬고, 움직이지만
	//    어떤 동물이냐에 따라 그 방법이 다름!
	// 	  -> 해당 클래스에 메소드를 정의할 수 없다.
	// 	  --> 미완성 상태로 만들어 상속받은 자식이 해당 메서드를 
	// 		  자식 본인에게 맞는 정의를 하도록 오버라이딩 강제화 시킴
	//	  --> 추상메서드(abstract method)로 작성
	
	
	// 먹다
	public abstract void eat(); // 추상메서드  - 블록이 없다
	
	// 숨쉬다
	public abstract void breath();
	
	// 움직이다
	public abstract void move();
	
	
	
	
	
	
}
