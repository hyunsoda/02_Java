package edu.kh.todoList.model.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

// DTO (Data Transfer Object) : (관련된 값의 묶음) 값 전달 역할
// == VO (Value Object)

// 스트림 입출력을 위한 직렬화
public class Todo implements Serializable{
	
	private String title; // 할 일 제목
	private String detail; // 상세 내용
	private boolean complete; // 완료 여부
	private LocalDateTime regDate; // 등록 날짜
	
	// java.time 패키지
		// 시관관련 모아둔 패키지
	// LocalDateTime : 날짜, 시간을 나타내는 클래스
	// LocalDateTime.now() : 현재 시간 반환
	
	public Todo() {}

	public Todo(String title, String detail, boolean complete, LocalDateTime regDate) {
		super();
		this.title = title;
		this.detail = detail;
		this.complete = complete;
		this.regDate = regDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public LocalDateTime getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDateTime regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "Todo [title=" + title + ", detail=" + detail + ", complete=" + complete + ", regDate=" + regDate + "]";
	}
	
	
	
	
	
	
	
	
}
