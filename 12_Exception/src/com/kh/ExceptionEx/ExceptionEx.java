package com.kh.ExceptionEx;

import java.util.*;

/*
 Exception == 예외
              예외란, 코드로 처리 가능한 에러를 뜻한다.
              
			  try {
			  
			  		// 예외를 발생시킬 수도 있지만, 시도하고 싶은 코드를 작성
			 
			  } catch(Exception e) {
			 		
			 		// 예외가 발생했을 때 보여줄 코드나, 문구를 작성
			 		
			  }
			  
 catch 문은 제한 없이 무제한으로 작성할 수 있다.
 catch 문을 여러개 사용할 경우
 
 	catch(배열Exception e)
			 	.
			 	.
			 	.
 	catch(Exception e) 를 맨 마지막에 작성 해주면 된다.
 */
public class ExceptionEx {

// 필드
	private Scanner sc = new Scanner(System.in);
	
// 메서드
	
	// 기본 생성자
	public ExceptionEx() {
		// Ctrl + Space
	}
	
	public void method1() {
		//   index   0   1   2   3
		int[] 배열 = {10, 20, 30, 40}; // 마지막 인덱스 == 3
		
		// for 문               length == 4
		for(int i = 0; i <= 배열.length; i++) {
			try { // 시도 하다
			System.out.println(배열[i]);
			} catch(RuntimeException e) {
		    // 또는 (ArrayIndexOutOfBoundsException e)
				System.out.println("1번 예외상황");
			}catch(Exception e) { // 문제를 잡다
				System.out.println("배열의 인덱스를 벗어났습니다.");
			}
		}
	}
	
	// 메인 - 최종 출력 및 실행
	public static void main(String[] args) {
		ExceptionEx 예외발생 = new ExceptionEx();
		예외발생.method1();
	}
	
}
