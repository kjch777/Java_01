package com.kh.practice.numRange.view;

import java.util.Scanner;

public class NumberMenu {

// 메서드
	// 출력 void
	public void menu() {
		// 사용자에게 두 정수를 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		sc.nextLine(); // 버퍼 지우기
		System.out.println("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		sc.nextLine(); // 버퍼 지우기
		
		// 입력 받은 두 정수를 NumberController 의 checkDouble() 에 매개변수로 넘겨주어 반환 값을 출력하기
	}
	
}
