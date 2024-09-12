package com.kh.array;
/*
 �迭 (�ڷ� ����)
 	 ���� �ڷ����� ������ �ϳ��� �������� �ٷ�� ��
 	 ������ �迭�� index �� �̿��ؼ� �����Ѵ�.
 	 index ���� ���ڴ� 0	������ ���ڴ� (����-1)
 	 
 	 ������ �迭�� Ȱ���ϱ� ���ؼ���, �迭�� �����ϴ� ������ ������ �̿��Ѵ�.
 	 [������ ����] - �ּҸ� �����ϴ� ����
 	 
 	 - �ҹ��ڷ� �����ϴ� �ڷ��� (int double ��) �� ������ �������� ��� ������ �����̰�,
 	 - ��ǥ���� ������ �����δ� String �� �ִ�.
 	 
 �迭�� ����� ���� ���
 	 ���� �迭
 	 int[] numbers = new int[5];
 	 �̷��� �ϸ� numbers ���� ���� 5�� (0 1 2 3 4) �� ���� �� �ִ� ������ �����ȴ�.
 */
public class ArrayEx1 {
	
	public static void main(String[] args) {
		// ���� �迭�� �����ϰ� �����غ���
		int[] numbers = new int[5];
		//                  int 5 �� ����
		//              index : 0 1 2 3 4
		//               �ʱⰪ : 0 0 0 0 0
		
		System.out.println(numbers);
		System.out.println(numbers[0]);
		
		// 0 ~ 4 ���� �ڸ��� 10 20 30 40 50
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		
		// ���ڿ��� 7�� ���� �� �ִ� index �� 0 ~ 6 ���� �غ���
		String[] str = new String[6];
		
		str[0] = "������";
		str[1] = "ȭ";
		
		System.out.println(str[0]); // ��
		System.out.println(str[1]); // ȭ
		
		// System.out.println(str[2]); // null
		
		str[2] = "��";
		str[3] = "��";
		str[4] = "��";
		str[5] = "����� �Դϴ�.";
		// str[6] = "��";
		
		System.out.println(str[2]);
		System.out.println(str[3]);
		System.out.println(str[4]);
		System.out.println(str[5]);
		// System.out.println(str[6]);
		
	}

}
