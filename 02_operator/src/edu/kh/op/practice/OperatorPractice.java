package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
  Scanner sc = new Scanner(System.in);
	public void practice1() {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수");
		int people = sc.nextInt();
		
		System.out.print("사탕 개수");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 :" + candy/people);
		System.out.println("남는 사탕 개수 :" + candy % people);
		
	}
	
	public void practice2() {

		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(정수만) :");
		int grade = sc.nextInt();
		
		System.out.print("반(정수만) :");
		int classname = sc.nextInt();
		
		System.out.print("번호(정수만) :");
		int iNum = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별(남학생/여학생) :");
		String sex = sc.nextLine();
		
		System.out.print("성적(소수점 아래 둘째 자리까지) :");
		double gradenum = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.",grade, classname, iNum, name, sex,gradenum);
		
		
		
		
	}

	public void practice3() {
		System.out.print("국어 :");
		int sub1 = sc.nextInt();
		
		System.out.print("영어 :");
		int sub2 = sc.nextInt();
		
		System.out.print("수학 :");
		int sub3 = sc.nextInt();
		
		System.out.println("합계 : " +(sub1+sub2+sub3));
		System.out.println("평균 : "+ (sub1+sub2+sub3)/3.0);
		}

}
