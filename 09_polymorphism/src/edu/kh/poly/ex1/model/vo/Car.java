package edu.kh.poly.ex1.model.vo;

public class Car {

	// 속성
	private String engine; // 엔진
	private String fuel; // 연료
	private int wheel; // 바퀴개수
	
	public Car() {} // 기본 생성자
	
	// alt + shift + s + o
	public Car(String engine, String fuel, int wheel) {
		super(); 
		this.engine = engine;
		this.fuel = fuel;
		this.wheel = wheel;
	}

	
	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	// Object.toString() 오버라이딩
	// @Override : 부모가 가진 메서드 자식이 재정의
	@Override // 오버라이딩했다는걸 컴파일러에게 알려주는 Override 어노테이션 ( 컴파일러 인식용 주석)
	public String toString() {
		return engine + " / " + fuel + " / " + wheel;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
