package com.kh.oop.basic;

public class Animal { // class �� == ���ϸ�
	
	
	// �ʵ�
	public String name;
	public int age;
	
	
	// �ʱ� ������
	public Animal() {
		
	}
	
	
	// �ʼ� ������
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
	// �̸��� �ʼ��� ������ ������
	public Animal(String name) {
		this.name = name;
	}
	
	
	// ���̸� �ʼ��� ������ ������
	public Animal(int age) {
		this.age = age;
	}
	
	// ��� �޼���
	public void info() {
		System.out.println("�̸� : " + name + "\n���� : " + age);
	}
	
	
	// ���� �޼���
	// �����ڴ� �޼��忡 ���Եȴ�. ���� �޼��尡 �� ū �����̴�.
	public static void main (String[] args) {
		// �ʱ� ������
		Animal dog = new Animal(); // �Ұ�ȣ ( ) �ȿ� �ƹ��͵� ���� ������, �ʱ� �����ڿ��� �ҷ��°� �ȴ�.
		dog.name = "�����";
		dog.age = 5;
		dog.info();
		
		System.out.println("==========");
		
		// �ʼ� ������
		Animal cat = new Animal("�����", 3); // �Ұ�ȣ ( ) �ȿ� ������ �־��� ������, �ʼ� �����ڿ��� �ҷ��°� �ȴ�.
		cat.info();
		
		System.out.println("==========");
		
		// ����	 �� ������
		System.out.println("===== ���� =====");
		Animal pig = new Animal("����"); // int �⺻���� 0
		pig.info();
		
		System.out.println("===== �� =====");
		Animal cow = new Animal(7); // String �⺻���� null
		cow.info();
	}

}
