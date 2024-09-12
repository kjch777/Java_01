package com.kh.SynchronizedEx;

/*
 SynchronizedEx
  	멀티 쓰레드 환경에서, 공유하는 데이터에 동기화를 제공한다.
  	여러 쓰레드가 하나에 동시에 접근할 때 발생할 수 있는 문제를 해결해준다.
  	특정 코드 영역을 잠금 처리하여, 한 번에 하나의 쓰레드만 접근할 수 있게 만들어준다.
 */
public class SynchronizedEx {
	private static int 숫자 = 0; // static : 고정

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			// 람다식
			Thread t = new Thread(() -> {
				synchronized (SynchronizedEx.class) {
					숫자++;
					System.out.println("숫자들 : " + 숫자);
				}
			});
			
			t.start();
		}
	}
}
