package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("1이상의 수를 입력하세요");
		int input = sc.nextInt();
		if(input<1) {
			System.out.println("1이상의 수를 입력해주세요");
		}else {
			for(int i = 1; i <= input; i++) {
				System.out.print(i+ " ");
			}
		}
	}

	public void practice2() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		if(input <1) {
			System.out.println("1이상의 숫자를 입력해주세요");
		} else {
			for(int i = input; i >=1; i--) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void practice3() {
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		int sum = 0;
		for(int i = 1; i<=input-1; i++) {
			sum += i;
			System.out.print(i + " + " );
		}
		System.out.print(input);
		sum += input;
		System.out.println(" = " + sum);
	}

	public void practice4() {
		System.out.print("첫 번째 숫자 : ");
		int input1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int input2 = sc.nextInt();
		
		if(input1<1 || input2<1) {
			System.out.println("1이상의 수를 입력하세요");
		}else if(input1<input2){
			for(int i = input1; i <=input2; i++) {
			System.out.print(i+" ");
			}} else if (input1>input2) {
				for(int i = input2; i <= input1; i++) {
				System.out.print(i+" ");
			}
		}
		
		
	}

	public void practice5() {
		System.out.print("숫자 :");
		int input = sc.nextInt();
		System.out.println("====="+ input+"단 =====");
		
		for(int i= 1;i<=9;i++) {
			System.out.printf("%d * %d = %d\n",input, i, input*i);
			
		}
	}

	public void practice6() {
		System.out.println("숫자 : ");
		int input = sc.nextInt();
		if(input<2||input>9) {
			System.out.println("2~9사이 숫자만 입력하세요");
		}else {
		for(int i = input;i<=9;i++)	{
			System.out.printf("=====%d단=====\n",i);
			for(int j = 1;j<=9;j++) {
				System.out.printf("%d * %d = %d\n", i, j, j*i); 
			}
			
		}
		}
		
	}

	public void practice7() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i = 1; i<=num;i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			
				System.out.println();
		}
	}

	public void practice8() {
		System.out.print("정수입력 : ");
		int input = sc.nextInt();
		for(int j = input; j>=1; j--) {
			for(int i=1;i<=j;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	}

	public void practice9() {
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		for(int i = input; i > 1; i--) {
			System.out.print(" ");
			for(int j = 1; j <=i; j++) {
				System.out.print("*");
				
			}
//			for(int k=1;k<=i;k++) {
//			System.out.print("*");
//			}
			System.out.println();
		}
	}
	

}
