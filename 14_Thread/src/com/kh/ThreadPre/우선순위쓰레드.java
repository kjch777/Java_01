package com.kh.ThreadPre;

public class �켱���������� {
	public static void main(String[] args) {
		for(int i = 1; i <= 3; i++) {
			�����忬�� t = new �����忬��(i);
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
