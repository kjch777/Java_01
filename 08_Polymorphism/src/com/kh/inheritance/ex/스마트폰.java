package com.kh.inheritance.ex;

// �θ� class
public class ����Ʈ�� {

// �ʵ�	
	private String ȭ��;
	private String ��Ż�;
	private String ����;

// �޼���
	// Setter
	public void setȭ��(String ȭ��) {
		this.ȭ�� = ȭ��;
	}

	public void set��Ż�(String ��Ż�) {
		this.��Ż� = ��Ż�;
	}

	public void set����(String ����) {
		this.���� = ����;
	}

	// Getter
	public String getȭ��() {
		return ȭ��;
	}

	public String get��Ż�() {
		return ��Ż�;
	}

	public String get����() {
		return ����;
	}

	// �⺻ ������
	public ����Ʈ��() {
		// Ctrl + Space + Enter
	}

	// �ʼ� ������
	public ����Ʈ��(String ȭ��, String ��Ż�, String ����) { // Alt + Shift + S �� O : ��ü ����
		super();
		this.ȭ�� = ȭ��;
		this.��Ż� = ��Ż�;
		this.���� = ����;
	}
	
	// ��� void �Ǵ� ��ȯ return
	
	// toString �� String �ؿ� ������� method
	@Override
	public String toString() {
		return "����Ʈ�� [ȭ�� = " + ȭ�� + " , ��Ż� = " + ��Ż� + " , ���� = " + ���� + "]";
	}

}
