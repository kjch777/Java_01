package com.kh.ThreadPre;
//                   extends
public class �����忬�� extends Thread {

// �ʵ�
	int ��;
	
// �޼���
	// �ʼ� ������
	public �����忬��(int ��) {
		// super();
		this.�� = ��;
	}
	
	// ��� void
	public void run() {
		System.out.println(this.�� + " ������ ����"); // getter setter �� ��� this. ���� �ҷ����� �� ����.
		try {
			Thread.sleep(3_000);
		} catch (InterruptedException e) {
			System.out.println("���� �߻�");
			e.printStackTrace();
		}
		System.out.println(this.�� + " ������ ����");
	}
	
}
