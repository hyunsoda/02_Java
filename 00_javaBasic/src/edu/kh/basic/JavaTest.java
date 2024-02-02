package edu.kh.basic; // 어떤 패키지 안에 클래스가 있는가

// 한 줄 주석 : 컴파일러(번역기)가 해석하지 않는 부분

/* 범위 주석 */

// class : 자바 코드가 작성되는 영역

public class JavaTest { 
	
	public static void main(String[] args) { 
		// main method(메서드) : 자바 어플리케이션(프로그램)을 실행하기 위해 반드시 필요한 메서드
		// 메서드 : 하나의 기능 단위
		
		System.out.println("Hello world!!!");
		// ctrl+alt+방향키 : 작성한 방향으로 해당 줄 복사
		
		System.out.println("점심 뭐먹지?");
		System.out.println("12345");
		
		System.out.println("----------------------------");
		
		// 숫자연산
		System.out.println("1+2"); // 1+2
		System.out.println(1+2); //3
		
		// "" 안에 작성된 코드는 단순 문자열로 인식
		// "" 안에 작성되지 않은 코드는 숫자, 변수로 인식
		System.out.println(50-23);
		System.out.println(12*13);
		System.out.println(327/3);
		System.out.println(12%2);
		
		// ""(문자열) + 숫자 함께 작성
		
		System.out.println("14 * 19 = " +266); //14 * 19 = 266 
		System.out.println("14 * 19 = " + 14 * 19); //14 * 19 = 266 
		
		System.out.println("90 + 70 + 65 =" + (90 + 70 +65)); // 사칙연산 우선순위때문에 뒤에도 문자열로 인식
		
		// 자바는 사칙연산의 우선순위를 그대로 따른다
		// -> 우선 계산을 원하면 () 괄호 사용
		
		// + 기호의 역할
		// -> 숫자 + 숫자 = 덧셈 연산 결과
		// -> 문자열 + 숫자 or
		// 	  문자열 + 문자열  --> 이어쓰기
	}
}
