package com.hw1.model.dto;

public class Poetry extends Book{
	private int numOfPoems;
	
	public Poetry() {}

	public Poetry(String title, String author, int numOfPoems) {
		super(title, author);
		this.numOfPoems = numOfPoems;
	}

	public int getNumOfPoems() {
		return numOfPoems;
	}

	public void setNumOfPoems(int numOfPoems) {
		this.numOfPoems = numOfPoems;
	}

	@Override
	public void displayInfo() {
		System.out.printf("[시집] 제목 : %s / 저자 : %s / 시 수 : %d\n", getTitle(), getAuthor(), numOfPoems);
	}
	
	
}
