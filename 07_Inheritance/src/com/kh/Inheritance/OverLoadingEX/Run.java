package com.kh.Inheritance.OverLoadingEX;

public class Run {
	
	// main method : main method �� �����ε�, �������̵� ���� �ʴ°� ��Ģ�̴�.
	public static void main(String[] args) {
		
		Person ���1 = new Person();
		���1.setName("ȫ�浿");
		
		Person ���2 = new Person("�����");
		
		Person ���3 = new Person("��¯��", 5);
		
		���1.displayInfo();
		���2.displayInfo();
		���3.displayInfo();
		
	}

}
