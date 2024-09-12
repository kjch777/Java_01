package com.kh.ThreadPre;

public class 동기화연습 {
	
	private static int 숫자 = 0; // 이렇게 작성한 코드는 필드에 위치하여야 한다.
	
	public static void main(String[] args) {
		
		for(int i = 0; i <= 7; i++) {
			Thread thread = new Thread(() -> {
				synchronized (동기화연습.class) {
					숫자++;
					System.out.println("숫자들 : " + 숫자);
				}
			});
			
			thread.start();
		}
	}
	
}
