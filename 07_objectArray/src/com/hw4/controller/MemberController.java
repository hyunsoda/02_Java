package com.hw4.controller;

import com.hw4.model.vo.Member;

public class MemberController {
	public static final int SIZE = 10;
	private int memberCount;
	private Member[] mem = new Member[SIZE];
	
	{
		mem[0] = new Member("user01", "pass01", "김유신",20 ,'M',"kim12@naver.com");
		mem[1] = new Member("user02", "pass02", "이순신",60 ,'M',"lee2@naver.com");
		mem[2] = new Member("user03", "pass03", "유관순",17 ,'F',"yo5@hanmail.net");
		mem[3] = new Member("user04", "pass04", "연개소문",57 ,'M',"yeon@gmail.com");
		mem[4] = new Member("user05", "pass05", "신사임당",45 ,'F',"shin@naver.com");
		memberCount = 5;
	}
	
	
	
	public int getMemberCount() {
		return this.memberCount; 
	}
	
	public Member[] getMem() {
		return this.mem; // 주소 값 리턴
		
	}

	public Member checkId(String userId) {
		Member m = null; // 아이디로 검색된 결과를 담을 변수 초기화
		
		// mem에서 매개변수로 전달받은 userId와 동일한 아이디를 가지고 있는 회원을 m에 대입
		for(int i = 0; i<memberCount;i++) {
			if(userId.equals(mem[i].getUserId())) 
				m = mem[i];
			if(mem[i]==null) break;
			
			
		}
		
		return m;
	}
	
	public void insertMember(Member m) {
		// 매개변수로 전달받은 회원정보를 mem객체에 추가
		mem[memberCount] = m;
		
		memberCount++;
	}

	public Member searchMember(int menu, String search) {
		Member searchMember = null;  // 검색된 회원 정보를 담을 변수 초기화
		// 매개변수로 전달받은 search 문자열을 menu번호에 따라
		for(int i =0; i<memberCount; i++) {
			if(menu == 1) {
				if(search.equals(mem[i].getUserId())) 
					searchMember = mem[i];
				
			}
			else if(menu == 2) {
				if(search.equals(mem[i].getName())) 
					searchMember = mem[i];
				
			}
			else {
				if(search.equals(mem[i].getEmail())) 
					searchMember = mem[i];
				 
			}
		}
		
	
		// 1인 경우 아이디로 검색 후 결과를 searchMember에 대입하고
		// 2인 경우 이름으로 검색 후 결과를 searchMember에 대입하고
		// 3인 경우 이메일로 검색 후 결과를 searchMember에 대입하고
	

		return searchMember;
		
	}
	
	public void updateMember(Member m, int menu, String update) {
		
		// 매개변수로 전달받은 m 회원과 변경 내용인 update 문자열을 menu에 따라
		
		// 1인 경우 setter메소드를 이용하여 m의 비밀번호를 update문자열로 변경
		// 2인 경우 setter메소드를 이용하여 m의 이름를 update문자열로 변경
		// 3인 경우 setter메소드를 이용하여 m의 이메일를 update문자열로 변경
		
	}

	public void deleteMember(String userId) {
		
		// 매개변수로 전달받은 userId가 mem에 존재하는 경우 해당 회원 삭제 후
		// 다음 인덱스 객체들의 정보를 한 칸씩 앞으로 이동 시킴
		// 실행 시 NullPointerException 발생할 수 있음 -> 왜 그런지 생각해보고 해결하시오
		
		memberCount--;
	}
	
	public Member[] sortIdAsc() {
		
		// 기존의 회원 객체 배열(mem)을 변경하지 않고 단지 정렬된 결과만을 보여주기 위해 
		// 기존의 배열 복사해서 사용 (clone(),System.arraycopy() 둘 중 하나 사용해서 복사
		Member copy[];
		
		// copy 배열을 아이디 별 오름차순 정렬 진행 --> HINT : compareTo() 메소드 활용
		
		return mem; // copy 주소값 리턴
		
	}
	
	public Member[] sortIdDesc() {
		// 위와 동일한 방식이지만 내림차순으로 정렬 후 주소 값 리턴
		return mem;
	}
	
	public Member[] sortAgeAsc() {
		// 위와 동일한 방식이지만 나이별 오름차순으로 정렬 후 주소 값 리턴
		// (숫자 비교이기 때문에 compareTo 사용 x)
		return mem;
	}

	public Member[] sortAgeDesc() {
		// 위와 동일한 방식이지만 내림차순으로 정렬 후 주소 값 리턴
		return mem;
	}
	
	public Member[] sortGenderDesc() {
		// 위와 동일한 방식이지만 성별 별 내림차순으로 정렬 후 주소 값 리턴
		// (남여 순으로 정렬)
		return mem;
	}
}
