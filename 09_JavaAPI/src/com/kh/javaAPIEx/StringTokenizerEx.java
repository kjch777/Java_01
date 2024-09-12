package com.kh.javaAPIEx;

import java.util.StringTokenizer;

/*
 StringTokenizer
 Token(동전) == 최소 단위 또는 정보를 가진 물리적, 가상적 물체 
 */
public class StringTokenizerEx {
	
	public static void main(String[] args) {
		
		//                         소괄호 ( ) 안에 " " 를 사용해서 뭐라도 넣어줘야 한다.
		//                   따로 구분자를 넣지 않으면, 기본적으로 띄어쓰기 기준으로 구분한다.
		StringTokenizer 토큰 = new StringTokenizer("자바 는 즐 거워");
		
		// hasMoreTokens 는, 만약 토큰 글자 안에 글자가 뭐라도 들어있다면 true
		while(토큰.hasMoreTokens()) {
			
			// nextToken : 현재 토큰은 꺼냈고, 다음 토큰을 보여줄 준비 해라.
			System.out.println(토큰.nextToken());
		}
		
		// 구분자를 , 로 넣은 토크나이저 보기
		//                                           사과오렌지포도를    , 붙여서 출력 하겠다는 코드
		StringTokenizer 토큰2번 = new StringTokenizer("사과,오렌지,포도", ", ");
		
		while(토큰2번.hasMoreTokens()) {
			System.out.println(토큰2번.nextToken());
		}
		
	}

}
