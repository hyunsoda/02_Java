package edu.kh.todoList.model.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import edu.kh.todoList.model.dto.Todo;

// Service :
// 데이터 가공, 로직 처리 등의 기능을 제공하는 역할

public interface TodoListService {

	/** 할 일 목록 반환 서비스
	 * @return todoList + 완료된 개수
	 */
	/* public abstract */ Map<String, Object> todoListFullView();
	// 생략가능
	// 인터페이스의 모든 메소드는 추상메소드

	/** 날짜 포맷을 변환해서 반환
	 * @param regDate
	 * @return yyyy-MM-dd HH:mm:ss 형태 날짜 반환
	 */
	public abstract String dateFormat(LocalDateTime regDate);
	
	
	/** 전달받은 index 번째 todo를 반환
	 * @param index
	 * @return index번째 todo 상제 정보, 없으면 null 반환
	 */
	public abstract String todoDetailView(int index);

	/** 할 일 추가 서비스
	 * @param title
	 * @param content
	 * @return 추가된 index 번호 or -1
	 */
	int todoAdd(String title, String content) throws Exception;

	/** 할 일 완료 여부 변경 (O <-> X)
	 * @param index
	 * @return 해당 index 요소의 완료 여부가 변경되면 true
	 * 				index 요소가 없으면 false
	 */
	boolean todoComplete(int index) throws Exception;

	/** 할 일 수정 서비스
	 * @param index
	 * @param title
	 * @param content
	 * @return 수정 성공 true, 실패 false
	 */
	boolean todoUpdate(int index, String title, String content) throws Exception;

	
	
	/** 할 일 삭제 서비스
	 * @param index
	 * @return 삭제 성공 시 삭제된 할 일의 제목 반환
	 * 			실패 시 null 반환
	 */
	String todoDelete(int index) throws Exception;
	
	
	
	
	
	
	
}
