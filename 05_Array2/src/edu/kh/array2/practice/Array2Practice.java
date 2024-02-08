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
//				str+=arr[i][k];
			}
		}
		for(int i = 0; i<arr.length;i++) {
			for(int k=0; k<arr[i].length; k++) {
				System.out.print(arr[i][k]);
			}
			System.out.println();
		}
		
		
	}

	public void practice2() {
//		4행 4열짜리 정수형 배열을 선언 및 할당하고
//		1) 1 ~ 16까지 값을 차례대로 저장하세요.
//		2) 저장된 값들을 차례대로 출력하세요.
		int arr[][] = new int[4][4];
		int num = 1;
		String str =""; 
		for(int i = 0; i <arr.length;i++ ) {
			for(int j = 0; j<arr[i].length;j++) {
				arr[i][j] = num++;
				str+= arr[i][j]+" ";
			}
		}
		
		if(str.length()%4==0) {
			System.out.println();
		}
		System.out.println(str);
	}
}
