package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		int num[] = new int[11];
		
		for(int i = 1; i < num.length; i++) {
			num[i] = i;
			System.out.print(i + " ");
		}
	}

	public void practice2() {
		int num[] = new int[10];
							// length 는 size 이지, max 의 개념이 아니다.
		for(int i = 0; i < num.length; i++) {
			num[i] = num.length - i; 
		 // num[0] =         10 - 0;	즉 10 
		 //	num[1] =         10 - 1;	즉  9
		 // num[9] = 		 10 - 9;    즉  1 
			System.out.println("num[" + i + "] = " + num[i]);
		                     // num    [0]     =       10; 
		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요 : ");
		int size = sc.nextInt();
		
		// 입력 받은 정수 크기의 배열 생성
		int num[] = new int[size]; 
		
		        // size == num.length
		for(int i = 0; i < num.length; i++) {
			num[i] = i + 1;
			System.out.print(num[i] + " ");
		}
	}

	public void practice4() {
						 //  0	   1	 2	    3	    4
		String[] fruits = {"사과", "귤", "포도", "복숭아", "참외"};
						 // 중괄호 { } 를 사용한다.
		System.out.println(fruits[1]);
	}

	public void practice6() {
		// int number[] = new int[5];
	    // index		    0 부터 [ ] 안의 숫자 - 1
		// length                 5
		
		// 요일 생성
				// length  7
				// index   0	   1	   2	   3	   4	   5	   6
		String[] dotw = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		Scanner sc = new Scanner(System.in);
		
		// 0 부터 6 까지의 정수 입력
		System.out.print("0 ~ 6 중 하나의 정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		// 입력된 숫자가 0 ~ 6 사이의 숫자가 맞는지 확인 후, 맞다면 요일 출력
		if((0 <= num) && (num <= 6)) { // .length 를 사용하면 숫자로 인식하게 된다.
			System.out.println(dotw[num]);
		} else {
			System.out.println("잘못된 입력입니다.");
		}
	}

	public void practice9() {
		
		// 길이가 7인 배열 생성하기
		int[] num = new int[7]; // index : [0 1 2 3 4 5 6]		length : 7
		
		// 랜덤을 이용하여 숫자 출력하기
			// 1. Random 객체 사용 : 조금 더 넓은 범위로 랜덤 사용 가능
			// 2. Math 객체에서 random() 메서드 사용 : 위 Random 객체보다는 작은 범위로 사용 가능
		for(int i = 0; i < num.length; i++) { // num 의 최종 길이를 알기 위해 num.length 를 사용했다.
			num[i] = (int)(Math.random() * 45 + 1); 
			// 45만 쓰면 0 ~ 44가 나오기 때문에, + 1을 써서 1 ~ 45가 나오게 한다.
			
			System.out.println("num[" + i + "] = " + num[i]);
		}
	}

}
