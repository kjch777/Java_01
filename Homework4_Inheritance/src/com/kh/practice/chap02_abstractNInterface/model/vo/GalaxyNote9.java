package com.kh.practice.chap02_abstractNInterface.model.vo;

public class GalaxyNote9 extends SmartPhone {
	
// �ʵ�
	// �θ𿡰� ��ӹ��� maker �ʵ带 "�Ｚ" ���� �ʱ�ȭ
	String maker = "�Ｚ";	
	
// �޼���
	// �⺻ ������
	public GalaxyNote9(String maker) { // (�θ� Ŭ���� �ʵ忡 �ִ� �ڷ����� ������)
	
		super(maker); // �Ұ�ȣ ( ) �ȿ� ������ �־��ش�.
		
		// this.
		this.maker = maker;
		
	}
	
	// ���� ȭ���� �����Ͽ� �������̵�
	// �޼��� �� print �� �����ϱ� ��� void
	@Override
	public String void printInformation() {
		
	}

}
