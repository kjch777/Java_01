package com.kh.ThreadEx;

public class Main {
	public static void main(String[] args) {
		// ThreadEx ������ = new ThreadEx();
		// ������.start();
		
		// System.out.println("===============");
		
		// for ������ �� 3���� �����带 �����ϰ�, �����ϱ�
		for(int i = 0; i < 3; i++) {
		 // ThreadEx2 �� �θ��̱� ������, ���� �׿� Thread �� �ۼ��ϴ� ���� �����ϴ�.
			Thread t = new ThreadEx2(i);
			if(i == 2) {
				t.setPriority(Thread.MIN_PRIORITY); // MIN = 1
			} else if(i == 1) {
				t.setPriority(Thread.MAX_PRIORITY); // MAX = 10
			} else { // 0
				t.setPriority(Thread.NORM_PRIORITY); // NORM = 5 (�⺻)
			}
			t.start();
		}
		System.out.println("===============");
	}
}
