package com.kh.array.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPre {
	
// �޼��� 
	// ������ - �⺻
	public ArrayPre() {
		
	}
	
	// void - ���
	public void practice1() {
		// �迭�� ����Ͽ� ��ü �� ���ϱ�
		// �迭�� ����� ��, ���� ���� �������� �Ǽ����� ���ڿ����� ��������
		// ������ �ϰ�, [] �ۼ� �Ѵ�.
		// int[] num = new int[5];
		
		//  index =  0  1  2  3  4		length = 5
		int[] num = {1, 2, 3, 4, 5};
		int result = 0; // ����� �ϳ��̱� ������ [] �� ���� �ʴ´�.
		
		// for - each �� : ó������ ������ �ݺ��ؼ� ���𰡸� ������ �� ����Ѵ�.
		// 		     {1, 2, 3, 4, 5}
		for(int ���� :       num		) {
			// num �ȿ� �ִ� ��� ������, �ϳ��� int ���� ������ ���� �� ���̴�.
			
			// �������� ��
			result += ����; // result = 1 + 2 + 3 + 4 + 5
		}
		System.out.println("�������� �� : " + result);
	}

	public void practice2() {
		// ArrayList �� ����Ͽ� ���� �߰��ϱ�
		// �¶��� ��ٱ���ó�� �ְ� ���� ���� ���� ���� ���� �� �ִ�.
		//						  new ArrayList<>(); �� <> �ȿ� String �� �־ �ǰ�, ���� �ʾƵ� ��� ����.
		ArrayList<String> goods = new ArrayList<>();
		
		// ���𰡸� �߰��� ���� .add�� ����Ѵ�.
		goods.add("��ǻ��");
		goods.add("�����");			
		goods.add("������");
		goods.add("��Ź��");
		
		// �Ѳ����� ����ϴ� ù��° ���
		System.out.println(goods);
		
		// for - each ���� ��� : �ι�° ���
		for(String g : goods) {
			System.out.print("[" + g + "]");
		}
		
	}
	
	public void practice3() {
		// �迭�� ����Ͽ� �ִ� ã��
		//      index =  0  1  2  3  4		length = 5
		int[] numbers = {3, 7, 2, 9, 1};
		
		int max = numbers[0]; // numbers[0] == 3
		
		for(int num : numbers) {
			if(num > max) {
				max = num;
			}
		}
		System.out.println("�ִ� : " + max);
	}

	public void practice4() {
		// ã�Ҵ� �� ã�Ҵ�
		String[] fruits = {"���", "�ٳ���", "����", "������"};
		
		String search = "Ű��";
		boolean found = false; // ������ ã�Ҵ��� �� ã�Ҵ��� �𸣱� ������ false �� �д�.
		
		// for - each ���� ����Ͽ� �ٳ��� ã��
		for(String 		  f      : fruits) {
		//������ �� �ڷ��� ���ο� ������ : ������ �� ������
			
			// ���� ���� ã�� ������ �´ٸ� ã�Ҵ�
			if(f.equals(search)) {
				found = true;
				break; // ������ ã�ұ� ������, ã�� if �� Ż��
			}
			
		}
		System.out.println(search + " ã�Ҿ�?" + (found ? " ã�Ҿ�!" : " �� ã�Ҿ�"));
	}

	public void practice5() {
		
		Scanner sc = new Scanner(System.in); 			// ��ĳ�� ��� �ҷ�����
		System.out.print("ã�� ������ ���� �Է��ϼ��� : "); 	// �Է� �غ���� ����
		String search = sc.nextLine();						// �Է� �ޱ�
		
		String[] zoo = {"�ڳ���", "������", "�Ǵ�", "�䳢", "����"}; // zoo �ȿ� ������ ����ֱ�
		boolean found = false;								 // ���� ã�Ҵ��� �� ã�Ҵ��� �𸣱� ������ false
		
		for(String z : zoo) {
			if(z.equals(search)) {
				found = true;
				break;
			}
		}
		System.out.println(search + " ã�Ҿ�?" + (found ? " ã�Ҿ�!" : " �� ã�Ҿ�"));
	}

}
