package com.kh.oop.basic;

public class ������ {
	// �ʵ�
	public boolean powerOn; // ���� ����
	public int volume; // �Ҹ� ũ��
	
	
	// ����(�ʱ�) ������
	public ������() {
		
	}
	
	
	// �ʼ� ������
	public ������(int vol) {
		this.volume = vol;
	}
	
	
	// �޼���
	public void ����() {
		System.out.println("���� : " + volume + " �Դϴ�.");
	}
	
	
	// ���� ��� �� ���� �޼��带 ����
	// ������ ������ 200 ���� �����, ������ 200 �� �´��� Ȯ���ϱ�
	public static void main(String[] args) {
		������ rmc = new ������(); // ������ ��ü ����
		rmc.powerOn = true;
		rmc.volume = 100;
		System.out.println("�������� ������ " + rmc.powerOn + " �̰�, " 
						   + "���� ������ " + rmc.volume + " �Դϴ�.");
	
		// ������ ������ 200 ���� ����� ������ 200 �� �´��� Ȯ���ϱ�
		������ rmc2 = new ������(200); // ������ ������ �ʼ��̱� ������ �Ұ�ȣ ( ) �ȿ� 200 �� �־��ش�.
		rmc2.����();
	}
	
}
