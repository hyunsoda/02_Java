package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

// Service : 특정 기능(비즈니스 로직)을 제공하는 클래스
public class AbstractionService {
	
	// ctrl + shift + o : 해당 클래스에서 import 안된 거 전부 import하기
	// VO를 이용해서 기능을 짤 것
	public void ex1() {
		// 국민 객체 만들기
			// people은 설계도일 뿐 객체가 아님!
			// people을 보고 만든 객체가 진짜 객체
		People p1 = new People();
		// People p1 : People  객체의 주소를 저장하여 참조하는 변수 p1
			// p1이라는 방의 자료형은 People (사용자 정의 자료형)
		
		// new People(); : 새로운 People 객체를 Heap 영역에 생성
		
		// ** 클래스 이름이 자료형처럼 사용된다
		// == 그래서 클래스를 "사용자 정의 자료형"이라고도 한다!!**
		
		/*
		p1.name = "홍길동";
		p1.gender = '남';
		p1.pNo = "200303-1234567";
		p1.address = "서울시 중구 남대문로 120 그레이츠청계 3층 E강의장";
		p1.phone = "010-1234-1234";
		p1.age = 4;
		
		System.out.println("p1의 name : " + p1.name);
		System.out.println("p1의 gender : " + p1.gender);
		System.out.println("p1의 pNo : " + p1.pNo);
		System.out.println("p1의 address : " + p1.address);
		System.out.println("p1의 phone : " + p1.phone);
		System.out.println("p1의 age : " + p1.age);
		*/
		
		p1.setName("홍길동");
		p1.setGender('남');
		p1.setpNo("200303-1234567");
		p1.setAddress("서울시 중구 남대문로 120 그레이츠청계 3층 E강의장");
		p1.setPhone("010-1234-1234");
		p1.setAge(4);
		
		// get name은 필드에 있는 name 변수를 호출한 쪽으로 되돌려 줌
		System.out.println("p1의 name : "+ p1.getName());
		System.out.println("p1의 gender : "+ p1.getGender());
		System.out.println("p1의 pNo : "+ p1.getpNo());
		System.out.println("p1의 address : "+ p1.getAddress());
		System.out.println("p1의 phone : "+ p1.getPhone());
		System.out.println("p1의 age : "+ p1.getAge());
		p1.tax();
		p1.vote();
		System.out.println("============================");
		// 본인 객체
		People sohyun = new People();
		
		sohyun.setName("안소현");
		sohyun.setGender('여');
		sohyun.setpNo("000626-4123456");
		sohyun.setAddress("서울시 노원구");
		sohyun.setPhone("010-3604-5672");
		sohyun.setAge(25);
		
		System.out.println("sohyun의 name : "+ sohyun.getName());
		System.out.println("sohyun의 gender : "+ sohyun.getGender());
		System.out.println("sohyun의 pNo : "+ sohyun.getpNo());
		System.out.println("sohyun의 address : "+ sohyun.getAddress());
		System.out.println("sohyun의 phone : "+ sohyun.getPhone());
		System.out.println("sohyun의 age : "+ sohyun.getAge());
		sohyun.tax();
		sohyun.vote();
		
		
		
		
		
		
		
		
		
		
	}
}
