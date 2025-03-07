package com.kh.op;

public class OperatorEx6 {
	/*
	 증감 연산자
	 +=
	 덧셈 연산을 수행하고, 결과를 변수의 값으로 넣어주는 역할을 한다.
	 
	 -=
	 뺄셈 연산을 수행하고, 결과를 변수의 값으로 넣어주는 역할을 한다.
	 
	 이외에도 *=	/=	%=	**==  //== 등등이 있다.
	 */
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		// += 연산자를 활용한 예제
		System.out.println("===== [+=] =====");
		System.out.println("num1 : " + num1 + " , num2 : " + num2);
		
		num1 += 3; // num1 = num1 + 3;
		System.out.println("num1 += 3 을 해준 num1 의 값 : " + num1);
		
		num2 += num1; // num2 = num2 + num1;
		System.out.println("num1 : " + num1 + " 과 num1 + num2 를 해준 num2 의 값 : " + num2);
		
		System.out.println("===== [-=] =====");
		
		int num3 = 10;
		int num4 = 5;
		
		num3 -= 2; // num3 = num3 -2;
		num4 -= num3; // num4 = num4 - num3;
		System.out.println("num3 의 값 : " + num3);
		System.out.println("num4 의 값 : " + num4);
	}

}
