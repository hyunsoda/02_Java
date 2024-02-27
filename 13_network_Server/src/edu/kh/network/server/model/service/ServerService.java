package edu.kh.network.server.model.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ServerService {

	// TCP Socket 프로그래밍
	
	/* TCP
	 * - 서버, 클라이언트간의 1:1 소켓 통신(연결 지향적 프로토콜)
	 * - 서버가 먼저 실행되어 있는 상태에서 
	 *   클라이언트가 연결해야함.
	 * 
	 * - 데이터 전송 순서가 보장되고,
	 *   수신 여부를 판단하여 오류(데이터 손실) 발생 시 재전송함.
	 * 
	 * * java.net 패키지에서 제공하는
	 * 	 Socket, ServerSocket 클래스를 사용해야함!
	 * 
	 * 	Socket
	 * - 프로세스의 양 끝단 (프로세스간의 통신을 담당)
	 * - Input/Output Stream 보유하고 있음
	 *  
	 *  
	 *  ServerSocket
	 * - 포트와 연결되어 외부 요청을 기다리는 객체
	 * - 클라이언트의 연결 요청이 들어오면
	 *   클라이언트의 소켓을 얻어와 연결하게 된다.
	 *  
	 * - 하나의 포트에는 하나의 ServerSocket만 연결 가능
	 * 
	 * */
	
	public void serverStart() {
		
		// 1) 서버의 포트번호 정함
		int port = 8500;
		// 포트는 0 ~ 65535 사이를 지정 가능
		// (단 , 1023번 이하는 이미 사용중인 경우가 많으니 피하는 게 좋음)
		
		// 소켓용 참조변수 선언
		ServerSocket serverSocket = null;
		Socket clientSocket = null;
		
		// 입/출력용 참조변수 선언
		InputStream is = null;
		OutputStream os = null;
 		
		// 보조스트림 참조변수 선언
		BufferedReader br = null;
		
		PrintWriter pw = null; 
			// 텍스트 기반 출력 클래스
			// 파일, 콘솔, 네트워크 소켓 등 다양한 출력 스트림에
			// 데이터를 쉽게 출력 가능
		
		try {
			// 2) 서버용 소켓 객체 생성
			serverSocket = new ServerSocket(port);
			
			// 3) 클라이언트 쪽에서 접속 요청이 오길 기다림
			// 4) 접속 요청이 오면 요청 수락 후 해당 클라이언트에 대한 소켓 객체 생성
			System.out.println("[Server]");
			System.out.println("클라이언트의 요청을 기다리고 있습니다...");
			
			clientSocket = serverSocket.accept(); // accept : 수락하다 // socket반환해줌 => clientSocket에 담음
			// -> 클라이언트의 요청이 오고 수락이 될 때까지 무한 대기
			
			System.out.println("[클라이언트 접속 성공]");
			
			// 5) 연결된 클라이언트와 입출력 스트림 생성
			// -> 클라이언트가 서버 요청 시 소켓을 전달함
			// -> 소켓에 입/출력 스트림이 담겨있음  => 꺼내서 연결
			is = clientSocket.getInputStream();
			os = clientSocket.getOutputStream();
			
			// 6) 보조 스트림을 통해 성능 개선
			br = new BufferedReader(new InputStreamReader(is)); 
			// 문자 기반 BufferedReader와
			// 바이트 기반 InputStream을 연결할 수 있도록
			// InputStreamReader를 함께 사용
			
			pw = new PrintWriter(os);
			
			// 7) 스트림을 통해 읽고 쓰기
			// 서버 -> 클라이언트 메세지 전송
			
			// 2024년 02월 27일 10:31:21 [서버 접속 성공]
			Date now = new Date(); // java.util.Date : 자바에서 시간을 나타내는 객체
						// new Date()로 객체 생성 시 현재 시간이 저장되어 있다.
			
			// SimpleDateFormat : 날짜 형식을 간단히 지정하는 객체
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
			
			String str = sdf.format(now) + "[서버 접속 성공]";
			
			pw.println(str); // 서버 -> 클라이언트로 출력
			pw.flush(); // flush() : 스트림의 내용을 밀어냄
			
			// --------------------------------------
			// 클라이언트 -> 서버로 메시지 전달받기
			String clientMessage = br.readLine();
			
			String clientIP = clientSocket.getInetAddress().getHostAddress();
								// 클라이언트 IP
			
			// 클라이언트 메세지 출력
			System.out.println(clientIP + "가 보낸 메세지 : " +  clientMessage);
			
			// --------------------------------------
			
			// 서버 -> 클라이언트 메세지 전달하기
			Scanner sc = new Scanner(System.in);
			
			System.out.print("서버로 전달할 메시지 : ");
			String str2 = sc.nextLine();
			
			pw.println(str2); // 메세지를 서버쪽으로 출력
			pw.flush(); // 스트림 내용 밀어내기
			
			
			// --------------------------------------
			
			
		}catch(Exception e) {
			e.printStackTrace(); // 예외 추적
			
		}finally {
			
			// 8) 통신 종료
			try {
				// 스트림/ 소켓 닫기
				
				if(br != null) br.close(); // + is.close() 보조스트림 닫으면 기반 스트림 같이 닫힘
				if(pw != null) pw.close(); // + os.close()
				// 보조 스트림을 닫게 되면
				// 연결된 기반 스트림도 같이 닫게 된다!
				
				if(serverSocket != null) serverSocket.close();
				if(clientSocket != null) clientSocket.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
		}



		
		
		
		
		
		
		
	}
	
	
}
