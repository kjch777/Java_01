package com.kh.ThreadPre;

public class 우선순위쓰레드 {
	public static void main(String[] args) {
		for(int i = 1; i <= 3; i++) {
			쓰레드연습 t = new 쓰레드연습(i);
			if(i == 1) {
				t.setPriority(Thread.MAX_PRIORITY);
			} else if(i == 2) {
				t.setPriority(Thread.NORM_PRIORITY);
			} else {
				t.setPriority(Thread.MIN_PRIORITY);
			}
			t.start();
		}
	}
}
