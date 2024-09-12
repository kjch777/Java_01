package com.kh.op;

import java.util.Scanner;

public class OperatorEx {
	// 메인 메서드 호출
	public static void main(String[] args) {
		
		// 내가 스캐너로 입력 받은 값이 출력되게 해보자
		
		Scanner sc = new Scanner(System.in);
		System.out.println("안녕하세요. 계산기예요.");
		System.out.print("a 값을 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print("b 값을 입력하세요 : ");
		int b = sc.nextInt();
		// a = b 보다 큰 수를 사용
		// b = a 보다 작은 수를 사용
		
		
		// int a = 1;
		// int b = 3;
		System.out.println(a+b);
		
		int sum = a+b; // 덧셈
		System.out.println("덧셈 결과 sum : " + sum);
		
		int dif = a-b; // 뺄셈
		System.out.println("뺄셈 결과 dif : " + dif);
		
		int mul = a*b; // 곱셈
		System.out.println("곱셈 결과 mul : " + mul);
		
		int div = b/a; // 나눗셈
		System.out.println("나눗셈 결과 div : " + div);
		
		sc.close();
		
		

	}

}
