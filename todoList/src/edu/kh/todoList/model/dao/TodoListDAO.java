package edu.kh.todoList.model.dao;

import java.util.List;

import edu.kh.todoList.model.dto.Todo;

// DAO (Data Access Object) :
// 데이터가 저장된 파일/ DB/ 외부 장치에 접근하는 역할
public interface TodoListDAO {
	
	/** TodoList를 파일로 저장하는 메서드
	 * 
	 */
	void saveFile() throws Exception; // 추상메서드와 오버라이딩 메서드 둘 다 throws 써줘야 함

	/** 할 일 목록 반환하는 DAO
	 * @return todoList
	 */
	List<Todo> todoListFullView();

	
	/** 전달 받은 index번째 todo를 반환 DAO
	 * @param index
	 * @return index번째 todo, 없으면 null
	 */
	Todo todoDetailView(int index);


	/** 할 일 추가 DAO
	 * @param todo
	 * @return 추가된 index or -1
	 */
	int todoAdd (Todo todo) throws Exception;

	
	/** 할 일 완료 여부 변경 DAO
	 * @return 해당 index 요소의 완료 여부가 변경되면 true
	 * 				index 요소가 없으면 false
	 */
	boolean todoComplete(int index) throws Exception;

	/** 할 일 수정 DAO
	 * @param index
	 * @param title
	 * @param content
	 * @return 성공 true 실패 false
	 */
	boolean todoUpdate(int index, String title, String content) throws Exception;

	/** 할 일 삭제 DAO
	 * @param index
	 * @return 성공 시 삭제된 할 일(Todo) 반환
	 * 			인덱스 범위 초과로 실패 시 null반환
	 * @throws Exception
	 */
	Todo todoDelete(int index) throws Exception;
	
	
	
	
	
	
}

