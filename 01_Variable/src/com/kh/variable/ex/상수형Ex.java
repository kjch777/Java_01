package com.kh.variable.ex;

public class �����Ex {
	// ���� �޼��� : �ڹ� ���α׷� �����ϴ� ����
	public static void main(String[] args) {
		// ��� : �ѹ� ���� ����ϸ� ���̻� ���� �ٲ� �� ���� ����
		// ��� Ű���� : final
		
		// ����� �ۼ� ���
		// ���� �빮�ڷ� �ۼ��ϸ�, ����Ǵ� �ܾ� ���̴� _ �� �Ἥ ���� ���´�
		// ����� �빮�ڷ� ǥ���ϴ� ���� �ڹ� ������ ���� ��Ģ
		final double PI = 3.1415926538;
		System.out.println("����� ǥ���� PI : " + PI);
		
		
		final int MIN = 0; // MIN �� �ּҰ��� ����
		final int MAX = 100; // MAX �� �ִ밪�� ����
		System.out.println("�ּҰ� : " + MIN + "," + " �ִ밪 : " + MAX);
		
		// ����� ������ ���� �����Ϸ��ϸ� ������ �߻��Ѵ�
		// ��� final �� ����ؼ�
		// String ���� "Hello World" �־��
		// �츮 ȸ�翡 ������ ����鿡��
		// Hello World ������ �����ְ�, ������ �� ���� �ϰ���� ��
		
		final String GREETING = "Hello World";
		System.out.println(GREETING);

	}

}
