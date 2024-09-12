package com.kh.oop.method.ex;

public class IceCream {
	
	// �ʵ�
	private String name;
	private int sugar;
	private boolean milk;
	
	// �޼��� - setter
	public void setName(String name) {
		this.name = name;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	
	// �޼��� - getter
	public String getName() {
		return name;
	}

	public int getSugar() {
		return sugar;
	}

	public boolean isMilk() {
		return milk;
	}
	
	// �޼��� - ������ - �⺻
	public IceCream() {
		
	}
	
	// �޼��� - ������ - �ʼ�
	public IceCream(String name1, int sugar1, boolean milk1) {
		this.name = name1;
		this.sugar = sugar1;
		this.milk = milk1;
	}
	
	// �޼��� - void - ���
	public void makeIceCream() {
		System.out.println("\n===== ���̽�ũ�� ����� =====\n");
		System.out.println("��� �����? : " + name + "��(��) ������!");
		System.out.println("������ �󸶳�? : " + sugar + "g");
		if(milk) {
			System.out.println("���� ����!");
		} else {
			System.out.println("���� ����!");
		}
		System.out.println("\n�ڡڡڡڡ� ���̽�ũ�� �ϼ� �ڡڡڡڡ�\n");
	}
	
}
