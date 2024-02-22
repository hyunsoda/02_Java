package com.toyfactory.model.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.toyfactory.model.dto.Toy;

public class ToyFactory {
	// 예시 답
	
	private Scanner sc = new Scanner(System.in);
	private Set<Toy> toySet = new HashSet<Toy>(); // 중복된 Toy 객체가 없도록 저장할 컬렉션 중 Set
	private Map<Integer, String> materialMap = new HashMap<Integer, String>(); // 재료가 저장되어 있는 map
	
	public ToyFactory() {
		
		// 기본 등록된 재료
		materialMap.put(1,"면직물" );
		materialMap.put(2,"플라스틱");
		materialMap.put(3,"유리");
		materialMap.put(4,"고무" );
		
		// 다섯개 장난감 생성하기
		toySet.add(new Toy("마미롱레그", 8,36000,"분홍색","19950805",addMaterials(1,4)));
		toySet.add(new Toy("허기워기",5,12000,"파란색", "19940312",addMaterials(1,2)));
		toySet.add(new Toy("키시미시",5,15000,"분홍색","19940505",addMaterials(1,4)));
		toySet.add(new Toy("캣냅",8,27000,"보라색","19960128",addMaterials(1,4)));
		toySet.add(new Toy("파피", 12,57000,"빨간색","19931225",addMaterials(1,2,4)));
		
	}
	
	// materials에 전달받은 값들을 추가하고 Set으로 반환하는 메서드
	public Set<String> addMaterials(Integer...newMaterials){
		// Integer... 들어올 매개변수가 몇 개인지 모를 때 "변수명 ..." 사용
		
		Set<String> addedMaterials = new HashSet<String>();
		for(Integer materialKey : newMaterials) {
			
			// 맵에서 해당 번호 (key)에 대응하는 재료를 가져와 추가
			// 1이 있다 -> 면직물 가져와서 추가
			String materialValue = materialMap.get(materialKey); // value값을 리턴하고 저장
			
			if(materialValue != null) {
				addedMaterials.add(materialValue);
			}
		}
		
		return addedMaterials;
		
	}
	
	public void displayMenu() {
		int menuNum = 0;
		
		do {
			
			
		System.out.println("\n<<플레이타임 공장>>");
		System.out.println("1. 전체 장난감 조회하기");
		System.out.println("2. 새로운 장난감 만들기");
		System.out.println("3. 장난감 삭제하기");
		System.out.println("4. 장난감 제조일 순으로 조회하기");
		System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
		System.out.println("6. 재료 추가");
		System.out.println("7. 재료 제거");
		System.out.println("0. 프로그램 종료");
		
		System.out.print("선택 : ");
		
		try {
			menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1 : displayAllToys(); break;
			case 2 : createNewToy();  break;
			case 3 : deleteToy(); break;
			case 4 : displayToysByManufactureDate();break;
			case 5 : displayToysByAge();break;
			case 6 : addMaterial();  break;
			case 7 : removeMaterialByName(); break;
			case 0 : System.out.println("프로그램을 종료합니다.");break;
			default : System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
			
		}catch(Exception e) {
			System.out.println("알맞은 입력을 해라...(경고)..");
			
			sc.nextLine();
			
			menuNum = -1; // 첫 반복에서 예외 발생 시 종료되지 않도록 menuNum 값을 임의의 값으로 세팅
		}
		}while(menuNum !=0);
	}
	
	// 전체 장난감 조회하기
	public void displayAllToys() throws Exception{
		
		System.out.println("<전체 장난감 목록>");
		
		int index = 1;
		for(Toy toy : toySet) {
			System.out.println(index + ". " + toy);
			index++;
		}
		
	}
	
	// 새로운 장난감 만들기
	public void createNewToy() {
		System.out.println("<새로운 장난감 추가>");
		
		System.out.println("장난감 이름 : ");
		String name = sc.next();
		
		// 기존에 있는 장난감인지 확인
		for(Toy existingToy : toySet) {
			
			if(existingToy.getName().equals(name)) {
				System.out.println("이미 같은 이름을 가진 장난감이 존재합니다.");
				return;
			}
		}
		System.out.print("사용 가능 연령 : ");
		int age = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		System.out.print("색상 : ");
		String color = sc.next();
		
		System.out.println("제조일 (YYYYMMDD 형식을 입력) : ");
		String manufactureDate = sc.next();
		
		Set<String> materials = new HashSet<String>(); // 재료 저장할 컬렉션
		while(true) {
			System.out.print("재료를 입력하세요 (종료하려면 'q'를 입력하세요) : ");
			String input = sc.next();
			if(input.equals("q")) {
				break;
			}
			
			materials.add(input);
			
			
		}
		Toy newToy = new Toy(name,age,price, color, manufactureDate,materials);
	
		toySet.add(newToy);
		System.out.println("새로운 장난감이 추가되었습니다.");
	
	}
	
	// 장난감 삭제하기
	public void deleteToy() {
		
		System.out.println("삭제할 장난감의 이름을 입력하세요 : ");
		String toyName = sc.next();
		
		boolean flag = false;
		
		for(Toy toy : toySet) {
			if(toy.getName().equals(toyName)) {
				toySet.remove(toy);
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("장난감이 삭제되었습니다.");
		}else {
			System.out.println("해당하는 이름의 장난감을 찾을 수 없습니다.");
		}
		
		
	}

	// 제조일 순으로 장난감 정렬하기
	public void displayToysByManufactureDate() {
		
		System.out.println("<제조일 순으로 장난감을 정렬>");
		
		List<Toy> toyListSortedByDate = new ArrayList<Toy>(toySet); // 소괄호 안에 set을 넣어서 arraylist로 변환
		 
		toyListSortedByDate.sort(Comparator.comparing(Toy::getManufactureDate)); // getManufactureDate는 메서드 레퍼런스
		
		int index =1;
		for(Toy toy : toyListSortedByDate) {
			System.out.println(index + ". " + toy);
			index ++;
			
			
		}
		
		
	}

	// 연령별 장난감 정렬하여 출력하기
	public void displayToysByAge() {
		System.out.println("<연령별로 사용 가능한 장난감>");
		
		Map<Integer, List<Toy>> toysByAge = new HashMap<Integer, List<Toy>>();
		// toysByAge라는 이름의 새로운 맵을 생성
		// -> 연령을 key로 하고, 해당 연령을 가진 장난감 List를 value로 가짐
		//  {K : V } -> { 5 : ["키시미시","허기워기"] }
		
		for(Toy toy : toySet) {
			
			int age = toy.getAge(); // 키시미시이면 5
			
			toysByAge.putIfAbsent(age, new ArrayList<>());
			// putIfAbsent() : Map 인터페이스에서 제공되는 메서드로,
			// 해당 키가 존재하지 않는 경우에만 전달받은 값을 추가함.
			// -> 맵에 해당 연령의 리스트가 없는 경우에만 새로운 리스트를 생성하여 추가
			
			// 5가 들어와서 없으면 새로운 리스트를 추가해줌
			// toysByAge.get(age) 빈 리스트 (value쪽)을 의미
			toysByAge.get(age).add(toy);
			
			// 캡냅의 나이를 가져오니 10 
			// key에 10에 대응되는 값이 있나? 없음
			// key에 추가 , value에 빈 리스트 생성
			// value에 캡냅 추가
			
		}
		for(Entry<Integer, List<Toy>> entry : toysByAge.entrySet()) {
			
			int age = entry.getKey(); 
			List<Toy> toyList= entry.getValue();
			
			System.out.println("[연령 : "+ age + "세]");
			int index = 1;
			
			for(Toy toy : toyList) {
				System.out.println(index + ". " + toy);
				index++;
			}
			
		}
		
	}

	// 재료 추가하기
	public void addMaterial() throws Exception{
		
		System.out.println("<재료 추가>");
		System.out.println("=== 현재 등록된 재료 ===");
		
		for(Entry<Integer,String> entry : materialMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println("======================");
		
		System.out.print("재료 고유번호 (Key) 입력 : ");
		int key = sc.nextInt();
		
		System.out.print("재료명 입력 : ");
		String material = sc.next();
		
		if(materialMap.containsKey(key)) {
			System.out.println("이미 해당 키에 재료가 등록되어 있습니다.");
			System.out.print("덮어쓰시겠습니까? (Y/N) : ");
			String input = sc.next();
			
			if(input.equalsIgnoreCase("Y")) {
				materialMap.put(key,material);
				System.out.println("재료가 성공적으로 덮어쓰기 되었습니다!");
			}else{
				System.out.println("재료 추가가 취소되었습니다.");
			}
			
		}else { // 키가 맵에 없는 경우 : 새 거
			materialMap.put(key, material);
			System.out.println("새로운 재료가 성공적으로 등록되었습니다!");
		}
		
		
		
	}

	// 재료명으로 재료 삭제하기
	public void removeMaterialByName() throws Exception{
		
		System.out.println("<재료 삭제>");
		System.out.println("=== 현재 등록된 재료 ===");
		
		for(Entry<Integer,String> entry : materialMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println("=========================");
		
		System.out.print("삭제할 재료명 입력 : ");
		String materialName = sc.next();
		
		boolean flag = false;
		
		for(Entry<Integer,String> entry: materialMap.entrySet()) {
			
			if(entry.getValue().equals(materialName)) {
				materialMap.remove(entry.getKey());
				System.out.println("재료 '"+ materialName + "' 가 성공적으로 제거되었습니다.");
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("해당 이름의 재료가 존재하지 않습니다.");
		}
		
	}
	
}
