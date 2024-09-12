package com.kh.oop.method;

public class MethodEx {
	/*
	 method��?
	 	class ���ο� �����ϸ�, Ư�� ����� �ϴ� �ڵ带 ��� ��Ÿ�� ��
	 	
	 	1. main method
		 	�ڹ� ���α׷��� ������ �� ����ϴ� method
		 	�ۼ��� method�� ������ ȣ���Ͽ�, �������� �����ϴ� method
		 	public static void main(String[] args) {
		 	
		 	}
	 	
	 	
	 	2. constructor method
		 	�����ڴ� method��� �̸��� �ٿ��� ���� ���� ���� ������, method�� �� �����̴�.
		 	class ��� ���� ��, method ���� ��/�ҹ��� �ϳ����� �ݵ�� �Ȱ��ƾ� �Ѵ�.
	 	
	 	
	 	3. void method
		 	��ȯ�ϴ� ���� ���� method
		 	method�� ������ ������, ���� �� ��� ���� ��ȯ���� �ʴ´�.
		 	 1) �Ű������� ���� void method
		 	 		public void method() {
		 	 			System.out.println("Hi~!");
		 	 		}
		 	 
		 	 2) �Ű������� �ִ� void method
		 	 		public void method(�ڷ��� �Ű�����) {
		 	 			System.out.println("�Ű����� : " + �Ű�����);
		 	 		}
	 	
	 	
	 	4. return method
	 		���� ��ȯ�ϴ� method
	 		method�� ����Ǹ� ����� ��ȯ�ϰ�, method�� ȣ���� ���� ��ȯ�� ���� �����Ѵ�.
	 			public �ڷ��� method(�ڷ��� �Ű�����) {
	 				return �ڷ����� �ش��ϴ� ������;
	 			}
	 			
	 		1) return ���� String �� ��
	 			public String method(String str) {
	 				return str;
	 			}
	 			
	 		2) return ���� int �� ��
	 			public int method(int num) {
	 				int abc = num;
	 				return abc;
	 			}
	 			
	 		3) return ���� �ʵ忡 �ۼ��Ǿ� �ְų�, ���� ���� �ۼ��Ǿ� ���� ��
	 			String str;
		 			public String method() {
		 				return str;
		 			}
	 */
	public static void main(String[] args) {
		// main method
		MethodEx mtd = new MethodEx();
		
		mtd.������1��(5, 3); // ���
		
		int ��� = mtd.������2��(7, 4); // ������2���� ���� ����� �ϰ�, 
									// ����� ���� ��� ��� ������ �־��� ��.
		System.out.println("����� : " + ���);
	}
	
	public MethodEx() {
		// �⺻ ������
	}
	
	public void ������1��(int a, int b) {
		// �Ű������� �ִ� void method
		int ���ǰ�� = a + b;
		System.out.println("�������� " + ���ǰ�� + " �Դϴ�.");
	}
	
	public int ������2��(int a, int b) {
		return a + b;
	}

}
