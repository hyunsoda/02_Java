package edu.kh.todoList.model.dao;

import java.util.List;

import edu.kh.todoList.model.dto.Todo;

// DAO (Data Access Object) :
// 데이터가 저장된 파일/ DB/ 외부 장치에 접근하는 역할
public interface TodoListDAO {

	/** 할 일 목록 반환하는 DAO
	 * @return todoList
	 */
	List<Todo> todoListFullView();

	
	/** 전달 받은 index번째 todo를 반환 DAO
	 * @param index
	 * @return index번째 todo, 없으면 null
	 */
	Todo todoDetailView(int index);
	
	
	
	
	
	
}

