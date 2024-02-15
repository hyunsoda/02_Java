package edu.kh.inheritance.model.dto;

/* Object
 * 	ㄴ Person
 * 		ㄴ Student
 * */



public class Student extends Person{
	// Student 클래스에 Person 클래스 내용을 연장한다
	// == Student 클래스에 Person 클래스 내용(필드, 메서드)을 추가하여 확장한다
	
	// ** 상속 **
	// 자식 extends 부모
	
	// 필드
//	private String name;
//	private int age;
//	private String nationality;
	private int grade; // 학년
	private int classRoom; //반
	
	public Student() {}

	public Student(String name, int age, String nationality, int grade, int classRoom) {
		
//		this.name = name;
//		this.age = age;
//		this.nationality = nationality;
		/*
		setName(name);
		setAge(age);
		setNationality(nationality);
		*/
		// 부모의 setter를 이용할 수 있지만 비효율적이다.
		// super(); // 부모의 기본생성자 // 자기가 상속받고 있는 부모님 생성자로 이동 
		
		// student의 매개변수로 들어온 값을 부모의 매개변수생성자 매개변수로 넘겨줌
		// -> 부모가 가진 필드의 값에 저장
		super(name,age,nationality); // person의 매개변수 생성자로 이동
		this.grade = grade;
		this.classRoom = classRoom;
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getNationality() {
//		return nationality;
//	}
//
//	public void setNationality(String nationality) {
//		this.nationality = nationality;
//	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}

	
	@Override
	public String toString() {
		return super.toString() + " / " + grade +" / " + classRoom;
		// super. : super참조변수
					// Student의 부모님으로 이동
		//super.toString(); == person의 toString()을 의미
	}
	
	
	
}
