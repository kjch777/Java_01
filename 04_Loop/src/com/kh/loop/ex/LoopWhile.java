package com.kh.loop.ex;

import java.util.Scanner;

public class LoopWhile {
	/*
	 while(조건식) : 끝이 확실하지 않은 반복에 사용한다.
	  
	 while(조건식이 참일 경우) {
	 						조건식이 참일 경우에 실행
	 }
	 						조건식이 거짓일 경우 실행 종료 
	  
	 예제 코드 1
	 	while(true){
	 		System.out.println("무한 반복);
	 	} 
	 
	 예제 코드 2
	 	while(false){
	 		System.out.println("실행하지 못한 채로 종료");
	 	}
	  
	 */
	public static void main(String[] args) {
		// 최종으로 실행하는 메인 메서드
		
		//inLoop();
		//whileLoop();
		whileLoopEX();

	}

	public static void inLoop() {
		// 최종으로 실행하지는 않지만, 코드를 작성할 수 있는 메서드
		
		while(true) {
			System.out.println("무한 실행");
		}
	}
	
	public static void outLoop() {
		
		/*	while(false) {
				System.out.println("실행 안됨");
		}	*/
		
	}
	
	public static void whileLoop() { // i 가 3 이상이면 거짓인 조건
		
		int i = 1;
		while(i <= 2) { // 조건이 참일 때 실행할 코드
			
			System.out.println("i의 값 : " + i);
			i++;
		}
		
	}
	
	public static void whileLoopEX() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) { // while () 안에 true 라고 써도 실행이 된다.
			System.out.println("1. 실행 / 2. 종료");
			System.out.print("원하는 번호를 입력하세요 : ");
			
			int num = sc.nextInt();
			switch(num) {
			case 1 :
				System.out.println("프로그램을 실행합니다.");
				break;
			case 2 : 
				System.out.println("프로그램을 종료합니다.");
				//break;
				return; 
				// break 와 return 모두 case 를 탈출하는 구문이기 때문에, 같이 사용할 수는 없다.
				// break 의 경우 while 이 true 일 때는, 종료되지 않고 계속 반복된다.
				// return 의 경우 while 이 true 여도, while 코드를 탈출해서 종료된다.
			default : 
				System.out.println("잘못된 번호입니다. 다시 입력해 주세요.");
				System.out.println("1. 실행 / 2. 종료");
				System.out.print("원하는 번호를 입력하세요 : ");
			}
		}
		
		
		
	}

}
