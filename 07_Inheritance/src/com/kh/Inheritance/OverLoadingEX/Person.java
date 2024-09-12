package com.kh.Inheritance.OverLoadingEX;

public class Person {

// �ʵ� : �������� �ۼ����ִ� ��
	private String name;
	private int age;
	
// �޼��� : Ư�� �ൿ�� �ϱ� ���� ���� �ڵ�
	// getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// ������ - �⺻ : �����ε�(�޼��� �̸��� �Ȱ�����, �ȿ� �ִ� �Ű������� �ٸ� �� ����Ѵ�.)
	public Person() {
		
	}
	
	// ������ - �ʼ� : �����ε�(�޼��� �̸��� �Ȱ�����, String name �� �ʼ��� ���� ���ϴ� ���)
	public Person(String name) {
		this.name = name;
	}
	
	// ������ - �ʼ� : �����ε�(�޼��� �̸��� �Ȱ�����, String name �� int age �� �ʼ��� ���� ���ϴ� ���)
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// void - ���
	public void displayInfo() {
		System.out.println("�̸� : " + name + " , ���� : " + age);
	}
	
}
