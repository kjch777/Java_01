package com.kh.variable.ex;

public class 상수형Ex {
	// 메인 메서드 : 자바 프로그램 실행하는 구문
	public static void main(String[] args) {
		// 상수 : 한번 값을 기록하면 더이상 값을 바꿀 수 없는 변수
		// 상수 키워드 : final
		
		// 상수명 작성 방법
		// 전부 대문자로 작성하며, 연결되는 단어 사이는 _ 를 써서 구분 짓는다
		// 상수를 대문자로 표기하는 것은 자바 개발자 간의 규칙
		final double PI = 3.1415926538;
		System.out.println("상수로 표기한 PI : " + PI);
		
		
		final int MIN = 0; // MIN 은 최소값을 뜻함
		final int MAX = 100; // MAX 는 최대값을 뜻함
		System.out.println("최소값 : " + MIN + "," + " 최대값 : " + MAX);
		
		// 상수로 지정된 값을 변경하려하면 에러가 발생한다
		// 상수 final 을 사용해서
		// String 으로 "Hello World" 넣어보기
		// 우리 회사에 들어오는 사람들에게
		// Hello World 문구를 보여주고, 변경할 수 없게 하고싶을 때
		
		final String GREETING = "Hello World";
		System.out.println(GREETING);

	}

}
