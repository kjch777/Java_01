package com.kh.ThreadPre;

public class ��������� {

	// ���� ��� �� ����
	public static void main(String[] args) {
		
		// for ������ ������ 2�� �����
		for(int i = 0; i < 2; i++) {
			
			// �����忬�� Ŭ�������� extends Thread �� �ۼ��Ͽ�, 
			// �̸� Thread Ŭ������ �����忬�� Ŭ������ �θ� Ŭ������ �ҷ��Ա� ������,
			// ���� �� �� �տ� Thread �� �ۼ��ص� ���� ���� ���� �ȴ�.
			Thread th = new �����忬��(i);
			
			// .start(); ������ ����
			th.start();
		}
		// for �� �ݴ� �߰�ȣ } �ڿ� ���� �޼��� ���� ��¹� �ۼ� �� �����ϱ�
		System.out.println("���� ����");
	}

}
