package com.kh.example.practice4.model.vo;

public class Student {
	
	// �ʵ�
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	// setter getter
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	
	// �ʱ�ȭ ���̶�, �߰�ȣ { } �ȿ� �ʵ尪 = 0 ���� �����ϴ� ���� ���Ѵ�..?
	// �޼��� - ������ - �⺻
	public Student() {
		
	}
	
	
	// �޼��� - void - ���
	public void information() { // ��� ������ ���⼭ ��������!
		System.out.println("===== �л� ���� ��ȸ =====\n");
		System.out.println("�г� : " + grade);
		System.out.println(" �� : " + classroom); // + �ڴ� �ʵ忡�� �����´�.
		System.out.println("�̸� : " + name);
		System.out.println(" Ű : " + height);
		System.out.println("���� : " + gender);
	}

}
