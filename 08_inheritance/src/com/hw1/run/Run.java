package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Student[] students = new Student[3];
		Employee[] emp = new Employee[10];
		
		students[0] = new Student("홍길동",20, 178.2, 70.0, 1, "정보시스템공학과");
		students[1] = new Student("김말똥",21,187.3,80.0,2,"경영학과");
		students[2] = new Student("강개순",23,167.0,45.0,4,"정보통신공학과");
	
		
		// 학생 정보 모두 출력
		// 향상된 for문
		for(Student std : students) {
			// 자료형 변수명 : 배열
			// Student 자료형에 std라는 이름으로 배열을 반복 접근하면서 하나씩 꺼내옴
			System.out.println(std.information());
		}
//		for(int i = 0; i<students.length;i++) {
//			System.out.println(students[i].information());
//		}
		
		System.out.println("============================");
		
		// 사원들의 정보를 키보드로 입력받고, 추가할 것인지 물어보고.
		// 대소문자 상관없이 'y'이면 계속 객체 추가
		// 한 명씩 추가될 때마다 count
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사원 추가");
		char ch = 'a';
		int count = 0;
		
		while(true) {

				System.out.print("이름 : ");
				String name = sc.next();
				
				System.out.print("나이 : ");
				int age = sc.nextInt();
				
				System.out.print("신장 : ");
				double height = sc.nextDouble();
				
				System.out.print("몸무게 : ");
				double weight = sc.nextDouble();
				
				System.out.print("급여 : ");
				int salary = sc.nextInt();
				
				System.out.print("부서 : ");
				String dept = sc.next();
				emp[count] = new Employee(name, age,  height, weight, salary,dept);
				count++;
				
				System.out.print("추가하겠습니까?(y/n) ");
				//String str = sc.next().toUpperCase(); 
					// 들어오는 문자를 대문자로 바꿔주는 것
				ch = sc.next().charAt(0);

			
			if(ch!='Y'&&ch!='y') break;
		
				
			}
		
		
			// 현재까지 기록된 사원들의 정보를 모두 출력
		for(Employee emps :emp) {
			
			// NullPointerException : 
				// 10칸으로 만들었는데 다 안 채워서 에러 발생중
			// 향상된 for문은 0번부터 다 접근함 -> null은 information()이 없음
			
			// [**방지**]
			if(emps == null)break; // NullPointerException 방지
			System.out.println(emps.information());
			}
		
		
		
		
//				for(int i = 0; i<count;i++) {
//			System.out.println(emp[i].information());
						
		
		
		
		
	}

}
