package com.kh.practice.set.model.vo;

public class Lottery {
	
// �ʵ�
	private String name;
	private String phone;
	
// �޼���
	// �⺻ ������
	public Lottery() {
		// Ctrl + Space
	}
	
	// �ʼ� ������ (��, �Ű����� ������)
	public Lottery(String name, String phone) { // Alt + Shift + S �� O
		// super(); �θ� class �� �Ű����� ������ ���ο��� super(); �� �ʿ� ����.
		this.name = name;
		this.phone = phone;
	}
	
	// Setter // Alt + Shift + S
	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// Getter // Alt + Shift + S
	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}
	
	// @Override toString
	// �������̵�� return "����ϰ� ���� ���� : " + ����ϰ� ���� ��;
	// �������̵�� �θ� class ������ ���� �����ϴ�.
	@Override
	public String toString() {
		return "�̸� : " + name + " , ��ȭ ��ȣ : " + phone;
	}

}
