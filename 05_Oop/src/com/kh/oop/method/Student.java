package com.kh.oop.method;

public class Student {
	
	// �ʵ�
	// private�� ���� class �� ������ �����Ӱ� ����� �� �ִ�.
	private String name;
	private int age;
	private int grade;
	
	// �޼��� - �⺻ ������
	public Student() {
		
	}
	
	// �޼��� - �ʼ� ������ : �ʼ� ������ ���ο��� this.
	public Student(String name1, int age1, int grade1) {
		this.name = name1;
		this.age = age1;
		this.grade = grade1;
	}
	
	// return �޼���
	public String getName() {
		return name; // return �޼��� ���ο����� ������ ������ �����Ѵ�.
	}
	// return �޼��� �̸����� �ڷ����� �������� ���´�.
	public int getage() {
		return age;
	}
	// return �޼��� �Ұ�ȣ ( ) �ȿ��� �ƹ��͵� ���� �ʴ´�.
	public int getGrade() {
		return grade;
	}
	
	// void method : ��� �޼���
	public void info() {
		System.out.println("===============\n");
		System.out.println("�л��� �̸� : " + name);
		System.out.println("�л��� ���� : " + age);
		System.out.println("�л��� �г� : " + grade + "\n");
	}

	// main method
	public static void main(String[] args) {
		Student sd1 = new Student("��ö��", 15, 2); // ��ü ���� 
		Student sd2 = new Student("�ڱ���", 17, 1); // ��ü ����
		sd1.info();
		sd2.info();

	}

}
