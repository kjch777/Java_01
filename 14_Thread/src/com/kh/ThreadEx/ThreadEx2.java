package com.kh.ThreadEx;

// Thread 클래스를 가져오는 작업 진행
public class ThreadEx2 extends Thread {

// 필드
	int 초;
	
// 메서드
	// 필수 생성자
	public ThreadEx2(int 초) {
		// super(); // super(); 는 부모 클래스에선 필요 없다.
		this.초 = 초;
	}
	
	// 출력 void
	public void run() {
		System.out.println(this.초 + " 쓰레드 시작 중");
		try {
			Thread.sleep(1_000); // 1초밖에 안 되지만, 그 사이에도 문제가 발생할 수 있기 때문에, 1초 대기에도 예외를 걸어주어야 한다.
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(this.초 + "쓰레드 종료 중");
	}
	
}
