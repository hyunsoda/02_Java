package edu.kh.oop.abstraction.model.vo;

// VO (Value Object) : 값 저장용 객체를 만들기 위한 클래스를 모아두는 패키지
// 여기서는 people이 값 저장용 객체

public class People { // 국민(사람) 클래스
	
	// 클래스란? 객체의 특성(속성, 기능)을 정의한 것
	// == 객체를 만들기 위한 설계도
		// People은 사람을 만들기 위한 설계도
	// 속성 == 값 == data
	// 값을 저장하기 위한 변수 선언
	// -> 국민이라면 공통적으로 가지고 있는 속성만 작성(추상화)
	// 이름, 성별, 주민번호, 주소, 전화번호, 나이

	// 필드안에 작성된 변수  == 필드변수 == 멤버변수 == 클래스 변수
	// *** 데이터 직접 접근 제한***
	// public(공공의) -> private(사적인, 개인적인) 변경
	
	// 캡슐화
	// - 데이터와 기능을 하나로 묶어서 관리하는 기법
	// - 데이터의 직접적인 접근을 제한하는 것이 원칙이다 **
	// -> 직접 접근을 못하기 때문에 
	//	  클래스 내부에 간접 접근 방법을 제공하는 기능을 작성해둔다
	//		 -> getter / setter
	
	private String name; // The field People.name is not visible
	private char gender;
	private String pNo; // 주민번호 "220303-222222"
	private String address;
	private String phone; // "010-1234-1234"
	private int age;
//	public double bitCoin; // 공통점이 아니므로 제거
	
	// public		int 	age; 
	//[접근제한자]		자료형	변수명;
	
	// 기능 == 행동 == method(메서드)
	public void tax() {
		System.out.println("세금을 냅니다...");
	}
	
	public void vote() {
		System.out.println("투표를 합니다...꼭 하세요!");
	}

	// 캡슐화에서 사용할 간접 접근 기능(getter/setter)
		// getter : 값 얻어올 때
		// setter : 값을 저장
//	public     String    getName() 
// [접근제한자]   반환형	  메서드명
		// 반환형 메서드 수행후 되돌리는 값 자료형
		// void : 되돌릴 값이 없을 때

	
	
	
	// alt +shift + s또는 상단메뉴 Source
		// -> Generate Getters and Setters...클릭
		// -> selectAll -> generate
	
	// name 변수의 값을 돌려 보내주는 간접 접근 기능
	// void : 반환할 값이 없다(반환형이 없다)
	// <-> 반환할 값이 있을 경우 그 값의 자료형을 작성(반환형)
	public String getName() {
		return name;
	}
	
	// name 변수에 값을 세팅하는 간접 접근 기능
	public void setName(String name) {
		// 매개 변수 String name
		// -> String 타입의 데이터를 전달받아 저장하고 있는 변수
		// ** this : 현재 객체
		// 멤버 변수 name에 매개변수 name을 대입시키는 역할을 함
		this.name = name;
	}
	
	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getpNo() {
		return pNo;
	}

	public void setpNo(String pNo) {
		this.pNo = pNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	// name값을 반환하는 getter
		// get + 카멜케이스로 필드명
	
	// setter
//	public void setName(String name){
//		// setter는 반환형 필요 없음
//		// 외부에서 setter를 지정하고 끝임
//		
//		// String자료형으로 매개변수로 들어올 거다
//		this.name = name;
//		// 앞에 있는 name은 필드에 있는 name임을 알려줘야 함		
//		// 뒤에 대입되고 있는 name은 매개변수로 넘어온 name
//	}
	
	


	
	
	
	
}
