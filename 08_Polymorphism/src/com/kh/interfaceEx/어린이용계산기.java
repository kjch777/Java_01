package com.kh.interfaceEx;

// ���� �⺻ ��� �޼��� implements �� ��������
// ���� 220v �� ����� ��
	// �������̽��� �������̽��� ������� ���~~ ������ ���� ���� ������ �� �ִ�.
	// ���� ������ ������ �� ���� , �� �Ἥ �������̽� ���ϸ��� �ۼ����ָ� �ȴ�.
public class ��̿���� implements ����, ��� {
	
	/*	���.java �������̽����� ������ �����ѱ�� ��������	*/
	@Override
	public void �����ѱ�() {
		System.out.println("������ �մϴ�.");
	}
	
	@Override
	public void ��������() {
		System.out.println("������ ���ϴ�.");
	}
	
	/*	����.java �������̽����� ������ �� �� �� �� ������	*/
	@Override
	public int ��(int a, int b) {
		return a + b;
	}
	
	@Override
	public int ��(int a, int b) {
		return a - b;
	}
	
	@Override
	public int ��(int a, int b) {
		return a * b;
	}
	
	@Override
	public double ��(int a, int b) {
		return a / b;
	}
	
	@Override
	public int ������(int a, int b) {
		return a % b;
	}
	
}
