package edu.kh.exception.test;

public class ExceptionTest {

	public static void main(String[] args) {

		// 컴파일 에러 => 개발자가 코드 잘못쓴 경우
		// 자료형이 맞지 않아 연산 불가하여 "컴파일 에러"가 발생 (코드 틀림)
		// int a = 99.9; //Type mismatch: cannot convert from double to int
		int a = (int)99.9; // 코드로 수정 가능!
		
		// 런타임 에러 => 프로그램 수행 중 발생하는 에러
		// 				주로 if문으로 처리 가능하다.
		
		int[] arr = new int[3]; // 길이 3 : 인덱스 0,1,2까지
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		// arr[3] = 40;
		// java.lang.ArrayIndexOutOfBoundsException : 배열 범위 초과 예외
		
		if(3 >= arr.length) {// 배열 인덱스 범위 초과 시
			System.out.println("배열 범위를 초과했습니다.");
		}else {
			// 배열 크기가 더 커서 예외에 걸리지 않는다면
			arr[3] = 40;
			arr[4] = 50;
		}
		
		
		
		
		
		
	}
	
}
