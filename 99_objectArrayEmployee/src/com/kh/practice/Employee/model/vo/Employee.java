package com.kh.practice.Employee.model.vo;

public class Employee {

// �ʵ� : class ���ο� �ۼ�
	private String name;
	private String subject;
	private int score;
	
// �޼���
	// getter
	public String getName() {
		return name;
	}

	public String getSubject() {
		return subject;
	}

	public int getScore() {
		return score;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setScore(int score) {
		this.score = score;
	}

	// �⺻ ������
	public Employee() {
		
	}
	
	// �ʼ� ������
	public Employee(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	
	// ��ȯ�ϴ� �޼���
	public String inform() {
		return "�̸� : " + name + " || ���� : " + subject + " || ���� : " + score;
	}
	
}
