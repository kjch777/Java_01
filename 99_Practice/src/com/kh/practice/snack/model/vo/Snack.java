package com.kh.practice.snack.model.vo;

public class Snack {
	
// �ʵ�
	private String kind;
	private String name;
	private String flavor;
	private int numOf;
	private int price;

// �޼���	
	// setter
	public void setKind(String kind) {
		this.kind = kind;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	// getter
	public String getKind() {
		return kind;
	}

	public String getName() {
		return name;
	}

	public String getFlavor() {
		return flavor;
	}

	public int getNumOf() {
		return numOf;
	}

	public int getPrice() {
		return price;
	}

	
	// �⺻ ������
	public Snack() {
		
	}
	
	// �ʼ� ������
	public Snack(String kind, String name, String flavor, int numOf, int price) {
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
	}
	
	// String ���� return �ϴ� �޼���
	public String information() {
		return "���� : " + kind + " , �̸� : " + name + " , �� : " + flavor + " , ���� : " + numOf + " , ���� : " + price;
	}// return �� ����
	
	/*
	// ��� void : void��, ���� ��ȯ���� �ʰ� ��¸� �Ѵٴ� �� == ����
	public void information() {
		System.out.println("���� : " + kind);
		System.out.println("�̸� : " + name);
		System.out.println(" �� : " + flavor);
		System.out.println("���� : " + numOf);
		System.out.println("���� : " + price);
	}
	*/

}
