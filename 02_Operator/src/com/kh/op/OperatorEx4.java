package com.kh.op;

public class OperatorEx4 {

	public static void main(String[] args) {
		/*
		 비교 연산자
		 데이터가 같은지 다른지를 비교할 때 사용한다.
		 결과는 항상 true 또는 false 로 나타난다.
		 
		 
		 사용 방벙
		 a == b 
		 		a 와 b 가 같으면 true
		 		a 와 b 가 다르면 false
		 a != b 
		 		a 와 b 가 다르면 true
		 		a 와 b 가 같으면 false
		 		
		 != 부정할 때 사용하는 연산자
		 == 같을 때 사용하는 연산자
		 
		 
		 */
		
		
		
		int a = 10;
		int b = 10;
		// System.out.println 으로 무언가를 출력할 때
		// + 는 " " 문자열이 있으면 각각의 값을 이어주는 역할을 한다.
		// 문자열이 들어간 출력 프린트에서 연산(더하기 빼기 곱하기 나누기 true false)
		// 같은 작업을 진행하기 위해서는 우선순위 1번인 () 를 이용해서
		// 연산 작업을 우선으로 진행하고, 연산이 끝난 결과를 문자와 이어 붙인다.
		System.out.println("a == b 일 때 : " + (a == b));
		System.out.println("a != b 일 때 : " + (a != b));
		System.out.println(a==b);
		System.out.println(a!=b);
		// a = 10 b = 10
		int c = 20;
		int d = 10;
		System.out.println("c == d 일 때 : " + (c == d));
		System.out.println("c != d 일 때 : " + (c != d));
		
		//1. a가 10이고 c가 20일 때, == 를 썼을 경우
		System.out.println("a == c ↓");
		System.out.println("     " + (a == c));
		// a == c 는 값이 다르기 때문에 false 가 나온다.

	}

}
