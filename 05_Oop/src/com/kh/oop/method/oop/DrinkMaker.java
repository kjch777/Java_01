package com.kh.oop.method.oop;

public class DrinkMaker {
	
// �ʵ�
	private String type;
	private    int quant; // ���� ��
	private    int temp; // �µ�
	
// �޼���
	// setter
	public void setType(String type) {
		this.type = type;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}
	
	// getter
	public String getType() {
		return type;
	}

	public int getQuant() {
		return quant;
	}

	public int getTemp() {
		return temp;
	}
	
	
	// �⺻ ������
	public DrinkMaker() {
		
	}
	
	// �ʼ� ������
	public DrinkMaker(String type1, int quant1, int temp1) {
		this.type = type1;
		this.quant = quant1;
		this.temp = temp1;
	}

	// ��� void
	public void makeDrink() {
		System.out.println("� ���Ḧ �帱���? : " + type);
		System.out.println("������ ���� �󸶳���? : " + quant + "ml");
		if(temp<5) {
			System.out.println("������ �ּ���.");
		} else if((5<temp) && (temp<10)) {
			System.out.println("�������ϰ� �ּ���.");
		} else {
			System.out.println("�̰߰� �ּ���.");
		}
		System.out.println("���� ���Խ��ϴ�~!");
	}
}
