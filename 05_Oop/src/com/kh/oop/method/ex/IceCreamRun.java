package com.kh.oop.method.ex;

public class IceCreamRun {

	// �޼��� - main - ���� ��� �� ������ �ڵ� �ۼ�
	public static void main(String[] args) {
		
	// ��ü ���� ����
		// �⺻ ������ ���
		IceCream ic1 = new IceCream(); // �����̴ϱ� ();
		
		ic1.setName("�������");
		ic1.setSugar(4);
		ic1.setMilk(false);
		
		// �⺻ ������ ���
		ic1.makeIceCream();
		
		// �ʼ� ������ ���
		IceCream ic2 = new IceCream("��ũ����", 10, true);
		
		// �ʼ� ������ ���
		ic2.makeIceCream();
	}

}
