package com.kh.oop.basic;
// ���� : Ctrl + s
public class Main {
	
	// ������ (�ʼ��� ���� �־�� �ϰų�, �ʱ⿡ ���� ������ �����ϴ� �޼���)
	public Main() {
		
	}
	// ���� ���� ���� �߿��� ���������� ����� ���ϸ� ����
	public static void main(String[] args) {
		// public static void practice2(){} �̾����� ������ ������.
		// ������ �޸� ������ �����Ǿ� �־�� ������, ���� static �� �ƴ϶� ���� ����
		Main main = new Main();
		main.practice2();
		
	}
	
	public void practice1() {
	  
		// ��Ű Ŭ������ ��ü ����
		��Ű myCookie = new ��Ű();
		
		// ��ü�� �Ӽ� ����
		// ��Ű�� ũ��� ����� ����
		myCookie.size = "����";
		myCookie.shape = "���׶��";
		
		// ��Ű�� ���� ���� ���
		System.out.println("��Ű�� ũ�� : " + myCookie.size);
		System.out.println("��Ű�� ��� : " + myCookie.shape);
		
		��Ű ī���Ǹſ���Ű = new ��Ű();
		ī���Ǹſ���Ű.size = "�ƴ���";
		ī���Ǹſ���Ű.shape = "�����";
		
		System.out.println("��Ű�� ũ�� : " + ī���Ǹſ���Ű.size);
		System.out.println("��Ű�� ��� : " + ī���Ǹſ���Ű.shape);
		
	}
	
	public void practice2() {
	  
		Nation ���� = new Nation(); // Nation ��ü ����
		
		����.name = "ȫ�浿";
		����.age = 55;
		����.gender = 'M';
		����.jumin = "550101-1234567";
		
		System.out.println("�̸� : " + ����.name);
		System.out.println("���� : " + ����.age);
		System.out.println("���� : " + ����.gender);
		System.out.println("�ֹι�ȣ : " + ����.jumin);
		
		����.speakKorean();
		����.welfare();
		
		System.out.println("==========");
		
		Nation ����2 = new Nation();
		����2.name = "��¯��";
		����2.age = 5;
		����2.gender = '��';
		System.out.println("�̸� : " + ����2.name);
		System.out.println("���� : " + ����2.age);
		System.out.println("���� : " + ����2.gender);
		
		System.out.println("==========");
		
		����.�������ǹ�();
		����2.�������ǹ�();
		
	}

}
