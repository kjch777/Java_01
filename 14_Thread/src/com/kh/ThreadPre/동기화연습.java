package com.kh.ThreadPre;

public class ����ȭ���� {
	
	private static int ���� = 0; // �̷��� �ۼ��� �ڵ�� �ʵ忡 ��ġ�Ͽ��� �Ѵ�.
	
	public static void main(String[] args) {
		
		for(int i = 0; i <= 7; i++) {
			Thread thread = new Thread(() -> {
				synchronized (����ȭ����.class) {
					����++;
					System.out.println("���ڵ� : " + ����);
				}
			});
			
			thread.start();
		}
	}
	
}
