package com.kh.oop.constructor;

public class Cafe { // class ���� �Ұ�ȣ ( ) �� ���� �ʴ´�.
	
	// �ʵ� ����
	public String name;
	public String location; // �ʵ忡���� �ڷ��� ������ �� �ۼ��ϰ�
	public    int tableNum; // ���� �������� �ʴ´�.

	// �⺻ ������
	// ������ ���� �ݵ�� class ��� ���ƾ� �Ѵ�.
	public Cafe() {
		// �⺻ �����ڿ��� ���� �ƹ��͵� �־����� �ʴ´�.
	}
	
	// �ʼ� ������
	// ������ ���� �ݵ�� class ��� ���ƾ� �Ѵ�.
	public Cafe(String name1, String location1, int tN) {
		this.name = name1;
		this.location = location1; // this �� ����Ͽ� �ʵ忡�� �������� �ҷ�����,
		this.tableNum = tN; // �ʼ� ������ ������ �Ű������� ������ �����Ѵ�.
	}
	
	// void �޼��� : ��¹� �ۼ��� ���
	// �޼��� ���� class ��� �޶� ��� ����.
	public void cafeInfo() {
		System.out.println("===== ī�� ������ ã�ҽ��ϴ�! =====");
		System.out.println("ī�� �̸� : " + name); // �ʵ忡�� �������� �ҷ��´�.
		System.out.println("ī�� ��� : " + location);
		System.out.println("Ź�� ���� : " + tableNum + "\n\n");
		// ��¹������� + �� ����Ͽ� �����Ѵ�.
	}
	
	public static void main(String[] args) {
		System.out.println("�ȳ��ϼ���? ī�� Ž���� �Դϴ�.");
		System.out.println("===== ī�� Ž���ϱ� =====\n\n");
		
		// Cafe ��ü ���
		Cafe cafe1 = new Cafe(); // ���ο� ���� ����
		cafe1.name = "��Ÿ����";
		cafe1.tableNum = 100;
		cafe1.cafeInfo();
		
		Cafe cafe2 = new Cafe();
		cafe2.location = "���� ȣ������";
		cafe2.tableNum = 50;
		cafe2.cafeInfo();
		
		Cafe cafe3 = new Cafe("Ŀ�Ǻ�", "���￪ 3�� �ⱸ", 35);
		cafe3.cafeInfo();

	}

}
