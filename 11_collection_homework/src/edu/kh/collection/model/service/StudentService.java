package edu.kh.collection.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.model.vo.Student;

public class StudentService {

	private Scanner sc = new Scanner(System.in);
	
	private List<Student> studentList = new ArrayList<Student>();
	

	public void displayMenu() {
		int menuNum = 0;
		do {
			System.out.println("\n==============학생 관리 프로그램 ==================\n");
			System.out.println("1. 학생 정보 추가");
			System.out.println("2. 학생 정보 전체 조회");
			System.out.println("3. 학생 정보 수정");
			System.out.println("4. 학생 정보 제거");
			System.out.println("5. 이름으로 검색 (일치)");
			System.out.println("6. 이름으로 검색 (포함)");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 번호 선택 : ");
			
			try {
				menuNum = sc.nextInt();
				System.out.println(); 
				
				switch(menuNum) {
				case 1 : System.out.println(addStudent());  break;
				case 2 : selectAll(); break;
				case 3 : System.out.println(updateStudent());  break;
				case 4 : System.out.println(removeStudent());  break;
				case 5 : searchName1(); break;
				case 6 : searchName2(); break;
				case 0 : System.out.println("프로그램 종료 .."); break;
				default : System.out.println("메뉴에 작성된 번호만 입력하세요!");
					
				}
				
			}catch(InputMismatchException e) {
				System.out.println("올바른 문자를 입력해주세요");
				sc.nextLine(); // 입력 버퍼에 남은 문자 제거
				// menuNum이 0을가지고 있어서 종료되는 것 방지
				menuNum = -1;
			}
			
		} while(menuNum !=0);
	}
	
	/**
	 * 1. 학생 정보 추가 메서드
	 * - 추가 성공 시 "성공" 실패 시 "실패" 문자열 반환
	 */
	public String addStudent() throws InputMismatchException{
		System.out.println("========학생 정보 추가========");
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("지역 : ");
		String region = sc.next();
		
		System.out.print("성별 : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		if(studentList.add(new Student(name, age, region, gender, score))) {
			return "성공"; // studentList.add 는 리턴 타입이 boolean
		}else {
			return "실패";
		}
	}
	
	/**
	 * 학생 전체 조회 메서드
	 * - List가 비어있는 경우 "학생 정보가 없습니다" 출력
	 * - 있는 경우 전체 학생 출력
	 */
	public void selectAll() throws InputMismatchException{
		System.out.println("=========학생 전체 조회==========");
		
		int index = 0;
		if(studentList.isEmpty()) { // true면 비어있는 거
			System.out.println("학생을 등록해주세요");
		} else {
			
			for(Student std : studentList) {
				System.out.println(index + "번째 학생");
				index++;
				System.out.println(std); // toString()오버라이딩 되어있어서 가능
			}
			
			
		}
		
	}
	
	/**
	 * 학생 정보 수정 메서드
	 * - 학생정보가 studentList에 있는지 검사, 없다면 "입력된 학생 정보가 없습니다" 문자열 반환
	 * - 입력된 숫자가 0보다 작은지 검사, 작다면 "음수는 입력할 수 없습니다" 문자열 반환
	 * - studentList 범위 내 인덱스번호인지 검사, 초과했다면 "범위를 넘어선 값을 입력할 수 없습니다" 문자열 반환
	 * - 수정이 완료되었다면, "000의 정보가 변경되었습니다"라는 문자열 반환
	 */
	public String updateStudent() throws InputMismatchException{
		
		System.out.println("=============학생 정보 수정===========");
		System.out.print("수정할 학생의 index를 입력해주세요 : ");
		int index = sc.nextInt();
		
		if(studentList.isEmpty()) {
			return "입력된 학생 정보가 없습니다.";
		} else if(index <0) {
			return "음수는 입력할 수 없습니다.";
		} else if(index>studentList.size()) {
			return "범위를 넘어선 값을 입력할 수 없습니다.";
		} else {
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.print("지역 : ");
			String region = sc.next();
			
			System.out.print("성별 : ");
			char gender = sc.next().charAt(0);
			
			System.out.print("점수 : ");
			int score = sc.nextInt();
			
			Student temp = studentList.set(index, new Student(name, age, region, gender, score)); //새로운 객체 생성해서 set
			
			// temp는 수정되기 전 기존 회원 정보
			return temp.getName()+"님의 정보가 변경되었습니다";
		}
		
		
		
	}
	
	/** 학생 정보 제거 메서드
	 * @return String
	 */
	public String removeStudent() throws InputMismatchException{
		
		System.out.println("==========학생 정보 제거===========");
		System.out.print("제거할 학생의 index입력 : ");
		int index = sc.nextInt();
		
		if(studentList.isEmpty()) {
			return "입력된 학생 정보가 없습니다.";
		}else if(index <0){
			return "음수는 입력할 수 없습니다.";
		} else if(index > studentList.size()) {
			return "범위를 넘어선 값을 입력할 수 없습니다.";
		} else {
			Student std = studentList.remove(index);
			return std.getName() + "님의 정보가 삭제되었습니다.";
		}
		
	}
	
	/**
	 * 이름이 일치하는 학생을 찾아서 조회하는 메서드 (완전 일치)
	 * 검색할 이름 입력받아 studentList에서 꺼내온 Student 객체의 name 값이 같은지 비교
	 * - 일치하는 경우 Student 객체 출력
	 * - 검색 결과가 없습니다 출력
	 */
	public void searchName1() {
		System.out.println("========이름이 일치하는 학생 (완전 일치)==========");
		
		if(studentList.isEmpty()) {
			System.out.println("학생을 등록해주세요");
		}else {
			System.out.print("검색할 이름을 입력해주세요. :");
			String name = sc.next();

			for(Student std:studentList) {
				if(name.equals(std.getName())) {
					System.out.println(std);
					return;
				} else {
					System.out.println("검색 결과가 없습니다.");
					return;
			}
		}
		}
		
	}

	/**
	 * 이름에 특정 문자열이 포함되는 학생을 찾아서 조회하는 메서드
	 * 문자열 입력받아 studentList에서 꺼내온 Student 객체의 name값에 포함되는 문자열인지 검사
	 * - 포함되는 경우  Student 객체 출력
	 * - 검색 결과가 없습니다 출력
	 */
	public void searchName2() {
		System.out.println("========이름으로 검색 (포함)==========");
		
		if(studentList.isEmpty()) {
			System.out.println("학생을 등록해주세요.");
		} else {
			System.out.print("검색할 문자열을 입력해주세요. : ");
			String name = sc.next();
			for(Student std : studentList) {
				if(name.contains(std.getName())) {
					System.out.println(std);
					return;
				}else {
					System.out.println("일치하는 결과가 없습니다.");
					return;
				}
			}
		}
	}
	
}
