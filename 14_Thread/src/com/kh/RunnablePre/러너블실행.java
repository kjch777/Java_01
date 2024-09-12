package com.kh.RunnablePre;

public class 러너블실행 {

	public static void main(String[] args) {
		
		// for 문을 사용하여 쓰레드 5개 생성 후,
		for (int i = 0; i < 5; i++) {
			
			러너블연습 th = new 러너블연습(i);
			Thread 쓰레드 = new Thread(th);
			쓰레드.start();
			
		}
		// for 문을 탈출하면 출력할 문구 작성
		System.out.println("메인 메서드 종료");
	}
	
}
