package com.kh.inheritance.ex;

// �ڽ� class
public class ������ extends ����Ʈ�� {
	
// �ʵ�
	private int IOS;
	
// �޼���
	// Setter
	public void setIOS(int iOS) {
		IOS = iOS;
	}

	// Getter : Alt + Shift + S
	public int getIOS() {
		return IOS;
	}
	
	// �⺻ ������
	public ������() {
		// Ctrl + Space + Enter
	}
	
	// �ʼ� ������
	public ������(String ȭ��, String ��Ż�, String ����, int iOS) {
		// Alt + Shift + S �� O : ��ü ����
		super(ȭ��, ��Ż�, ����);
		this.IOS = iOS;
	}
	
	// toString
	public String toString() {
		return "������ ���� : " + IOS + " / " + super.toString();
	}

}
