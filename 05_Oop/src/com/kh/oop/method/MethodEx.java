package com.kh.oop.method;

public class MethodEx {
	/*
	 method란?
	 	class 내부에 존재하며, 특정 기능을 하는 코드를 묶어서 나타낸 것
	 	
	 	1. main method
		 	자바 프로그램을 시작할 때 사용하는 method
		 	작성한 method나 변수를 호출하여, 최종으로 실행하는 method
		 	public static void main(String[] args) {
		 	
		 	}
	 	
	 	
	 	2. constructor method
		 	생성자는 method라는 이름을 붙여서 사용는 경우는 거의 없지만, method의 한 종류이다.
		 	class 명과 파일 명, method 명은 대/소문자 하나까지 반드시 똑같아야 한다.
	 	
	 	
	 	3. void method
		 	반환하는 값이 없는 method
		 	method가 실행은 되지만, 실행 후 어떠한 값도 반환하지 않는다.
		 	 1) 매개변수가 없는 void method
		 	 		public void method() {
		 	 			System.out.println("Hi~!");
		 	 		}
		 	 
		 	 2) 매개변수가 있는 void method
		 	 		public void method(자료형 매개변수) {
		 	 			System.out.println("매개변수 : " + 매개변수);
		 	 		}
	 	
	 	
	 	4. return method
	 		값을 반환하는 method
	 		method가 실행되면 결과를 반환하고, method를 호출한 곳에 반환된 값을 제공한다.
	 			public 자료형 method(자료형 매개변수) {
	 				return 자료형에 해당하는 변수명;
	 			}
	 			
	 		1) return 값이 String 일 때
	 			public String method(String str) {
	 				return str;
	 			}
	 			
	 		2) return 값이 int 일 때
	 			public int method(int num) {
	 				int abc = num;
	 				return abc;
	 			}
	 			
	 		3) return 값이 필드에 작성되어 있거나, 위에 먼저 작성되어 있을 때
	 			String str;
		 			public String method() {
		 				return str;
		 			}
	 */
	public static void main(String[] args) {
		// main method
		MethodEx mtd = new MethodEx();
		
		mtd.숫자합1번(5, 3); // 출력
		
		int 결과 = mtd.숫자합2번(7, 4); // 숫자합2번을 통해 계산을 하고, 
									// 계산한 값을 결과 라는 변수명에 넣어준 것.
		System.out.println("결과값 : " + 결과);
	}
	
	public MethodEx() {
		// 기본 생성자
	}
	
	public void 숫자합1번(int a, int b) {
		// 매개변수가 있는 void method
		int 합의결과 = a + b;
		System.out.println("숫자합은 " + 합의결과 + " 입니다.");
	}
	
	public int 숫자합2번(int a, int b) {
		return a + b;
	}

}
