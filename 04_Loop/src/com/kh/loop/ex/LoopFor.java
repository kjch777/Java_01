package com.kh.loop.ex;

public class LoopFor {
	/*
	 for �� : ���� ������ �ݺ��� ������ �� ����ϴ� ����̴�.
	 Ư�� ������ �����ϴ� ���� { } �ȿ� �ִ� �ڵ� ���� �ݺ��ؼ� �����ϸ�,
	 �ݺ� Ƚ���� �����ϰ� ������ ��쿡 ���� ����Ѵ�.
	 
	 ��� ����
	 for (�ʱ��; ���ǽ�; ������){
	 			�� �� ������ ������ ; �� ���� �ʴ´�.
	 			������ ���� ��� �ݺ��ؼ� ����� �ڵ� ��
	 						}
	 			for �� ������ ���� ������ for ���� Ż���Ѵ�.
	 			
     for - each �� : �迭�̳� �ݺ� ������ ��� ���� ���Ͽ�, �ݺ������� �۾��� �� ����ϴ� ���� �ݺ���
     				���ǰ� �ݺ��� ó������ ������ ��� �ݺ�
     				
     ��� ����
     	for(�ڷ��� ������ ���� : �ݺ��ؼ� �����ְ��� �ϴ� ������ �ۼ�) {
     		// �����ϰ��� �ϴ� �۾� �ۼ�
     		System.out.println(������ ������ �ۼ�);
     	}
	 			
	 */

	public static void main(String[] args) {
		/*
		 for ( �ʱ���� ���̱� ������ i ��� �ۼ��ϸ� ������ ����.
		 for ( i ; i <= 2; i++ ) {
		  		System.out.println(" i �� �� : " + i );
		 ������ 
		 for (������ ������ = ������ �ʱ� ����; ����; ������) 
		 	 	   �� �������� �ۼ��ؾ� �Ѵ�.
		 */
		for(int i = 1; i <= 2; i++) {
			System.out.print(i + " ");
		}
		System.out.println("===== for�� 2�� =====");
		for(int a = 1; a <= 3; a++) {
			System.out.print("a�� �� : " + a + "\n");
		}
		System.out.println("===== for�� 3�� =====");
		for(int num = 1; num <= 5; num++) {
			System.out.println("num�� �� : " + num);
		}
		System.out.println("===== for�� 4�� =====");
		for(int num = 2; num <= 10; num+=2) {
			System.out.println("num �� �� : " + num);
		}
		// for ������ ������ 5�� ��� �ϱ�
		System.out.println("===== for�� 5�� =====");
		System.out.println("������ 5��");
		int dan = 5;
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + " X " + i + " = " + (dan*i));
		}
		
		System.out.println("===== for�� 6�� =====");
		int dan3 = 3;
		for(int i = 1; i <=9; i++) {
			System.out.println(dan3 + " X " + i + " = " + (dan3*i));
		}
		
	}

}
