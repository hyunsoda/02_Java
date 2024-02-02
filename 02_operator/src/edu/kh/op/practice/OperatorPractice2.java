package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 나이는? ");
		int age = sc.nextInt();
		
		System.out.println(age >= 20 ? "저는 성인입니다" : "저는 미성년입니다");
		
		System.out.print("청소년입니까? ");
		System.out.println((age >= 13) && (age <=19)? "true" :"false" );
		
		System.out.print("노인이거나 어린이 입니까? ");
		System.out.println((age>= 65) || (age<=12)? "true" : "false" );
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 나이는? ");
		int age = sc.nextInt();
		
		String personType = (age>=20)? "성인" : "미성년";
		System.out.println("저는" + personType + "입니다");
		
		boolean isTeenager = (age>=13) && (age<=19);
		System.out.println("청소년입니까?" + isTeenager);
		
		boolean isSeniorOrChild = (age >= 65) || (age <=12);
		System.out.println("노인이거나 어린이 입니까?" + isSeniorOrChild);
	}
	
}	
