package edu.kh.todoList.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

import edu.kh.todoList.model.dto.Todo;
import edu.kh.todoList.model.service.TodoListService;
import edu.kh.todoList.model.service.TodoListServiceImpl;

// View : 보여지는 부분(내용 출력/키보드 입력) 역할
public class TodoListView {
	
	// 필드
	private BufferedReader br = null; // 키보드 입력 스트림 참조 변수
	private TodoListService service = null; // 서비스 참조 변수
		// 해당 클래스에서 사용할 객체들을 미리 만들어둠
	
	// 기본생성자
	public TodoListView() {
		
		// 객체 생성 시 발생되는 예외를 여기서 모아서 처리할 예정
		try {
			// 부모타입 참조변수 = 자식 객체
			// 인터페이스로 객체 만들 수 없음
			service = new TodoListServiceImpl(); // 다형성 업캐스팅
			
			br = new BufferedReader(new InputStreamReader(System.in));
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	// --------------------------
	
	/**
	 * TodoList 프로그램 시작 화면
	 */
	public void startView() {
		
		int input = 0;
		
		do {
			
			try {
				
				// 선택한 번호가 반환되어 input에 저장됨
				input = selectMenu(); // 출력하는 메소드
				
				switch(input) {
				case 1 : todoListFullView(); break;
//				case 2 : todoDetailView(); break;
//				case 3 : todoAdd(); break;
//				case 4 : todoComplete(); break;
//				case 5 : todoUpdate(); break;
//				case 6 : todoDelete(); break;
				
				case 0 : System.out.println("@@ 프로그램 종료 @@"); break;
				default : System.out.println("### 메뉴에 작성된 번호만 입력해 주세요 ###");
				
				}
				
				System.out.println("========================================");
				
				
			}catch(NumberFormatException e) {
				System.out.println("###숫자만 입력해 주세요###");
				input = -1; // 첫 반복에 종료되는 걸 방지
				
			}catch(IOException e) {
				System.out.println("### 입/출력 관련 예외 발생###");
				e.printStackTrace(); // 예외 출력
				
			} catch(Exception e) { // 기타 예외 모두 처리
				e.printStackTrace();
			
			} 
			
		} while(input != 0);
		
		
		
	}
	
	
	/** 메뉴 출력 및 선택
	 * @return 선택한 메뉴의 번호 반환
	 */
	public int selectMenu() throws NumberFormatException, IOException{
		
		System.out.println("\n======= Todo List =======");
		
		System.out.println("1. Todo List Full View"); // 전체보기
		System.out.println("2. Todo Detail View"); // 상세보기
		System.out.println("3. Todo Add"); // 추가하기
		System.out.println("4. Todo Complete"); //  완료로 바꾸기
		System.out.println("5. Todo Update"); // 수정하기
		System.out.println("6. Todo Delete"); // 삭제하기
		System.out.println("0. EXIT");
		
		System.out.print("select menu number >>> ");
	
		int input = Integer.parseInt(br.readLine()); // br도 stream이라 IOException발생
		// 매개변수로 받은 (문자열로 읽어오는) 걸 Integer타입으로 바꿔준다
		System.out.println();
		
		return input;
		
		// NumberFormatException은 숫자가 아닐 때 발생
		// IOException은 입출력 관련 exception
	}
	
	// ========================================================
	
	/**
	 * 할 일 목록 모두 보기
	 */
	public void todoListFullView() {
		
		System.out.println("\n=========[1. Todo List Full View]============\n");
		
		// 할 일 목록 + 완료된 개수 카운트한 값 얻어오기
		// (List)		 (int)
		Map<String, Object> map = service.todoListFullView(); // todoListFullView() 반환값은 map
		// value값이 list(할 일 목록)가 될 수도, int(완료된 개수)가 될 수도 있다
		
		// 반환 받은 map요소 해체하기
		List<Todo> todoList = (List<Todo>)map.get("todoList");
		int completeCount = (int)map.get("completeCount");
			//	Map받을 때 object로 반환됐기 때문에 다운캐스팅해야 한다
		
		
		
		// 출력
		System.out.printf("[ 완료된 Todo 개수 / 전체 Todo 수 : %d / %d ]\n"
				, completeCount, todoList.size());
		System.out.println("--------------------------------------------------------------------");
		System.out.printf("%-3s %10s   %10s     %s\n", "인덱스", "등록일", "완료여부", "할 일 제목");
		System.out.println("--------------------------------------------------------------------");
		
		// for문에서 사용할 변수를 ,를 이용해서 여러개 설정가능
		// len = todoList.size(); i < len;  == i<todoList.size();
		for(int i=0, len = todoList.size(); i < len; i++) {
		
			String title = todoList.get(i).getTitle();
			
			String completeYN = todoList.get(i).isComplete() ? "O" : "X";
			
			String regDate = service.dateFormat(todoList.get(i).getRegDate());
			
			System.out.printf("[%3d]  %20s    (%s)       %s\n", i, regDate, completeYN, title);
		}



		
		
		
		
	}
	
	
	
	
}
