package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
  Scanner sc = new Scanner(System.in);
	public void practice1() {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 :" + candy/people);
		System.out.println("남는 사탕 개수 :" + candy % people);
		
	}
	
	public void practice2() {

		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년 :");
		int grade = sc.nextInt();
		
		System.out.print("반 :");
		int classname = sc.nextInt();
		
		System.out.print("번호 :");
		int iNum = sc.nextInt();
		
		System.out.print("성별(남학생/여학생) :");
		String sex = sc.next();
		
		System.out.print("성적(소수점 아래 둘째 자리까지) :");
		double gradenum = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n",grade, classname, iNum, name, sex,gradenum);
		
		
		
		
	}

	public void practice3() {
		System.out.print("국어 :");
		int sub1 = sc.nextInt();
		
		System.out.print("영어 :");
		int sub2 = sc.nextInt();
		
		System.out.print("수학 :");
		int sub3 = sc.nextInt();
		
		double avg = (sub1+sub2+sub3)/3.0;
		System.out.println("합계 : " +(sub1+sub2+sub3));
		System.out.println("평균 : "+ (sub1+sub2+sub3)/3.0);
		
		// 각 과목이 40점이 넘고 평균이 60점 넘으면 합격 그렇지 못 하면 불합격
		boolean result = (sub1 >= 40) && (sub2 >= 40) && (sub3 >= 40) && (avg >= 60);
		
		System.out.println(result ? "합격" : "불합격");
	}

}
