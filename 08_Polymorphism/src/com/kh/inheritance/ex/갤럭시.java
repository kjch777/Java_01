package com.kh.inheritance.ex;

// extends ����Ʈ�� ��ӹޱ�
public class ������ extends ����Ʈ�� {

// �ʵ�
	private int �ȵ���̵�;

// �޼���
	// Setter
	public void set�ȵ���̵�(int �ȵ���̵�) {
		this.�ȵ���̵� = �ȵ���̵�;
	}
	
	// Getter
	public int get�ȵ���̵�() {
		return �ȵ���̵�;
	}
	
	// �⺻ ������ - Ctrl + Space + Enter
	public ������() {
		// Ctrl + Space + Enter
	}

	// �ʼ� ������ - Alt + Shift + S �� O : ��ü ����
	public ������(int �ȵ���̵�) {
		super();
		this.�ȵ���̵� = �ȵ���̵�;
	}
	
	// @Override toString
	// Alt + Shift + S �� S
	@Override
	public String toString() { // return �� �׳� �ۼ��� �� ; �� ������.
		return "������ ���� : " + �ȵ���̵� + " / " + super.toString();
	}
	
}
