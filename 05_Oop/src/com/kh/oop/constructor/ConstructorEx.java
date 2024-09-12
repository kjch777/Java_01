package com.kh.oop.constructor;

public class ConstructorEx {
	
	
	// �ʵ� ������ ����
	public String name; // ���� ����.
	public String phNo;
	public	  int idNo;
	public    int money;
	
	public static void main(String[] args) {
		/*
		 ������
		 ������ ���ϴ� ������ �ʱ�ȭ �� �� �ִ�.
		 
		 �ʱⰪ = 0; �� ��, �ʱⰪ�� 1�� �־��ָ�
		 �ʱⰪ�� 1�� �ʱ�ȭ �ȴ�.
		 
		 1. �����ڴ� ��ȯ���� ����. (return ��� X, void X �� 2���� �������� �ʴ´�.)
		 2. ��ü(Ŭ����)�� �ʱ�ȭ �ϴ� ����� ���� ���, ���� ����� �����ϴ�.
		 
		 ���� ����
		 1. �⺻(�ʱ�) ������ : �ʼ��� �ۼ��ؾ� �ϴ� ���� ����.
		 	public Ŭ���� �̸� () {
		 	
		 	}
		 	
		 2. �ʼ� ������ : �ʼ��� �޾ƿ;� �ϴ� ���� �����Ѵ�.
		 			  �ʼ��� �޾ƿ;� �ϴ� ����, �ʵ忡 �ۼ��� ���� �޾ƿ��� ���� �����ϴ�.
		 	public Ŭ���� �̸� (String aa, int bb, char cc) { 
		 		  (������� �ʵ尪�� ���ƾ� �Ѵ�.)
		 		  this.������1 = aa;
		 		  this.������2 = bb;
		 		  this.������3 = cc;
		 	}
		 	
		 3. ���� ������ ������ : �ʵ峪 �����ڿ��� ���� �������� ������
		 */
	}

	
	// �����ڴ� �⺻, �ʼ�, ���� ������ �����ڷ� ������.
	// �⺻ ������ : �ƹ��͵� �ʼ��� ���� ���� ������
	public ConstructorEx() {
		// ������ �̸��� Ŭ���� �̸��� ��/�ҹ��� �ϳ����� �ݵ�� �Ȱ��ƾ� �Ѵ�.
	} 
	
	
	// �ʼ� ������ : ��ȣ �ȿ� �Ű������� �ʼ��� ���� �ϴ� ������
	public ConstructorEx(String inputName /* �Ű����� */) {
		// ������ �̸��� Ŭ���� �̸��� ��/�ҹ��� �ϳ����� �ݵ�� �Ȱ��ƾ� �Ѵ�.
		this.name = inputName;
		// �ʵ尪 name ��, �Ű����� inputName �� ����Ͽ� ���� ��ȯ��Ų ��
	}
	
	public ConstructorEx(String inputName, String inputNumber) {
		//				(�Ű������� �������� �߿����� �ʰ�, �ڷ����� ������ �߿��ϴ�.)
		//				(������ ���Ƶ� ������ �ٸ��� ������ ���� �ʴ´�.)
		this.name = inputName;
		this.phNo = inputNumber;  
	}
	
	public ConstructorEx(String inputName, String inputNumber, int inputID) {
		this.name = inputName;
		this.phNo = inputNumber;
		this.idNo = inputID;
	}
	
	public ConstructorEx(String inputName, String inputNumber, int inputID, int inputMoney) {
		this.name = inputName;
		this.phNo = inputNumber;
		this.idNo = inputID;
		this.money = inputMoney; // �ʵ忡�� ���� ����ִ� �������� �ҷ��ͼ� ���� ���� �־��� ��
	}
	
	
	/*
	 ���� ������ ������ : �ʱ��� ���� �������ֱ� ������ �Ű������� �ʼ��� �־����� �ʾƵ� ������,
	 ������ �⺻ �����ڿ� ������� �Ȱ��Ƽ� ������ ���� ������, ���Ƿ� �Ű������� �־��ش�.
	 ������ public ConstructorEx(){} �� ����Ѵ�.
	 ���� �� ����. 
	 */ 
	public ConstructorEx(int a) {
		// �⺻���� ���� �����ؼ� �����ϴ� ������
		// ������ ������ ���� �������ְ�, ���� ���� ������ �� �ֵ��� ���� �������̴�.
		
		name = "�̸��� �Է����ּ���.";
		phNo = "��ȣ�� �Է����ּ���."; // String �̱� ������ ���ڿ��� ������ �־��־�� �Ѵ�.
		idNo = 7; // int �̱� ������ ���ڸ� ������ �־��־�� �Ѵ�.
		money = 0;
	}

}
