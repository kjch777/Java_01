package com.kh.variable.ex;

public class 자료형Ex {

	public static void main(String[] args) {
		// 변수 : 메모리에 값을 저장하기 위한 공간
		//		 저장되는 값이 변할 수 있기 때문에 변수라 한다.
		
		// 자료형 : 변수 또는 값의 크기나 형식을 결정
		
		/*
		 자바에서 기본으로 제공하는 자료형(예약어)
		 [논리형]
		 boolean (1byte) - true / false
		 
		 [정수형]
		 byte  (1byte)
		 short (2byte)
		 int   (4byte) - 정수 기본형
		 long  (8byte)
		 
		 [실수형]
		 float  (4byte) - 숫자 뒤에 f나 F를 붙여줘야함
		 double (8byte) - 실수 기본형
		 
		 [문자형]
		 char (2byte) - 문자 하나만 넣을 수 있고, 문자 앞뒤로 ''(작은 따옴표) 사용해야 함
		 
		 참조형 : 기본은 아니지만, 기본이 된 문자열
		 [문자열]
		 String : 크기를 특정하게 지정할 수 없음, 맨 앞 S 대문자
		 		  표현하려면 문자열 앞뒤로 ""(큰 따옴표) 사용해야함
		 		  
		 // 변수 선언 : 메모리에 공간을 할당
		 // 값 대입 : 변수에 값을 집어넣는 것
		 // 변수를 선언할 때, 자료형은 변수명마다 최초 1회만 선언
		 * */
		
	  //자료형(예약어)	  변수명 선언	  =    값 대입	;(종료)
		int            number     =      1;
		System.out.println(number);
		
	  //변수명에 들어있는 숫자를 변경하고 싶다면
	  //변경할 때, 자료형은 사용하지 않음
		
		number = 3;
	  //number 안에는 이제 1 대신 3이 들어가 있게 된다.
		
		System.out.println(number);

	}

}
