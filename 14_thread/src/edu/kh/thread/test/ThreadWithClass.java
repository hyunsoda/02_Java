package edu.kh.thread.test;

// Thread 클래스를 상속받아 쓰레드 생성하기
public class ThreadWithClass extends Thread{
	// 클래스 상속은 단일 상속만 가능하기 때문에 
	// Thread 클래스 상속을 받으면 다른 클래스 상속 불가
	// -> 때문에 일반적으로 Runbable 인터페이스 상속받아 구현함
	
	public void run() {
		// 스레드가 수행할 작업을 정의하면 됨.
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Thread : "+ i);
			
			try {
				// InterruptedException : 자바에서 다중 쓰레드 프로그래밍 시
										// 발생할 수 있는 예외
				
				// 1초간 스레드를 멈추어 대기시키기 (ms)
				Thread.sleep(1000);
				// sleep : static 메서드이기때문에 클래스명.메서드명()으로 작성
				
			}catch(Exception e) {
				e.printStackTrace();
				
			}
			
		}
		
		
	}
	
	
}
