package com.kh.RunnableEx;
/*
 Runnable
 Thread �� ����ϴ� ��ſ�, �������� �������ų� ��ӹ��� �� ����ϴ� �������̽��̴�. 
 */

public class RunnableEx implements Runnable { // Runnable �ڿ� , �� ����Ͽ� �������� �ҷ��� �� �ִ�.

	public void run() {
		
		System.out.println("������ ���� ��");
		
		try {
			Thread.sleep(3_000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("������ ����");
	}
	
}
