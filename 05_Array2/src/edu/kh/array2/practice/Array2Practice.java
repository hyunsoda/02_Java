package edu.kh.array2.practice;

import java.util.Arrays;

public class Array2Practice {

	public void practice1() {
//		3행 3열짜리 문자열 배열을 선언 및 할당하고
//		인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장 후 출력하세요.
		String str = "";
		String [][] arr = new String[3][3];
		for(int i = 0; i<arr.length;i++) {
			
			for(int k = 0; k < arr[i].length;k++) {
				
				arr[i][k]= "("+ i + "," + k +")";
				str+=arr[i][k];
			}
		}
		
		System.out.println(str);
		
	}

	public void practice2() {
		
	}
}
