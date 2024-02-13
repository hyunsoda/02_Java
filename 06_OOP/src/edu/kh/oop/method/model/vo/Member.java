package edu.kh.oop.method.model.vo;

public class Member { // 속성 + 기능

	// 필드
	private String memberId; // 아이디
	private String memberPw; // 비밀번호
	private String memberName; // 이름
	private int memberAge; // 나이
	
	// 생성자
	// 생성자 규칙 : 반환형이 없고, 클래스명과 이름이 같아야 한다.
	
	// 기본생성자
	// ctrl + space 제일 첫 번째 거 enter
	public Member() {}

	// 매개변수 생성자 (필드 모두 초기화)
	// 자동완성 : alt+ shift + s -> Generate Constructor and Using Field...
	public Member(String memberId, String memberPw, String memberName, int memberAge) {
		// 오버로딩 적용(매개변수의 개수 다름)
		
		// 매개변수로 전달받은 값을 필드로 대입시키기
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
	}

	
	// 메서드 (getter/setter 포함)
	// alt +shift + s => r
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}	

	
	
	
}
