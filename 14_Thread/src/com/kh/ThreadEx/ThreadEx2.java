package com.kh.ThreadEx;

// Thread Ŭ������ �������� �۾� ����
public class ThreadEx2 extends Thread {

// �ʵ�
	int ��;
	
// �޼���
	// �ʼ� ������
	public ThreadEx2(int ��) {
		// super(); // super(); �� �θ� Ŭ�������� �ʿ� ����.
		this.�� = ��;
	}
	
	// ��� void
	public void run() {
		System.out.println(this.�� + " ������ ���� ��");
		try {
			Thread.sleep(1_000); // 1�ʹۿ� �� ������, �� ���̿��� ������ �߻��� �� �ֱ� ������, 1�� ��⿡�� ���ܸ� �ɾ��־�� �Ѵ�.
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(this.�� + "������ ���� ��");
	}
	
}
