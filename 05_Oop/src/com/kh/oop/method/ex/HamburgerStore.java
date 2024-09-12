package com.kh.oop.method.ex;

public class HamburgerStore {
	
	// �ʵ�
	private String name;
	private int price;
	
	// setter - ���߿� ���� ���� �� ����Ѵ�.
	public void setName(String name) {
		this.name = name; // �׷��� ���ο� this
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// getter - ���߿� ���� ����� �� ���ȴ�.
	public String getName() {
		return name; // �׷��� ���ο� return
	}
	public int getPrice() {
		return price;
	}
	
	// �޼��� - ������ - �⺻
	public HamburgerStore() {
		
	}
	
	// �޼��� - ������ - �ʼ�
	//			  ���� ���� - �ڷ��� ������
	public HamburgerStore(String name1, int price1) {
		this.name = name1;
		this.price = price1; // this. �ʵ� ������ = �ʼ� ������ ���� ������;
	}
	
	// �޼��� - void - ���
	public void info() {
		System.out.println("���� �̸� : " + name);
		System.out.println("���� ���� : " + price);
	}
	
	// �޼��� - main - ���� ��� �� ����
	public static void main(String[] args) {
		
		// ��ü HamburgerStore �� �� ���� hs1 ����
		HamburgerStore hs1 = new HamburgerStore();
		
		// �⺻ �����ڷ� ���
		hs1.setName("���� ����"); // main �޼��� �ȿ��� ������ ��ü�� �ҷ��ͼ�
		hs1.setPrice(3_500);   // set ���� ����� ���� �����Ѵ�.
		hs1.info();
		
		System.out.println("\n===== �ܹ��� ��Ƽ =====\n");
		
		// �ʼ� �����ڷ� ���
		// ��ü HamburgerStore �� �� ���� hs2 ���� ��, 
		// HamburgerStore �� �Ұ�ȣ ( ) �ȿ� ����ϰ� ���� ���� �����Ѵ�.
		HamburgerStore hs2 = new HamburgerStore("�Ұ�� ����", 5_000);
		hs2.info();
		
	}
}
