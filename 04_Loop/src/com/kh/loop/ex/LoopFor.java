package com.kh.loop.ex;

public class LoopFor {
	/*
	 for 문 : 끝이 정해진 반복을 진행할 때 사용하는 제어문이다.
	 특정 조건을 만족하는 동안 { } 안에 있는 코드 블럭을 반복해서 실행하며,
	 반복 횟수가 일정하게 정해진 경우에 많이 사용한다.
	 
	 사용 예제
	 for (초기식; 조건식; 증감식){
	 			맨 뒤 증감식 끝에는 ; 을 쓰지 않는다.
	 			조건이 맞을 경우 반복해서 실행될 코드 블럭
	 						}
	 			for 문 조건이 맞지 않으면 for 문을 탈출한다.
	 			
     for - each 문 : 배열이나 반복 가능한 모든 값에 대하여, 반복적으로 작업할 때 사용하는 편리한 반복문
     				조건과 반복이 처음부터 끝까지 모두 반복
     				
     사용 예제
     	for(자료형 변수명 생성 : 반복해서 보여주고자 하는 변수명 작성) {
     		// 실행하고자 하는 작업 작성
     		System.out.println(생성된 변수명 작성);
     	}
	 			
	 */

	public static void main(String[] args) {
		/*
		 for ( 초기식의 값이기 때문에 i 라고만 작성하면 오류가 난다.
		 for ( i ; i <= 2; i++ ) {
		  		System.out.println(" i 의 값 : " + i );
		 무조건 
		 for (지정값 변수명 = 변수의 초기 숫자; 조건; 증감식) 
		 	 	   의 형식으로 작성해야 한다.
		 */
		for(int i = 1; i <= 2; i++) {
			System.out.print(i + " ");
		}
		System.out.println("===== for문 2번 =====");
		for(int a = 1; a <= 3; a++) {
			System.out.print("a의 값 : " + a + "\n");
		}
		System.out.println("===== for문 3번 =====");
		for(int num = 1; num <= 5; num++) {
			System.out.println("num의 값 : " + num);
		}
		System.out.println("===== for문 4번 =====");
		for(int num = 2; num <= 10; num+=2) {
			System.out.println("num 의 값 : " + num);
		}
		// for 문으로 구구단 5단 출력 하기
		System.out.println("===== for문 5번 =====");
		System.out.println("구구단 5단");
		int dan = 5;
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " X " + i + " = " + (dan*i));
		}
		
		System.out.println("===== for문 6번 =====");
		int dan3 = 3;
		for(int i = 1; i <=9; i++) {
			System.out.println(dan3 + " X " + i + " = " + (dan3*i));
		}
		
	}

}
