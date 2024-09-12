package com.kh.loop.ex;

public class LoopDoWhile {
	/*
	 do-while : do 에서 while 조건에 상관 없이, 1 번은 무조건 실행 한다.
	 			조건이 false 여도, 최초 1회는 반드시 실행 한다.
	 사용 예제
	 do {
	 		수행될 문장;
	 	} while (조건식);
	 */
	
	public static void main(String[] args) {
		int count = 6;
		do {
			System.out.println("숫자값 : " + count);
			// 조건에 대한 증감식을 추가 하는 경우도 있다.
			count++;
		} while(count <= 5);
	}

}
