package com.kh.variable.ex;

public class 강제형변환Ex2 {
	// 메인 메서드 (프로그램을 실행하는 공간)
	public static void main(String[] args) {
		/*
		 강제 형 변환
		 1. 값의 범위가 큰 자료형을 작은 자료형으로 강제로 변환하는 것
		 2. 따라서 데이터 손실을 고려해야 한다
		 3. 의도적으로 자료형을 다른 자료형으로 변환할 때 사용
		 
		 사용방법
		 (자료형) 변수명 ; 
		 사용하면 괄호 안에 지정된 자료형으로 변경됨
		 */
		
		// 강제 형 변환 확인 1
		// 자료형 변환 + 데이터 손실
		int num1 = 290;
		// int 4byte 를 byte 1byte 로 변경하겠다는 의미
		byte result1 = (byte) num1; // 강제 형 변환 하기 위한 예제
		System.out.println("num1 : " + num1 + ", result1 : " + result1);

	}

}
