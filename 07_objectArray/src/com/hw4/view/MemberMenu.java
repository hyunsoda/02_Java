package com.hw4.view;

import java.util.Scanner;

import com.hw4.controller.MemberController;

public class MemberMenu {
	
	private MemberController mc = new MemberController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
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
		
		do {
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
			
			
			
			
		}while(sel!=0);
		
	}
	
	public void insertMember() {
	
	}

	public void searchMember() {
		
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
