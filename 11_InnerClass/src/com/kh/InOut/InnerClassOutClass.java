package com.kh.InOut;
/*
 Ŭ���� �ȿ� �̸��� �ٸ� Ŭ������ �����غ��� 
 */
public class InnerClassOutClass {

// �ʵ�
	private int ���� = 10;
	
// �޼���
	// �⺻ ������
	public InnerClassOutClass() {
		// Ctrl + Space
	}
	
	// ���� Ŭ���� �����
	class InnerClass{
		void �ۿ��������ֱ�() {
			System.out.println("���ں��� : " + ����);
		}
	}
	
	// ���� ��� �� ����
	public static void main(String[] args) {
		InnerClassOutClass �ξƿ� = new InnerClassOutClass();
		InnerClassOutClass.InnerClass �� = �ξƿ�.new InnerClass();
		��.�ۿ��������ֱ�();
	}
}
