package com.kh.RunnablePre;

public class ���ʺ��� implements Runnable {

// �ʵ�
	int ��;

// �޼��� 
	// �ʼ� ������
	public ���ʺ���(int ��) {
		// super();
		this.�� = ��;
	}

	// ��� void
	@Override // Runnable �������̽�����, run() �� �ݵ�� �ۼ� �� �־�� �ϴ� �޼����̴�. 
	public void run() {
		try {
			System.out.println(this.�� + " ������ ����");
			Thread.sleep(1_000);
		} catch (InterruptedException e) {
			System.out.println("���� �߻�");
			e.printStackTrace();
		}
		System.out.println(this.�� + " ������ ����");
	}
}
