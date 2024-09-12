package com.kh.array;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		/*
		// for 문을 활용한 배열 출력
		
		int numbers[] = new int[5];
		// 1 부터 4 까지 배열에 숫자를 넣어보자
		// index 0 부터 시작하기 때문에 i = 0;
		// length : 길이
		// numbers.length : numbers 의 최대 길이를 구하겠다는 뜻
		System.out.println("최대 길이 : " + numbers.length);
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i;
			System.out.println("numbers[" + i + "] = " + i);
		}
		*/
		
		// method1();
		ArrayEx2 ae = new ArrayEx2();
		ae.practice17();
		
	}
	
	public static void method1() {
		
		// 정수 0 1 2 에 각각 10 20 30 을 넣고 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("0 1 2 중 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		int[] num1 = new int[3];
		num1[0] = 10;
		num1[1] = 20;
		num1[2] = 30;
		
		if((0 <= num) && (num < 3)) {
			for(int i = 0; i < num1.length; i++) {
				if(i == 0) {
					System.out.println(num1[i]);
					return;
				} else if(i == 1) {
					System.out.println(num1[i]);
					return;
				} else if(i == 2) {
					System.out.println(num1[i]);
					return;
				}
			}
		} else {
			System.out.println("잘못된 입력입니다.");
		}
		
	}
	
	public static void method2() {
		
		// 문자열  월 화 수 목 금 토 일  각 자리에 어떤 요일이 들어가 있는지 출력하기
				String[] str = {"월", "화", "수", "목", "금", "토", "일"};
				//          [] 를 위 자리에 작성해도 상관없다.
				for(int i = 0; i < str.length; i++) {
					System.out.println(str[i] + " ");
				}
				
				// 실수 index 2 까지 만들고 출력
				double[] dbl = new double[3];
				dbl[0] = 10.1;
				dbl[1] = 11.2;
				dbl[2] = 12.3;
				
				for(int i = 0; i < dbl.length; i++) {
					System.out.print(dbl[i] + " ");
				}
				
				// 문자 A B C 넣고 각 자리 출력하기
				char chr[] = {'A', 'B', 'C'};
				
				for(int i = 0; i < chr.length; i++) {
					System.out.println(chr[i] + " ");
				}
				
	}

	public void practice17() {
		
		String[] chickenMenu = {"후라이드 치킨", "양념 치킨", "간장 치킨"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("먹고 싶은 치킨 이름을 입력 하세요 : ");
		String inputChic = sc.nextLine();
		
		// 배열에 사용자가 입력한 치킨이 있는지 검색하기
		boolean found = false;
		
		// for - each 문을 사용하여 치킨이 있는지 확인하기
		for(String Chic : chickenMenu) {
			
			if(Chic.equals(inputChic)) { // 만약 치킨이 존재한다면, found = true; break;
				found = true;
				break;
			}
			
		} 
		
		// 만약 치킨이 존재한다면, 배달 가능 이라고 출력하고,
		if(found) {
			System.out.println(inputChic + "은 배달 가능합니다!");
		} else { // 존재하지 않는다면, ㅇㅇ치킨은 없는 메뉴 입니다. 출력하기
			System.out.println(inputChic + "은(는) 존재하지 않는 메뉴입니다.");
		}
		
	}

}
