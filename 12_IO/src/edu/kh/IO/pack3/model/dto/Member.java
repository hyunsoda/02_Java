package edu.kh.IO.pack3.model.dto;

import java.io.Serializable;

// 직렬화(Serializable) : 객체를 직선형태로 변형

// 직렬화 방법! -> Serializable 인터페이스를 상속 받으면 끝!

/* Serializable 인터페이스
 * - 추상 메서드가 하나도 없는 인터페이스
 * - 상속만 받아도 입/출력 시 직렬화가 가능하다는 의미(표시)만 제공
 * 	--> 마커 인터페이스 (표시만 한다)
 * 
 * 
 * 
 * */


public class Member implements Serializable{

	// serialVersionUID : 직렬화 식별 번호
	// -> 직렬화 / 역직렬화 시 같은 객체가 맞는지 확인하는 식별번호
	// 별도로 작성하지 않으면 JVM이 알아서 지정
	
	
	
	// 필드
	private String id;
	private String pw;
	private String name;
	private int age;
	
	public Member() {} // 기본 생성자

	// 매개변수 생성자
	public Member(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
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

	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
}
