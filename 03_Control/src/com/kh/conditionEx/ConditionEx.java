package com.kh.conditionEx;

import java.util.Scanner;

// 패키지 : 작성한 파일의 실제 폴더 위치
public class ConditionEx {
// 조건문 기능용 클래스 
// if 와 else 용 클래스
	public static void main(String[] args) {
		// 최종 메서드
		//method1();
		//method2();
		//method3();
		practice1();
		practice2();
	}
	
	public static void method1() {
		// 메서드 1
		Scanner sc = new Scanner(System.in);
		
		System.out.print("고객님의 나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		if (age >= 19) {
		// 만약 고객의 나이가 19세 이상이라면
		// 즉 age 의 값이 19 이상이면
			System.out.println("성인입니다.");
			// "성인입니다." 를 출력할 것
		}
		
		else {
		// 만약 age 의 값이 19 미만이면
			System.out.println("미성년자입니다.");
			// "미성년자입니다." 를 출력할 것
			
			/*
			 if 란 주어진 조건이 참일 때 실행되는 코드 블록이다.
			 else 는 조건이 거짓일 때 실행되는 코드 블록 (필수로 작성해야 하는 것이 아니다.)
			 else 는 소괄호 ( ) 안에 조건식을 작성하지 않아도 된다.
			 
			 사용 방법
			 if (조건문) {
			 	조건이 참일 경우 실행할 코드 작성
			 	만약, 조건문의 조건이 참이 아닐 경우에는 자동으로 종료된다.
			 }
			 */
		}
		
	}
	
	public static void method2() {
		
		int num = 2;
		
		if (num % 2 == 0) {
			// 어떤 수를 2로 나눴을 때 나머지가 0이면 짝수이다.
			System.out.println("짝수입니다.");
		}
		
		else {
			System.out.println("홀수입니다.");
		}
		
	} 
	
	public static void method3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("고객님의 나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		if((0 < age) && (age < 14)) {
			System.out.println("어린이입니다.");	
		}
		
		else {
			System.out.println("어린이가 아닙니다.");
		}
		
	}

	public static void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("고객님의 나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		if ((age >= 10) && (age < 20)) {
			System.out.println("10대 입니다.");
		}
		
		else {
			System.out.println("10대가 아닙니다.");
		}
	}
	
	public static void practice2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("고객님의 나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		if (age >= 80) {
			System.out.println("80세 이상입니다.");
		}
		
		else {
			System.out.println("해당하지 않습니다.");
		}
	}

}
