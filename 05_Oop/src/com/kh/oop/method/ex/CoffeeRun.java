package com.kh.oop.method.ex;
// ���� package(����) �ȿ��� class �� ���� �� ���,
// import �� ���� �ʾƵ� ���� ���� ���� �ȴ�.

public class CoffeeRun {
	
	public static void main(String[] args) {
		
		// CoffeeMaker ��ü ���� - �⺻ ������ �̿�
		CoffeeMaker cM1 = new CoffeeMaker();
		cM1.setCoffeType("�Ƹ޸�ī��");
		cM1.setSugar(1);
		cM1.setMilk(false); 
		// boolean �� true false �� int ó�� �����ȣ ���� �׳� ���� �ȴ�.
		
		// ���
		cM1.makeCoffee();
		
		// �ʼ� ������ �̿�
		CoffeeMaker cM2 = new CoffeeMaker("ī���", 5, true);
		cM2.makeCoffee();
		
	}

}
