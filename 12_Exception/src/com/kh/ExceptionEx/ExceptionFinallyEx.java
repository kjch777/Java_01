package com.kh.ExceptionEx;
/*
 Exception 에서, try catch finally 
 
 try 쓰고 Ctrl + Space // catch finally
 
 try {
 		// 예외가 발생할 수도 있지만, 실행할 코드 작성
 } catch(Exception e) {
 						// 예외가 발생했을 때 실행할 코드 작성
 } finally {
 				// 예외 발생과 관계 없이, 무조건 실행할 코드 작성
 		   		ex) 파일 닫기, 연결 종료 등
 }
 */
public class ExceptionFinallyEx {
	public static void main(String[] args) {
		try {
			int 결과 = 10/0;
		} catch (Exception e) {
			System.out.println("0 넣지 마라.");
		} finally {
			System.out.println("종료.");
		}
	}
}
