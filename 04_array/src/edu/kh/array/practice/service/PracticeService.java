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

	public void practice8() {
//		3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
//		중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
//		단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
//		다시 정수를 받도록 하세요.
		System.out.print("정수 입력: ");
		int input = sc.nextInt();
		int input2 = (1+input)/2;
		int arr[] =  new int[input];
		int max = arr[0];
		String str = "";
		
		if(input<3||input % 2==0) {
			System.out.println("다시 입력하세요.");
		} else {
			for(int i = 0; i < arr.length/2; i++) {
				arr[i] = i+1;
				
				str+=arr[i]+" ";
			}
				for(int k = arr.length/2 ; k < arr.length;k++) {
				arr[k]= input2--;
				str+=arr[k]+" ";
			}
			System.out.println(str);
		}
		
	}

	public void practice9() {
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
//		1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
		int arr[] = new int[10];
		String str ="";
		
		for(int i=0; i <arr.length;i++) {
			int random = (int)(Math.random()*11+1);
			arr[i] = random;
			str += arr[i]+" ";
		}
		System.out.println(str);
	}

	public void practice10() {
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
//		1~10 사이의 난수를 발생시켜 배열에 초기화 후
//		배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
		int arr[] = new int[10];
		int max = arr[0];
		int min = arr[0];
		String str = "";
		
		for(int i = 0; i< arr.length; i++) {
			int random = (int)(Math.random()*10+1);
			arr[i]= random;
			str += arr[i]+ " ";
			if(max<arr[i]) {
				max = arr[i];
			}
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("발생한 난수 : " + str);
		System.out.println("최대값 : "+ max);
		System.out.println("최소값 : "+ min);
	}

	public void practice11() {
//		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//		1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
		int arr[] = new int[10];
		String str ="";
		
		for(int i = 0; i < arr.length;i++) {
			int random = (int)(Math.random()*10+1);
			arr[i]= random;
			
			
		for(int x = 0; x < i; x++) {
			if(arr[x] == random) {
				i--;
				break;
			}
		}	
		}
		for(int k=0; k<arr.length;k++) {
			str += arr[k]+" ";
		}
		System.out.println(str);
		
	}

	public void practice12() {
//		로또 번호 자동 생성기 프로그램을 만들기.
//		(중복 값 없이 오름차순으로 정렬하여 출력하세요.)
		int lotto[] = new int[6];
		String str = "";
		
		for(int i = 0; i <lotto.length; i++) {
			int random = (int)(Math.random()*45+1);
			lotto[i]= random;
			for(int k = 0; k < i; k++) {
				if(lotto[k] == random) {
					i--;
				}
			}
		}
		Arrays.sort(lotto);
		for(int x= 0; x<lotto.length; x++) {
			str += lotto[x]+ " ";
		}
		System.out.println(str);
	}

	public void practice13() {
//		문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
//		문자의 개수와 함께 출력하세요.
		System.out.print("문자열 :");
		String input = sc.next();
		char arr[] = new char[input.length()];
		String str ="";
		
		for(int i = 0; i<arr.length;i++) {
			arr[i]=input.charAt(i);
			str += arr[i];
		}
		System.out.println("문자열에 있는 문자 : " + str);
		System.out.println("문자 개수 : " + (arr.length));
	}

	public void practice14() {
//		사용자가 입력한 배열의 길이만큼의 문자열 배열을 선언 및 할당하고
//		배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
//		단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
//		늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
//		사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
		
//		int plus = 0;
//		int count = 1;
//		int countinput = 0;
//		String copyArr[] = new String[count];
//		String copyArr2[] = new String[countinput];
//		
//		
//		boolean flag = false;
//		
//	
//	
//			System.out.print("배열의 크기를 입력하세요 : ");
//			int input = sc.nextInt();
//			countinput += input;
//			
//			String arr[] = new String[input];
//			sc.nextLine();
//		
//		
//		
//			for(int i = 0; i <arr.length; i++) {
//			System.out.print((i+1)+"번째 문자열 : ");
//			arr[i] =sc.nextLine();
//			}
//			
//			
//			System.out.print("더 값을 입력하시겠습니까?(y/n) : ");
//			char ch = sc.next().charAt(0);
//		
//			
//			if(ch=='y') {
//				flag = true;
//				sc.nextLine();
//				
//			}else {
//				System.out.println(Arrays.toString(arr));
//			}
//			
//			
//		 while(flag) {
//			 System.out.print("더 입력하고 싶은 개수 : ");
//			 int input2 = sc.nextInt();
//			 plus = input + input2;
//			 sc.nextLine();
//			 String arr2[] = new String[plus];
//			 
//			 String arrnew[] = new String[input2];
//			 
//			 for(int i = 0; i <arrnew.length; i++) {
//					System.out.print((i+1)+"번째 문자열 : ");
//					arrnew[i] =sc.nextLine();
//					}
//				System.out.print("더 값을 입력하시겠습니까?(y/n) : ");
//				ch = sc.next().charAt(0);
//				
//				if(ch=='y') {
//					flag = true;
//					sc.nextLine();
//					copyArr = Arrays.copyOf(arr2,arr2.length );
//					
//				}else {
//					System.out.println(Arrays.toString(copyArr));
//				}
//		 }
//		System.out.println();
	
		
	     // 1. 첫 배열 크기 지정
        Scanner sc= new Scanner(System.in);

        System.out.print("배열의 크기를 입력하시오 : ");
        int size = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[size];

        // 2. 첫 배열에 저장할 문자열 입력 받기
        for(int i=0; i<arr.length ; i++) {
            System.out.print((i+1) + "번째 문자열 : ");
            arr[i] = sc.nextLine();
        }

        // 3. 반복이 시작되는 구간부터 무한루프로 작성하여 내부에 종료 조건을 만들어 break
        while(true) {
            System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
            char ch = sc.nextLine().charAt(0);

            // 4. 값을 더 입력할 경우
            if(ch == 'y' || ch == 'Y') {

                // 5. 더 입력받을 개수 입력 받기
                System.out.print("더 입력하고 싶은 개수 : ");
                int addSize = sc.nextInt();
                sc.nextLine();

                // 6. 새로 값을 입력 받을 배열 생성 --> 기존 배열 크기 + 추가 입력 개수
                String[] newArr = new String[arr.length + addSize];

                // 7. 배열 복사 + 새로운 문자열 입력 받기
                for(int i=0; i<newArr.length ; i++) {
                    if(i<arr.length) { // 인덱스의 크기가 기존 배열보다 작을 경우 기존 배열값 복사
                        newArr[i] = arr[i];
                    }else { // 인덱스의 크기가 기존 배열보다 클 경우 새로운 문자열 입력 받기
                        System.out.print((i+1) + "번째 문자열 : ");
                        newArr[i] = sc.nextLine();
                    }
                }

                // 8. 기존 배열공간을 참조하던 변수 arr에 새로운 배열 공간의 주소 newArr 대입
                arr = newArr;

            }else if(ch == 'n' || ch == 'N'){ // 9. 값을 더 입력하지 않은 경우
                break; // 반복문 종료
            }else { // 잘못 입력한 경우
                System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
            }
        }

        // 10. 배열값 모두 출력
        System.out.println(Arrays.toString(arr));
		
		
		
	}
}
