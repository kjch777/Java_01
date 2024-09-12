package com.kh.oop.method.oop;

// Coffee Store class
public class CoffeeStore {
	
// �ʵ�
	// Ŀ�� ����� ������ �����ͼ�, ������ ���Ը��� Ŀ�� ����� ����� �ٸ��� �ۼ��غ���
	private CoffeeMaker maker;
	private String name;
	private String location;
	
// �޼���
	// setter
	public void setMaker(CoffeeMaker maker) {
		this.maker = maker;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	// getter
	public CoffeeMaker getMaker() {
		return maker;
	}
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	
	// �⺻ ������
	public CoffeeStore() {
		
	}
	
	// �ʼ� ������
	public CoffeeStore(CoffeeMaker maker1, String name1, String location1) {
		this.maker = maker1;
		this.name = name1;
		this.location = location1;
	}
	
	// ��� void
	public void orderCoffee() {
		System.out.println("Ŀ�� �귣�� : " + name);
		System.out.println("�귣�� ���� : " + location + "\n");
		System.out.println(name + "���� �ֹ��� Ŀ��");
		maker.makeCoffee();
	}

}
