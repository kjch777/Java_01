package com.kh.oop.basic;

public class Student {
	// class ������� �ݵ�� �빮�ڷ� �����ؾ� �Ѵ�.
	
	
	// �ʵ�
	// �ʵ�� �ڷ����� ������ ������ �ϰ�, ���� �������� �ʾƵ� �ȴ�.
	public String name;
	public String age;
	public String grade;
	
	
	// ������ �޼��� (�ʼ��� �ۼ��ؾ� �ϴ� ������ �޼��� �����)
	// �̸� ���� �г� ��� �ʼ��� �־��.
	public Student(String inputName, String inputAge, String inputGrade) { 
		// ������ �޼��� �̸��� �ݵ�� class �̸��� �Ȱ��ƾ� �Ѵ�.
		// ������ �޼��� �Ұ�ȣ ( ) �ȿ� �ʼ� ������ , �� �����Ͽ� �ۼ��Ѵ�.
		this.name = inputName;
		this.age = inputAge;
		this.grade = inputGrade;
		// �ʼ� ������ ���ο� this. �� ����Ͽ� �ҷ��� ����, ���� ���� �������ش�.
		
	}
	
	
	// ���� ��� �޼���
	public void info() {
		// �̸� ���� �г� ���
		System.out.println("�̸� : " + name); // ���� ��� �޼��忡����
		System.out.println("���� : " + age);  // �ʵ忡�� �ҷ��´�.
		System.out.println("�г� : " + grade);
	}
	
	
	// ���� ���� �޼���
	public static void main (String[] args) {
		// �л� ��ü �����ϱ�				��ö�� 18�� 3�г�	�ڿ��� 20�� 2�г�
		Student student1 = new Student("��ö��", "18��", "3�г�");
		student1.info();
		System.out.println("==========");
		Student student2 = new Student("�ڿ���", "20��", "2�г�");
		student2.info();
		// �л�1�� �л�2 ���� ����ϱ�
	}
	
}
