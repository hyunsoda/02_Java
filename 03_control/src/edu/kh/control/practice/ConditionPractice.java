package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
//		키보드로 입력 받은 정수가 양수이면서 짝수일 때만 “짝수입니다.”를 출력하고
//		짝수가 아니면 “홀수입니다.“를 출력하세요.
//		양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		System.out.print("숫자를 한 개 입력하세요 :");
		int input = sc.nextInt();
		
		if(input > 0 && input % 2 ==0) {
			System.out.println("짝수입니다");
		} else if(input % 2 == 1) {
			System.out.println("홀수입니다.");
		} else if(input <=0) {
			System.out.println("양수만 입력해주세요.");
		}
		
	}
	
	public void practice2() {
//		국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
//		합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
//		(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
//
//		합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
//		불합격인 경우에는 “불합격입니다.”를 출력하세요.
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.println("영어점수 : ");
		int eng = sc.nextInt();
		System.out.println("수학점수 : ");
		int math = sc.nextInt();
		
		int sum = kor+eng+math;
		System.out.println(sum);
		if(kor<40 || eng <40 || math < 40 || sum < 60) {
			System.out.println("불합격입니다");
		} else {
			System.out.printf("국어 : %d,\n영어 : %d,\n수학 : %d,\n합계 : %d,\n평균 : %.1f,\n축하합니다 합격입니다",
					kor, eng, math, sum, sum/3.0 );
		}
	}

	public void practice3() {
		/*
		 * 1~12 사이의 수를 입력 받아 해당 달의 일수를 출력하세요.(2월 윤달은 생각하지 않습니다.) 잘못 입력한 경우 “OO월은 잘못 입력된
		 * 달입니다.”를 출력하세요. (switch문 사용)
		 */
		System.out.print("1~12사이의 정수 입력 : ");
		int month = sc.nextInt();
		if (month<1 || month>12) {
			System.out.println(month+"월은 잘못 입력된 달입니다");
		}else {
			switch(month) {
			case 1 : System.out.print("1월은 31일까지 있습니다"); break;
			case 2 : System.out.print("2월은 28일까지 있습니다"); break;
			case 3 : System.out.print("3월은 31일까지 있습니다"); break;
			case 4 : System.out.print("4월은 30일까지 있습니다"); break;
			case 5 : System.out.print("5월은 31일까지 있습니다"); break;
			case 6 : System.out.print("6월은 30일까지 있습니다"); break;
			case 7 : System.out.print("7월은 31일까지 있습니다"); break;
			case 8 : System.out.print("8월은 31일까지 있습니다"); break;
			case 9 : System.out.print("9월은 30일까지 있습니다"); break;
			case 10 : System.out.print("10월은 31일까지 있습니다"); break;
			case 11 : System.out.print("11월은 30일까지 있습니다"); break;
			case 12 : System.out.print("12월은 31일까지 있습니다"); break;
			}
		}
	}

	public void practice4() {
//		키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
//		저체중/정상체중/과체중/비만을 출력하세요.
//
//		BMI = 몸무게 / (키(m) * 키(m))
//		BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
//		BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
//		BMI가 30이상일 경우 고도 비만
		System.out.print("키(m)를 입력해주세요");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해주세요");
		double weight = sc.nextDouble();
		
		double BMI = weight/(height*height);
		System.out.println("BMI지수 : " + BMI);
		if(BMI<18.5) {
			System.out.println("저체중");
		} else if(BMI>=18.5 && BMI<23) {
			System.out.println("정상체중");
		} else if(BMI>=23 && BMI <25) {
			System.out.println("과체중");
		} else if(BMI>=25 && BMI <30) {
			System.out.println("비만");
		} else if(BMI>=30) {
			System.out.println("고도 비만");
		}
		
	}

	public void practice5() {
//		중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass 또는 Fail을 출력하세요.
//		평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
//		이 때, 출석 횟수는 총 강의 횟수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
//		70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
		System.out.print("중간 고사 점수 :");
		int mid = sc.nextInt();
		System.out.print("기말 고사 점수 :");
		int fin = sc.nextInt();
		System.out.print("과제 점수 :");
		int assignment = sc.nextInt();
		System.out.print("출석 횟수 :");
		int attend = sc.nextInt();
		
		System.out.println("===========결과==========");
		double midf = mid*20.0/100;
		double finf = fin*30.0/100;
		double assignmentf = assignment*30.0/100;
		double attendf = attend;
		double whole = midf+finf+assignmentf+ attendf;
		
		if(attendf <14) {
			System.out.printf("Fail [출석 횟수 부족] (%d/20)", attend);
		}
		else if(whole>=70) {
			System.out.println("중간 고사 점수(20) : "+ midf);
			System.out.println("기말 고사 점수(30) : "+ finf);
			System.out.println("과제 점수(30) : "+ assignmentf);
			System.out.println("출석 점수(20) : "+ attendf);
			System.out.println("총점 : "+ whole);
			System.out.println("PASS");
		} else if(whole<70) {
			System.out.println("중간 고사 점수(20) : "+ midf);
			System.out.println("기말 고사 점수(30) : "+ finf);
			System.out.println("과제 점수(30) : "+ assignmentf);
			System.out.println("출석 점수(20) : "+ attendf);
			System.out.println("총점 : "+ whole);
			System.out.println("Fail [점수미달]");
		}
		
		
		
	}
	
	
}
