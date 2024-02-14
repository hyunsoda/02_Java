package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {
	
	private Product pro[] = null;
	public static int count= 0; // 클래스명.변수명
	Scanner sc = new Scanner(System.in);
	
	{ // 초기화 블럭을 이용해서 배열 크기 할당
		pro = new Product[10];
	}

	
	
	int menuNum = 0;
	public void mainMenu() {
		do {
			System.out.println("=====제품 관리 메뉴=====");
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("3. 제품 삭제");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 선택 : ");
			menuNum = sc.nextInt();
			sc.nextLine();
			
			
			switch(menuNum) {
			case 1 : productInput(); break;
			case 2 : productPrint(); break;
			case 3 : productDelete(); break;
			case 0 : System.out.println("프로그램 종료"); break;
			default : System.out.println("1,2,3,0 중에 선택하세요.");
			}
			
		}while(menuNum != 0);
	}
	
	public void productInput() {
		// 키보드로 도서 정보를 입력 받아 객체 생성
		// 현재 카운트 인덱스에 생성한 주소 저장
		System.out.print("제품번호 : ");
		int pId = sc.nextInt();
		
		sc.nextLine(); // 입력버퍼 개행 제거
		
		System.out.print("제품명 : ");
		String pName = sc.nextLine();
		
		System.out.print("제품가격 : ");
		int price = sc.nextInt();
		
		System.out.print("제품 세금 :");
		double tax = sc.nextDouble();

			pro[count] = new Product(pId,pName,price,tax);
			System.out.println("제품 정보 추가 완료!");
		}
		

	
	public void productPrint() {
		// 현재까지 기록된 도서 정보 모두 출력
		for(int i = 0; i < count; i++) {
			System.out.println(pro[i].information());
				
			}
		}
		
	public void productDelete() {
		System.out.print("삭제할 도서명을 입력하세요 : ");
		String delete = sc.next();
		for(int i = 0; i< pro.length; i++) {
			if (pro[i].getpName().equals(delete)) {
				pro[i] = null;
				System.out.println("도서를 삭+제했습니다");
				break;
			}else {
				System.out.println("없는 도서입니다.");
				break;
			}
		}
		
	}
	
	}
	

