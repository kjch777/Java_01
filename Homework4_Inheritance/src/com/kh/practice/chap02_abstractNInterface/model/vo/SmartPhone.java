package com.kh.practice.chap02_abstractNInterface.model.vo;

public abstract class SmartPhone {
// class �� abstract �� ���̷��� class �տ� �ۼ��Ѵ�.

// �ʵ�
	private String maker; // ������ ����
	
// �޼���
	// Getter
	public String getMaker() {
		return maker;
	}
	
	// Setter
	public void setMaker(String maker) {
		this.maker = maker;
	}

	// �⺻ ������
	public SmartPhone() {
		// Ctrl + Space
	}
	
	// ����Ʈ���� ���� ������ ����ϱ� ���� �߻� �޼���
	// �޼���� print �� �����ϱ� ��� void
	public abstract String void printInformation() {
		
	}
	
}
