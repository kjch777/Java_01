package com.kh.ComparatorEx;

import java.util.ArrayList; // 항상 .util 이 기본이다.
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// 패키지명이나 파일명 한번에 바꾸는 단축키 F2
/*
 Comparator : 비교하는 객체
 메서드
 compare(변수명1, 변수명2) : 두 객체나 변수를 비교하여, 정렬 순서를 결정할 때 사용한다.
         변수명1이 변수명2보다 작으면 음수를 반환한다.
		 변수명1과 변수명2가 같으면 0 을 반환한다.
		 변수명1이 변수명2보다 크면 양수를 반환한다.
 reversed() : 순서를 거꾸로 뒤집어서 순서를 매길 때 사용한다.
              반전이라는 뜻
 comparing(클래스명 :: 참조할 메서드명) : 클래스 안에서 참조할 메서드를 불러와, 정렬 기준을 만들어주는 예제
 */
public class ComparatorEx {
	public static void main(String[] args) {
		List<String> 단어들 = new ArrayList<>(Arrays.asList("사과", "블루베리", "오렌지"));
		
		// 단어들 리스트 안에 있는 단어의 길이를 기준으로 정렬하기
		// 클래스명 :: 참조할 메서드명
		// String 클래스 하위 메서드 중, 길이를 나타내는 length 메서드를 사용해서 비교하겠다는 코드
		Comparator<String> 길이비교 = Comparator.comparing(String :: length);
		
		// .sort() 를 사용하여 정렬
		단어들.sort(길이비교);
		
		// 정렬된 리스트 출력
		System.out.println("문자열 길이를 기준으로 정렬된 리스트 : " + 단어들);
	}
}
