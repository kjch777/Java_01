package com.kh.op;

import java.util.Scanner;

public class OperatorPre3 {

	public static void main(String[] args) {
		
		//method1();
		method2();

	}

	public static void method1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		boolean result1 = (num1 > num2);
		boolean result2 = (num1 < num2);
		boolean result3 = (num1 >= num2);
		boolean result4 = (num1 <= num2);
		
		System.out.println("비교 결과 값 1 = " + num1 + " > " + num2 + " : " + result1);
		System.out.println("비교 결과 값 2 = " + num1 + " < " + num2 + " : " + result2);
		System.out.println("비교 결과 값 3 = " + num1 + " >= " + num2 + " : " + result3);
		System.out.println("비교 결과 값 4 = " + num1 + " <= " + num2 + " : " + result4);
		
	}
	
	public static void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		System.out.print("세번째 정수를 입력하세요 : ");
		int num3 = sc.nextInt();
		
		boolean result1 = (num1 == num2) && (num2 != num3);
		// && if while 조건을 체크할 때
		// 	  2개의 조건이 모두 만족하는 경우에 사용한다.
		//  & 비트 단위 연산으로 특정 비트 패턴을 판단할 때 사용한다.
		//	  거의 쓰이지 않는다.
		boolean result2 = (num1 >= num2) || (num2 <= num3);
		
		System.out.println("비교 결과 값 1 : " + result1);
		System.out.println("비교 결과 값 2 : " + result2);
		
		
	}

}
