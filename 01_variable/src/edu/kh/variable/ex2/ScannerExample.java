package edu.kh.variable.ex2;

import java.util.Scanner;

// Scanner class를 쓰려면 import를 꼭 해줘야 함
// import구문은 항상 package아래 최상단에 있어야 한다
// import : 다른 패키지에 존재하는 클래스를 얻어오는 구문
// import java.util.Scanner : java.util 패키지에서 Scanner 설계도 수입

// Scanner라는 기계를 만들건데 지식이 없음 -> java.util에 Scanner라는 설계도가 있음 
// -> 설계도 수입해와서 ScannerExample(내가 만든 클래스)에서 설계도 보고 기계 만들어서 사용할 수 있게됨 

public class ScannerExample {
	public static void main(String[] args) {
		
		// Scanner : 프로그램 실행 중 키보드 입력을 받을 수 있게 하는 역할
		
		// Scanner 생성
		// -> 프로그램 안에 스캐너라는 기계를 만드는 것
		Scanner sc = new Scanner(System.in);
		// 오류 원인 -> 만들고 싶은데 설계도(class)가 없어서 못만들고 있음
		// -> import 구문 작성시 오류 해결
		
		System.out.print("정수 1 입력 : ");
		
		int input1 = sc.nextInt(); // 입력받은 정수를 input1이라는 변수에 대입
		// nextInt() : 다음 입력된 정수를 읽어옴 (키보드로 입력된 정수를 읽어옴)
		System.out.print("정수 2 입력 : ");
		int input2 = sc.nextInt(); 
		
		System.out.printf("%d+%d = %d\n",input1,input2,input1+input2);
		
		
		
		
		
	}
}
