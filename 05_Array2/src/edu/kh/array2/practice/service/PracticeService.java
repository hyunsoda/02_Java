package edu.kh.array2.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice7() {
//		1차원 문자열 배열에 학생 이름 초기화되어 있다.
//		3행 2열 짜리 2차원 문자열 배열 2개를 새로 선언 및 할당하여
//		학생 이름을 2차원 배열에 순서대로 저장하고 아래와 같이 출력하시오.
//		(첫 번째 2차원 배열이 모두 저장된 경우 두 번째 2차원 배열에 저장 진행)
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		String arr1[][] = new String[3][2];
		String arr2[][] = new String[3][2];
		
		int index =0 ;
		System.out.println("=====1분단=====");
		for(int i = 0; i<arr1.length;i++) {
			for(int k =0; k<arr1[i].length;k++) {
				arr1[i][k] = students[index];
				index++;
				System.out.print(arr1[i][k]+ " ");
			}
			System.out.println();
		}
		System.out.println("=====2분단=====");
		for(int i=0; i<arr2.length; i++) {
			for(int k=0; k<arr2[i].length;k++) {
				arr2[i][k] = students[index];
				index++;
				System.out.print(arr2[i][k]+ " ");
			}
			System.out.println();
		}
	}

	public void practice8() {
//		위 문제에서 자리 배치한 것을 가지고 학생 이름을 검색하여
//		해당 학생이 어느 자리에 앉았는지 출력하세요.
		
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		String arr1[][] = new String[3][2];
		String arr2[][] = new String[3][2];
		
		int index =0 ;
		System.out.println("=====1분단=====");
		for(int i = 0; i<arr1.length;i++) {
			for(int k =0; k<arr1[i].length;k++) {
				arr1[i][k] = students[index];
				index++;
				System.out.print(arr1[i][k]+ " ");
			}
			System.out.println();
		}
		System.out.println("=====2분단=====");
		for(int i=0; i<arr2.length; i++) {
			for(int k=0; k<arr2[i].length;k++) {
				arr2[i][k] = students[index];
				index++;
				System.out.print(arr2[i][k]+ " ");
			}
			System.out.println();
		}
		System.out.println("=============");
		
		System.out.print("검색할 학생 이름을 입력하세요. : ");
		String name = sc.next();
		int index2 = 0;
		String direction = null;
		int exist = 0;
	
		for(int i = 0; i<arr1.length;i++) {
			for(int k = 0; k<arr1[i].length;k++) {
				if(name.equals(arr1[i][k])) {
					exist ++;
					if(k == 0) {
						direction ="왼쪽";
					} else {
						direction = "오른쪽";
					}
					System.out.printf("검색하신 %s 학생은 1분단 %d번째 줄 %s에 있습니다", name,i+1,direction);
				}
			}
		}
		
		for(int i = 0; i<arr2.length;i++) {
			for(int k = 0; k<arr2[i].length;k++) {
				if(name.equals(arr2[i][k])) {
					exist ++;
					if(k == 0) {
						direction ="왼쪽";
					} else {
						direction = "오른쪽";
					}
					System.out.printf("검색하신 %s 학생은 2분단 %d번째 줄 %s에 있습니다", name,i+1,direction);
				}
			}
		}
		if(exist ==0) {
			System.out.println("검색하신 학생이 존재하지 않습니다");
		}
	}
	
	public void practice9() {
//		String 2차원 배열 6행 6열을 만들고 행의 맨 위와 제일 앞 열은 각 인덱스를 저장하세요.
//		그리고 사용자에게 행과 열을 입력 받아 해당 좌표의 값을 'X'로 변환해 2차원 배열을 출력하세요.
		
		String arr[][] = new String[6][6];
		for(int i = 0; i<arr.length-1; i++ ) {
			for(int k = 0; k<arr[i].length-1; k++) {
				arr[0][k+1] = k + " ";
				arr[i+1][0] = i + " ";
				System.out.print(arr[i][k]);
			}
			System.out.println();
		}
		int row = 0;
		int col = 0;
		
			System.out.print("행 입력 : ");
			row = sc.nextInt();
			System.out.print("열 입력 : ");
			col = sc.nextInt();
			
			for(int i = 0; i < arr.length; i++) {
				for(int k = 0; k < arr[i].length;k++) {
					if(row == i && col == k) {
						arr[i+1][k+1]= "X";
					
					} 
					if(arr[i][k]==null) {
						arr[i][k] =" ";
					}
						System.out.print(arr[i][k] + " ");
					}
						System.out.println();
				}
	
		
	}

	public void practice10() {
//		실습문제9와 내용은 같으나 행 입력 시 99가 입력되지 않으면 무한 반복이 되도록 구현하세요.
	String arr[][] = new String[6][6];
	for(int i = 0; i<arr.length-1; i++) {
		arr[i+1][0] = i + " ";
		arr[0][i+1] = i + " ";
		
		}
	}
}
