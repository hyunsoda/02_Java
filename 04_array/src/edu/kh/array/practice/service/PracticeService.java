package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {

	Scanner sc = new Scanner(System.in);
	
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
		int num = 9;
		for(int i=0; i<arr.length;i++) {
				arr[i]=num--;
		}
		System.out.println(Arrays.toString(arr));
		int sum = 0;
		for(int k= 0; k < arr.length; k++ ) {
			
			if(k % 2 ==1) {
				sum += arr[k];
			}
		}
		System.out.print("홀수 번째 인덱스 합 : ");
		System.out.println(sum);
	}

	public void practice3() {
//		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
//		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		int arr[] = new int[input];
		for(int i=0; i < arr.length; i++) {
			arr[i]= i+1;
		}
		System.out.println(Arrays.toString(arr));
	}

	public void practice4() {
//		정수 5개를 입력 받아 배열을 초기화 하고
//		검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
//		배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
		boolean flag = false;
		int arr[] = new int[5];
		for(int i=0; i<5; i++) {
			System.out.print("입력"+i+":");
			arr[i] = sc.nextInt();
		}
		System.out.print("검색할 값 : ");
		int input = sc.nextInt();
		for(int j=0; j<5;j++) {
			if(arr[j]==input) {
				flag = true;
				System.out.println("인덱스 :"+ j);
			}
		}
		if(!flag) {
			System.out.println("일치하는 값이 존재하지 않습니다");
		}
	}

	public void practice5() {
//		문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
//		개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		System.out.print("문자열 : ");
		String input = sc.next();
		char ch1[] = new char[input.length()];
		for(int j = 0; j<input.length();j++) {
			ch1[j]=input.charAt(j);
		}
		System.out.println(Arrays.toString(ch1));
		
		int count = 0;
		String countstr="";
		
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		for(int i = 0; i< ch1.length; i++) {
			if(ch == ch1[i]) {
				count++;
				countstr+= i+" ";
			}
		}
		System.out.printf("%s에 %s가 존재하는 위치(인덱스) : %s\n",input, ch, countstr);
		System.out.printf("%s개수 : %d", ch,count);
	}

	public void practice6() {
//		사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
//		배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
//		그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		System.out.print("정수 : ");
		int input = sc.nextInt();
		int arr[]= new int[input];
		
		String str ="";
		int sum = 0;
		
		for(int i=0; i<arr.length;i++ ) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값: ",i);
			arr[i] = sc.nextInt();
			str += arr[i]+" ";
			sum += arr[i]; 
		}
		System.out.println(str);
		System.out.printf("총 합 : %d",sum);
	}

	public void practice7() {
		
		char arr[] = new char[14];
		String str = "";
		
		System.out.print("주민등록번호(-포함) : ");
		String num = sc.next();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i]= num.charAt(i);
			if(i>7) {
				arr[i]='*';
			}
			str+= arr[i];
		}
		System.out.println(str);
	}

	
}
