package com.kh.abstractEx;

// ���� �������� : extends
public class �簢�� extends ����{
	
// �ʵ�
	// �غ� ����
	private double �غ�;
	private double ����;
	
// �޼���
	// �ʼ� ������ : Alt + Shift + S �� O
	public �簢��(String ����, double �غ�, double ����) {
		super(����);
		this.�غ� = �غ�;
		this.���� = ����;
	}
	
	@Override
	public double ��������() { // ����������	�ڷ���	������
		return 0.5 * �غ� * ����;
	}
	
	@Override
	public double �����ѷ�() {
		double ���� = Math.sqrt(Math.pow(�غ�, 2) + Math.pow(����, 2));
		return �غ� + ���� + ����;
	}

}
