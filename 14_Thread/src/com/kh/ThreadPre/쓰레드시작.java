package com.kh.ThreadPre;

public class 쓰레드시작 {

	// 최종 출력 및 실행
	public static void main(String[] args) {
		
		// for 문으로 쓰레드 2개 만들기
		for(int i = 0; i < 2; i++) {
			
			// 쓰레드연습 클래스에서 extends Thread 를 작성하여, 
			// 미리 Thread 클래스를 쓰레드연습 클래스의 부모 클래스로 불러왔기 때문에,
			// 왼쪽 항 맨 앞에 Thread 를 작성해도 문제 없이 실행 된다.
			Thread th = new 쓰레드연습(i);
			
			// .start(); 쓰레드 시작
			th.start();
		}
		// for 문 닫는 중괄호 } 뒤에 메인 메서드 종료 출력문 작성 후 실행하기
		System.out.println("메인 종료");
	}

}
