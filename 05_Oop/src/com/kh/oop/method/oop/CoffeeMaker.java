package com.kh.oop.method.oop;

public class CoffeeMaker {
	
	// �ʵ�
	private String coffeeType; // Ŀ�� ����
	private int sugar; // ���� ��
	private boolean milk; // ���� ����
	
	
	// setter
	public void setCoffeType(String coffeType) {
		this.coffeeType = coffeType;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	public void setMilk(boolean milk) { // set �� �Ȱ��� set ���� ���´� �Ѥ�
		this.milk = milk;
	}
	
	// getter
	public String getCoffeType() {
		return coffeeType;
	}

	public int getSugar() {
		return sugar;
	}

	public boolean isMilk() { // boolean �� get �� �ƴ϶� is �� ���´�.
		return milk;
	}

	
	// �޼��� - ������ - �⺻
	public CoffeeMaker () {
		
	}
	
	// �޼��� - ������ - �ʼ�
	public CoffeeMaker(String cT, int sG, boolean mK) {
		this.coffeeType = cT;
		this.sugar = sG;
		this.milk = mK;
	}
	
	// �޼��� - void - ���
	public void makeCoffee() {
		
		System.out.println("\n===== Ŀ�� ����� ! =====\n");
		System.out.println("� Ŀ�Ǹ� ������? : " + coffeeType + "�� ������!");
		System.out.println("������ �󸶳� �������? : " + sugar + "g");
		
		// ���� ������ �ְڴٸ�
		if(milk) {
			System.out.println("���� ����!");
		} else {
			System.out.println("���� ����!");
		}
		System.out.println("Ŀ�� �ϼ�~!");
	}
	
	/*
	// main - ���� ��� �� ������ �ڵ� �ۼ�
	public static void main(String[] args) {
		
		// �⺻ �����ڷ� ��ü ����
		CoffeeMaker coffee1 = new CoffeeMaker();
		coffee1.setCoffeType("�Ƹ޸�ī��");
		coffee1.setSugar(1);
		coffee1.setMilk(false);
		
		// �⺻ �����ڷ� ���
		coffee1.makeCoffee();
		
		System.out.println("\n===== ���� ��! =====\n");
		
		// �ʼ� �����ڷ� ��ü ����
		CoffeeMaker coffee2 = new CoffeeMaker("ī���", 5, true);
		
		// �ʼ� �����ڷ� ���
		coffee2.makeCoffee();
	}
	*/
	
}
