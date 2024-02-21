package edu.kh.collection.pack4.mode.service;

import java.util.ArrayList;
import java.util.List;

public class JavaAPIService {

	/* Wrapper Class
	 * 
	 * - wrap : 감싸다, 포장하다
	 * 
	 * - 기본 자료형을 객체로 감싸는 클래스
	 * -> 기본 자료형의 객체화
	 * 
	 * -> 왜? 컬렉션처럼 객체만 취급하는 상황에서 
	 * 	  기본 자료형도 취급 가능한 형태로 바꾸기 위해서
	 * 
	 * 			--> Boxing
	 * Unboxing <--
	 * 
	 * boolean <--> Boolean
	 * byte  <--> Byte
	 * short <--> Short
	 * Int <--> Integer
	 * long <--> Long
	 * float <--> Float
	 * double <--> Double
	 * char <--> Character
	 * 
	 * Boxing, Unboxing을 자동으로 수행되도록 구현되어 있음
	 * Auto Boxing, Auto Unboxing
	 * 
	 * 
	 * */
	
	/**
	 * Auto Boxing, Auto Unboxing 확인
	 */
	public void method1() {
		int num1 = 100; // int
		
		// 삭제 예정인 방법(쓰지마ㅜㅜ)
		// Integer wrap1 = new Integer(num1);
		
		Integer wrap1 = num1; // 컴파일러가 Auto Boxing 수행 코드 추가
							 // (int) num1 -> (Integer) num1
		int num2 = wrap1; // 컴파일러가 Auto Unboxing 수행 코드 추가
						 // (Integer) wrap1 -> (int) wrap1에 저장된 값
		
		long num3 = 10_000_000_000L; // 100억
		Long wrap2 = num3; // Auto Boxing
		long num4 = wrap2; // Auto Unboxing
		
		
		// Integer 객체만 저장하는 List
		List<Integer> list = new ArrayList<Integer>();
		list.add(1000); // (int) 1000 -> (Integer) 1000 / Auto Boxing
		list.add(2000);
		list.add(3000);
		
		
		// print 구문 내에서
		// Wrapper 클래스로 만든 객체를 참조할 때
		// toString() 호출하는 것이 아닌
		// Auto Unboxing을 진행해서 기본 자료형으로 변경한다!
		System.out.println(list.get(0) + list.get(1)+list.get(2)); // 6000
		// 객체를 보통 print구문으로 사용하면 toString으로 이어쓰기 되어야 하지만 +이 됨
		
		}
	
	/**
	 * Wrapper Class가 제공하는 필드, 메소드
	 * -> 대부분이 static!!!
	 * 	  -> 클래스명.필드면  / 클래스명.메서드명() 사용
	 */
	public void method2() {

		// 정수형, 실수형 공통 
		System.out.println("byte의 용량 : " + Byte.BYTES + "바이트");
		System.out.println("byte의 용량 : " + Byte.SIZE + "비트");
		System.out.println("byte의 최대값 : " + Byte.MAX_VALUE );
		System.out.println("byte의 최소값 : " + Byte.MIN_VALUE );
		
		// 실수형만 사용 가능
		System.out.println(Double.NaN); // Not a Number 숫자가 아닌 값
		System.out.println(Double.NEGATIVE_INFINITY); // 음수 무한대
		System.out.println(Double.POSITIVE_INFINITY); // 양수 무한대
		
		// Boolean(논리형)은 true / false 밖에 없음
		System.out.println(Boolean.FALSE);
		System.out.println(Boolean.TRUE);
		
		System.out.println("==============================");
		
		// 중요 !!!
		System.out.println("[String => 기본 자료형 변환]");
		
		// HTML 연결 시 (요청 데이터 처리) 많이 사용
		// -> HTML에 관련된 모든 값은 String
		// 단, char(Character)는 별도로 존재하지 않음.
				// charAt()등 사용..
		
		byte b = Byte.parseByte("1");
		short s = Short.parseShort("2");
		int i = Integer.parseInt("3"); // 중요
		long l = Long.parseLong("4"); // 중요
		float f = Float.parseFloat("0.1");
		double d = Double.parseDouble("0.2"); // 중요
		boolean bool = Boolean.parseBoolean("true");
		
		System.out.println("===============================");
		
		System.out.println("[기본 자료형 -> String 변환");
		
		// String 이어쓰기를 이용한 방법
		// -> 코드는 짧으나 효율이 좋지 않음 (속도 down, 메모리 소모 up)
		long test1 = 12345678910L;
		String change1 = test1 +""; // long + String -> String
		
		// Wrapper Class 이용하는 방법
		// -> 코드는 길지만 효율이 좋음
		int test2 = 400;
		String change2 = Integer.valueOf(test2).toString(); // 값을 꺼내와서 문자열로 바꿔줌
		
		double test3 = 4.321;
		String change3 = Double.valueOf(test3).toString();
	
		
	}
	
	/**
	 * String의 불변성(immutable, 변하지 않는 성질 == 상수) // 변하는 건 mutable이라고 함
	 * - 문자열이 수정되면 새로운 String 객체가 생성됨
	 */
	public void method3() {
			
		// String 
		// 불변성 -> 변하지 않는다
		//	기존객체들이 변하는 게 아니다
		// 원래 String은 상수다
		
		
		
		// System.identityHashCode(str)
		// -> 주소 값을 이용해서 만든 해시코드(식별번호)
		// -> 같은 객체에 저장된 값이 변했다면 주소는 일정해야 된다!
		// identityHashCode도 일정해야 한다.
		
		String str = "hello";
		System.out.println(str);
		System.out.println(System.identityHashCode(str)); // 1651191114 
		
		str = "world";
		System.out.println(str);
		System.out.println(System.identityHashCode(str)); // 1586600255
		// 재대입이 아니라 상수풀에 또다른 공간을 만드는 것이다
			// 다른 객체임
		
		str+= "!!!";
		System.out.println(str);
		System.out.println(System.identityHashCode(str)); /// 943010986
		// 참조하고 있던 곳이 world만 있던 곳에서 +=!!!된 새로운 공간이 생기고 그곳을 참조하게 됨
		// 원래 있던 곳은 Garbage Collector에 의해서 없어진다
		
		
		
		
		
		
		
	}

	
	/**
	 * String 리터럴 ("")로 생성된 객체 활용
	 * - 동일한 리터럴을 이용해 String 객체를 생성한 경우
	 * 	 추가적으로 객체를 생성하지 않고
	 * 	 기존에 존재하는 String 객체의 주소를 반환 (재활용)
	 */
	public void method4() {
		// String 만드는 법
		// 1. String str ="문자열";
		// 2. String str = new String();
		
		String temp1 = "Hello!!"; // 0x400
		String temp2 = "Hello!!"; 
		
		System.out.println(System.identityHashCode(temp1)); //1865127310
		System.out.println(System.identityHashCode(temp2)); //1865127310
		// 똑같은 객체를 참조하고 있다
		
		// 객체의 필드 값을 비교
		System.out.println("저장된 값 비교 : " + temp1.equals(temp2));
		
		// 변수에 저장된 값 (주소) 비교
		System.out.println("주소를 비교 : " + (temp1 == temp2));
		
		
	}

	
	/**
	 * 사용자 (개발자)가 관리하는 String 객체 생성
	 * - "" 리터럴로 생성된 String -> 상수풀 (JVM 관리)
	 * - new 연산자로 생성된 String -> Heap 영역 (사용자가 관리)
	 */
	public void method5() {
		
		String temp1 = "abcd"; // 리터럴로 생성
		String temp2 = new String("abcd"); // new 연산자로 생성
		String temp3 = new String("abcd"); // new 연산자로 생성
		// new 연산자로 객체 만들면 내용 같아도 무조건 Heap영역에 새 객체 만드는 거다
	
		System.out.println("temp1 : " + System.identityHashCode(temp1));
		System.out.println("temp2 : " + System.identityHashCode(temp2));
		System.out.println("temp3 : " + System.identityHashCode(temp3));
		
		// 셋 다 주소가 다름 == "abcd"를 재활용하지 않음
		// -> 값은 같지만 전부 다른 객체!
		
		temp2 += "efg";
		System.out.println("efg temp2 : " + System.identityHashCode(temp2));
		// 기존 temp2 해시코드와 다르다 --> 다른 객체
		
		
		
	}
}
