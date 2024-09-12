package com.kh.ExceptionEx;

public class ExceptionPre {

	// 메인 - 최종 출력 및 실행
	public static void main(String[] args) {

		try { // 예외가 발생할 수도 있지만, 일단 실행시키기
			int 나누기결과 = 10 / 0;
			System.out.println(나누기결과);

			//   산수관련     Exception   변수명
		} catch (ArithmeticException 산수예외발생) {
			System.out.println("산수 문제가 발생 했습니다.");
		}

	 // try 단축키 : try 작성 후 Ctrl + Space
		try { 
			// 예외가 발생할 수도 있지만, 일단 시도해보고 싶은 코드 작성
			int[] 배열 = {1, 2, 3};
			//   index   0  1  2 // 따라서, [ ] 안에는 0 1 2 만 들어갈 수 있다.
			System.out.println(배열[3]);

		} catch (Exception e) {
			System.out.println("범위를 벗어났습니다.");
		}
	}

}
