package com.kh.RunnableEx;

public class Main {

	public static void main(String[] args) {
		
		// �������� ������ �� �ִ� implements �� ������� ���,
		// Runnable �� ���� �ҷ��� ����, ������ ��ü�� �־��־�� �Ѵ�.
		Runnable ���ʺ� = new RunnableEx();
		
		// ������ ����
		Thread ������ = new Thread(���ʺ�);
		
		// ������ ����
		������.start();

	}

}
