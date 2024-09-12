package com.kh.variable.ex;

/*
 enum(열거형) : 변수명을 나열해 놓은 상수이다.
 		상수 : 상시 고정된 값

 메서드
 	             .values(); : enum 에 작성한 모든 상수를 배열로 반환할 때 사용한다.
 	  .valueOf(String 이름); : 이름과 일치하는 enum 상수를 반환할 때 사용한다.
 	            .ordinal(); : enum 상수의 순서를 전달할 때 사용한다.
 	               .name(); : enum 상수의 이름을 반환할 때 사용한다.
 	.compareTo(EnumType e); : 다른 enum 상수와 순서를 비교할 때 사용한다.
 	           .toString(); : enum 상수를 문자열 표현으로 반환할 때 사용한다.
 	           .getClass(); : enum 클래스의 Class 객체를 반환할 때 사용한다.
 */



public class 열거형Ex {
	
	public enum 날짜들 {
		월요일, 화요일, 수요일, 목요일, 금요일, 토요일, 일요일, MONDAY; // 영어 상수는 전부 대문자로 작성한다.
	}
	
	//         index   0    1   2    3
	public enum 계절들 { 봄, 여름, 가을, 겨울 };
	
	public static void main(String[] args) {
		System.out.println("월요일 : " + 날짜들.월요일);
		System.out.println("화요일 : " + 날짜들.화요일);
		System.out.println("수요일 : " + 날짜들.수요일);
		
		계절들[] 계절 = 계절들.values();
		System.out.println("계절들에 정의된 모든 상수");
		for(계절들 s : 계절) {
			System.out.println(s);
		}
		// .valueOf(String 이름) : 이름과 일치하는 enum 상수를 반환할 때 사용한다.
		계절들 봄 = 계절들.valueOf("봄");
		System.out.println("봄 과 일치하는 상수 : " + 봄);
		// 예외 처리를 위한 Exception 작성
		
		// .ordinal(); : enum 상수의 순서를 전달할 때 사용한다.
		System.out.println("봄 상수의 순서 : " + 봄.ordinal());
		
		// .name(); : enum 상수의 이름을 반환할 때 사용한다.
		System.out.println("봄 상수의 이름 : " + 봄.name());
		
		// .toString(); : valueOf 처럼 출력 가능
		System.out.println(봄.toString());
		
		// .getClass(); : enum 클래스의 Class 객체를 반환할 때 사용한다.
		System.out.println("클래스의 객체는 : " + 계절.getClass());
		
		// class [Lcom.kh.variable.ex.EnumEx$계절들; : 계절의 배열을 나타내는 값
	}
	
}
