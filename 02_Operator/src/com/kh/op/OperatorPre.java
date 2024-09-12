package com.kh.op;

import java.util.Scanner;

public class OperatorPre {
	// 최종 출력 되는 메인 메서드
	public static void main(String[] args) {
		method1();
	}
	public static void method1() {
		// 최종 출력 되는 메서드가 아니라, 내가 필요할 때 꺼내서 사용할 수 있는 메서드
		// 메서드란, 특정 상태나 기능을 정리해놓은 집합이다.
		// static 이란, 고정된 이라는 뜻을 가지고 있다.
		// static 이 붙는다는 것은 자료형이나 변수에 담아서 쓰는게 아니라, 
		// 단독으로, 고정적으로 메모리에서 사용할 수 있음을 나타내는 표현이다.
		
		
		
		// 1. int num1 = 10, int num2 = 3
		//    더하기 빼기 곱하기 나누기 결과 출력하기
		
		// 2. double num3 = 2.5, double num4 = 3.5
		//    더하기 빼기 곱하기 나누기 결과 출력하기
		
		int num1 = 10;
		int num2 = 3;
		
		int sum1 = num1 + num2;
		int dif1 = num1 - num2;
		int mul1 = num1 * num2;
		int div1 = num1 / num2;
		
		System.out.println("int의 덧셈 결과 : " + sum1);
		System.out.println("int의 뺄셈 결과 : " + dif1);
		System.out.println("int의 곱셈 결과 : " + mul1);
		System.out.println("int의 나눗셈 결과 : " + div1);
		
		double num3 = 2.5;
		double num4 = 3.5;
		
		double sum2 = num3 + num4;
		double sub1 = num3 - num4;
		double mul2 = num3 * num4;
		double div2 = num3 / num4;
		
		System.out.println("double의 덧셈 결과 : " + sum2);
		System.out.println("double의 뺄셈 결과 : " + sub1);
		System.out.println("double의 곱셈 결과 : " + mul2);
		System.out.println("double의 나눗셈 결과 : " + div2);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 정수 a 값을 직접 입력하세요. : ");
		int a = sc.nextInt();
		System.out.print("원하는 정수 b 값을 직접 입력하세요. : ");
		int b = sc.nextInt();
		
		int sum3 = a+b;
		int dif2 = a-b;
		int mul3 = a*b;
		int div3 = a/b;
		
		System.out.println("정수 a와 정수 b의 덧셈 결과 : " + sum3);
		System.out.println("정수 a와 정수 b의 뺄셈 결과 : " + dif2);
		System.out.println("정수 a와 정수 b의 곱셈 결과 : " + mul3);
		System.out.println("정수 a와 정수 b의 나눗셈 결과 : " + div3);
		
		System.out.println("원하는 실수 c 값을 직접 입력하세요. : ");
		double c = sc.nextDouble();
		System.out.println("원하는 실수 d 값을 직접 입력하세요. : ");
		double d = sc.nextDouble();
		
		double sum4 = c+d;
		double sub2 = c-d;
		double mul4 = c*d;
		double div4 = c/d;
		
		System.out.println("실수 c와 실수 d의 덧셈 결과 : " + sum4);
		System.out.println("실수 c와 실수 d의 뺄셈 결과 : " + sub2);
		System.out.println("실수 c와 실수 d의 곱셈 결과 : " + mul4);
		System.out.println("실수 c와 실수 d의 나눗셈 결과 : " + div4);
		
		sc.close();
		
		
		
	}

}
