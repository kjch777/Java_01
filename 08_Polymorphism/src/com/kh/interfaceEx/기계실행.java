package com.kh.interfaceEx;

public class ������ {
	public static void main(String[] args) {
		��ǻ�� ������ = new ��ǻ��();
		������.�����ѱ�();
		������.��������();
		
		��Ź�� �뵹�� = new ��Ź��();
		�뵹��.�����ѱ�();
		�뵹��.��������();
		
		// ��̿� ���� ����
		��̿���� c1 = new ��̿����();
		c1.�����ѱ�();
		c1.��������();
		
		// ��̿� ���� ��� �׽�Ʈ
		int a = 10;
		int b = 5;
		
		System.out.println(a + " + " + b + " = " + c1.��(a, b));
		System.out.println(a + " - " + b + " = " + c1.��(a, b));
		System.out.println(a + " * " + b + " = " + c1.��(a, b));
		System.out.println(a + " / " + b + " = " + c1.��(a, b));
		System.out.println(a + " % " + b + " = " + c1.������(a, b));
		
		// ���л��� ���� ����
		���л������ c2 = new ���л������();
		c2.�����ѱ�();
		c2.��������();
		
		// ���л��� ���� ��� �׽�Ʈ
		a = 500;
		b = 47;
		
		System.out.println(a + " + " + b + " = " + c2.��(a, b));
		System.out.println(a + " - " + b + " = " + c2.��(a, b));
		System.out.println(a + " * " + b + " = " + c2.��(a, b));
		System.out.println(a + " / " + b + " = " + c2.��(a, b));
		System.out.println(a + " % " + b + " = " + c2.������(a, b));
	}
}
