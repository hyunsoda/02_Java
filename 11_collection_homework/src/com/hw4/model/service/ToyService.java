package com.hw4.model.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import com.hw4.model.dto.Toy;


public class ToyService {
	private Set<Toy> toy = new HashSet<Toy>();
	// 리스트로 만들어서 set에 넣기
	
	private Map<Integer, String> ingredlist = new HashMap<Integer, String>();
	private Scanner sc = new Scanner(System.in);
	
	public ToyService() {
		Toy t1 = new Toy("마미롱레그", 8,36000,"분홍색",19950805,"면직물,고무");
		Toy t2 = new Toy("허기워기",5,12000,"파란색", 19940312,"면직물, 플라스틱");
		Toy t3 = new Toy("키시미시",5,15000,"분홍색",19940505,"면직물, 플라스틱");
		Toy t4 = new Toy("캣냅",8,27000,"보라색",19960128,"면직물, 플라스틱");
		Toy t5 = new Toy("파피", 12,57000,"빨간색",19931225,"면직물, 플라스틱,고무");
		
		toy.add(t1);
		toy.add(t2);
		toy.add(t3);
		toy.add(t4);
		toy.add(t5);
		
		
		ingredlist.put(1,"면직물" );
		ingredlist.put(2,"플라스틱" );
		ingredlist.put(3,"유리" );
		ingredlist.put(4,"고무" );
	}
	
	public void displayMenu() {
		int menuNum = -1;
		do {
			
		
		System.out.println("<<플레이타임 공장>>");
		System.out.println("1. 전체 장난감 조회하기");
		System.out.println("2. 새로운 장난감 만들기");
		System.out.println("3. 장난감 삭제하기");
		System.out.println("4. 장난감 제조일 순으로 조회하기");
		System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
		System.out.println("6. 재료 추가");
		System.out.println("7. 재료 제거");
		
		System.out.println("선택 : ");
		try {
			menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1 : selectToy(); break;
			case 2 : System.out.println(addToy());  break;
			case 3 : System.out.println(removeToy()); break;
			case 4 : sortToy();break;
			case 5 : ageavailableToy();break;
			case 6 : System.out.println(addIngredient());  break;
			case 7 : System.out.println(removeIngredient()); break;
			
			
			
			}
		}catch(InputMismatchException e) {
			System.out.println("숫자를 입력해주세요.");
			sc.nextLine();
		}
		}while(menuNum !=0);
		
	}
	
	public void selectToy() throws InputMismatchException{
		System.out.println("<전체 장난감 목록>");
		List<Toy> list = new ArrayList<Toy>(toy);
		for(int i = 0; i<toy.size();i++) {
			System.out.print(i+1+". ");
			System.out.println(list.get(i));
		}
	}
	
	public String addToy() throws InputMismatchException{
		
		
		System.out.println("<새로운 장난감 추가>");
		System.out.print("장난감 이름 : ");
		String name = sc.next();
		
		System.out.print("사용 가능 연령 : ");
		int age = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		System.out.print("색상 : ");
		String color = sc.next();
		
		System.out.println("제조일 (YYYYMMDD 형식을 입력) : ");
		int date = sc.nextInt();
		
		String ingredient = "x";
		String sum = "";
		do {
			
			System.out.println("재료를 입력하세요 (종료하려면 'q'를 입력하세요) : ");
			ingredient = sc.next();
			if(ingredient.toUpperCase().charAt(0)!= 'Q') {
				sum += ingredient;
			}
			
		} while(ingredient.toUpperCase().charAt(0)!= 'Q') ;
			
		
		if(toy.add(new Toy(name,age,price,color,date,sum))) {
			return "새로운 장난감이 추가되었습니다";
		} else {
			return "실패";
		}
		
	}
	
	public String removeToy() throws InputMismatchException{
		System.out.print("삭제할 장난감의 이름을 입력하세요 : ");
		String name = sc.next();
		int index = 0;
		
		List<Toy> list = new ArrayList<Toy>(toy);
		for(int i = 0; i<list.size();i++) {
			if(name.equals(list.get(i).getName())) {
			index = i;
			toy.remove(list.get(index));
		}
		
		}
		return "장난감이 삭제되었습니다";
		
		}

	public void sortToy() throws InputMismatchException{
		System.out.println("<제조일 순으로 장난감을 정렬>");
		List<Toy> list = new ArrayList<Toy>(toy);
		Comparator<Toy> toyComparator = Comparator.comparing(Toy::getManufacture);
		Collections.sort(list,toyComparator);
		for(Toy std : list) {
			System.out.println(std);
		}
	}

	public void ageavailableToy() throws InputMismatchException{
		System.out.println("<연령별로 사용 가능한 장난감>");
		Iterator<Toy> it= toy.iterator();
		List<Toy> list = new ArrayList<Toy>(toy);
		Comparator<Toy> toyComparator = Comparator.comparing(Toy::getAge);
		Collections.sort(list,toyComparator);
		String str = "";
		int index = 1;
		
		for(int i = 0 ; i< list.size();i++) {
			
			for(int avail = 0; avail<20; avail++) {
				
				if(list.get(i).getAge()==avail) {
				str+="[연령 : "+list.get(i).getAge() +"세]: ";
				str+=list.get(i)+"\n";
			} else {
				
			}
			}
			
		}
			
			System.out.println(str);		
	}

	public String addIngredient() throws InputMismatchException{
		System.out.println("<재료 추가>");
		System.out.println("===현재 등록된 재료===");
		Set<Entry<Integer, String>> entrySet = ingredlist.entrySet(); // Entry로 만든 제네릭 Set은 Entry<String, String>
		
		// 향상된 for문 + EntrySet
		
		// Entry.getKey() : Key만 얻어오기
		// Entry.getValue() : Value만 얻어오기
		for(Entry<Integer, String> entry: entrySet) {
			System.out.printf("%s: %s \n", 
			entry.getKey(), entry.getValue());
		}
		System.out.println("==========");
		System.out.print("재료 고유번호 (Key) 입력 : ");
		int key = sc.nextInt();
		
		System.out.print("재료명 입력 : ");
		String name = sc.next();
		
		for(Entry<Integer, String> entry: entrySet) {
			if(key==entry.getKey()) {
				System.out.println("이미 해당 키에 재료가 등록되어 있습니다.");
				System.out.println("덮어쓰시겠습니까? (Y/N) : ");
				char ch = sc.next().toUpperCase().charAt(0);
				if(ch=='Y') {
					ingredlist.put(key, name);
					return "재료가 성공적으로 덮어쓰기 되었습니다.";
				}else {
					return "실패";
				}
			}
		}
		
		ingredlist.put(key, name);
		return "재료가 성공적으로 덮어쓰기 되었습니다.";
		
		
	}

	public String removeIngredient() throws InputMismatchException{
		System.out.println("<재료 삭제>");
		System.out.println("===현재 등록된 재료===");
		Set<Entry<Integer, String>> entrySet = ingredlist.entrySet(); // Entry로 만든 제네릭 Set은 Entry<String, String>
	
		for(Entry<Integer, String> entry: entrySet) {
			System.out.printf("%s: %s \n", 
			entry.getKey(), entry.getValue());
		}
		System.out.println("==========");
		String str = "";
		System.out.print("삭제할 재료명 입력 : ");
		String name = sc.next();
		for(int i = 0; i<ingredlist.size();i++) {
			if(name.equals(ingredlist.get(i))) {
				str = ingredlist.remove(i);
				return "재료"+ str+"가 성공적으로 제거되었습니다.";
			}
		}
		return "해당 이름의 재료가 존재하지 않습니다.";
		
	}
}
