package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample { // 기능 제공용 클래스 -> 메서드가 모여있음
	 // 필드
	Scanner sc = new Scanner(System.in); // 전역에 scanner를 만들어 두면 어디서든 sc를 불러다 쓰면 됨
	
	public void ex1() {
		
		// if문
		// 조건식이 true일 때만 내부 코드 수행
		
		/*
		 *  [작성법]
		 *  if(조건식){
		 *  	조건식이 true일 때 수행할 코드
		 *  }
		 */
		
		// 입력받은 정수가 양수인지 검사
		// 양수라면 "양수입니다" 출력
		
		System.out.print("정수를 입력하세요 : ");
		int iNum = sc.nextInt();
		
		if(iNum > 0) {
			System.out.println("양수입니다");
		}
		if(iNum <=0) {
			System.out.println("양수가 아니다");
		}
		
		
	}

	public void ex2() {
		
		// if-else문
		// 조건식 결과가 true면 if문,
		// false면 else 구문이 수행됨
		
		/*
		 * [작성법]
		 * if(조건식){
		 * 		조건식이 true일 때 수행될 코드
		 * } else {
		 * 		조건식이 false일 때 수행될 코드
		 * }
		 * */
		
		// 홀짝 검사
		// 입력받은 정수값이 홀수이면 "홀수입니다" 출력
		// 0이면 "0입니다"
		// 짝수이면 짝수입니다" 출력
		// else if 사용 x, 중첩 if문 사용하기
		
		System.out.print("정수 입력 :");
		int input = sc.nextInt();
		if(input % 2 == 1) {
			System.out.println("홀수입니다");
		}  else { // 짝수 또는 0 입력 시 수행
			
			// 중첩 if
			if(input == 0) {
				System.out.println(" 0입니다");
			} else{
			System.out.println("짝수입니다.");
			} 
		}
		
		
		
		
		
	}
		
	public void ex3() {
		// 양수, 음수, 0 판별
		// if(조건식) -else if(조건식) - else
		
	System.out.print("정수 입력 :");
	int input = sc.nextInt();
	
	if(input > 0) {
		System.out.println("양수입니다");
	} else if (input < 0) { // 바로 위에있는 if문이 만족되지 않은 경우 수행
		System.out.println("음수입니다");
	} else {
		System.out.println("0 입니다");
	}
		
	}

	public void ex4() {
		
		// 달(month)을 입력받아 해당 달에 맞는 계절 출력
		// 단, 겨울일 때 온도가 -15도 이하 "한파 경보", -12이하 "한파 주의보"
		// 여름일 때 온도가 35도 이상 "폭염 경보", 33도 이상 "폭염 주의보"
		// 1~12 사이가 아닐 땐 "해당하는 계절이 없습니다" 출력
		// 1,2,12 겨울
		// 3~5 봄
		// 6~8 여름
		// 9~11 가을
		
		System.out.print("달(month)를 입력하세요: ");
		int month = sc.nextInt();
		
		if(month>=3 && month<=5) {
			System.out.println("봄입니다");
		} else if(month >= 6 && month <=8) {
			System.out.print("온도를 입력하세요");
			int temperature = sc.nextInt();
				if(temperature >=35) {
				System.out.println("여름입니다 폭염경보");
				} else if(temperature >= 33) {
					System.out.println("여름입니다 폭염주의보");
				}
				else {
					System.out.println("여름입니다");
				}
			}	
			else if(month >=9 && month <=11) {
				System.out.println("가을입니다");
		} else if(month == 12 || month ==1 || month==2) {
			System.out.println("온도를 입력하세요");
			int temperature = sc.nextInt();
				if(temperature<=-15) {
					System.out.println("겨울입니다 한파 경보");
				} else if(temperature<=-12) {
					System.out.println("겨울입니다 한파 주의보");
				} else {
					System.out.println("겨울입니다");
				}
		} else {
			System.out.println("해당하는 계절이 없습니다");
		}
		
//	// 예시 답안	
//		System.out.print("달 입력 : ");
//		int month = sc.nextInt();
//		
//		String season; // 아래 조건문 수행 결과를 저장할 변수 선언
//		
//		if(month ==1|| month ==2 || month ==12) {
//			season = "겨울";
//			
//			System.out.print("온도 입력 : ");
//			int temperature = sc.nextInt();
//			
//			if(temperature <= -15) {
//				season += " 한파경보";
//				// 겨울 
//				// season = season + "한파경보";
//				// season = 겨울 한파경보
//			} else if(temperature <= -12) {
//				season += " 한파주의보";
//			}
//			
//		} else if (month >= 3 && month <=5) {
//			season = "봄";
//		} else if(month >=6 && month <=8) {
//			season = "여름";
//			
//			System.out.print("온도 입력 : ");
//			if(temperature >= 35) {
//				season += " 폭염경보";
//			} else if(temperature >= 33) {
//				season += " 폭염주의보";
//			}
//		} else if(month >= 9 && month <= 11) {
//			season = "가을";
//		} else {
//			season = "해당하는 계절이 없습니다";
//		}
//		System.out.println(season);
		
	}

	public void ex5() {
		
		System.out.print("나이 입력 :");
		int age = sc.nextInt();
		if (age<=13) {
			System.out.println("어린이 입니다");
		} else if(age>13 && age<= 19) {
			System.out.println("청소년 입니다");
		} else {
			System.out.println("성인 입니다");
		}
	}

	public void ex6( ){
		
		System.out.print("점수 입력(100점 만점) :");
		int grade = sc.nextInt();
		
		if(grade<0 || grade>100) {
			System.out.println("잘못 입력하셨습니다");
		} else if(grade>=90) {
			System.out.println("A");
		} else if(grade >=80 ) {
			System.out.println("B");
		} else if(grade >= 70) {
			System.out.println("C");
		} else if(grade >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

	public void ex7() {
		// 놀이기구 탑승 제한 검사
		// 나이가 12세 이상, 키 140.0cm 이상 일 경우에만 "탑승 가능"
		// 나이가 12미만인 경우 : "적정 연령이 아닙니다."
		// 키가 140.0cm 미만 : "적정 키가 아닙니다."
		// 나이를 0세 미만, 100세 초과 시 : "잘못 입력 하셨습니다."
		
		System.out.print("나이 입력 :");
		int age = sc.nextInt();
		System.out.print("키 입력");
		double height = sc.nextDouble();
		
		if(age>= 12 && height >= 140.0) {
			System.out.println("탑승 가능");
		} else if(age <12) {
			System.out.println("적정 연령이 아닙니다");
		} else if(height <140.0) {
			System.out.println("적정 키가 아닙니다");
		} else if(age < 0 || age>100) {
			System.out.println("잘못 입력 하셨습니다.");
		}
		
		
		// 예시 답안
//		System.out.print("나이 입력 : ");
//		int age = sc.nextInt();
//		
//		String result;
//		
//		if(age<0 || age >100) {
//			result = "잘못 입력하셨습니다";
//		}else {
//			
//			System.out.print("키 입력 : ");
//			double height = sc.nextDouble();
//			
//			if(age<12) {
//				result = "적정 연령이 아닙니다";
//			} else if(height <140.0) {
//				result = "적정 키가 아닙니다";
//			} else {
//				result = "탑승 가능";
//			}
//		}
//		System.out.println(result);
//		
	}

	public void ex8() {
		// 놀이기구 탑승 제한 검사 프로그램
		// 조건 - 나이 : 12세 이상
		// - 키 : 140.0cm 이상
		// 나이를 0~100세 사이로 입력하지 않은 경우 : "나이를 잘못 입력 하셨습니다."
		// 키를 0~250.0cm 사이로 입력하지 않은 경우 : "키를 잘못 입력 하셨습니다."
		// -> 입력이 되자 마자 검사를 진행하여 잘못된 경우 프로그램 종료
		// 나이 O , 키 X : "나이는 적절하나, 키가 적절치 않음";
		// 나이 X , 키 O : "키는 적절하나, 나이는 적절치 않음";
		// 나이 X , 키 X : "나이와 키 모두 적절치 않음";
		// 나이 O , 키 O : "탑승 가능"
	System.out.print("나이 입력 :");
	int age = sc.nextInt();
	if (age<0 || age >100) {
		System.out.println("나이를 잘못 입력하셨습니다");
	} else {
		System.out.print("키 입력: ");
		double height = sc.nextDouble();
		if(height<0 || height>250.0) {
			System.out.print("키를 잘못 입력하셨습니다");
		}else {
			// 조건 따지기
			if(age>=12 && height<140.0) {
				System.out.println("나이는 적절하나, 키가 적절치 않음");
			} else if(age<12 && height>=140.0) {
				System.out.println("키는 적절하나, 나이는 적절치 않음");
			} else if(age<12 && height <140.0) {
				System.out.println("나이와 키 모두 적절치 않음");
			} else if(age>=12 && height >=140.0) {
				System.out.println("탑승 가능");
			}
		}
	}
	}
	
	
	

}
