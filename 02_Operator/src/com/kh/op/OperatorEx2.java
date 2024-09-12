package com.kh.op;
// 메서드란, 특정 상태나 기능을 정리해놓은 집합이다.
// class 바깥에는 package와 import 만 작성할 수 있고,
// 이외에 개발자가 실행하고자 하는 내용은 class 내부에 작성해야 한다.
import java.util.Scanner;

public class OperatorEx2 {
	// 1. 메서드 : 스캐너를 사용하지 않는 메서드
	public static void method1() {
		int num1 = 20;
		int num2 = 5;
		int 더하기 = num1 + num2;
		int 빼기 = num1 - num2;
		int 곱하기 = num1 * num2;
		int 나누기 = num1 / num2;
		System.out.println("더하기 : " + 더하기);
		System.out.println("빼기 : " + 빼기);
		System.out.println("곱하기 : " + 곱하기);
		System.out.println("나누기 : " + 나누기);
		
	}
	
	public static void method2() {
		double num3 = 1.4;
		double num4 = 2.5;
		
		double sum = num3 + num4;
		double sub = num3 - num4;
		double mul = num3 * num4;
		double div = num3 / num4;
		
		System.out.println("sum : " + sum);
		System.out.println("sub : " + sub);
		System.out.println("mul : " + mul);
		System.out.println("div : " + div);
	}
	
	public static void method3() {
		// method3() 는 Scanner
		// method3 옆에 있는 () 는 나중에 어떤 값을 받을 때 사용하며,
		// 값을 받을 일이 없으면 () 는 빈 공간으로 유지한다.
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 A를 입력하세요 : ");
		int num5 = sc.nextInt(); // 키보드로 작성한 숫자가 num5 로 들어올 수 있게 변수 선언
		System.out.print("숫자 B를 입력하세요 : ");
		int num6 = sc.nextInt(); // 키보드로 작성한 숫자가 num6 로 들어올 수 있게 변수 선언
		int sum1 = num5 + num6;
		int sub1 = num5 - num6;
		int mul1 = num5 * num6;
		int div1 = num5 / num6;
		// 키보드로 작성한 숫자를 더하기 빼기 곱하기 나누기 할 수 있다.
		System.out.println("sum1 : " + sum1);
		System.out.println("sub1 : " + sub1);
		System.out.println("mul1 : " + mul1);
		System.out.println("div1 : " + div1);
		
		sc.close();
		
	}
	
	// method4 를 만들어서 Scanner 로 double 더하기 빼기 곱하기 나누기 출력
	// double num7 = sc.nextDouble();
	// double num8 = sc.nextDouble();
	// 더하기 double sum2 
	// 빼기 double sub2
	// 곱하기 double mul2
	// 나누기 double div2
	
	public static void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("실수 A를 입력하세요. → ");
		double num7 = sc.nextDouble();
		System.out.print("실수 B를 입력하세요. → ");
		double num8 = sc.nextDouble();
		
		double sum2 = num7 + num8;
		double sub2 = num7 - num8;
		double mul2 = num7 * num8;
		double div2 = num7 / num8;
		
		System.out.println("더한 값 : " + sum2);
		System.out.println("뺀 값 : " + sub2);
		System.out.println("곱한 값 : " + mul2);
		System.out.println("나눈 값 : " + div2);
		
		sc.close();
	}

	public static void main(String[] args) {
		// 최종 제출 메인 메서드
		// 앞으로는 만든 메서드 중에서 출력하고 싶은 메서드만 작성할 것
		
		// 만약에 method1() 안에 작성한 내용을 출력하고 싶다면,
		// method1(); 이라고 작성 후 출력하면 된다.
		//method1();
		//method2();
		//method3();
		method4();
		
		

	}

}
