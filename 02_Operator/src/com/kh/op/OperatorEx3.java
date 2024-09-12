package com.kh.op;

public class OperatorEx3 {

	public static void main(String[] args) {
		/*
		 * 증감 연산자 : ++ --
		 * ++ 는 1을 더한다는 의미
		 * -- 는 1을 뺀다는 의미
		 * 변수값 자체를 바꿔버리는 것 같다.
		 * 
		 * 전위 연산자 : 먼저 더하기 빼기를 한 다음에 다른 계산을 실행할 것
		 * 후위 연산자 : 다른 계산을 먼저 한 다음에 더하기 빼기를 실행할 것 
		 * */ 
		
		int a = 10;
		  // b 까지 가기 전에 a 에 1을 더해서 a값을 b한테 넣어준다.
		  // a 는 b 한테 들어가기 전에 10 + 1 을 한 값이
		  // a 안으로 들어가게 되고, a 안에 들어간 10 + 1 = 11 이
		  // b 안으로 들어가게 된다.
		  // (a+1=a)
		int b = ++a;
		System.out.println("a : " + a + ", " + "b : " + b);
		
		int c = 10;
		// 우선 d 에다가 c 값을 넣어준다. d = c = 10
		// 그 후에 c 에다가 1 을 더해준다. c = c + 1 = 11
		int d = c++;
		System.out.println("c : " + c + ", " + "d : " + d);
		

	}

}
