package com.kh.oop.basic;

public class Bank { // class ���� ������, �ݵ�� �빮�ڷ� �����ؾ� �Ѵ�.
	// �̸�	���¹�ȣ	�ܾ�	��й�ȣ	�����ü��ŵ���
	// �ʵ�
	public String name;
	public String accountNumber; // �ʵ忡�� �������� ������ �������ָ� �ȴ�.
	public 	  int balance;		 // ���� �������ָ� �� �ȴ�.
	public String password;
	public boolean agree; 
	
	
	// ������ �޼���
	// �ʱ� ���� ������ : �̸��� Ŭ���� �̸��� �ݵ�� ���ƾ� �Ѵ�. �� ��, ��/�ҹ��ڵ� �ݵ�� ���ƾ� �Ѵ�.
	public Bank() {
		
	}
	
	
	// �ʼ� ������
	public Bank(String name, String mA, int mB, String mP, boolean agree) {
		// �ʼ� ������ �Ұ�ȣ ( ) ���� �ʼ� ������ , �� �����Ͽ� �ۼ��Ѵ�.
		// �ʼ� ������ �Ұ�ȣ ( ) ���� �ʼ� ������ �ڷ����� ������ �ۼ��Ѵ�.
		this.name = name;
		this.accountNumber = mA; // �ʼ� ������ �߰�ȣ { } �� �ۼ��� 
		this.balance = mB;		 // this.�ʵ� ������ = �ʼ� ������ �Ұ�ȣ ( ) ����
		this.password = mP;		 // 				   ���ο� ������
		this.agree = agree;
	}
	
	
	// ��� �޼���
	public void info() {
		System.out.println("�̸� : " + name);
		System.out.println("���¹�ȣ : " + accountNumber);
		System.out.println("�ܾ� : " + balance);
		System.out.println("��й�ȣ : " + password);
		System.out.println("�����ü��ŵ��� : " + agree);
	}
	
	
	// ���� ���� ��� �޼���
	public static void main(String[] args) {
		Bank customer1 = new Bank();
		customer1.name = "Joe";
		customer1.accountNumber = "111-2222-33333";
		customer1.balance = 1_234;
		customer1.password = "0A1b";
		customer1.agree = true; // boolean true �� ���
		
		customer1.info();
		
		System.out.println("==========");
		
		Bank customer2 = new Bank();
		customer2.name = "Dan";
		customer2.accountNumber = "000-1111-22222";
		customer2.balance = 1_234_567;
		customer2.password = "9Q8w";
		// boolean �� �⺻���� false �̴�.
		// �ƿ� �ۼ��� ���� ������ �ڵ����� false ��� ��µȴ�.
		
		customer2.info();
		
		System.out.println("==========");
		
		Bank customer3 = new Bank("Mike", "012-3456-78910", 12_345, "5Q5p", true);
	// Ŭ������ ���ο� ������ = new Ŭ������
		// String ���� ū ����ǥ " " �ȿ�, int �� boolean ���� ����ǥ ���� �׳� �ۼ��Ѵ�.
		// ���� �� ���̿��� , �� ����ؼ� �����Ѵ�.
		customer3.info();
	// ���ο� ������.��� �����ڸ�();
	}
}
