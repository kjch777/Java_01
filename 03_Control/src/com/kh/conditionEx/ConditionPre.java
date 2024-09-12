package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionPre {

	public static void main(String[] args) {
		// 최종으로 실행할 메인 메서드
		//method1();
		//method2();
		method3();

	}

	public static void method1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		if (num1 == num2) {
			System.out.println(num1 + " 과 " + num2 + " 의 값은 같습니다.");
		} else {
			System.out.println(num1 + " 과 " + num2 + " 의 값은 다릅니다.");
		}
		
	}
	
	public static void method2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 문자를 입력하세요 : ");
		String str1 = sc.nextLine();
		System.out.print("두번째 문자를 입력하세요 : ");
		String str2 = sc.nextLine();
		
		if (str1.equals(str2)) {
			System.out.println(str1 + " 와 " + str2 + " 는 같습니다.");
		} else {
			System.out.println(str1 + " 와 " + str2 + " 는 다릅니다.");
		}
		
	}
	
	public static void method3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 실수를 입력하세요 : ");
		double dou1 = sc.nextDouble();
		System.out.print("두번째 실수를 입력하세요 : ");
		double dou2 = sc.nextDouble();
		
		if (dou1 == dou2) {
			System.out.println(dou1 + " 와 " + dou2 + " 는 같습니다.");
		} else {
			System.out.println(dou1 + " 와 " + dou2 + " 는 다릅니다.");
		}
		
	}

}
