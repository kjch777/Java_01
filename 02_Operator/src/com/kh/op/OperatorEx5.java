package com.kh.op;

public class OperatorEx5 {

	public static void main(String[] args) {
		/*
		 
		 �� ������ 
		 
		 == : ���� ������ true
		 	���� ��� 
		 	       5 == 5 : true
		 		   3 == 5 : false
		 		   5 == 3 : false
		 		   
		 != : ���� �ٸ��� true
		  	���� ���
		  		   5 != 5 : false
		  		   3 != 5 : true
		  		   5 != 3 : true
		 
		 
		 ������ ������(�� �����ڿ� ����)
		 
		    ���ʰ� �������� ���� �ʰ��� �̸��� �� ����ϴ� ǥ��
		 ���� > ������ : ������ ���� �������� ������ ũ�� true 
		 ���� < ������ : ������ ���� �������� ������ ������ true
		  
		    ���ʰ� �������� ���� �̻��̳� ������ �� ����ϴ� ǥ��
		 ���� >= ������ : ������ ���� �������� ������ ũ�ų� ������ true 
		 ���� <= ������ : ������ ���� �������� ������ �۰ų� ������ true
		  
		  
		 �� ������
		 
		 && : �� �� 2�� ���� ������ ��� true �� ���� ��ü ǥ���� true
		 	���� ���
		 		   (5 == 5) && (5 == 5) : true
		 		   (5 != 3) && (3 == 3) : true
		 		   (5 == 5) && (5 == 3) : false
		 		   (3 == 5) && (5 == 5) : false
		 		   
		 || : �� �� 2�� ���� ���� �߿� �ϳ��� true �� ���� ��ü ǥ���� true
		 	���� ���
		 		   (5 == 5) || (5 == 5) : true
		 		   (5 == 5) || (5 == 3) : true
		 		   (5 == 3) || (3 == 3) : true
		 		   (5 == 3) || (3 == 5) : false
		 		   
		 */
		
		int num1 = 10;
		int num2 = 20;
		
		boolean result1 = (num1 == num2); // num1 �� num2 �� ���ٸ� true
		boolean result2 = (num1 != num2); // num1 �� num2 �� �ٸ��ٸ� true
		boolean result3 = (num1 < num2); // num1 �� num2 ���� �۴ٸ� true
		
		System.out.println("�����1 : " + result1);
		System.out.println("�����2 : " + result2);
		System.out.println("�����3 : " + result3);
		
	}

}
