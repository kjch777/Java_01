package com.kh.oop.constructor;

public class Join {
	
	// �ʵ�
	public int memberNo;
	public String nickName;
	public String memberName;
	public String phoneNumber;
	
	// �⺻ ������
	public Join() {
		// ��� ��ȣ �ȿ� �ƹ��͵� �ۼ����� �ʴ´�.
	}
	
	// �ʼ� ������
	public Join(int memberNo, String nN, String memberName, String pN) {
	// �̰��� �ʵ忡 �ִ�.�ʵ� ������ = ���� �������� ������ �ְڴ�.	
		this.memberNo = memberNo; // this. �ʵ� ������ = �ʼ� ������ ���� ������
		this.nickName = nN;  // �������� ���� ���Ƶ� �ƹ��� ����� ����.
		this.memberName = memberName;
		this.phoneNumber = pN;
		
	}
	
	// �޼��� : Ŭ���� �ȿ� �����ϸ�, Ư�� ����� �� �� �ֵ��� ���� ���� �ڵ� ����
	// void �޼��� : ����� �������� �ʴ� �޼���
	public void memberInfo() {
		System.out.println("ȸ�� ��ȣ : " + memberNo); // �ʵ忡 �ִ� ������
		System.out.println("ȸ�� I D : " + nickName);
		System.out.println("ȸ�� �̸� : " + memberName);
		System.out.println("��ȭ ��ȣ : " + phoneNumber);
	}

	// �������� �������ִ� ���� �޼���
	public static void main(String[] args) {
		System.out.println("===== 1st =====");
		
		// ȸ�� 1�� ���� ���� Ȯ��
		// Join ��ü ����
		Join member1 = new Join();
		
		// �ʼ��� �ۼ��Ұ� ��������
		member1.nickName = "��뼱��";
		member1.memberName = "���̹�";
		member1.phoneNumber = "010-1234-5678";
		member1.memberInfo();
		
		System.out.println("===== 2nd =====");
		
		Join member2 = new Join();
		member2.memberNo = 1;
		member2.nickName = "hongKong";
		member2.memberName = "ȣ��";
		member2.phoneNumber = "010-7777-8888";
		member2.memberInfo();
		
		System.out.println("===== 3rd =====");
		
		// �ʼ� �ۼ� ������ ��������
		Join member3 = new Join(2, "����", "ȣȣ", "010-5555-8888");
		member3.memberInfo();
		
		System.out.println("===== 4th =====");
		
		Join member4 = new Join();
		member4.memberNo = 3;
		member4.nickName = "saintJ";
		member4.memberName = "���̸�";
		member4.phoneNumber = "010-7899-5465";
		member4.memberInfo();
		
		System.out.println("===== 5th =====");
		
		Join member5 = new Join(4, "superMan", "�� �ó�", "010-1938-1932");
		member5.memberInfo();
	}

}
