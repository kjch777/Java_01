package com.kh.interfaceEx;

// ����� ��� �������̽��� �ҷ��ͼ� ���� �� �ϼ���Ų��.
public class ���л������ implements ����, ��� {
	
	// ��� �������̽� �� ��� �����ͼ� �ϼ��ϱ�
	@Override
	public void �����ѱ�() {
		System.out.println("������ �մϴ�.");
	}
	
	@Override
	public void ��������() {
		System.out.println("������ ���ϴ�.");
	}
	
	// ���� �������̽� �� ��� �����ͼ� �ϼ��ϱ�
	@Override
	public int ��(int a, int b) {
		return a+b;
	}
	
	@Override
	public int ��(int a, int b) {
		return a-b;
	}
	
	@Override
	public int ��(int a, int b) {
		return a*b;
	}
	
	@Override
	public double ��(int a, int b) {
		return a/b;
	}
	
	@Override
	public int ������(int a, int b) {
		return a%b;
	}

}
