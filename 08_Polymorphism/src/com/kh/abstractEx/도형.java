package com.kh.abstractEx;
/*
 abstract class (�߻� Ŭ����)
 �߻� �޼��带 �����ϰ� �ִ� Ŭ�����̰�, �̿ϼ� Ŭ�����̱� ������,
 ��ǻ�Ϳ� �߻� Ŭ������ ���� ������ ��ü ������ ����� ���� �Ұ����ϴ�. 
 
 ��� ����
 [���� ������] : public		protected	default		private
 
 [���� ������] abstract class ���ϸ� {
 	// �ʵ� & �޼��� (�޼���� �ʼ��� �ƴ�)
 	[���� ������] abstract �ڷ��� ������();
 }
 */
public abstract class ���� { // �߻� Ŭ����
// �߻� : ���� ���� �� �� ��

// �ʵ�
	private String ����;

// �޼���
	// Setter
	public void set����(String ����) {
		this.���� = ����;
	}
	
	// Getter
	public String get����() {
		return ����;
	}
	
	// �ʼ� ������
	public ����(String ����) {
		this.���� = ����;
	}
	
	// abstract �� ����������, ���߿� ���赵�� �ϼ��� ���Ͽ��� �ʼ��� �ҷ��� �ϼ��ؾ� �ϴ� �޼�����̴�.
	// abstract �޼���� �̿ϼ� �޼����̱� ������,
	// �ڽ� Ŭ�������� �̿ϼ��� �θ� Ŭ������ �ϼ����ֱ� ���Ͽ�, 
	// �ڽ��� �θ� �ҷ��� �� �ڽĿ��� �ʼ��� �ҷ��� ���� �޼��� ����� �ϼ��ؾ� �Ѵ�.
	public abstract double ��������();

	public abstract double �����ѷ�();
	
	public void �������() {
		System.out.println("�� ������ ���̰� " + ��������() + " �̰�, �ѷ��� " + �����ѷ�() + " �Դϴ�.");
	}
}
