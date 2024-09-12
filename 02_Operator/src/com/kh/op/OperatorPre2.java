package com.kh.op;

import java.util.Scanner;

public class OperatorPre2 {
	
	public static void method1() {
		// 스캐너로 입력한 값이 true 인지 false 인지 작성 해볼 것
		
		Scanner sc = new Scanner(System.in);
		System.out.print("a의 값을 입력하세요. : ");
		int a = sc.nextInt();
		System.out.print("b의 값을 입력하세요. : ");
		int b = sc.nextInt();
		System.out.println("a : " + a + ", " + "b : " + b);
		System.out.println("a 와 b 가 같으면 a == b 는 true 가 나올 것입니다.");
		System.out.println("a == b : " + (a == b));
		System.out.println("a 와 b 가 다르면 a != b 는 true 가 나올 것입니다.");
		System.out.println("a != b : " + (a != b));
		
		sc.close();
		
	}
	
	// method2 를 만들어서 증감 연산자를 사용한 다음,
	// 비교 연산자를 사용해서 값이 같은지 다른지 확인해볼 것
	
	public static void method2() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("c의 값을 입력하세요 : ");
		int c = sc.nextInt();
		System.out.println("입력한 c의 값 : " + c);
		// c 의 값으로 11을 입력했다면
		System.out.print("d의 값을 입력하세요 : ");
		int d = sc.nextInt();
		
		int e = ++c; // e = c + 1 = c 따라서 e = c = 12
		
		// int f = ++c; 를 한다면, f의 값은 어떻게 나오는지
		// System.out.println("f : " + f); f값 출력해보기
		
		System.out.println("c : " + c + ", d : " + d + ", e : " + e);
		System.out.println("c == d : " + (c == d));
		System.out.println("c == e : " + (c == e));
		
		int f = ++c; // f = c + 1 = c 따라서 f = c = 12 + 1 = 13
		System.out.println("f : " + f);
		
		sc.close();
	}

	//method3 만들어서 사용하기
	
	public static void method3() {
		/* 최종 목표 : 모든 사람이 사탕을 골고루 나눠 가지려고 한다.
		 * 이 때, 인원 수와 사탕 개수를 키보드로 입력 받고,
		 * 1인당 동일하게 나눠 가진 사탕의 개수와,
		 * 나눠 주고 남은 사탕의 개수를 출력 해보자.
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수를 입력 하세요. : ");
		int people = sc.nextInt(); // 인원 수
		
		System.out.println("사탕 파티에 " + people + " 명이 참석했습니다.");
		System.out.print("현재 가지고 있는 사탕의 총 개수를 입력 하세요. : ");
		int candies = sc.nextInt();
		System.out.println("현재 가지고 있는 사탕은 총 " + candies + " 입니다.");
		
		System.out.println("그렇다면 1인당 동일하게 나눠 가질 사탕의 개수는 몇 개입니까?");
		
		// 한 사람 당 동일하게 나눠 가질 사탕의 개수 = 사탕의 총 개수 / 총 인원 수 
		
		int perPerson = candies / people;
		System.out.println("1인당 동일하게 나눠가질 사탕의 개수는 " + perPerson + " 개입니다.");
		System.out.println("그렇다면 남은 사탕의 개수는 몇 개입니까?");
		// 남은 사탕의 개수 = 사탕의 총 개수 % 인원 수;
		
		int remain = candies % people;
		System.out.println("남은 사탕의 개수는 " + remain + " 개입니다.");
		
		sc.close();
		
	}
	
	public static void main(String[] args) {
		// 최종 출력할 method 만 작성
		method3();

	}

}
