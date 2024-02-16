package edu.kh.poly.ex2.run;

import edu.kh.poly.ex2.model.service.ASHCalculator;
import edu.kh.poly.ex2.model.service.AbstractService;
import edu.kh.poly.ex2.model.service.Calculator;
import edu.kh.poly.ex2.model.service.HGDCalculator;

public class AbstractRun {

	public static void main(String[] args) {

		AbstractService service = new AbstractService();
//		service.ex1();
//		service.ex2();
		
		// =========================================
		
		// Calculator cal = new ASHCalculator();
		Calculator cal = new HGDCalculator();
		
		System.out.println("합 : "+ cal.plus(20, 30));
		System.out.println("차 : " + cal.minus(20, 30));
		System.out.println("곱 : " + cal.multiple(20, 30));
		System.out.println("몫 : " + cal.divide(20, 30));
	
		// 인터페이스 == 미완성 설계도 == 객체생성 불가능 (new 연산자 사용x)
		// -> 추상클래스처럼 참조 변수로는 사용 가능
		
		// 코드의 큰 수정 없이
		// 객체 생성 코드만 바꾸면 새로운 클래스 코드를 수행할 수 있다.
		
		// 인터페이스 특징 
		// 1) 인터페이스를 부모 참조변수로 사용하면
		// 	  다형성 중 업캐스팅이 적용돼서
		// 	  상속받은 모든 클래스를 자식 객체로 참조할 수 있다.
		
		// -> 이를 이용하여 중요한 메인코드의 수정을 최소화할 수 있다.
		// ex) Run에 작성된 합, 차, 곱 몫을 출력하는 코드의 수정 없이
		// 	   객체 생성 코드 한 줄만 수정하여 다르게 작성된 기능을 수행할 수 있다.
		
		// 2) 자식 클래스에 공통된 메서드 구현을 강제하기 때문에
		// 	  모든 자식 클래스가 동일한 형태를 띄게 된다.
		// -> 이를 이용하여 공동 작업 (팀 프로젝트)에 필요한
		// 	  개발환경을 조성할 수 있다!
		
		
		
		
		
		
		
		
		
	}

}
