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
		for(int i = 0; i< arr.length; i++) {
			for(int j = 0; j< arr[i].length;j++) {
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
		}
		
		}

	public void practice3() {
//		4행 4열짜리 정수형 배열을 선언 및 할당하고
//		1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
//		2) 저장된 값들을 차례대로 출력하세요.
		int num = 16;
		int arr[][] = new int[4][4];
		for(int i = 0; i <arr.length;i++) {
			for(int k=0; k<arr[i].length;k++) {
				arr[i][k] = num--;
			}
		}
		for(int i = 0; i<arr.length;i++) {
			for(int k=0;k<arr[i].length;k++) {
				System.out.printf("%2d ",arr[i][k]);
			}
			System.out.println();
		}
	}

	public void practice4() {
//		4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
//		아래의 내용처럼 처리하세요.
		int arr[][] = new int[4][4];
		int sum = 0;
		int sumc[] = new int[3];
		int sumr[] = new int[3];
		for(int i = 0; i<arr.length-1;i++) {
			for(int k=0; k<arr[i].length-1;k++) {
			int random = (int)(Math.random()*10+1);	
				arr[i][k] = random;
			}
			
		}
		for(int i= 0; i<arr.length;i++) {
			for (int k=0; k<arr[i].length-1;k++) {
				arr[i][3] += arr[i][k];
				
				
			}
		
		}
		
		
		for(int i= 0;i<arr.length-1;i++) {
			for(int k = 0; k<arr[i].length;k++) {
				arr[3][k] += arr[i][k];
			}
				sum += arr[i][3];
		}
			arr[3][3] = sum;
			
		for(int i = 0; i<arr.length;i++) {
			for(int k = 0 ; k<arr.length;k++) {
				System.out.printf("%2d ",arr[i][k]);
			}
			System.out.println();
		}
		
	}
}
