package edu.kh.lambda.test;

public class LambdaTest {

	/* 람다 표현식 (Lambda Expression) : 익명 함수를 간결하게 표현하는 방법
	 * 									 메서드를 하나의 식으로 표현하는 것이 주요 특징
	 * 
	 * 람다 문법 : (매개변수) -> 표현식 or (매개변수) -> { 실행문 ;}
	 * 
	 * 함수형 인터페이스 : 람다 표현식을 사용하기 위한 인터페이스로,
	 * 						단 하나의 추상메서드만 가지고 있어야 한다.
	 * 
	 * 익명함수 사용
	 * 
	 * */
	
	// 람다식을 사용하는 메서드
	public int operate(int a, int b, Calculator calculator) {
		return calculator.calc(a, b);
	}
	
	public void ex() {
		
		// 정수형 파라미터 두 개를 받아서 더하는 람다식
		Calculator add = (a,b) ->a + b;
		
		// 정수형 파라미터 두 개를 받아서 곱하는 람다식
		Calculator multiply = (a,b) -> a * b;
		
		int num1 = 10;
		int num2 = 5;
		
		// 덧셈 수행
		System.out.println("덧셈 결과값 : "+ operate(num1, num2, add));
		
		// 곱셈 수행
		System.out.println("곱셈 결과값 : "+ operate(num1, num2, multiply));
		
	}
	
	
	
}
