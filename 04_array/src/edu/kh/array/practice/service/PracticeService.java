package edu.kh.array.practice.service;

import java.util.Arrays;

public class PracticeService {
	
	public void practice1() {
//		길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
//		순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
//		짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
		
		int[] arr = new int[9];
		for(int i = 0; i< arr.length; i++) {
			arr[i] = i+1;
		}
		System.out.println(Arrays.toString(arr));
			int sum = 0;
		for(int k = 0; k <arr.length;k++) {
		
			if( k % 2 ==0){
				sum += arr[k];
				
			}
			
		}
		System.out.print("합계 :");
		System.out.println(sum);
		
	}

	public void practice2() {
//		길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
//		순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
//		홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
		int[] arr = new int[9];
		for(int i = 0; i <arr.length ; i++) {
			arr[i]= i+1;
			
		}
		System.out.println(Arrays.toString(arr));
		int sum = 0;
		for(int k= 0; k < arr.length; k++ ) {
			if(k % 2 ==1) {
				sum += arr[k];
			}
		}
	}
}
