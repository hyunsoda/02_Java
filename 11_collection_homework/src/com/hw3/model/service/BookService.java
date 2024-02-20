package com.hw3.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class BookService {

	private List<Book> bookList = new ArrayList<Book>();
	private List<Book> bookmark = new ArrayList<Book>();
	
	private Scanner sc = new Scanner(System.in);
	
	
	public BookService() {
		bookList.add(new Book(1111,"세이노의 가르침","세이노",6480,"데이원"));
		bookList.add(new Book(2222,"문과남자의 과학공부","유시민",15750,"돌베개"));
		bookList.add(new Book(3333,"역행자", "자정",17550,"홍진지식하우스"));
		bookList.add(new Book(4444,"꿀벌의 예언","베르나르 베르베르",15120,"열린책들"));
		bookList.add(new Book(5555,"도둑맞은 집중력","요한 하리",16920,"어크로스"));
	}
	
	public void displayMenu() {
		System.out.println("==== 도서 목록 프로그램 =====");
		int menuNum = 0;
		do {
			System.out.println("1. 도서등록");
			System.out.println("2. 도서 조회");
			System.out.println("3. 도서 수정");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 즐겨찾기 추가");
			System.out.println("6. 즐겨찾기 삭제");
			System.out.println("7. 즐겨찾기 조회");
			System.out.println("8. 추천도서 뽑기");
			System.out.println("0. 프로그램 종료");
		
		try {
			System.out.print("메뉴를 입력하세요 : ");
			menuNum = sc.nextInt();
			sc.nextLine();
			switch(menuNum) {
			case 1 : System.out.println(addBook()); break;
			case 2 : selectBook();break;
			case 3 : updateBook();break;
			case 4 : System.out.println(removeBook());;break;
			case 5 : System.out.println(addBookMark()); break;
			case 6 : System.out.println(removeBookMark());break;
			case 7 : selectBookMark();break;
			case 8 : pickBook();break;
			case 0 : System.out.println("프로그램을 종료합니다."); ;break;
			
			}
			
		} catch(InputMismatchException e) {
			System.out.println("올바른 숫자를 입력해주세요.");
			menuNum = -1;
		}
		} 
		while(menuNum !=0);
		
		
	}
	
	public String addBook() throws InputMismatchException{
		System.out.println("=====도서 등록======");
		
		System.out.print("도서 번호 : ");
		int bookNum = sc.nextInt();
		sc.nextLine();
		
		System.out.print("도서 제목 : ");
		String name = sc.nextLine();
		
		System.out.print("도서 저자 : ");
		String author = sc.nextLine();
		
		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		System.out.print("도서 출판사 : ");
		String publisher = sc.nextLine();
		
		if(bookList.add(new Book(bookNum,name, author, price, publisher))) {
			return "등록 성공";
		} else {
			return "등록 실패";
		}
	}

	public void selectBook() throws InputMismatchException{
		for(Book bk : bookList) {
			System.out.println(bk);
		}
	}

	public void updateBook() throws InputMismatchException{
		System.out.println("======도서 수정======");
		
		System.out.println("수정할 도서 번호를 입력하세요 : ");
		int num = sc.nextInt();
		int index = 0;
		
		
		for(Book bk : bookList) {
			int fixNum = -1;
			if(num == bk.getBookNum()) {
				
				for(int i =0; i<bookList.size();i++) {
					if(num == bookList.get(i).getBookNum()) {
						index = i;
					}
				
				
				
				System.out.println("1. 도서명");
				System.out.println("2. 도서 저자");
				System.out.println("3. 도서 가격");
				System.out.println("4. 도서 출판사");
				System.out.println("0. 수정 종료");
				System.out.print("어떤 정보를 수정하시겠습니까 ? :");
				
				fixNum = sc.nextInt();
				sc.nextLine();
				
				
				switch(fixNum) {
				case 1 : System.out.println("=====도서명 수정=====");
						 System.out.print("수정할 도서명을 입력하세요 : ");
						
						 String fixName = sc.nextLine();
						 bookList.set(index, new Book(bk.getBookNum(),fixName,bk.getAuthor(),bk.getPrice(),bk.getPublisher()));
						 System.out.println("수정 완료"); break;
						
				case 2 : System.out.println("=====도서 저자 수정=====");
						 System.out.print("수정할 도서저자를 입력하세요 : ");
						
						 String fixAuthor = sc.nextLine();
						 bookList.set(index, new Book(bk.getBookNum(),bk.getName(),fixAuthor,bk.getPrice(),bk.getPublisher()));
						 System.out.println("수정 완료"); break;	
						 
				case 3 :  System.out.println("=====도서 가격 수정=====");
						  System.out.print("수정할 도서가격을 입력하세요 : ");
							
						  int fixPrice = sc.nextInt();
						  bookList.set(index, new Book(bk.getBookNum(),bk.getName(),bk.getAuthor(),fixPrice,bk.getPublisher()));
						  System.out.println("수정 완료"); break;
						  
				case 4 : System.out.println("=====도서 출판사 수정=====");
						  System.out.print("수정할 도서출판사를 입력하세요 : ");
							
						  String fixPublisher = sc.nextLine();
						  bookList.set(index, new Book(bk.getBookNum(),bk.getName(),bk.getAuthor(),bk.getPrice(),fixPublisher));
						  System.out.println("수정 완료"); break;
				case 0 : System.out.println("수정 종료"); return;					
					
				}
				
				
			}
		}
		}
		
	}

	public String removeBook() throws InputMismatchException{
		
		System.out.println("======도서 삭제=======");
		
		System.out.print("삭제할 도서 번호를 입력해주세요.");
		int removeNum = sc.nextInt();
		int index = -1;
		System.out.print("정말 삭제하시겠습니까?(Y/N) :");
		char ch = sc.next().toUpperCase().charAt(0);
		if(ch == 'Y') {
				for(int i = 0; i<bookList.size();i++) {
				if(removeNum == bookList.get(i).getBookNum()) {
					index = i;
				}
			}
			
		bookList.remove(index);
			return "삭제되었습니다.";
			
		} else {
			return "취소";
		}
		
		
	}

	public String addBookMark() throws InputMismatchException{
		System.out.println("======즐겨찾기 추가 ======");
		
		System.out.print("즐겨찾기 할 책 번호를 입력해주세요 : ");
		int num = sc.nextInt();
		int index = -1;
		for(int i = 0; i<bookList.size(); i++) {
			if(num == bookList.get(i).getBookNum()) {
				index = i;
			}
		}
		if(
		bookmark.add(new Book(bookList.get(index).getBookNum(),bookList.get(index).getName(),bookList.get(index).getAuthor(),
				bookList.get(index).getPrice(),bookList.get(index).getPublisher()))
		) {
			return "즐겨찾기 완료";
		} else {
			return "즐겨찾기 실패";
		}
		
		}
	
	public String removeBookMark() throws InputMismatchException{
		System.out.println("=====즐겨찾기 삭제=======");
		
		System.out.print("즐겨찾기 삭제할 도서 번호를 입력해주세요.");
		int removeNum = sc.nextInt();
		int index = -1;
		System.out.print("정말 삭제하시겠습니까?(Y/N) :");
		char ch = sc.next().toUpperCase().charAt(0);
		if(ch == 'Y') {
				for(int i = 0; i<bookmark.size();i++) {
				if(removeNum == bookmark.get(i).getBookNum()) {
					index = i;
				}
			}
			
		bookmark.remove(index);
			return "삭제되었습니다.";
			
		} else {
			return "취소";
		}
	
	}

	public void selectBookMark() throws InputMismatchException{
		if(bookmark.isEmpty()) {
			System.out.println("즐겨찾기를 추가해주세요.");
		} else {
			for(Book bk : bookmark) {
			System.out.println(bk);
		}
		}
		
	}

	public void pickBook() throws InputMismatchException{
		int random = (int)(Math.random()*bookList.size());
		System.out.println("추천도서 : " + bookList.get(random));
	}
}
