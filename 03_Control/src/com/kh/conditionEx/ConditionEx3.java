package com.kh.conditionEx;

public class ConditionEx3 {
	/*
	 if 문으로 정수를 비교할 수 있고, 실수를 비교할 수 있고, 문자열, 문자 등 모든 것을 비교할 수 있다.
	 대표적으로 정수 비교와 문자열 비교가 있다.
	 
	 = 은 equal 이라고 읽는다.
	 == 는 = 이 2개니까 equals 라고 읽는다.
	 
	 정수 비교
	 	if (숫자 == 숫자){
	 		숫자와 숫자가 같을 때 실행할 출력문
	 	}
	 문자열 비교	.equals 가 핵심
	 	if ("문자열".equals("문자열")){
	 		 문자열과 문자열이 같을 때 실행할 출력문
	 	}
	 문자열을 String 을 사용하여 변수명에 넣어준다면, "문자열" 큰 따옴표를 붙여서 적지 않고,
	 지정해준 변수명만 적어주면 된다.
	 
	 String str = "문자열";
	 if (str.equals(str)) {
	 	System.out.println("문자열이 동일합니다.");
	 }
	 if ("문자열".equals(str)) {
	 	System.out.println("문자열이 동일합니다.");
	 }
	 if (str.equals("문자열")) {
	 	System.out.println("문자열이 동일합니다.");}
	 */
	public static void main(String[] args) {
		// 정수 비교
		int number = 10;
		if (number == 10) {
			System.out.println("두 숫자가 동일합니다.");
		}
		
		// 문자열 비교
		String str = "Hello";
		if (str.equals("Hello")) {
			System.out.println("두 문자열이 동일합니다.");
		}
		
		String str1 = "둘";
		String str2 = ""; // 오류 찾을 때 사용...???
		
		if ("둘".equals(str1)) {
			System.out.println("모두 둘 입니다.");
		}

	}

}
