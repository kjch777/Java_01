package com.kh.RunnableEx;

public class Main {

	public static void main(String[] args) {
		
		// 여러개를 가져올 수 있는 implements 를 사용했을 경우,
		// Runnable 을 먼저 불러온 다음, 쓰레드 객체에 넣어주어야 한다.
		Runnable 러너블 = new RunnableEx();
		
		// 쓰레드 생성
		Thread 쓰레드 = new Thread(러너블);
		
		// 쓰레드 시작
		쓰레드.start();

	}

}
