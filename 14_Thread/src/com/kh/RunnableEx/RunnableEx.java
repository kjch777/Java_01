package com.kh.RunnableEx;
/*
 Runnable
 Thread 를 사용하는 대신에, 여러개를 가져오거나 상속받을 때 사용하는 인터페이스이다. 
 */

public class RunnableEx implements Runnable { // Runnable 뒤에 , 를 사용하여 여러개를 불러올 수 있다.

	public void run() {
		
		System.out.println("쓰레드 실행 중");
		
		try {
			Thread.sleep(3_000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("쓰레드 종료");
	}
	
}
