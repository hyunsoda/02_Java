package com.hw1.run;

import com.hw1.model.dto.Novel;
import com.hw1.model.dto.Poetry;
import com.hw1.model.dto.Textbook;

public class Run {

	public static void main(String[] args) {

		new Novel("해리 포터","J.K. 롤링","판타지").displayInfo();
		new Textbook("자바 프로그래밍", "James Gosling", "컴퓨터 과학").displayInfo();
		new Poetry("우리들의 사랑시","김소월",30).displayInfo();
	}

}
