package com.kh.loop.ex;

public class LoopDoWhile {
	/*
	 do-while : do ���� while ���ǿ� ��� ����, 1 ���� ������ ���� �Ѵ�.
	 			������ false ����, ���� 1ȸ�� �ݵ�� ���� �Ѵ�.
	 ��� ����
	 do {
	 		����� ����;
	 	} while (���ǽ�);
	 */
	
	public static void main(String[] args) {
		int count = 6;
		do {
			System.out.println("���ڰ� : " + count);
			// ���ǿ� ���� �������� �߰� �ϴ� ��쵵 �ִ�.
			count++;
		} while(count <= 5);
	}

}
