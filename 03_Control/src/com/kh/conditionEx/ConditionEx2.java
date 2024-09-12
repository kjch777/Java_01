package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionEx2 {

	public static void main(String[] args) {
		/*
		 if - else if - else 
		 
		 사용 방법
		 if (조건 1) {
		 	조건 1이 참일 경우 실행할 코드 작성
		 }
		 
		 else if (조건 2) {
		 	조건 1이 거짓이고
		 	조건 2가 참일 경우 실행할 코드 작성
		 }
		 
		 else {
		 	조건 1과 조건 2가 모두 거짓일 경우 실행할 코드 작성
		 }
		 */
		method1();
		//method2();
		//method3();
		//method4();

	}
	
	public static void method1() {
		// 만약 돈이 2_000 원 이상 있을 경우, 택시를 탄다.
		// 만약 돈이 1_500 ~ 1_900 원 이하 있을 경우, 대중교통을 탄다.
		// 이외의 경우, 걸어간다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 가지고 있는 돈의 액수를 입력 하세요 : ");
		int money = sc.nextInt(); // 내가 현재 가지고 있는 돈
		
		String result;
		
		if(money >= 2_000) {
			result = "택시";
		}
		
		else if((money >= 1_500) && (money <= 1_900)) {
			result = "대중 교통";
		}
		
		else {
			result = "도보";
		}
		
		System.out.println(result + " 을(를) 이용 합니다.");
	}
	
	public static void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("안녕하세요, 네버랜드입니다! 나이를 입력 해주세요 : ");
		int age = sc.nextInt();
		String result;
		
		if((age <= 13) && (age > 0)) {
			result = "어린이";
		}
		
		else if((age > 13) && (age <= 18)) {
			result = "청소년";
		}
			
		else if(age > 18) {
			result = "성인";
		}
		
		else {
			result = "잘못된 입력";
		}
		System.out.println(result + " 입니다.");
	}
	
	public static void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("계절을 알아보기를 원하는 달을 숫자로 입력하세요 : ");
		int month = sc.nextInt();
		
		String result; // if - else if - else 모두에 result 를 반드시 써야 한다.
		if((month == 1) || (month == 2) || (month == 12)) {
			result = "겨울";
		} else if((month>=3) && (month<=5)) {
			result = "봄";
		} else if((month>=6) && (month<=8)) {
			result = "여름";
		} else if((month>=9) && (month<=11)) {
			result = "가을";
		} else {
			result = "잘못된 입력";
		}
		System.out.println(result + " 입니다.");
	}
	
	public static void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		// 변수의 기능을 활용하여 마지막에 나이에 따른 표기를 출력
		String result;
		// 타입	변수명
		if((age <= 13) && (age > 0)) {
			result = "어린이";
		} else if((age >= 14) && (age <= 18)) {
			result = "청소년";
		} else if(age > 18) {
			result = "성인";
		} else {
			result = "잘못된 입력";
		} 
		
		System.out.println(result + " 입니다.");
	}
}


