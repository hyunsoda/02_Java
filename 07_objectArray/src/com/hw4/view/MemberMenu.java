package com.hw4.view;

import java.util.Scanner;

import com.hw4.controller.MemberController;
import com.hw4.model.vo.Member;

public class MemberMenu {
	
	private MemberController mc = new MemberController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		while(true) {
			
		
		System.out.println("===== 회원 관리 메뉴 =====");
		System.out.println("1. 신규 회원 등록");
		System.out.println("2. 회원 정보 검색");
		System.out.println("3. 회원 정보 수정");
		System.out.println("4. 회원 정보 삭제");
		System.out.println("5. 회원 정보 출력");
		System.out.println("6. 회원 정보 정렬");
		System.out.println("0. 프로그램 종료");
		
		System.out.print("메뉴 선택 : ");
		int sel = sc.nextInt();
		sc.nextLine();		
		
			switch(sel) {
			case 1: insertMember(); break;
			case 2 : searchMember(); break;
			case 3 : updateMember();break;
			case 4 : deleteMember();break;
			case 5 : printAllMember();break;
			case 6 : sortMember(); break;
			case 0 : System.out.println("프로그램 종료");break;
			default : System.out.println("다른 숫자를 선택해주세요");break;
			}
			
			
		}	
			
		
		
	}
	
	public void insertMember() {
//		등록할 회원에 대한
//		정보를 입력 받고 동일한 아이디가
//		없는 경우 MemberController의
//		insertMember 메소드 실행
		System.out.println("=== 신규 회원 등록 ===");
		
		
		
		// 1. 현재 회원 수(memberCount)가 최대 회원 수 (SIZE)를 넘어설 경우 return처리
		if(mc.getMemberCount() >MemberController.SIZE) {
			return;
		}
		
		// 2. 아이디를 입력 받아 MemberControllerdml checkId()메소드로 전달 결과값
		System.out.print("아이디 : ");
		String userId = sc.next();
		if(mc.checkId(userId) != null) {
			System.out.println("동일한 아이디가 존재합니다. 회원등록 실패");
		} else {
			
			System.out.print("비밀번호 : ");
			String userPwd = sc.next();
			
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.print("성별 : ");
			char gender = sc.next().charAt(0);
			
			System.out.print("이메일 : ");
			String email = sc.next();
			Member m = new Member(userId, userPwd, name, age,gender,email);
			mc.insertMember(m);
			return;
		}
		
		
		
	}

	public void searchMember() {
		System.out.println("====회원 정보 검색====");
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 이전메뉴로");
		
	}

	public void updateMember() {
		
	}

	public void deleteMember() {
		
	}
	
	public void printAllMember() {
		
	}
	
	public void sortMember() {
		
	}
}
