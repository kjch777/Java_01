package com.kh.oop.method.ex;

public class PizzaStore {
	
	// �ʵ�
	private String pizzaName; 
	private    int pizzaPrice;
	
	// getter setter
	public String getPizzaName() {
		return pizzaName;
	}
	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}
	public int getPizzaPrice() {
		return pizzaPrice;
	}
	public void setPizzaPrice(int pizzaPrice) {
		this.pizzaPrice = pizzaPrice;
	}
	
	// �޼��� - ������ - �⺻
	// ������ �޼���� �̸��� �ݵ�� class ��� �Ȱ��ƾ� �Ѵ�.
	public PizzaStore() {
		
	}
	
	// �޼��� - ������ - �ʼ�
	// ������ �޼���� �̸��� �ݵ�� class ��� �Ȱ��ƾ� �Ѵ�.
	public PizzaStore(String pizzaName1, int pizzaPrice1) {
		this.pizzaName = pizzaName1;
		this.pizzaPrice = pizzaPrice1;
	}
	
	// �޼��� - void - ���
	public void inforPizza() {
		System.out.println("���� �̸� : " + pizzaName);
		System.out.println("���� ���� : " + pizzaPrice);
	}
	
	// �޼��� - main - ���� ��� �� ����
	public static void main(String[] args) {
		
		// ���� ��ü
		PizzaStore pizza1 = new PizzaStore();
		pizza1.setPizzaName("���۷δ�");
		pizza1.setPizzaPrice(25_000);
		
		pizza1.inforPizza();
		
		System.out.println("\n==========\n");
		PizzaStore pizza2 = new PizzaStore();
		pizza2.setPizzaName("�������� ����");
		
		// ���� ���� ���� ���� ���
		
		pizza2.inforPizza();
		
		// ���� �ʱ� ���� ���°� �ʼ� �������̴�.
		// �ʼ� �����ڷ� ����غ���
		System.out.println("\n==========\n");
		PizzaStore pizza3 = new PizzaStore("���ξ���", 18_000);
		pizza3.inforPizza();
		
	}

}
