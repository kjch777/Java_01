package com.kh.SynchronizedEx;

/*
 SynchronizedEx
  	��Ƽ ������ ȯ�濡��, �����ϴ� �����Ϳ� ����ȭ�� �����Ѵ�.
  	���� �����尡 �ϳ��� ���ÿ� ������ �� �߻��� �� �ִ� ������ �ذ����ش�.
  	Ư�� �ڵ� ������ ��� ó���Ͽ�, �� ���� �ϳ��� �����常 ������ �� �ְ� ������ش�.
 */
public class SynchronizedEx {
	private static int ���� = 0; // static : ����

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			// ���ٽ�
			Thread t = new Thread(() -> {
				synchronized (SynchronizedEx.class) {
					����++;
					System.out.println("���ڵ� : " + ����);
				}
			});
			
			t.start();
		}
	}
}
