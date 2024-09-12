package com.kh.ThreadPre;
//                   extends
public class 쓰레드연습 extends Thread {

// 필드
	int 초;
	
// 메서드
	// 필수 생성자
	public 쓰레드연습(int 초) {
		// super();
		this.초 = 초;
	}
	
	// 출력 void
	public void run() {
		System.out.println(this.초 + " 쓰레드 시작"); // getter setter 가 없어서 this. 으로 불러오는 것 같다.
		try {
			Thread.sleep(3_000);
		} catch (InterruptedException e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}
		System.out.println(this.초 + " 쓰레드 종료");
	}
	
}
