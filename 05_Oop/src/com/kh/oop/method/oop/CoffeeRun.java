package com.kh.oop.method.oop;

public class CoffeeRun {
	
	// �޼��� - main - ���� ��� �� ������ �ڵ带 �ۼ��ϴ� ����
	public static void main(String[] args) {
		
		// Ŀ�� �����
		CoffeeMaker cm = new CoffeeMaker("�Ƹ޸�ī��", 1, false);
		
		// Ŀ�� ���� ����
		CoffeeStore cs = new CoffeeStore(cm, "��Ÿ ����", "����� ������");
		
		// �ֹ� �� ����
		cs.orderCoffee();
	}

}
