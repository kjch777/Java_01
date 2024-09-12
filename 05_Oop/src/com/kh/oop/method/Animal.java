package com.kh.oop.method;

public class Animal {
	
	// �ʵ�
	public String name;
	public int age;
	
	// method - �⺻ ������
	public Animal() {
		
	}
	
	// method - �ʼ� ������
	public Animal(String name1, int age1) {
		this.name = name1;
		this.age = age1;
	}
	
	// return method - �̸�
	public String getName() {
		return name;
	}
	
	// return method - ����
	public int getAge() {
		return age;
	}
	
	// void method - ��� �޼���
	public void info() {
		System.out.println("���� �̸� : " + name);
		System.out.println("���� ���� : " + age);
	}
	
	// main method
	public static void main(String[] args) {
		
		Animal dog = new Animal("�����", 4); // ��ü ����
		dog.info();
		
		System.out.println("\n===============\n");
		
		Animal cat = new Animal("����", 2); // ��ü ����
		cat.info();

	}

}
