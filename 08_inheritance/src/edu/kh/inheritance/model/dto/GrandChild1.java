package edu.kh.inheritance.model.dto;

//  상속 계층 구조
// Object
// 	ㄴ Person
//		ㄴ Employee
//				ㄴ GrandChild

public class GrandChild1 extends Employee{

	// final 메서드 확인(오버라이딩 불가)
	/*
	@Override
	public void onlyEmployee() {}
	// Cannot override the final method from Employee
	*/
	
}
