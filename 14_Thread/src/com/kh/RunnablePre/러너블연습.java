package com.kh.RunnablePre;

public class 러너블연습 implements Runnable {

// 필드
	int 초;

// 메서드 
	// 필수 생성자
	public 러너블연습(int 초) {
		// super();
		this.초 = 초;
	}

	// 출력 void
	@Override // Runnable 인터페이스에서, run() 은 반드시 작성 해 주어야 하는 메서드이다. 
	public void run() {
		try {
			System.out.println(this.초 + " 쓰레드 시작");
			Thread.sleep(1_000);
		} catch (InterruptedException e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}
		System.out.println(this.초 + " 쓰레드 종료");
	}
}
