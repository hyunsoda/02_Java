package edu.kh.todoList.model.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import edu.kh.todoList.model.dao.TodoListDAO;
import edu.kh.todoList.model.dao.TodoListDAOImpl;

public class TodoListServiceImpl implements TodoListService{

	// 필드
	// DAO를 객체화해서 데이터들을 service에서 이용
	private TodoListDAO dao = null;
	
	// 기본생성자
	public TodoListServiceImpl() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		// TodoListServiceImpl 객체가 생성될 때
		dao = new TodoListDAOImpl(); // TodoListDAOImple 객체 생성
		// 부모타입참조변수 = 자식객체 (다형성 업캐스팅)
		
		
		
	}
	
	
	
	
	
	
	
	
}
