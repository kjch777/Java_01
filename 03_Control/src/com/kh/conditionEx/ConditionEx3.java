package com.kh.conditionEx;

public class ConditionEx3 {
	/*
	 if ������ ������ ���� �� �ְ�, �Ǽ��� ���� �� �ְ�, ���ڿ�, ���� �� ��� ���� ���� �� �ִ�.
	 ��ǥ������ ���� �񱳿� ���ڿ� �񱳰� �ִ�.
	 
	 = �� equal �̶�� �д´�.
	 == �� = �� 2���ϱ� equals ��� �д´�.
	 
	 ���� ��
	 	if (���� == ����){
	 		���ڿ� ���ڰ� ���� �� ������ ��¹�
	 	}
	 ���ڿ� ��	.equals �� �ٽ�
	 	if ("���ڿ�".equals("���ڿ�")){
	 		 ���ڿ��� ���ڿ��� ���� �� ������ ��¹�
	 	}
	 ���ڿ��� String �� ����Ͽ� ������ �־��شٸ�, "���ڿ�" ū ����ǥ�� �ٿ��� ���� �ʰ�,
	 �������� ������ �����ָ� �ȴ�.
	 
	 String str = "���ڿ�";
	 if (str.equals(str)) {
	 	System.out.println("���ڿ��� �����մϴ�.");
	 }
	 if ("���ڿ�".equals(str)) {
	 	System.out.println("���ڿ��� �����մϴ�.");
	 }
	 if (str.equals("���ڿ�")) {
	 	System.out.println("���ڿ��� �����մϴ�.");}
	 */
	public static void main(String[] args) {
		// ���� ��
		int number = 10;
		if (number == 10) {
			System.out.println("�� ���ڰ� �����մϴ�.");
		}
		
		// ���ڿ� ��
		String str = "Hello";
		if (str.equals("Hello")) {
			System.out.println("�� ���ڿ��� �����մϴ�.");
		}
		
		String str1 = "��";
		String str2 = ""; // ���� ã�� �� ���...???
		
		if ("��".equals(str1)) {
			System.out.println("��� �� �Դϴ�.");
		}

	}

}
