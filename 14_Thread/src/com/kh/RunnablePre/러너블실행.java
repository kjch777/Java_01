package com.kh.RunnablePre;

public class ���ʺ���� {

	public static void main(String[] args) {
		
		// for ���� ����Ͽ� ������ 5�� ���� ��,
		for (int i = 0; i < 5; i++) {
			
			���ʺ��� th = new ���ʺ���(i);
			Thread ������ = new Thread(th);
			������.start();
			
		}
		// for ���� Ż���ϸ� ����� ���� �ۼ�
		System.out.println("���� �޼��� ����");
	}
	
}
