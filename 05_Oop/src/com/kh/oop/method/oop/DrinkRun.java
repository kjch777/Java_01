package com.kh.oop.method.oop;

public class DrinkRun {

	// �޼��� - main - ���� ��� �� ������ �ڵ带 �ۼ��ϴ� ����
	public static void main(String[] args) {
		
		// ��ü ���� ����
		DrinkMaker dm1 = new DrinkMaker("���Ƽ", 100, 5);
		dm1.makeDrink();
		
		DrinkStore ds1 = new DrinkStore(dm1, "�ް�Ŀ��", "��⵵ ������", false);
		ds1.orderDrink();
		
		DrinkMaker dm2 = new DrinkMaker("�Ƹ޸�ī��", 300, 1);
		dm2.makeDrink();
		
		DrinkStore ds2 = new DrinkStore(dm2, "��Ÿ����", "����� ���ʱ�", true);
		ds2.orderDrink();

	}

}
