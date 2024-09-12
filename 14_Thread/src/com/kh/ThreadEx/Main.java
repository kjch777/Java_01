package com.kh.ThreadEx;

public class Main {
	public static void main(String[] args) {
		// ThreadEx 쓰레드 = new ThreadEx();
		// 쓰레드.start();
		
		// System.out.println("===============");
		
		// for 문으로 총 3개의 쓰레드를 생성하고, 실행하기
		for(int i = 0; i < 3; i++) {
		 // ThreadEx2 의 부모이기 때문에, 왼쪽 항에 Thread 를 작성하는 것이 가능하다.
			Thread t = new ThreadEx2(i);
			if(i == 2) {
				t.setPriority(Thread.MIN_PRIORITY); // MIN = 1
			} else if(i == 1) {
				t.setPriority(Thread.MAX_PRIORITY); // MAX = 10
			} else { // 0
				t.setPriority(Thread.NORM_PRIORITY); // NORM = 5 (기본)
			}
			t.start();
		}
		System.out.println("===============");
	}
}
