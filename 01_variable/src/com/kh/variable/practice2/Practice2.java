package com.kh.variable.practice2;

import java.util.Scanner;

public class Practice2 {
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요 :");
		
		char str2 = sc.next().charAt(0);
		// -> charAt(0) 문자열의 0번째 index만 가져와서 char형태로 변경해줌
		System.out.printf("%c unicode : %d",str2,(int)str2);
		
		
	// 내 답안	
//		String str1 = sc.next();
//		int str2 = (int)str1.charAt(0);
//		System.out.printf("%d\n",str2);

	}
}
